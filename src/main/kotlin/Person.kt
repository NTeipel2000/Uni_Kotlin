class Person(
    val name : String,
    var alter : Int,
    var address : Address?
) {
    var friends : List<Person> = mutableListOf()

    fun printFriends(){
        if(friends.isEmpty()){
            println("Diese Person hat keine Freunde.")
            return
        }
        friends.forEach { println(it) }
    }

    fun filterFriends(alter: Int){
        val filteredList : List<Person> = friends.filter{ it.alter > alter }
        for(f in filteredList) println(f)
    }

    override fun toString(): String {
        return "Hallo, ich bin $name, $alter Jahre alt und wohne hier: ${address ?: "Nirgends"}"
    }

}