package com.example.tenniskata

class Tennis(private val firstPlayerName: String, private val secondPlayerName: String) {

    private var firstPlayerScore = 0
    private var secondPlayerScore = 0
    private val scorelist = mapOf<Int, String>(
        0 to "love",
        1 to "fifteen",
        2 to "thirty",
        3 to "forty"
    )

    fun firstPlayerAdd(times: Int) {
        for (i in 1..times) {
            firstPlayerScore++
        }
    }

    fun secondPlayerAdd(times: Int) {
        for (i in 1..times) {
            secondPlayerScore++
        }
    }

    fun score(): String {
        if (isSameScore()) {
            return if (isDeuce()) {
                "deuce"
            } else {
                "${scorelist[firstPlayerScore]} all"
            }
        } else {
            if (firstPlayerScore != 0 && secondPlayerScore != 0) {
                val advScores = getAdvScore()
                val advPlayerName = getAdvPlayerName(advScores)
                return if (isWin()) {
                    "$advPlayerName win"
                } else {
                    "$advPlayerName adv"
                }
            }
            return "${scorelist[firstPlayerScore]} ${scorelist[secondPlayerScore]}"
        }
    }

    private fun isSameScore(): Boolean {
        return firstPlayerScore == secondPlayerScore
    }
    private fun isDeuce(): Boolean {
        return firstPlayerScore >= 3
    }

    private fun getAdvScore(): Int {
        return firstPlayerScore - secondPlayerScore
    }

    private fun getAdvPlayerName(advScores: Int): String {
        return if (advScores > 0) firstPlayerName else secondPlayerName
    }

    private fun isWin(): Boolean{
        if(firstPlayerScore == 7 || secondPlayerScore == 7 || Math.abs(getAdvScore()) == 2){
            return true
        }else {
            return false
        }
    }
}