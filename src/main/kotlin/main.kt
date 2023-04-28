fun main(){
    val math = Course(CourseName.MATH)
    val chemistry = Course(CourseName.CHEMISTRY)
    val english = Course(CourseName.ENGLISH)

    val student1 = Student("Nils Teipel", 22)
    val student2 = Student("Max Mustermann", 40)

    math.grade = 4.0
    chemistry.grade = 5.0
    english.grade = 3.5

    student1.addCourse(math)
    student1.addCourse(chemistry)
    student2.addCourse(english)

    val tenB = StudentClass("10b")
    tenB.addStudent(student1)
    tenB.addStudent(student2)

    println("Durchschnitt Student1: ${student1.averageGrade()}")
    println("Durchschnitt Student2: ${student2.averageGrade()}")
    println("Durchgefallen: ${tenB.getPercentageOfFailedStudents()}%")
}