package tictactoe


fun main() {
    var battleField = ""
    val inputLst = mutableListOf(" ", " ", " ", " ", " ", " ", " ", " ", " ")
    val input = inputLst.joinToString("")
    printBoard(input)
    user(input, 1)

//   println(analyzeGameState(input))
// }
}
fun printBoard(input: String) {
    println(input.let {
        "---------\n" +
                "| ${it[0]} ${it[1]} ${it[2]} |\n" +
                "| ${it[3]} ${it[4]} ${it[5]} |\n" +
                "| ${it[6]} ${it[7]} ${it[8]} |\n" +
                "---------\n"
    })
}
fun user(input: String, player: Int) {
    val integerChars = "0123456789"
    var input = input
    var input2 = readln()
    var resultStr = ""
    var player = player

    if (input2.isNotEmpty()) {
        if (integerChars.contains(input2.first().toString()) && integerChars.contains(input2.last().toString())) {
            val firstNum = input2.first().toString()
            val lastNum = input2.last().toString()
            if (firstNum.toInt() in 1 .. 3 && lastNum.toInt() in 1 .. 3){
                val checkIndexInt = input2GetIndex(input2)
                if (input[checkIndexInt] == ' ') {
                    if (player == 1) {
                        player = 2
                    } else if (player == 2) {
                        player = 1
                    }
                    resultStr = printResult(input, checkIndexInt, player)
                    println(resultStr.let {
                        "---------\n" +
                                "| ${it[0]} ${it[1]} ${it[2]} |\n" +
                                "| ${it[3]} ${it[4]} ${it[5]} |\n" +
                                "| ${it[6]} ${it[7]} ${it[8]} |\n" +
                                "---------\n"
                    })
                    input = resultStr
                    when(analyzeGameState(input)) {
                        "Impossible" -> println("Impossible")
                        "X wins"-> println("X wins")
                        "O wins" -> println("O wins")
                        "Draw" -> println("Draw")
                        else -> {
                            user(input, player)
                        }
                    }

                }else {
                    println("This cell is occupied!")
                    user(input, player)
                }
            } else {
                println("Coordinates should be from 1 to 3!")
                user(input, player)
            }
        } else {
            println("You should enter numbers!")
            user(input, player)
        }
    } else user(input, player)
}


fun input2GetIndex(input2: String): Int {
    // put your code here
    var chIndex = 0
        when(input2) {
            "1 1" -> chIndex = 0
            "1 2" -> chIndex = 1
            "1 3" -> chIndex = 2
            "2 1" -> chIndex = 3
            "2 2" -> chIndex = 4
            "2 3" -> chIndex = 5
            "3 1" -> chIndex = 6
            "3 2" -> chIndex = 7
            "3 3" -> chIndex = 8
        }
    return chIndex
    }


fun printResult(input: String, check: Int, player: Int): String {
    var newStr1 = ""
    var battleField = mutableListOf<String>()
    for (ch in input) {
        battleField.add(ch.toString())
    }
    if (player == 1) {
        battleField[check] = "X"
    } else if (player == 2) {
        battleField[check] = "O"
    }
    newStr1 = battleField.joinToString("")
    return newStr1
}



fun analyzeGameState(input: String): String {
 val subLists = input.toMutableList().chunked(3)
 val winForX = checkWin(subLists, 'X')
 val winForO = checkWin(subLists, 'O')
 val isFinished = isFinishedGame(subLists)
 val isIncorrectLetterCount = incorrectLetterCount(subLists)

 if (isIncorrectLetterCount || (winForO && winForX)) {
     return "Impossible"
 }

 if (winForX) {
     return "X wins"
 }

 if (winForO) {
     return "O wins"
 }

 if (!isFinished) {
     return "Game not finished"
 }

 return "Draw"
}

fun incorrectLetterCount(board: List<List<Char>>): Boolean {
 var ex = 0;
 var oh = 0;

 for(row in board) {
     ex += row.count { it == 'X'}
     oh += row.count { it == 'O'}
 }

 if (kotlin.math.abs(ex - oh) >= 2) {
     return true
 }
 return false
}

fun isFinishedGame(board: List<List<Char>>): Boolean {
 for (i in board.indices) {
     for (j in board[i].indices) {
         if (board[i][j] == ' ') {
             return false
         }
     }
 }
 return true
}

fun checkWin(board:  List<List<Char>>, player: Char): Boolean {
 var win = false
//    scan every row for player if whole row is player then player wins
 for (row in board) {
     if (row[0] == player && row[1] == player && row[2] == player) {
         win = true
     }
 }
//    scan every col for player if whole col is player then player wins
 for (i in board.indices) {
     if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
         win = true
     }
 }
//    scan (0,0),(1, 1),(2,2) for player if all coors are player then player wins
 if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
     win = true
 }
//    scan (0,2) (1,1) (2,0) for player if all coors are player then player wins
 if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
     win = true
 }

 return win
}
