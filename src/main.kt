//1: Write a function that Adds Two Numbers
fun main(){
    Add2(1,3)
    var sqr=square(5)
    println(sqr)
    displayNames("Lisa ","Anita ","Lace")
    var another=mainz(arrayOf())
    println(another)
    ma1n()

    var myPhone=Mobile("A52","Samsung",20000)
    println(myPhone)

    var fullDetails=Details("Nash","Ash",20)
    println(fullDetails)

    var employeesName=Employee("Mwanaisha Hamadi","mwanaishamadi@gmail.com","Amazon,Carlifonia")
    println(employeesName)

    dataTypes()

    newArray()
}
fun Add2(a:Int,b:Int){
    var sum=a+b
    println(sum)
}
//2:Write a function that finds the square of a number
fun square(numb:Int):Int{
    var b=numb*numb
    return b
}
//3:Write a function that displays names
fun displayNames(name1:String,name2:String,name3:String){
    var namez=name1.plus(name2).plus(name3)
    println(namez)
}
//4:Given below is an example of Character  Convert char to String
//fun main(args: Array<String>) {
//    Val ch = 'c'
//    }
fun mainz(args: Array<Char>) :String {
    val ch = 'c'
    return ch.toString()
}
//5:Given below is an example of a kotlin character array convert to string.
//fun main(args: Array<String>) {
//
//    val ch = charArrayOf('a', 'e', 'i', 'o', 'u')
//  }
fun ma1n(){
    val bh=charArrayOf('a','e','i','o','u')
    bh.toString()
    println(bh)
}
//1:Create a class Mobile containing the following state
//a(Model
//b(Brand
//c(MRP
//
//a( print out the detail of the mobile

data class Mobile(var model:String,var brand:String,var mrp:Int)

//2:Create a class containing firstName,lastName, and age
//a(Println fullName  and age

data class Details(var firstName:String,var lastName:String,var age:Int)

//3:Create a class employee containing the following state
//a: Name
//b: Email
//c: Company
//i(Print the output

data class Employee(var Name:String,var Email:String,var Company:String)

//4:Given below is an example of data type.
//a( find there data types
//Val subjects = 5
//val marks = 47.5
//val name = "Deepak"

fun dataTypes(){
    val subjects = 5
    val marks=47.5
    val name="Deepak"
    if (subjects is Int){
        println(subjects)
    }else {
        println("not Int")
    }
    if (marks is Double){
        println(marks)
    }else{
        println("not Double")
    }
    if(name is String){
        println(name)
    }else{
        println("I don't know what this is")
    }
}
//5:Given below is an example of an array
//Write a  Program to Add Two Integers
//i: Print an Array using For loop
//Val array = intArrayOf(1, 2, 3, 4, 5)
fun newArray(){
    var array = intArrayOf(1, 2, 3, 4, 5)
    array.forEach { new->
        println( array)
        var array2=array.set(6,7)
        println(array2)

    }

        // creating empty arraylist using constructor
        var arraylist=ArrayList<Int>()
        // adding elements
        arraylist.add(10)
        arraylist.add(20)
        arraylist.add(30)
        arraylist.add(40)
        arraylist.add(50)
    println(arraylist)

}