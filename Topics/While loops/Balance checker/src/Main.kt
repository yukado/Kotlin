import java.util.Scanner

fun main() {
    var balance = readln().toInt()
    val scanner = Scanner(System.`in`)
    var spend = 0
    var thx = ""


    do {
         spend = scanner.nextInt()
        // TODO
        if (balance >= spend){
            balance -= spend
            thx = "Thank you for choosing us to manage your account! Your balance is $balance."
        } else if (balance < spend) {
            thx = "Error, insufficient funds for the purchase. Your balance is $balance, but you need $spend."
        }
       } while(scanner.hasNextInt())
     println("$thx")
}


