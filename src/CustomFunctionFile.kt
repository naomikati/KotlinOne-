fun main(args: Array<String>) {
motto()
userVerification("mah_kena","naomikati@gmail")
average(24.0, 45,24.0f)
addition(300,300.0)
println(addition(300,300.0))
login("mah_kena")
login("makena","mah-kkena")
}

fun motto(){
    println("Hello this is our motto")
}
fun userVerification(name:String,email:String){
    println("hello,your username is $name and your email is $email")
}
fun average(x:Double, y:Int, z:Float) {
    var result = (x + y + z) / 3.0
    println("Hello, your average is $result")
}
fun addition(x:Int, Y:Double):Double{
    var answer =x + Y
    return answer
}
fun login(name:String){
    println("hello, your name is $name")
}
fun login(email: String,password:String){
    println("hello,your email is $email and your password is $password")
}