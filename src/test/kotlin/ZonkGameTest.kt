import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Example tests")
class ZonkGameTest {

    @Test
    @DisplayName("Single die")
    fun test1() {
        doTest(intArrayOf(1), 100)
    }

    @Test
    @DisplayName("Single die")
    fun test2() {
        doTest(intArrayOf(2), 0)
    }

    @Test
    @DisplayName("Single die")
    fun test3() {
        doTest(intArrayOf(3), 0)
    }

    @Test
    @DisplayName("Single die")
    fun test4() {
        doTest(intArrayOf(4), 0)
    }

    @Test
    @DisplayName("Single die")
    fun test5() {
        doTest(intArrayOf(5), 50)
    }

    @Test
    @DisplayName("Single die")
    fun test6() {
        doTest(intArrayOf(6), 0)
    }

    @Test
    @DisplayName("Multiple dice")
    fun test7() {
        doTest(intArrayOf(1, 1), 200)
    }

    @Test
    @DisplayName("Multiple dice")
    fun test8() {
        doTest(intArrayOf(1, 1, 1), 1000)
    }

    @Test
    @DisplayName("Multiple dice")
    fun test9() {
        doTest(intArrayOf(1, 2, 3, 4, 5, 6), 1000)
    }

    @Test
    @DisplayName("Multiple dice")
    fun test10() {
        doTest(intArrayOf(2, 2, 3, 3, 6, 6), 750)
    }

    @Test
    @DisplayName("Multiple dice")
    fun test11() {
        doTest(intArrayOf(3, 2, 6, 4, 4, 6), 0)
    }

    private fun doTest(dice: IntArray, expected: Int) {
        assertEquals(expected, getScore(dice), "(" + dice.joinToString() + ")")
    }
}