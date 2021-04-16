fun main(){
oddNum()
   println(person("veronicah","catharine","jane","Sharon"))
    robot(2)
    robot(10)
    robot(24)
    number()
}
fun oddNum() {
    for (i in 1..100) {
        if(i %2 !=0){
            println(i)
        }
    }
}
fun person(name1:String,name2:String,name3:String,name4:String):Int{
    var names=arrayOf(name1,name2,name3,name4)
    var busket=0
    for(name in names){
        if(name.length>5){
            busket ++
        }



         }
    return busket
}

fun robot(age:Int) {
    if (age <= 6) {
        println("serve a glass of milk")
    } else if (age <= 15) {
        println("serve a bottle of Fanta orange")

    } else {
        println("serve  a bottle of Cocacola")
    }

}

fun number() {
    for (k in 1..100) {
        if (k % 3 == 0 && k % 5 == 0) {
            println("FizzBuzz")
        }
           else if (k % 3 == 0) {
                println("Fizz")
            }
                else if (k % 5 == 0) {
            println("Buzz")
        }

               else{println(k)

                }


            }

        }






