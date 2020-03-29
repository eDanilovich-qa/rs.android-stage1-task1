package subtask5

import java.lang.StringBuilder

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var result = StringBuilder()
        var number = n/2
        var counter = k
        var indexex = mutableListOf<Int>()
        for (index in 0 until number){
            var a = if (index == 0) digitString.lastIndex else (index * 2) + 1
            if (digitString[index] != digitString[a]){
                if (digitString[index] > digitString[a]) result.append(digitString[index]) else result.append(digitString[a])
                indexex.add(index)
                counter--
            }
            else{
                result.append(digitString[index])
            }
            if (counter < 0){
                return "-1"
            }
        }

        while (counter > 0){
            for (index in indexex){
                if (digitString[index] != '9'){
                    result[index] = '9'
                    counter--
                }
                if(indexex.indexOf(index) == indexex.lastIndex && counter > 0){
                    break
                }
            }
        }

        var string = result.reversed()
        if (n % 2 != 0){
            result.append(digitString[number])
        }
        result.append(string)
        return result.toString()
    }
}
