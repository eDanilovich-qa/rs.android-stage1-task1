package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        val commonSum = input.sum()
        val sumWithoutMin = commonSum - input.min() !!
        val sumWithoutMax = commonSum - input.max() !!
        return intArrayOf(sumWithoutMax, sumWithoutMin)
    }
}
