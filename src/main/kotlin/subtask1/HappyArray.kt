package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var isEmpty = false
        var happyList =sadArray.toMutableList()
        if (sadArray.size == 0) {
            isEmpty = true
        } else {
            var isModified = true
            while (isModified) {
                isModified = false
                for (index in happyList.indices) {
                    if (index != 0 && index != happyList.lastIndex && happyList[index] > happyList[index - 1] + happyList[index + 1]) {
                        happyList.removeAt(index)
                        isModified = true
                        break
                    }
                }

            }
        }

        return if (isEmpty) sadArray else happyList.toIntArray()
    }
}
