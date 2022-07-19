package oop

fun main(args: Array<String>) {
    var admin=`Admin class`("king",9900000.00,"king@gmail")
    admin.registeruser()
    println(admin.salary)
    admin.setIdNumber("12345")
    println(admin.getidnumber())
}

class `Admin class` {
    var name: String
    var salary: Double
    var email: String
    private var Phonenumber: String = ""
    private var idNumber: String = ""

    constructor(name: String, salary: Double, email: String) {
        this.name = name
        this.salary = salary
        this.email = email
    }

    fun registeruser() {
        println("yeah u can register user")
    }

    fun suspendemployee() {
        println("u can be suspended")
    }

    fun setphonenumber(phonenumber: String) {
        this.Phonenumber = phonenumber
    }

    fun getphonenumber(): String {
        return this.Phonenumber
    }

    fun setIdNumber(idnumber: String) {
        this.idNumber = idNumber
    }

    fun getidnumber(): String {
        return this.idNumber
    }
}
