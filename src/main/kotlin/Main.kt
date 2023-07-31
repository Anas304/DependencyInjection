import person.Person
import person.Person2

fun main(args: Array<String>) {

    val person = Person()
    val goals = person.goals
    println("The goals of person are = $goals")

    val person2 =
        Person2(
            name = "Person2",
            age = 29.1,
            goals = listOf("Life-Management", "Being-Human", "Handling-Things", "Being-Greatefull")
        )

    val goals2 = person2.goals
    println("The goals of person2 are = $goals2")


}