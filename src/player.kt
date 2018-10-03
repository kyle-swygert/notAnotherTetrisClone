package player

class Player(name: String){

    var score: Int = 0
    var name: String = ""

    init{ // does this init block only go along with the primary constructor???
        this.score = 0
        this.name = name // sets the name data member to the string that is passed in with the primary constructor for the class.
    }

    constructor(name: String, score: Int) : this(name) {
        this.score = score
        this.name = name
    }


    fun printName() {
        println("This player's name is ${this.name}.")
    }

    fun printScore() {
        println("${this.name} has ${this.score} points.")
    }


}