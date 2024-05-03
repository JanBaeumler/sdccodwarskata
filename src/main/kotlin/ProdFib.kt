fun productFib(prod: Long): LongArray {
    val valueOne = getTwoValuesFromFibonacci(prod)[0]
    val valueTwo = getTwoValuesFromFibonacci(prod)[1]
    return longArrayOf(valueOne, valueTwo, longArrayOf(valueOne, valueTwo).valuesMultipliedEqualToProd(prod))
}

fun getTwoValuesFromFibonacci(prod: Long): LongArray {
    var fOne: Long = 0
    var fTwo: Long = 1
    do {
        val fN = fOne + fTwo
        fOne = fTwo
        fTwo = fN
    } while (prod > fOne * fTwo)
    return longArrayOf(fOne, fTwo)
}

fun LongArray.valuesMultipliedEqualToProd(prod: Long): Long {
    return if (this[0] * this[1] == prod) {
        1
    } else {
        0
    }
}