object Empty : NumberTree() {
    override fun ausgabe(){ }

    override fun size() = 0

    override fun add(number: Int) = NumberNode(number)

    override fun sum() = 0.0

    override fun average() = 0.0

}