package com.soetek.practice

fun main() {
    val random = (1..10).random()
    var isMatched = false
    var startNum = 1
    var endNum = 10
    while (!isMatched) {
        print("Please enter a number($startNum-$endNum): ")
        val input = readLine()
        val inputNum = input?.toIntOrNull() ?: 0

        if (random > inputNum) {
            startNum = inputNum
        } else if (random < inputNum) {
            endNum = inputNum
        } else {
            println("You got it!")
            isMatched = true
        }
    }
}