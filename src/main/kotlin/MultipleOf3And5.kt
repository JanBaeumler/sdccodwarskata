fun solution(number: Int) = (0..<number).filter { it % 3 == 0 || it % 5 == 0 }.sum()


fun solutionUgly(number: Int): Int {
    var numberToReturn = 0
    for(int in 0..<number) {
        if(int % 3 == 0 || int % 5 == 0) {
            numberToReturn += int
        }
    }
    return numberToReturn
}
