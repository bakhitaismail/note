fun main() {
    var userName: String = "Bakhita"
    var age: Int = 18
    var musician: String = "Sia"
    var footballer: String = "Marcus Rashford"
    println("Hello, world!")
    sayHelloKotlin()
    fullName()
    fullSentence()
    println("Hello, world. My name is $userName. I am $age years old. My favorite artist is $musician.")
    println("I love $footballer.")
    println("Hello, in 2 years I will be ${age + 4}")
    println("My name is $userName Ismail.")

}

fun sayHelloKotlin() {
    println("Hello, Kotlin")
}

fun fullName() {
    println("Bakhita Ismail")
}

fun fullSentence() {
    println("Hello, world. My name is Bakhita Ismail.")
}
