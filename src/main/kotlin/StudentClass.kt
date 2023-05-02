class StudentClass(private val id: String) {
    private var students : MutableList<Student> = mutableListOf()

    fun addStudent(student : Student){
        if(student in students) throw Exception("Student already assigned to this list")
        students.add(student)
    }

    //Liveaufgabe
    fun getPercentageOfFailedStudents() = (students.count { it.averageGrade() > 4.0 }.toDouble() / students.size) * 100
}