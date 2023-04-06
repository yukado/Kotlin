package machine

import kotlin.system.exitProcess
var waterm = 400
var milkm = 540
var beansm = 120
var cups = 9
var moneym = 550

fun main() {


    mainMenu()

}

fun mainMenu() {
    println("Write action (buy, fill, take, remaining, exit): ")
    when(readln()) {
        "buy" -> {
            buyCoffee()
        }
        "fill" -> {
            fillMachine()
        }
        "take" -> {
            takeMFromMachine()
        }
        "remaining" -> {
            remainingMachine()
        }
        "exit" -> {
            exitProcess(130)
        }
    }
}
fun buyCoffee() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    val userInputBuy = readln()
    when(userInputBuy) {
        "1" -> if (waterm < 250) {
            println("Sorry not enough water!")
            mainMenu()
        } else if (beansm < 16) {
            println("Sorry not enough beans!")
            mainMenu()
        } else if (cups < 1) {
            println("Sorry not enough cups!")
        } else if (waterm >=250 && beansm >= 16 && cups >= 1) {
            waterm -= 250
            beansm -= 16
            cups -= 1
            moneym += 4
            println("I have enough recourses, making you a coffee!")
            println()
            mainMenu()
        }

        "2" -> if (waterm < 350) {
            println("Sorry not enough water!")
            mainMenu()
        } else if (milkm < 75) {
            println("Sorry not enough milk!")
        }
        else if (beansm < 20) {
            println("Sorry not enough beans!")
            mainMenu()
        } else if (cups < 1) {
            println("Sorry not enough cups!")
        } else if (waterm >=350 && milkm >= 75 && beansm >= 20 && cups >= 1) {
            waterm -= 350
            milkm -= 75
            beansm -= 20
            cups -= 1
            moneym += 7
            println("I have enough recourses, making you a coffee!")
            println()
            mainMenu()
        }
        "3" -> if (waterm < 200) {
            println("Sorry not enough water!")
            mainMenu()
        } else if (milkm < 100) {
            println("Sorry not enough milk!")
        }
        else if (beansm < 12) {
            println("Sorry not enough beans!")
            mainMenu()
        } else if (cups < 1) {
            println("Sorry not enough cups!")
        } else if (waterm >=200 && milkm >= 100 && beansm >= 12 && cups >= 1) {
            waterm -= 200
            milkm -= 100
            beansm -= 12
            cups -= 1
            moneym += 6
            println("I have enough recourses, making you a coffee!")
            println()
            mainMenu()
        }
        "back" -> mainMenu()
    }
}
fun fillMachine() {
    println("Write how many ml of water do you want to add: ")
    waterm += readln().toInt()
    println("Write how many ml of milk do you want to add: ")
    milkm += readln().toInt()
    println("Write how many grams of coffee beans do you want to add: ")
    beansm += readln().toInt()
    println("Write how many disposable cups of coffee do you want to add: ")
    cups += readln().toInt()
    println()
    mainMenu()
}
fun takeMFromMachine() {
    println("I gave you $$moneym")
    moneym = 0
    println()
    mainMenu()
}
fun remainingMachine() {
    println("The coffee machine has:")
    println("$waterm ml water")
    println("$milkm ml of milk")
    println("$beansm g of coffee beans")
    println("$cups disposable cups")
    println("$moneym of money")
    println()
    mainMenu()
}
