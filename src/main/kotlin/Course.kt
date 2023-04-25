class Course (private val name : CourseName){

    var grade : Double? = null
        set(value) {
            if(value!! in 1.0..6.0) field = value
            else throw Exception("Grade must be between 1.0 an 6.0")
        }

    var passed : Boolean = false
        get() {
            field = grade!! <= 4.0
            return field
        }

}