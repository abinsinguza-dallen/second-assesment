fun main() {
    var text = "akirachix"
    var t =text[1].toString()+text[4]+text[5]+text[3]
    println(t)
    var pin =years(2000,22)
    println(pin)
    var w =modulus(20,36,24)
    println(w)
    var r = name("i love mum")
    println(r.uppercase())
    var q = word("still am nolonger")
    println(q.trimStart())
    println(q.trimEnd())
    println(q.trim())
}
fun years(years:Int , age: Int):String {
    var final = years.toString() + age.toString()
    return final
}
fun modulus(s:Int,t:Int,f:Int):Int{
    var mod =s%t%f
    return mod

}
fun name(word:String):String{
    var t = "i love mum"
    return t

}
fun word(girl:String):String{
    var u = " still am nolonger"
    return u
}