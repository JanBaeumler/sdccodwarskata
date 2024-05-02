fun testIt(a: Int, b: Int) = a.crossSum() * b.crossSum()

fun Int.crossSum() = this.toString().sumOf { it.digitToInt() }

fun testItShort(a: Int, b: Int): Int {
    return a.toString().sumOf { it.digitToInt() } * b.toString().sumOf { it.digitToInt() }
}

fun testItTwo(a: Int, b: Int): Int {
    val valueA = a.toString().split("").toList().filter { it.isNotEmpty() }.sumOf { it.toInt() }
    val valueB = b.toString().split("").toList().filter { it.isNotEmpty() }.sumOf { it.toInt() }
    return valueA * valueB
}

fun testItThree(a: Int, b: Int): Int {
    return a.addSingleValuesFromNumber() * b.addSingleValuesFromNumber()
}


fun Int.addSingleValuesFromNumber() = this
        .toString()
        .split("")
        .toList()
        .filter { it.isNotEmpty() }
        .sumOf { it.toInt() }


