
    fun getCountOne(str: String) : Int {
        var count = 0
        for (char in str) {
            if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
                count++
            }
        }
            return count
    }

    fun getCountTwo(str: String) : Int {
        val filteredString = str.filter { char: Char -> char == 'a' || char == 'e' || char == 'i' || char == 'o' ||
                char == 'u' }
        return filteredString.count()
    }

    fun getCountThree(str: String) : Int {
        return str.filter { char: Char -> char == 'a' || char == 'e' || char == 'i' || char == 'o' ||
                char == 'u' }.count()
    }

    fun getCount(str: String) : Int {
        return str.count { char: Char -> char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' }
    }
