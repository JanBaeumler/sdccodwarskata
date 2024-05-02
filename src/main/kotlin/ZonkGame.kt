fun getScore(dice: IntArray): Int {
    var intToReturn = 0
    var mutableDice: MutableList<Int> = dice.toMutableList()
    if (mutableDice.checkIfContainsAllNumbers() != 0) {
        return mutableDice.checkIfContainsAllNumbers()
    }
    if (mutableDice.checkIfContainsThreePairs() != 0) {
        return mutableDice.checkIfContainsThreePairs()
    }

    if (mutableDice.fiveOfAKind() != 0) {
        intToReturn += mutableDice.fiveOfAKind()
        mutableDice.groupBy { it }.filter { it.value.size == 5 }
    }
    if (mutableDice.checkIfContainsThreeOnes() != 0) {
        intToReturn += mutableDice.checkIfContainsThreeOnes()
        mutableDice = mutableDice.sorted().subList(3, mutableDice.size).toMutableList()
        println(mutableDice)
    }
    if (mutableDice.checkIfContainsTwoOnes() != 0) {
        intToReturn += mutableDice.checkIfContainsTwoOnes()
        mutableDice = mutableDice.sorted().subList(2, mutableDice.size).toMutableList()
    }
    if (mutableDice.checkIfContainsSingleOne() != 0) {
        intToReturn += mutableDice.checkIfContainsSingleOne()
        mutableDice.sorted().subList(1, mutableDice.size)
    }
    if (mutableDice.getNumberWhereCountIsHigherTwo() != null) {
        intToReturn += mutableDice.getNumberWhereCountIsHigherTwo()
        mutableDice.groupBy { it }.filter { it.value.size < 2 }
    }

    if (mutableDice.fourOfAKind() != 0) {
        intToReturn += mutableDice.fourOfAKind()
        mutableDice.groupBy { it }.filter { it.value.size == 4 }
    }
    if (mutableDice.checkIfContainsSingleFive() != 0) {
        intToReturn += mutableDice.checkIfContainsSingleFive()
    }
    return intToReturn
}

fun MutableList<Int>.sixOfAKind(): Int {
    return if (this.toSet().size == 1) {
        (this.toSet().first() * 100) * 4
    } else 0
}

fun MutableList<Int>.fiveOfAKind(): Int {
    return (this
        .groupBy { it }
        .filter { it.value.size == 5 }
        .getOrDefault(0, null)
        ?.get(0) ?: 0) * 100 * 3
}

fun MutableList<Int>.fourOfAKind(): Int {
    return (this
        .groupBy { it }
        .filter { it.value.size == 4 }
        .getOrDefault(0, null)
        ?.get(0) ?: 0) * 100 * 2
}

fun MutableList<Int>.checkIfContainsThreeOnes(): Int {
    return if (this.filter { it == 1 }.size == 3) {
        1000
    } else 0
}

fun MutableList<Int>.checkIfContainsTwoOnes(): Int {
    return if (this.filter { it == 1 }.size == 2) {
        200
    } else 0
}

fun MutableList<Int>.checkIfContainsSingleOne(): Int {
    return if (this.contains(1)) {
        100
    } else 0
}

fun MutableList<Int>.checkIfContainsSingleFive(): Int {
    return if (this.contains(5)) {
        50
    } else 0
}

fun MutableList<Int>.checkIfContainsThreePairs(): Int {
    return if (this.filter { it != 1 && it != 5 }
            .groupBy { it }
            .filter { it.value.size == 2 }.size == 3) {
        return 750
    } else 0
}

fun MutableList<Int>.checkIfContainsAllNumbers(): Int {
    return if (this.toSet().size == 6) {
        1000
    } else 0
}

fun MutableList<Int>.getNumberWhereCountIsHigherTwo(): Int {
   return (this
        .groupBy { it }
        .filter { it.value.size > 2 }
        .getOrDefault(0, null)
        ?.get(0) ?: 0) * 100
}