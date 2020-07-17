package 伴生对象

//伴生对象使用companion object
//在Java里面  单例实现的步骤是先私有化构造方法
//在kotlin里面私有化构造方法  private constructor()

/**
 * 饿汉式
 * */
class Person private constructor(){
    companion object{
        val instance=Person()
    }
}



/**
 * 懒汉式
 * */
//java式
class Sqlite private constructor(){
    companion object{
        var default:Sqlite?=null
        fun getInstance():Sqlite{
            if (default==null){
                synchronized(this) {
                    default=Sqlite()
                }
            }
            return default!!
        }
    }
    fun show(){
        println("hello!!")
    }
}

//kotlin式
class Sqlite2 private constructor(){
    companion object{
        val default:Sqlite2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
            Sqlite2()
        }
    }
    fun show(){
        println("hello!!")
    }
}

fun main() {
    Sqlite.getInstance().show()
    Sqlite2.default.show()
}