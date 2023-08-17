open class Color(val name:String,val symbol:String,val hexcode:String){
    open fun returnAttributes():String{
        return "$name,$symbol,$hexcode"
        println("$name")
    }

}
class Rainbow(name: String,symbol: String,hexcode: String) :Color(name, symbol, hexcode){
    override fun returnAttributes(): String {
        return super.returnAttributes()
    }
    fun rainbowColors(){
        val colors = listOf(
            Rainbow("Red","R","#ff0000"),
            Rainbow("BLUE","R","#ff0000"),
        )
        for (x in colors){
            println(x.returnAttributes())
        }
    }

}

fun main (){
    val rainbow = Rainbow("","","")
    rainbow.rainbowColors()
}