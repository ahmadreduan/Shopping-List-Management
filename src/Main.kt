fun main() {
    val shoppingList = mutableListOf<String>()

    while (true) {
        println("\n1. Add item to the list")
        println("2. Remove item from the list")
        println("3. View current list")
        println("4. Exit")

        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> {
                print("Enter item to add: ")
                val newItem = readLine()
                if (newItem != null) {
                    shoppingList.add(newItem)
                    println("$newItem added to the list.")
                } else {
                    println("Invalid input. Please try again.")
                }
            }
            2 -> {
                if (shoppingList.isEmpty()) {
                    println("The list is empty.")
                } else {
                    println("Current list: ")
                    shoppingList.forEachIndexed { index, item ->
                        println("${index + 1}. $item")
                    }
                    print("Enter the index of item to remove: ")
                    val index = readLine()?.toIntOrNull()
                    if (index != null && index in 1..shoppingList.size) {
                        val removedItem = shoppingList.removeAt(index - 1)
                        println("$removedItem removed from the list.")
                    } else {
                        println("Invalid input. Please try again.")
                    }
                }
            }
            3 -> {
                if (shoppingList.isEmpty()) {
                    println("The list is empty.")
                } else {
                    println("Current list: ")
                    shoppingList.forEachIndexed { index, item ->
                        println("${index + 1}. $item")
                    }
                }
            }
            4 -> {
                println("Exiting...")
                return
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}
