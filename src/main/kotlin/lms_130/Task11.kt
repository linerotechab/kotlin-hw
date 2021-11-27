package lms_130

fun question1Task11(listOfAttendees: List<String>): Int {

    return TODO("Replace this 'TODO' with the variable 'numberOfAttendees'. Do not erase the 'return' keyword")
}

fun question2Task11(listOfAttendees: List<String>, condition: String): List<String> {

    return TODO("Replace this 'TODO' with the variable 'peopleWithCondition'. Do not erase the 'return' keyword")
}

fun main() {

    // Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
    val conditionOfInterest = "-V"
    val listOfAttendees = listOf(
        "Stéphanie-A",
        "Edmée-K",
        "Maëlla-K",
        "Océanne-K",
        "Géraldine-K",
        "Maëline-K",
    )

    // NOTE: Uncomment the code below when you are ready to test your answers
    println("The event has a total of ${question1Task11(listOfAttendees)} attendees.")
    println("The attendees with condition $conditionOfInterest are ${question2Task11(listOfAttendees, conditionOfInterest)}")
}
