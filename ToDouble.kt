fun toDouble(Numerator: Int ,Denominator: Int):Double{

    var double: Double = (Numerator.toDouble()/Denominator.toDouble())
    return (double)
}

fun add(Numerator: Int ,Denominator: Int,Numerator2: Int ,Denominator2: Int):RationalNumber {

    if (Denominator == Denominator2) {

        var numerator3 = Numerator + Numerator2
        var denominator3 = Denominator
        var final = numerator3 / denominator3
        return (RationalNumber(numerator3, denominator3))
    } else {
        var denominator3 = Denominator * Denominator2
        var numerator3 = (Denominator * Numerator2) + (Denominator2 * Numerator)
        return RationalNumber(numerator3, denominator3)
    }
}
fun toString2(numerator3:Int, denominator3:Int){
    var a = numerator3
    a.toString()
    var b = denominator3
    b.toString()