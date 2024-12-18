fun main() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit Account")
    println("2. Credit Account")
    println("3. Checking Account")
    println("Choose an option (1, 2, or 3):")

    var userChoice = readLine()
    val accountType = when (userChoice) {
        "1" -> {
            println("You chose Debit Account")
            "debit"
        }
        "2" -> {
            println("You chose Credit Account")
            "credit"
        }
        "3" -> {
            println("You chose Checking Account")
            "checking"
        }
        else -> {
            println("Sorry, there is no such account type.")
            continuePrompt() // Helper function to handle invalid input.
            null
        }
    }
    if (accountType != null) {
        println("Your $accountType account has been created successfully!")
    }
}

fun continuePrompt() {
    println("Please enter a valid option.")
    // Logic for handling next iteration can be added here, e.g., restarting the input process.
}
