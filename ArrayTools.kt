

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