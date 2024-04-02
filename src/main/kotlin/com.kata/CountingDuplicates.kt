package com.kata

class CountingDuplicates(private val word: String) {
    fun countDuplicate(): Int {
        val chars = this.word.uppercase().toCharArray()
        val eachTypeOfChar = chars.toSet()
        var countDuplicates = 0

        eachTypeOfChar.forEach { char ->
            val countLetter = chars.count { it == char }
            if (countLetter > 1){
                countDuplicates ++
            }
        }
        return countDuplicates
    }

}
