import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ToSmallestTest {
        private fun testing(n: Long, sexpect: String) {
            val sactual = ToSmallest.smallest(n).contentToString()
            assertEquals(sexpect, sactual)
        }
        @Test
        fun fixedTest() {
            testing(261235, "[126235, 2, 0]")
          //  testing(209917, "[29917, 0, 1]")
            testing(285365, "[238565, 3, 1]")

        }
    }
