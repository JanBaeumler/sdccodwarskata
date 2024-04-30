fun solution(number: Int): Int {
    return (0..<number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}

fun solutionUgly(number: Int): Int {
    var numberToReturn = 0
    val valuesToCalculate:MutableList<Int> = mutableListOf()
    for(int in 0..<number) {
        if(int % 3 == 0 || int % 5 == 0) {
            valuesToCalculate.add(int)
        }
    }
    for(numberToAdd in valuesToCalculate) {
        numberToReturn += numberToAdd
    }
    return numberToReturn
}
