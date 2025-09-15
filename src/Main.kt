fun main() {
    val input = "AAADSSSRRTTHAAAA"
    val output = StringBuilder()
    var count = 1
    var prevChar = input[0]
    for (i in 1 until input.length) {
        val currentChar = input[i]
        if (currentChar == prevChar) {
            count++
        } else {
            output.append(prevChar)
            if (count >= 2) {
                output.append(count)
            }
            prevChar = currentChar
            count = 1
        }
    }
    output.append(prevChar)
    if (count >= 2) {
        output.append(count)
    }
    println(output.toString())
}