package oop
fun main(args: Array<String>) {
    var firstInterface = Client()
}
interface FirstInterface {
    var name:String
    fun register()
    fun login(){
        println("Yeah,I can login")
    }
}
class Client():FirstInterface{
    override var name: String = "Jane Doe"
    override fun register() {
        println("Yeah I can register")
    }
}
interface SecondInterface{
    var name:String
    var price:Double
    fun addProduct()
    fun delete()
    fun calculateProfit():Double
}

class Merchandise():SecondInterface{
    override var name: String = "Maize flour"
    override var price: Double = 230.50
    override fun addProduct() {
        
    }

    override fun delete() {
        println("Yeah i can delete any product")
    }

    override fun calculateProfit(): Double {
        println("Yeah i can calculate any profit")
    }


}