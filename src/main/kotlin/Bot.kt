import java.util.*

class Bot {

    val scanner = Scanner(System.`in`)
    val name = "Aider"
    val birthYear = "2022"

    fun main() {
        greet(name, birthYear)
        remindName()
        guessAge()
        count()
        test()
        end()
    }

    private fun greet(assistantName: String, birthYear: String) {
        println("Hello! My name is ${assistantName}.")
        println("I was created in ${birthYear}.")
        println("Please, remind me your name.")
    }

    private fun remindName() {
        val name = scanner.nextLine()
        println("What a great name you have, ${name}!")
    }

    private fun guessAge() {
        println("Let me guess your age.")
        println("Enter remainders of dividing your age by 3, 5 and 7.")
        val rem3 = scanner.nextInt()
        val rem5 = scanner.nextInt()
        val rem7 = scanner.nextInt()
        val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
        println("Your age is ${age}. That's a good time to start programming!")
    }

    private fun count() {
        println("Now I will prove to you that I can count to any number you want.")
        val num = scanner.nextInt()
        for (i in 0..num) {
            print(i)
            println("!")
        }
    }

    private fun test() {
        println("Let's test your programming knowledge.")
        println("Why do we use methods?")
        println("1. To repeat a statement multiple times.")
        println("2. To decompose a program into several small subroutines.")
        println("3. To determine the execution time of a program.")
        println("4. To interrupt the execution of a program.")

        val answer = scanner.nextInt()
        if (answer != 2) {
            println("Please, try again.")
        }
    }

    private fun end() {
        println("Congratulations, have a nice day!")
    }
}