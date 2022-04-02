fun main(){
    oddNumbers()
    var p=arrayOfNames(arrayOf("tessa", "Gerald","Shimakhokho", "Prudence","Ian","pat"))
    println(p)
    serveDrinks(5)
    serveDrinks(12)
    serveDrinks(25)
    digits()

}
fun oddNumbers(){
    for (x in 1..100){
        if (x%2!==0){
            println(x)
        }
    }
}
fun arrayOfNames(names:Array<String>):Int{
    var number = 0
    names.forEach { n ->
        if (n.length > 5){
            number++
        }
    }

    return number
}
fun serveDrinks(age:Int){
    if (age<=6){
        println("Milk")
    }
    else if (age>6 && age<15){
        println("Fanta Orange")
    }
    else{
        println("Cocacola")
    }
}
fun digits() {
    for (b in 1..100) {
        if (b % 3 == 0) {
            println("Fizz")
        } else if (b % 5 == 0) {
            println("Buzz")
        } else if (b % 3 == 0 && b % 5 == 0) {
            println("FizzBuzz")
        }
        else{
            println(b)
        }
    }
}
