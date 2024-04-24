import java.util.*

fun toCamelCase(str:String):String {
    return str
        .split("-", "_")
        .mapIndexed {index, value ->
            if(index == 0) {value}
            else value.replaceFirstChar { it.uppercase() } }
        .joinToString ("")
}



fun toCamelCaseTwo(str:String):String {
    return str
        .split("-", "_")
        .joinToString("") { value -> value.replaceFirstChar { it.uppercase() } }
        .replaceFirstChar { str[0] }

}