package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var finalBill = bill.sum() - bill[k]
        return if (finalBill / 2 == b) "Bon Appetit" else (Math.abs(b - finalBill / 2)).toString()
    }
}
