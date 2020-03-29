package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var payment = (bill.sum() - bill[k]) / 2
        if (payment == b){
            return "Bon Appetit"
        }
        return (b - payment).toString()
    }
}
