package GenericInKotlinPart2

//Kotlin: Covariance
//T = Type, K=Key, V =Values, E= ?

/**
 * out produces T and preserves subtyping
 * When you declare a generic type with an out modifier, it's called covariant
 * A covariant is a producer of T, that means functions
 * can return T, but they can't take as parameter
 */

abstract class Laptop(){}
class Technician<out T : Laptop>(){
    //with "out" keyword you can make your generic type covariance...
    fun repair(){

    }
}
class Msi():Laptop(){}
class Lenovo():Laptop(){}
class ServiceCenter(){
    fun addTechnician(technician: Technician<Lenovo>){
    }
}



fun main(args:Array<String>){

    val technician:Technician<Lenovo> = Technician()
    val serviceCenter:ServiceCenter = ServiceCenter()

    serviceCenter.addTechnician(technician)






}