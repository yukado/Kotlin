// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here

    for (i in 1.. 3) {
        print("1..3 ->$i")
    }
    println(" ")
    for (i in 11..10) {
        print("11..10 ->$i")
    }
    println("  ")
    for (i in 11 downTo 10) {
        print("11 downTo 10 ->$i")
    }
    println("  ")
    for (i in 11 downTo 10 step 2) {
        print("11 downTo 10 step 2 ->$i")
    }
    println("  ")
    for (i in 1 until 5) {
        print("1 until 5 ->$i")
    }
    println("  ")
    for (i in 'a' .. 'c' step 2) {
        print("'a' .. 'c' step 2 ->$i")
    }
    println("  ")
    for (i in 'a'.. 'd' step 3) {
        print("'a' .. 'c' step 3 ->$i")
    }
}
