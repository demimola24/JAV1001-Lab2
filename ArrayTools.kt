

fun casearCipher(value: String, shiftValue: Int): String{
    var encryptedValue = ""
    val len: Int = value.length
    for (x in 0 until len) {
        encryptedValue += if ((value[x] + shiftValue) > 'z') (value[x] - (26 - shiftValue)) as Char else (value.get(
            x
        ) + shiftValue)
    }
    return encryptedValue
}

fun casearCipherTesting(){
    // Getting input from the user
    val input = Scanner(System.`in`)

    println("Enter a string to encrypt: ")
    val numberInput = input.nextLine()

    println("Enter a shift value (Int): ")
    val shiftInput = input.nextInt()

    println("Encrypted value is : ${casearCipher(numberInput,shiftInput)}")
}

fun arrayAveraging(input: Array<Int>): Double{
    return if (input.isNullOrEmpty()) 0.0
    else {
        var sum = 0.0
        for (i in input) {
            sum += i
        }
        sum / input.size
    }
}
fun arrayAvgTestCases(){
    println("Average is ${arrayAveraging(arrayOf(3,2,4))}")
    println("Average is ${arrayAveraging(arrayOf(-2,2,-4))}")
    println("Average is ${arrayAveraging(arrayOf(0,0,0))}")

}

fun arrayContains(values: Array<Int>, query: Int): Boolean{
    for(number in values){
        if(number==query){
            return true
        }
    }
    return false
}
fun arrayContainsTestCases(){
    println(arrayContains(arrayOf(3,2,4),2))
    println(arrayContains(arrayOf(-3,-2,-4),2))
    println(arrayContains(arrayOf(0,0,0),2))

}


fun arrayReverse(values: Array<Int>): Array<Int>{
    val mutableList = mutableListOf<Int>()
    for (i in values.lastIndex downTo 0) {
        mutableList.add(values[i])
    }
    return mutableList.toTypedArray()
}

fun arrayReverseTestCases(){
    println(Arrays.toString(arrayReverse(arrayOf(-3,-2,-4))))
    println(Arrays.toString(arrayReverse(arrayOf(1,1,3))))
    println(Arrays.toString(arrayReverse(arrayOf(-3,-0,100))))
}

