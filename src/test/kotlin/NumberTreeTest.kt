import org.junit.jupiter.api.Assertions .*
import org.junit.jupiter.api.Test

class NumberTreeTest {
    @Test
    fun testSize() {
        val tree: NumberTree = Empty
        assertEquals(0, tree.size())

        val assignment1Tree: NumberTree =
            NumberNode(
                5,
                left = NumberNode(
                    3,
                    left = NumberNode(
                        2,
                        NumberNode(1)
                    ),
                    right = NumberNode(
                        4
                    )
                ),
                right = NumberNode(
                    8,
                    right = NumberNode(
                        10
                    )
                )
            )

        assertEquals(7, assignment1Tree.size())
    }

    @Test
    fun testSum(){
        val assignment1Tree: NumberTree =
            NumberNode(
                5,
                left = NumberNode(
                    3,
                    left = NumberNode(
                        2,
                        NumberNode(1)
                    ),
                    right = NumberNode(
                        4
                    )
                ),
                right = NumberNode(
                    8,
                    right = NumberNode(
                        10
                    )
                )
            )

        assertEquals(33.0
            , assignment1Tree.sum())
    }

}
