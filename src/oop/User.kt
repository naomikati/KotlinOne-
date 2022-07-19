package oop

fun main(args: Array<String>) {
    var firstuser=User("king" ,"king@gmail.com","1234","1234")
    firstuser.register()
    firstuser.login()
}
class User {
    /// these are the user properties
    var name: String
    var email: String
    var password: String
    var confirmpassword: String
    //THIS IS A CONSTRUCTOR

    constructor(name: String, email: String, password: String, confirmpassword: String){
    this.name=name
    this.email=email
    this.password=password
    this.confirmpassword=confirmpassword
}
    fun register() {
        if (!password.equals(confirmpassword)) {
            println("passwords dont match")
        } else {
            println("user registered successfully")
        }
    }

    fun login() {
        if (email.equals("emobilis@gmail") && password.equals(1234)) {
            println("login successfull")
        } else {
            println("login failed")
        }
    }
}