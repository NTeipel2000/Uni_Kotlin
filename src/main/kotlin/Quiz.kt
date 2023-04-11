class Quiz(private val questions: ArrayList<Question>) {

    private var points = 0

    fun play(){
        for(i in 0 until questions.size step 1){
            val aktQuestion = questions[i]
            aktQuestion.show()
            if(aktQuestion.checkAnswer(getUserInput())){
                println("Super! Richtige Antwort.\n")
                points += aktQuestion.score
            }else{
                println("Schade! Leider falsch...\n")
            }
        }
        println("Du hast ${points} von ${getMaxScore()} möglichen Punkten erreicht!")
    }

    fun getUserInput(): Int{
        return readln().toInt()
    }

    fun getMaxScore(): Int{
        var sum = 0
        questions.forEach {
            sum += it.score
        }
        return sum
    }

    //-------------------Zusatzaufgabe------------------------
    fun getQuestionWithHighestScore(): Question{
        var highestScore = questions[0]
        questions.forEach {
            if(it.score > highestScore.score) highestScore = it
        }
        return highestScore
    }

    fun getQuestionsWithMinMaxScore(min: Int, max: Int): List<Question>{
        val questionsMinMax = ArrayList<Question>()
        questions.forEach {
            if(it.score in min..max) questionsMinMax.add(it)
        }
        return questionsMinMax
    }

    fun getQuestionsWithAnswer(answer: Int): List<Question>{
        val questionsWithAnswer = ArrayList<Question>()
        questions.forEach {
            if(it.correctAnswer == answer) questionsWithAnswer.add(it)
        }
        return questionsWithAnswer
    }

    fun getQuestionsWithMinScore(min: Int): List<Question>{
        val questionsWithMinScore = ArrayList<Question>()
        questions.forEach {
            if(it.score > min) questionsWithMinScore.add(it)
        }
        return questionsWithMinScore
    }

    fun getAverageScore(): Double{
        return (getMaxScore() / (questions.size-1)).toDouble()
    }
}