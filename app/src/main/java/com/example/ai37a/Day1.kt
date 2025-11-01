package com.example.ai37a
import androidx.compose.animation.scaleOut

fun main() {
    print ("Hello world")
    println("Hello")

    //mutable
    var age= 20
    age=5

    //imutable
    val roll = 20

    //data type
    var a : Boolean= true
    var b : Int = 555
    var c : Double =3.44
    println(a)
    println(b)
    println(c)

    //conversion
    var num: Double =4.44
    var x: Int= num.toInt()

    println(x)

    var d : String ="Hello"
    var e : Int =d.length
    print(e)
    print(d.isEmpty())
    println(d.lowercase())
    println(d.uppercase())
    println(d.plus(", How are you?"))

    //array
    var age1 = arrayOf(1,2,3)
    println(age1)
    println("The first element of age is"+ age1)
    println("The second element of age is"+ age1)
    println("The third element of age is"+ age1)

    //arrayList
    var value= ArrayList<Int>()
    value.add(1)
    value.add(1,2)

    var value1= arrayListOf<Int>(1,2)

    //if-else
    var number : Any = readln()!!.toInt()
    if(number.toString().toInt() % 2 ==0){
        println("$number is even")
    }
    else{
        println("$number is odd")
    }

    //for loop
    for (i in 1..9){
        println(i)
    }

    //while loop
    var i : Int=0
    while (i<5){
        println(i)
        i++
    }

    var num1=1
    do {
        println(num1)
        num1++
    }
    while(num1 <= 15)



    // Create a  dictionary
    val dictionary = mapOf(
        "apple" to "A red or green fruit.",
        "ball" to "A round object used in games.",
        "cat" to "A small animal that says meow.",
        "dog" to "A loyal animal that barks.",
        "elephant" to "A large animal with a trunk."
    )
    println("Enter a word: ")
    val word: String = readln()
    println("meaning ${dictionary[word]}")



}