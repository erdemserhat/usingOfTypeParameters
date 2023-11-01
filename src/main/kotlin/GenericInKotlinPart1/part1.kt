package GenericInKotlinPart1

fun main(args:Array<String>){

    /**
     * Generics are the powerful features that allow us to define classes
     * methods and properties which are accessible using different data
     * types while keeping a check of the compile-time safety
     */

    //Let's examine listOf function...

    //The below state is defined using generics and
    //so it's capable of working with just <Int>
    val numbers1 = listOf<Int>(1,2,3)

    var sum1=0
    for(num in numbers1){
        sum1+=num
    }
    println(sum1)

    //The below state is defined using Any and we didn't used generics.
    val numbers2 = myListOf(1,2,3,"1")
    //-->you can add other values :(


    var sum2=0
    for(num in numbers2){
        //sum2+=num--> this gives an error
        sum2+=num as Int
        //-->an explicit casting is done for every num :(

    }


    //With the generic updated function;

    val numbers3 = myUpdatedListOf<Int>(1,2,3,4,5)
    var sum3=0
    for(num in numbers3){
        sum3+=num
        //No need type casting :)
        //Particular object type exist :)
        //General purpose function compatible with any type :)
    }


}

fun myListOf(vararg  element:Any):List<Any> {
    return element.asList()

}

//Let's have a look at updated version

fun <T>myUpdatedListOf(vararg  element:T):List<T>{
    return element.asList()
}