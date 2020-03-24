package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var output = mutableListOf<String>()

        for (i in inputString.indices){
            when(inputString[i]){
                '<' -> output.add(getSubstring(inputString.substring(i), '<', '>'))
                '(' -> output.add(getSubstring(inputString.substring(i), '(', ')'))
                '[' -> output.add(getSubstring(inputString.substring(i), '[', ']'))
            }
        }
        return output.toTypedArray()
    }

    fun getSubstring(string: String, start: Char, end: Char): String{
        var res = ""
        var count = 0

        for (i in 1 .. string.length) {
            if (string[i] == start)
                count++
            else if (string[i] == end && count != 0)
                count--
            else if (string[i] == end && count == 0) {
                res = string.substring(1, i)
                break
            }
        }

        return res
    }


}
