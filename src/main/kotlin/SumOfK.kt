fun chooseBestSum(t:Int, k:Int, ls:List<Int>):Int {
    ls
        .filter { it < t }
        .sorted()
        .highestValueUnderT(t, k)
    return 0
}

private fun List<Int>.highestValueUnderT(t: Int, k:Int) {
    this.map { it }
}
