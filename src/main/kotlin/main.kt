fun main(){
    val quiz = Quiz(createTestData())
    quiz.play()
/*
    println(quiz.getQuestionWithHighestScore().text)
    println("--------------")
    printList(quiz.getQuestionsWithMinMaxScore(2, 9))
    println("--------------")
    printList(quiz.getQuestionsWithAnswer(1))
    println("--------------")
    printList(quiz.getQuestionsWithMinScore(2))
    println("--------------")
    println(quiz.getAverageScore())
 */
}

fun createTestData(): ArrayList<Question>{
    val q1 = Question(
        "Welches Tier ist auf dem Nickel der USA abgebildet?",
        arrayListOf("Hirsch", "Bär", "Bison", "Elch"),
        3,
        1
    )

    val q2 = Question(
        "Was ist die Hauptstadt Australiens?",
        arrayListOf("Sydney", "Perth", "Melbourne", "Canberra"),
        3,
        1
    )

    val q3 = Question(
        "Welches Land hat die meisten Einwohner?",
        arrayListOf("Indien", "China", "Russland", "USA"),
        2,
        4
    )

    val q4 = Question(
        "Welche Farbe hat das Blut von Krebsen?",
        arrayListOf("Rot", "Blau", "Grün", "Gelb"),
        2,
        8
    )

    val q5 = Question(
        "Wer war die erste Frau im Weltraum?",
        arrayListOf("Valentina Tereshkova", "Sally Ride", "Mae Jennison", "Svetlana Svitskaya"),
        1,
        10
    )

    return arrayListOf(q1, q2, q3, q4 ,q5)
}

fun printList(list: List<Question>){
    list.forEach {
        println(it.text)
    }
}

