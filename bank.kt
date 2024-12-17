fun main() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")
    var accountType = 0
    var userChoice = readLine();
    if(userChoice == "1"){
        accountType = 1
        println("You chose Debit Account")
    } else if (userChoice == "2"){
        accountType = 2
        println("You chose Credit Account")
    } else if (userChoice == "3"){
        accountType = 3
        println("You chose Checking Account")
    } else {
        println("Sorry, there is no such account type.")
    }
}