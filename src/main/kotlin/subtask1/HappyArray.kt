package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty() || sadArray.size == 2) {
            return sadArray
        }
        var sadList = sadArray.toMutableList()
        var currentIndex = 1
        while (currentIndex < sadList.lastIndex){
            val sumOfNearestItems = sadList[currentIndex - 1] + sadList[currentIndex + 1]
            if (sadList[currentIndex] > sumOfNearestItems){
                sadList.removeAt(currentIndex)
                if (currentIndex != 1)
                {
                    currentIndex--
                }
                continue
            }
            currentIndex++
        }
        return sadList.toIntArray()
    }
}
