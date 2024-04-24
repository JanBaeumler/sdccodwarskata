fun duplicateCountOne(text: String): Int {
    val chars: Set<Char> = text.toSet()
    println(text.length)
    println(chars.size)
    return text.length - chars.size

}

fun duplicateCountTwo(text: String): Int {
    val groupsOfChars = text.groupBy { it }
    var count = 0
    for (chars in groupsOfChars) {
        if (chars.value.size > 1) {
            count++
        }
    }
    return count
}

fun duplicateCountThree(text: String): Int {
    val groupsOfChars = text.groupBy { it }
    return groupsOfChars.count { group -> group.value.size > 1 }
}

fun duplicateCountFour(text: String): Int {
    val groupsOfChars = text.groupBy { it }
    return groupsOfChars.count { it.value.size > 1 }
}

fun duplicateCount(text: String) = text
    .lowercase()
    .groupBy { it }
    .count { it.value.size > 1 }
