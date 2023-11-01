fun main(args:Array<String>){
    val box = Box("X")

    //Only compatible with Strings
    println(box.get())
   (box.set("Y"))
    println(box.get())

    //Compatible with any data type such as Int
    val genericBox = GenericBox<Int>(1)
    println(genericBox.get())
    genericBox.set(1212)
    println(genericBox.get())

    //Compatible with any data type such as Boolean

    val genericBoxBoolean = GenericBox<Boolean>(true)
    println(genericBoxBoolean.get())

    val genericBoxForAny = GenericBox<Any>(Any())
    genericBoxForAny.get()

}


/**
 * This function is only workable for String data types
 * But you think ; should we do implements a function in every data type??
 */
class Box(text:String){
    private var text:String?=text
    fun get():String?=text
    fun set(a:String){
        this.text=a
    }
}

/**
 * Solution;
 * Generics allow you to implement system as general data type
 * so your function can take parameter any data type
 */
class GenericBox<T>(t:T){
    private var data:T?=t
    fun get():T?=data
    fun set(t:T){
        data=t
    }

}
