fun toDouble(input:RationalNumber): Double{
    val double: Double = (input.numerator.toDouble()/input.denominator.toDouble())
    return(double)
}

fun add (inputOne:RationalNumber, inputTwo:RationalNumber): RationalNumber {

    val numb1 = inputOne.numerator
    val deno1 = inputOne.denominator
    val numb2 = inputTwo.numerator
    val deno2 = inputTwo.denominator


    var newDen = deno1 * deno2
    val newNum1 = numb1 * deno2
    val newNum2 = numb2 * deno1
    var finalNum = newNum1 + newNum2

    return RationalNumber(finalNum, newDen)

}