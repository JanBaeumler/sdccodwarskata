import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class LatestClockTest {

    @Nested
    inner class TestExample {

        @Test
        @DisplayName("latestClock(1, 9, 8, 3) should return \"19:38\"")
        fun test_1_9_8_3() {
            assertEquals("19:38", latestClock(1, 9, 8, 3));
        }

        @Test
        @DisplayName("latestClock(2, 2, 2, 2) should return \"22:22\"")
        fun test_2_2_2_2() {
            assertEquals("22:22", latestClock(2, 2, 2, 2));
        }

        @Test @DisplayName("latestClock(9, 1, 2, 5) should return \"21:59\"")
        fun test_9_1_2_5() {
            assertEquals("21:59", latestClock(9, 1, 2, 5));
        }
    }

}