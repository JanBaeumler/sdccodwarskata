fun high(str: String) = str
    .split(" ")
    .maxBy { it.score() }

fun String.score(): Int {
    return this.sumOf { it.code - 96 }
}
