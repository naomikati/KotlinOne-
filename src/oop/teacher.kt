package oop

fun main(args: Array<String>) {
    var firstStudent = Student("makena",100)
    firstStudent.viewresults()

    var FirstBoardMember = BoardMember("linet",25)
    FirstBoardMember.publishMagazine()
}
open class teacher(open var name: String,open var age:Int){
    fun viewresults(){
        println("Hello $name,you can view results")
    }
    fun publishMagazine(){
        println("Hello $name, you are $age years and you can publish a magazine")
    }
}

 open class Student(name: String,age: Int):teacher(name,age){
    fun sitForExams(){
        println("Hello, i can sit for exams")
    }
}
class BoardMember(name: String,age: Int):Student(name, age){

}