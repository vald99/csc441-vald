package week3wed

fun main() {
    // Three vals: first name, major, and favorite food
    val name = "Yandel"
    val major = "Computer Science"
    val favoriteFood = "Burger"
    println("$name")
    println("Major: $major")
    println("Favorite Food: $favoriteFood")

    // One var: How many CSC courses taken, then add 1 in the next line
    var cscCoursesTaken = 9
    cscCoursesTaken += 1
    println("Courses taken: ${cscCoursesTaken + 1}")

    // One of each of the four types: String, Int, Double, and Boolean
    val courseName = "Web and Mobile Secure Software"
    val fingersOnHand = 5
    val ramUsage = 11.71
    val hungryTrue = false
    println("Course Name: $courseName")
    println("Fingers on single hand: $fingersOnHand")
    println("RAM usage: $ramUsage")
    println("Is hungry? $hungryTrue")

    // Three string templates: One of each of plain $, arithmetic, and using .length
    println("$favoriteFood") // burger
    println("${cscCoursesTaken + 1}") // 11
    println("${courseName.length}") // 30

    // Ask the user something: use print(...) then readln()
    print("What's your age? ")
    val age = readlnOrNull()
    println("$age, that's your age.")
}