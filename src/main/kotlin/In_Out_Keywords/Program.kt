package In_Out_Keywords


open class User()

class StandardUser:User()

class PremiumUser:User()


fun main(args:Array<String>){

    var myPremiumUserList:List<PremiumUser> = listOf()
    var myStandardUserList:List<StandardUser> = listOf()
    var myUserList:List<User> = listOf()

    //
    /**
     * As you can see, as List is a covariance, I can assign myPremiumList
     * object to myUserList variable
     * So, baseclass object can be replaceable with subclass object
     * -->List<> is covariance because it is defined "out" keyword
     * let's press ctrl and examine
     */
    myUserList=myPremiumUserList

    /**
     * For example, MutableList does not contain "out" keyword and that's
     * why it is not a covariance therefore you cannot assign a subclass object
     * instead of a base class object ;
     * */

    var myPremiumUsers:MutableList<PremiumUser> = mutableListOf()
    var myStandardUsers:MutableList<StandardUser> = mutableListOf()
    var myUsers:MutableList<User> = mutableListOf()

    /*
    myUsers=myPremiumUsers
    -->Gives an error
    Type mismatch.
    Required:MutableList<User>
    Found:MutableList<PremiumUser>
     */


}






