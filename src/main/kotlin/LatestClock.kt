


fun latestClock(a: Int, b: Int, c: Int, d: Int): String {
    val sortedNumbers :MutableList<Int> = listOf(a, b, c, d).sortedDescending().toMutableList()
    val firstNumber = sortedNumbers.filter { it <= 2 }[0]
    sortedNumbers.removeAt(sortedNumbers.indexOf(firstNumber))
    val secondNumber = if (firstNumber == 2) {
        sortedNumbers.filter { it <= 3 }[0]
    } else {
        sortedNumbers.filter { it <= 9 }[0]
    }
    sortedNumbers.removeAt(sortedNumbers.indexOf(secondNumber))

    val thirdNumber = sortedNumbers.filter { it <= 5 }[0]

    sortedNumbers.removeAt(sortedNumbers.indexOf(thirdNumber))

    val fourthNumber = sortedNumbers.filter { it <= 9 }[0]

    return "$firstNumber$secondNumber:$thirdNumber$fourthNumber"
}
