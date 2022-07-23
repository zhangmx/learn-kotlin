fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun getScore(name: String) = when {
    name == "Alice" -> 2
    name == "Bob" -> 3
    name.startsWith('A') -> 4
    else -> 0
}

