


import player.*

fun main(args: Array<String>) {
    println("Hello world")

    var score = 2234

    var user1 = Player("John")
    var user2 = Player("Joe", score)

    ++user1.score

    user1.printName()
    user1.printScore()

    user2.printScore()

}