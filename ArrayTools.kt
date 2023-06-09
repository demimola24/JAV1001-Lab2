

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
