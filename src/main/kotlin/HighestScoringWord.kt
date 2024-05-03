fun high(str: String) = str
    .split(" ")
    .maxByOrNull { it.toCharArray().sumOfOneWord() }!!


fun CharArray.sumOfOneWord(): Int {
    return this.sumOf { it.code - 96 }
}
