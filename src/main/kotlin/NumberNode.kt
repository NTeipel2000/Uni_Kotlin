class NumberNode(
    val value: Int,
    val left: NumberTree = Empty,
    val right: NumberTree = Empty
): NumberTree() {
    override fun ausgabe() {
        left.ausgabe()
        print("$value ")
        right.ausgabe()
    }

    override fun size() = 1 + left.size() + right.size()

    override fun add(number: Int): NumberTree {
        return if(number <= value ) NumberNode(value, left.add(number), right)
        else NumberNode(value, left, right.add(number))
    }

    override fun sum() = value + left.sum() + right.sum()

    override fun average() = sum() / size()


}