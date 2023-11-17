class algorithms() {
    fun Nonsense_algorithm(g: Int) {
        var list = arrayListOf(2, 4, 5)
        for (i in list) {
            for (j in list) {
                var x = i + j


                if (x == g) {
                    println(x)

                } else {
                    println("lie")
                }

                while (x < 4) {
                    print("m")
                }

            }
        }
    }

    fun sumOfEvenNumbers(n: Int): Int {
        //set value to 0 in order to get the numbers
        var sum = 0

        //for i in the range of n basically enumerate each number from 0 till n
        for (i in 1..n) {
            //if its divisible by 2 add to 0
            if (i % 2 == 0) {
                sum += i

            }

        }
        //for some reason return was not bringing value so used this
        println(sum)

        return sum

    }


    fun odd_numbers(n: Int) {
        var sum = 0
        for (i in 1..n) {
            if (i % 2 > 0) {
                sum++
            }

        }
        println("Number of odd numbers from 1 to $n: $sum")
    }
}



fun loop(){
    var ne = 0
    while(ne<3){
        println("Booooo")
        ne++
    }
}









fun test(){
    var list = arrayListOf(2,2,4,5,7)
    for (i in list){

    }
}












class Calculator(){
    fun addition(m:Int,n:Int){
        println(m+n)
    }

    fun subtraction(m:Int,n:Int){
        println(m-n)

    }

    fun multiplication(m:Int,n: Int){
        println(m*n)
    }

    fun division(m:Int,n:Int){

    }

}





fun main(args: Array<String>) {
    println("Hello World!")
    var n = 11
    var m = 10
    var c = Calculator()
    val alg = algorithms()
    //c.addition(n,m)
    //print(addition(m,n))
    //multiplication(m,n)
    //subtraction(m,n)
    //Nonsense_algorithm(1)
    //alg.sumOfEvenNumbers(n)
    //alg.odd_numbers(n)
    //test()
    loop()



}