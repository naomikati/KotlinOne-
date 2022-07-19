fun main(args: Array<String>) {
    var age =18
    if(age <18){
        println("Go home")
    }else{
        println("Welcome to the party")
    }
    //GRADING SYSTEM
    var marks =77
    if (marks < 40){
        println("E")
    }else if(marks <50){
        println("D")
    }else if (marks <60){
        println("C")
    }else if (marks <70){
        println("B")
    }else{
        println("A")
    }

    //BETTING SYSTEM
    var bettingNumber =0
    when(bettingNumber) {
        1 -> {
            println("oops! you have lost")
        }
        2 -> {
            println("oops! you have lost")
        }
        3 -> {
            println("oops! you have lost")
        }
        4 -> {
            println("oops! you have lost")
        }
        else -> {
            println("place a number from one to four place bet")
        }
    }

}
