    import org.junit.jupiter.api.Assertions.assertEquals
    import org.junit.jupiter.api.Test

    class OldestAgesTest {

        @Test
        fun testOldestAges() {
            assertEquals(listOf(45, 87), oldestAges(listOf(1,5,87,45,8,8)))
            assertEquals(listOf(18, 83), oldestAges(listOf(6,5,83,5,3,18)))
        }
    }