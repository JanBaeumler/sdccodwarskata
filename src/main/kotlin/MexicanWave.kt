fun waveTryOne(str: String) = str
    .mapIndexed { index, c ->
        c.takeUnless { it.isWhitespace() }?.let { str.toUpperCaseAtGivenIndex(index) }
    }.filterNotNull()

fun wave(str: String) = str.mapIndexed { index, c ->
    if (c.isLetter()) {
        str.toUpperCaseAtGivenIndex(index)
    } else {
        null
    }
}.filterNotNull()

fun String.toUpperCaseAtGivenIndex(givenIndex: Int) = this
    .mapIndexed { index, c ->
        if (index != givenIndex) {
            c.lowercase()
        } else {
            c.uppercase()
        }
    }.joinToString("")
