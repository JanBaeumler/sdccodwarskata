fun oldestAgesOne(ages: List<Int>): List<Int> {
    return listOf(
        ages.sortedDescending()[1],
        ages.sortedDescending()[0]
    )
}

fun oldestAgesTwo(ages: List<Int>): List<Int> {
    val sortedNumbersDescending = ages.sortedDescending()
    return listOf(sortedNumbersDescending[1], sortedNumbersDescending[0])
}

fun oldestAges(ages: List<Int>): List<Int> = ages.sorted()
        .takeLast(2)



