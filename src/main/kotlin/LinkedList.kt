class LinkedList <T: Comparable<T>>{
    data class Node<T>(val data: T, var next: Node<T>?)

    private var first: Node<T>? = null

    var size = 0

    fun isEmpty(): Boolean = first == null

    fun addFirst(data: T) {
        size++
        first = if (isEmpty()) Node(data, null)
        else {
            val newNode = Node(data, first)
            newNode
        }
    }

    fun addLast(data: T){
        size++
        if(isEmpty()){
            first = Node(data, null)
            return
        }
        var runPointer = first
        while(runPointer?.next != null){
            runPointer = runPointer.next
        }
        runPointer?.next = Node(data, null)
    }

    fun addSorted(data: T){
        size++
        var runPointer = first
        while(runPointer?.next != null){
            if(runPointer.data < data && runPointer.next!!.data > data){
                runPointer.next = Node(data, runPointer.next)
                return
            }
            runPointer = runPointer.next
        }
    }

    fun appendList(newList: LinkedList<T>){
        if(newList.isEmpty()) return
        size += newList.size
        var runPointer = newList.first
        while(runPointer != null){
            addLast(runPointer.data)
            runPointer = runPointer.next
        }
    }

   fun forEach(action: (T)->Unit){
       var runPointer = first
       while (runPointer != null){
           action(runPointer.data)
           runPointer = runPointer.next
       }
   }

    fun clear(){
        first = null
        size = 0
    }

    fun sizeLoop(): Int{
        var runPointer = first
        var i = 0
        while(runPointer != null){
            i++
            runPointer = runPointer.next
        }
        return i
    }

    fun sizeForEach(): Int{
        var count = 0
        forEach { count++ }
        return count
    }

    fun firstWhere(condition: (T) -> Boolean): T?{
        var runPointer = first
        while(runPointer != null){
            if(condition(runPointer.data)) return runPointer.data
            runPointer = runPointer.next
        }
        return null
    }

    override fun toString(): String{
        var s = "["
        var runPointer = first
        while(runPointer != null){
            s += (runPointer.data.toString())
            if(runPointer.next != null) s+= ", "
            runPointer = runPointer.next
        }
        return (s.plus("]"))
    }
}