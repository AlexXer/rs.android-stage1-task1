package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var isEmpty = false
        val happyList = sadArray.toMutableList()
        if (sadArray.isEmpty()) {
            isEmpty = true
        } else {
            var index = 1
            while (index != happyList.size - 1) {
                if (happyList[index] > happyList[index + 1] + happyList[index - 1]) {
                    happyList.removeAt(index)
                    if (index != 1)
                        index--
                } else {
                    index++
                }
            }
        }

        return if (isEmpty) sadArray else happyList.toIntArray()
    }
}
