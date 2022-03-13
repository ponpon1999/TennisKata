package com.example.tenniskata

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TennisTest {
    private lateinit var tennis: Tennis
    @Before
    fun init(){
        tennis = Tennis("firstplayer","secondplayer")
    }

    @Test//0-0
    fun love_all_test(){
        given_tennis_score("love all")

    }

    @Test//1-0
    fun fifteen_love_test(){
        tennis.firstPlayerAdd(1)
        given_tennis_score("fifteen love")

    }

    @Test//0-1
    fun love_fifteen_test(){
        tennis.secondPlayerAdd(1)
        given_tennis_score("love fifteen")
    }

    @Test//2-0
    fun thirty_love_test(){
        tennis.firstPlayerAdd(2)
        given_tennis_score("thirty love")
    }

    @Test//0-2
    fun love_thirty_test(){
        tennis.secondPlayerAdd(2)
        given_tennis_score("love thirty")
    }

    @Test//3-0
    fun forty_love_test(){
        tennis.firstPlayerAdd(3)
        given_tennis_score("forty love")
    }

    @Test//0-3
    fun love_forty_test(){
        tennis.secondPlayerAdd(3)
        given_tennis_score("love forty")
    }

    @Test//1-1
    fun fifteen_all_test(){
        given_same_score(1)
        given_tennis_score("fifteen all")
    }

    @Test//2-2
    fun thirty_all_test(){
        given_same_score(2)
        given_tennis_score("thirty all")
    }

    @Test//3-3
    fun deuce_test_3_3(){
        given_same_score(3)
        given_tennis_score("deuce")
    }

    @Test//4-4
    fun deuce_test_4_4(){
        given_same_score(4)
        given_tennis_score("deuce")
    }

    @Test//5-5
    fun deuce_test_5_5(){
        given_same_score(5)
        given_tennis_score("deuce")
    }

    @Test//6-6
    fun deuce6_test_6_6(){
        given_same_score(6)
        given_tennis_score("deuce")
    }

    @Test//4-3
    fun firstplayer_adv_test(){
        given_scores(4,3)
        given_tennis_score("firstplayer adv")
    }

    @Test//3-4
    fun secondplayer_adv_test(){
        given_scores(3,4)
        given_tennis_score("secondplayer adv")
    }


    @Test//5-3
    fun firstplayer_win_test_5_3(){
        given_scores(5,3)
        given_tennis_score("firstplayer win")
    }

    @Test//6-4
    fun firstplayer_win_test_6_4(){
        given_scores(6,4)
        given_tennis_score("firstplayer win")
    }

    @Test//7-6
    fun firstplayer_win_test_7_6(){
        given_scores(7,6)
        given_tennis_score("firstplayer win")
    }

    @Test//3-5
    fun secondplayer_win_test_3_5(){
        given_scores(3,5)
        given_tennis_score("secondplayer win")
    }

    @Test//4-6
    fun secondplayer_win_test_4_6(){
        given_scores(4,6)
        given_tennis_score("secondplayer win")
    }

    @Test//6-7
    fun secondplayer_win_test_6_7(){
        given_scores(6,7)
        given_tennis_score("secondplayer win")
    }


    private fun given_tennis_score(expect:String){
        Assert.assertEquals(expect,tennis.score())
    }

    private fun given_same_score(times:Int){
        tennis.firstPlayerAdd(times)
        tennis.secondPlayerAdd(times)
    }
    private fun given_scores(firstPlayer:Int,secondPlayer:Int){
        tennis.firstPlayerAdd(firstPlayer)
        tennis.secondPlayerAdd(secondPlayer)

    }
}