object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
        return elements.filterIndexed { index, i ->
            !elements.isPresentInSubList(index, i) || elements.valueIsUnderMaxOcurrences(index, maxOcurrences, i)
        }.toIntArray()
    }

    private fun IntArray.isPresentInSubList(index: Int, element: Int) = this.createSublist(index).contains(element)

    private fun IntArray.valueIsUnderMaxOcurrences(index: Int, maxOcurrences: Int, element: Int) =
        this.createSublist(index).groupBy { it }.getValue(element).size < maxOcurrences

    private fun IntArray.createSublist(index: Int) = this.toList().subList(0, index)
}

private fun IntArray.inOneMethod(maxOcurrences: Int) = this.filterIndexed { index, i ->
    !this.toList().subList(0, index).contains(i) || this.toList().subList(0, index).groupBy { it }
        .getValue(i).size < maxOcurrences
}.toIntArray()


// Mit Tipp von Daniel Knuth
private fun firstTry(elements: IntArray, maxOcurrences: Int) = elements.filterIndexed { index, i ->
    elements
        .toList()
        .slice(0 .. index)
        .count { it == i } < maxOcurrences
}.toIntArray()


private fun IntArray.uglyWay(maxOcurrences: Int): IntArray {
    val newList: MutableList<Int> = mutableListOf()
    for (element in this) {
        if (!newList.contains(element) || newList.groupBy { it }.getValue(element).size < maxOcurrences) {
            newList.add(element)
        }
    }
    println(newList)
    return newList.toIntArray()
}