class User {
    lateinit var address:String
    val status by lazy("active")

    fun setUserAddres(address:String){
        this.address = address
    }

    override fun toString():String{
        return if(::address.isInitialized)
            "$status - $address"
        else
            status
    }
}