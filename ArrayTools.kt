

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
