package person

// this is not good
class Person {
    val name: String = "Anas"
    val age: Double = 24.7
    var goals: List<String> = listOf("Human", "Abroad", "Business", "Wife", "Free")
}

// constructor injection
class Person2(val name: String, val age: Double, val goals: List<String>)

//But A person or persons :) does not depend on these properties/fields/factors


// These are the dependencies of a real person yeah a few of them LOL!
// So this is the real example of constructor injection
class RealPerson(var incomeSource: Double, val family: Int, hope: String) {
    private fun eat() {}
    private fun sleep() {}
    private fun drink() {}
    private fun work() {}
    private fun plan() {}
    private fun hope() {}
    private fun pray() {}


}
