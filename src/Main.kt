fun  main(){
var result=productIntergers(arrayOf(11,20,63,98,45))
    println(result)
    var answer=addMixed(arrayOf(98,80.8,70.3,60,20.3,10,11.0))
    println(answer)
    var display=characters(arrayOf('a','b','c','d','e','o','u','k','r','v','t','i'))
    println(display)
}
fun productIntergers(nums:Array<Int>):Int{
var product=1
    nums.forEach{ number->
        product*=number

    }
    return product
}

fun addMixed(mixed:Array<Any>):Double{
    var sum=0.0
    mixed.forEach{ num->
        if(num is Double)
            sum+=num

    }
 return sum

}

fun characters(words:Array<Char>):Int {
    var z = 0
    words.forEach { alph ->
        if (alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
        z++

    }
    return z
}


