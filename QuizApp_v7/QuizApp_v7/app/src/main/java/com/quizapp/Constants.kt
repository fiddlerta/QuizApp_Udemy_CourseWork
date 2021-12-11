package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_argentina,
            "Аргентина", "Австралія",
            "Арменія", "Австрія", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_australia,
            "Ангола", "Австрія",
            "Австралія", "Азербайджан", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_brazil,
            "Білорусія", "Беліз",
            "Бруней", "Бразилія", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_belgium,
            "Чехія", "Бельгія",
            "Барбадос", "Німеччина", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_fiji,
            "Габон", "Франція",
            "Фіджі", "Фінляндія", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_germany,
            "Німеччина", "Грузія",
            "Греція", "Жодна з перелічених", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_denmark,
            "Гренландія", "Єгипет",
            "Данія", "Ефіопія", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_india,
            "Ірландія", "Іран",
            "Угорщина", "Індія", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_new_zealand,
            "Австралія", "Нова Зеландія",
            "Англія", "США", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Якій країні належить цей прапор ?",
            R.drawable.ic_flag_of_kuwait,
            "Кувейт", "Ірак",
            "ОАЕ", "Палестина", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}