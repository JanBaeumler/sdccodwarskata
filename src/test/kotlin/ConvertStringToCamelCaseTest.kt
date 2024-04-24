import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertStringToCamelCaseTest {

    @Test
    fun testFixed() {
        assertEquals("", toCamelCase(""))
        assertEquals("theStealthWarrior", toCamelCase("the_stealth_warrior"))
        assertEquals("TheStealthWarrior", toCamelCase("The-Stealth-Warrior"))
        assertEquals("ABC", toCamelCase("A-B-C"))
    }

}