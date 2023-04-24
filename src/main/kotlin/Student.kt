class Student(val name : String, var age : Int) {
    var courses : MutableList<Course> = mutableListOf()

    fun addCourse(course : Course){
        if (course in courses) throw Exception("Course already assigned to this Student")
        courses.add(course)
    }

    fun averageGrade(): Double{
        var avg : Double = 0.0
        for(c in courses) avg += c.grade!!
        return avg/courses.size
    }
}