fun main() {
    oddNumber()
    println(names(arrayOf("Zillah","Mwimali","Joy","Moraya","Abby","Dedan","Bob")))
    serveDrinks(18)
    serveDrinks(6)
    serveDrinks(15)
    numbers()


}
fun oddNumber(){
    for (number in 1..100){
        if (number%2!==0){
            println(number)
        }

    }
}
fun names(name:Array<String>):Int{
    var total=0
    for (nam in name) {
        if (nam.length >= 5) {
            total++
        }
    }
    return total
}
fun serveDrinks(age:Int){
   if (age<6){
       println("Serve Milk")
   }
    else if (age>6 && age<15){
        println("Serve Fanta Orange ")
   }
    else{
        println("Serve Cocacola")
   }

}
fun numbers(){
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("FizzBuzz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        }
        else (println(num))
    }
}




