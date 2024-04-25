fun findMissingLetterOne(array: CharArray): Char {
    var count = 0
    for (char in array[0]..array[array.size - 1]) {
        if (char != array[count]) {
            return char
        } else {
            count++
        }
    }
    return ' '
}

fun findMissingLetterTwo(array: CharArray): Char {
    for (i in array.indices) {
        if (array[i].plus(1) != array[i + 1]) {
            return array[i] + 1
        }
    }
    return ' '
}

fun findMissingLetter(array: CharArray): Char {
    array.mapIndexed { index, c ->
        if (c + 1 != array[index + 1]) {
            return c + 1
        }
    }
    return ' '
}

