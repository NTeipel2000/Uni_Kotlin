class Question (
    val text: String,
    val answers: ArrayList<String>,
    val correctAnswer: Int,
    val score: Int
){
    fun show(){
        println(text)
        println("--------------")
        for (i in 0 until answers.size step 1){
            println("${i+1}. ${answers[i]}")
        }
    }

    fun checkAnswer(userInput : Int): Boolean{
        if(userInput == correctAnswer) return true
        return false
    }


}