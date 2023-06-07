class LinkedList {

    private data class Node(val data: String, var next: Node?)

    private var firstNode: Node? = null

    var size: Int = 0
        get(){
            var rp = firstNode
            while (rp != null){
                rp = rp.next
                field++
            }
            return field
        }
        private set

    fun addLast(data: String){
        var rp = firstNode
        while (rp?.next != null) rp = rp.next
        rp?.next = Node(data, null)
    }

    fun getAtIndex(index: Int): String? {
        if(index > size) return null
        var i = 0
        var rp = firstNode
        while (rp != null){
            if (i == index) return rp.data
            rp = rp.next
            i++
        }
        return null
    }
}