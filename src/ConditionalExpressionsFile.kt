fun main(args: Array<String>) {
    var marks = 67
    var result = if (marks <50){
        "E"
    }else if (marks <60){
        "D"
    }else if (marks <70){
        "C"
    }else if (marks <80){
        "B"
    }else {
        "A"
    }
    println(result)

    var bettingNumber =0
    var bettingResult= when(bettingNumber){
        1->{
            "oops!! you have lost"
        }
        2->{
            "Congrats!! you have won"
        }
        3->{
            "oops!! you have lost"
        }
        else->{
            "please enter a number from 1 - 3to bet"
        }
    }
    println(bettingResult)

}