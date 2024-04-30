import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
        assertEquals(0, solution(0))
        assertEquals(0, solution(-5))
    }
}

