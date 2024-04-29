fun rgb(r: Int, g: Int, b: Int): String {
    return "${convertToHexInRange(r)}${convertToHexInRange(g)}${convertToHexInRange(b)}"
}

private fun convertToHexInRange(color: Int): String {
    return when {
        color < 0 -> "00"
        color > 255 -> "FF"
        else -> Integer.toHexString(color).padStart(2, '0').uppercase()
    }
}

/*
@OptIn(ExperimentalStdlibApi::class)
private fun convertToHexInRangeTwo(color: Int): String {
    return color
        .coerceIn(0, 255)
        .toHexString()
        .uppercase()
        .takeLast(2)
}

private fun convertToHexInRangeOne(color: Int): String {
    return when {
        color < 0 -> Integer.toHexString(0).padStart(2, '0').uppercase()
        color > 255 -> Integer.toHexString(255).padStart(2, '0').uppercase()
        else -> Integer.toHexString(color).padStart(2, '0').uppercase()
    }
}


fun rgbOne(r: Int, g: Int, b: Int): String {
    val valueRed = checkIfColorIsInRange(r)
    val valueGreen = checkIfColorIsInRange(g)
    val valueBlue = checkIfColorIsInRange(b)
    return "$valueRed$valueGreen$valueBlue"

}

@OptIn(ExperimentalStdlibApi::class)
private fun checkIfColorIsInRange(color: Int): String {
    return when {
        color < 0 -> 0.toHexString().uppercase().takeLast(2)
        color > 255 -> 255.toHexString().uppercase().takeLast(2)
        else -> color.toHexString().uppercase().takeLast(2)
    }
}*/
