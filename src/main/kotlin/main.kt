fun main(){
    val math = Course("MATH")
    val chemistry = Course("CHEMISTRY")
    val english = Course("ENGLISH")

    val student1 = Student("Nils Teipel", 22)
    val student2 = Student("Max Mustermann", 40)

    math.grade = 4.0
    chemistry.grade = 2.0
    english.grade = 3.5

    student1.addCourse(math)
    student1.addCourse(chemistry)
    student2.addCourse(english)

    println("Durchschnitt Student1: ${student1.averageGrade()}")
    println("Durchschnitt Student2: ${student2.averageGrade()}")
}