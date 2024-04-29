object ToSmallest {

    fun smallest(n: Long): LongArray {
        val firstNumberIsSmallest = n.checkIfFirstIsSmallest()
        val smallestNumber = n.smallestValue()
        val indexSmallestNumber = n.indexForSmallestNumber(smallestNumber)
        val changedLong:Long =  if(firstNumberIsSmallest) {
            n.toListOfInteger().subList(1, 6).joinToString("").toLong().moveSmallestValue(indexSmallestNumber)
        } else {
            n.moveSmallestValue(indexSmallestNumber)
        }
        val newIndexSmallestNumber = changedLong.indexForSmallestNumber(smallestNumber)
        return longArrayOf(changedLong, indexSmallestNumber, newIndexSmallestNumber)
    }

    private fun Long.moveSmallestValue(indexSmallestNumber: Long): Long {
        val smallestNumber = this.toListOfInteger()[indexSmallestNumber.toInt()]
        return this.toListOfInteger()
            .filterIndexed { index, c -> index.toLong() != indexSmallestNumber }
            .joinToString("")
            .padStart(6, smallestNumber.toString().toCharArray()[0])
            .toLong()
    }

    private fun Long.checkIfFirstIsSmallest(): Boolean {
        return this.takeLowestOneBit().toInt() == this.toListOfInteger().sorted()[0]
    }

    private fun Long.smallestValue(): Long {
        val firstNumber = this.toListOfInteger()[0]
        val sortedNumbers =  this
            .toListOfInteger()
            .sorted()
        return if(sortedNumbers[0] == firstNumber) {
            sortedNumbers[1].toLong()
        } else {
            sortedNumbers[0].toLong()
        }
    }

    private fun Long.indexForSmallestNumber(smallestNumber: Long): Long {
        return this
            .toListOfInteger()
            .indexOf(smallestNumber.toInt())
            .toLong()
    }

    private fun Long.toListOfInteger() = this.toString()
        .split("")
        .filter { it.contains("[0-9]".toRegex()) }
        .map { it.toInt() }
}
