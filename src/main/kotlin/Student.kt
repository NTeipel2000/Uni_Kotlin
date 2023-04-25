class Student(val name : String, var age : Int) {
    private var courses : MutableList<Course> = mutableListOf()

    fun addCourse(course : Course){
        if (course in courses) throw Exception("Course already assigned to this Student")
        courses.add(course)
    }

    fun averageGrade() = (courses.sumOf { it.grade!! } / courses.size)
}