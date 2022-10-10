import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class NumbersTest {

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource(
        "12, 4, 16",
        "-5, 10, 5",
        "-10, 2, -8"
    )
    fun testTwoNumbersSumWithValidNumbers(numberOne: Int, numberTwo: Int, expectedSumTwoValidNumbers: Int) {
        val numbers: Numbers = Numbers.TwoNumbers(numberOne, numberTwo)
        val actualSumTwoNumbers = numbers.sum()
        assertEquals(expectedSumTwoValidNumbers, actualSumTwoNumbers)
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource(
        "12, 4, 8",
        "5, 10, -5",
        "-10, 2, -12"
    )
    fun testTwoNumbersSubtractWithValidNumbers(numberOne: Int, numberTwo: Int, expectedSumTwoValidNumbers: Int) {
        val numbers: Numbers = Numbers.TwoNumbers(numberOne, numberTwo)
        val actualSubTwoNumbers = numbers.sub()
        assertEquals(expectedSumTwoValidNumbers, actualSubTwoNumbers)
    }

    @ParameterizedTest(name = "{0} + {1} + {2} = {3}")
    @CsvSource(
        "12, 4, 5, 21",
        "-5, 10, 10, 15",
        "-10, 2, -10, -18"
    )
    fun testThreeNumbersSumWithValidNumbers(numberOne: Int, numberTwo: Int, numberThree: Int, expectedSumTwoValidNumbers: Int) {
        val numbers: Numbers = Numbers.ThreeNumbers(numberOne, numberTwo, numberThree)
        val actualSumThreeNumbers = numbers.sum()
        assertEquals(expectedSumTwoValidNumbers, actualSumThreeNumbers)
    }

    @ParameterizedTest(name = "{0} - {1} - {2} = {3}")
    @CsvSource(
        "50, 4, 5, 41",
        "15, 10, 10, -5",
        "-10, 2, -10, -2"
    )
    fun testThreeNumbersSubtractWithValidNumbers(numberOne: Int, numberTwo: Int, numberThree: Int, expectedSumTwoValidNumbers: Int) {
        val numbers: Numbers = Numbers.ThreeNumbers(numberOne, numberTwo, numberThree)
        val actualSumThreeNumbers = numbers.sub()
        assertEquals(expectedSumTwoValidNumbers, actualSumThreeNumbers)
    }
}