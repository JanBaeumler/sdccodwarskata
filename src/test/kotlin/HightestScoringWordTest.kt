import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HightestScoringWordTest {

    @Test
    fun testFixed1() {
        assertEquals("taxi", high("man i need a taxi up to ubud"))
    }

    @Test
    fun testFixed2() {
        assertEquals("volcano", high("what time are we climbing up the volcano"))
    }

    @Test
    fun testFixed3() {
        assertEquals("semynak", high("take me to semynak"))
    }

    @Test
    fun testFixed4() {
        assertEquals("aa", high("aa b"))
    }

    @Test
    fun testFixed5() {
        assertEquals("b", high("b aa"))
    }

    @Test
    fun testFixed6() {
        assertEquals("bb", high("bb d"))
    }

    @Test
    fun testFixed7() {
        assertEquals("d", high("d bb"))
    }

    @Test
    fun testFixed8() {
        assertEquals("aaa", high("aaa b"))
    }
}