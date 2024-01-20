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

    fun palindrome_alg(num:Any):Boolean{
        //change input to string
        var s_num =num.toString()
        //Reverse the string
        var reversed_string = s_num.reversed()
         //Compare them
        if(s_num==reversed_string){
            print("True")
        }
        else{
            println("False")
        }
       return s_num==reversed_string

    }


    fun insertion_sort(one:IntArray){
         // get the lenght of the array
         var x =one.size
        for(i in 1 until x ){
            var key = one[i]
            var j = i - 1
            while (j >= 0 && one[j] > key) {
                one[j + 1] = one[j]
                j--
            }
            one[j + 1] = key

        }



    }


    fun linear_search(value:Any){

        var List = arrayListOf(1,3,4,2,5,6,7,8,9)


        //Returns the list with the value and index
        for ((index, i) in List.withIndex()){
            if (i == value){

                println("FOUND AT:$index")

            }


        }


    }



    fun binary_search(target: Int, list: IntArray): Int {
        // set lowest index to 0
        var low = 0
        // set highest to len - 1
        var high = list.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            val mid_value = list[mid]

            if (mid_value == target) {
                return mid // Return the index where the target is found
            } else if (mid_value < target) {
                low = mid + 1 // Adjust the search range to the right half
            } else {
                high = mid - 1 // Adjust the search range to the left half
            }
        }

        return -1
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

















fun main(args: Array<String>) {
    println("Hello World!")
    var n = 11
    var m = 2
    var List = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12)

    val alg = algorithms()
    //c.addition(n,m)
    //print(addition(m,n))
    //multiplication(m,n)
    //subtraction(m,n)
    //Nonsense_algorithm(1)
    //alg.sumOfEvenNumbers(n)
    //alg.odd_numbers(n)
    //test()
    //alg.palindrome_alg(123)
    //alg.linear_search(5)
   val result = alg.binary_search(2,List)

    if (result != -1) {
        println("Target  found at index $result.")
    } else {
        println("Target  not found in the list.")
    }

}