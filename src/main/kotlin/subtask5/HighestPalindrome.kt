package subtask5


import java.lang.Integer.max
import java.lang.StringBuilder

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val res = StringBuilder(digitString)
        val needToChange = BooleanArray(n / 2)
        var numberChanges = k

        for (i in 0 until res.length / 2) {
            if (res[i] != res[n - 1 - i]) {
                numberChanges--
                needToChange[i] = true
            }
        }

        if (numberChanges >= 0) {
            for (i in 0 until res.length / 2) {
                if (!needToChange[i]) {
                    if (numberChanges >= 2 && res[i] != '9') {
                        equal(res, i, '9')
                        numberChanges -= 2
                    }
                } else {
                    if (res[i] != '9' && res[n - i - 1] != '9' && numberChanges >= 1) {
                        equal(res, i, '9')
                        numberChanges--
                    } else {
                        equal(res, i,
                            max(res[i].toInt(), res[n - i - 1].toInt()).toChar())
                    }
                }
            }
            if (numberChanges >= 1) {
                res[n / 2] = '9'
            }
            return res.toString()
        } else {
            return "-1"
        }
    }

    private fun equal(string: StringBuilder, index: Int, value: Char) {
        string[index] = value
        string[string.length - 1 - index] = value
    }
}
