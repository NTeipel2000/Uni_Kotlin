class StudentClass(private val id: String) {
    private var students : MutableList<Student> = mutableListOf()

    fun addStudent(student : Student){
        if(student in students) throw Exception("Student already assigned to this list")
        students.add(student)
    }
}