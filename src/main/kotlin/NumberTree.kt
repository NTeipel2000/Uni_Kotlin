 sealed class NumberTree {

     abstract fun ausgabe(): Unit;
     abstract fun size(): Int;
     abstract fun add(number: Int): NumberTree;
     abstract fun sum(): Double;
     abstract fun average(): Double;

}