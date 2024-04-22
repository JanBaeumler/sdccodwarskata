


fun oldestAgesOne(ages: List<Int>): List<Int> {
    val firstNumber = ages.max();
    val numbersWithoutFirstNumber = ages.filter { it != ages.max() }
    val secondNumber = numbersWithoutFirstNumber.max()
    return listOf(secondNumber, firstNumber)
}

fun oldestAgesTwo(ages: List<Int>): List<Int> {
    return listOf(ages.sortedDescending()[1], ages.sortedDescending()[0])
}

fun oldestAges(ages: List<Int>): List<Int> {
    val sortedNumbersDescending = ages.sortedDescending()
    return listOf(sortedNumbersDescending[1], sortedNumbersDescending[0])
}

