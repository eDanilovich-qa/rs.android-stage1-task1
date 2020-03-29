package subtask4

import java.lang.Exception

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var resultArray = mutableListOf<String>()
        var currentCharIndex = 0
        while(inputString.length > currentCharIndex){
            var currentChar = inputString[currentCharIndex]
            if (inputString[currentCharIndex] in "<[("){
                var tempString = inputString.substring(currentCharIndex + 1)
                val closedItemIndex = tempString.indexOf(getValue(currentChar))
                if (closedItemIndex != -1){
                    resultArray.add(tempString.substring(0, closedItemIndex))
                }
            }
            currentCharIndex++
        }
        return resultArray.toTypedArray()
    }

    fun getValue(startSymbol: Char): Char{
        return when (startSymbol){
            '(' -> ')'
            '<' -> '>'
            '[' -> ']'
            else -> {
                throw Exception()
            }
        }
    }
}
