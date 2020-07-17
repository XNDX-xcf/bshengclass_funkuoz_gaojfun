package 伴生对象

/**
 *Extension 扩展
 * 在已有的类上面添加属性和方法
 *
 *
 * 1.继承
 * 2.装饰模式 组合模式
 * 3.扩展
 * */
open class Car{

}

//继承
class Audi:Car(){

}

//装饰 组合
class Dazhong{
    val car=Car()
    val color:String="red"
    //还可以添加方法
}


//扩展
/**
 * 扩展
 *     fun 添加方法
 *     var 添加属性
 *     val
 * 实际上并没有添加当前这个类中 而是一种映射关系
 * 当扩展方法或者扩展属性和原有的相同 那么原有的优先级高
 * 由于扩展属性没有backing fied 所以扩展属性不能存值 也不能初始化
 * 相当于只是在这个类里面添加了对应的set或get方法
 * 必须为扩展属性显示声明get或者set方法
 *     val get
 *     var get/set
 * */

class Student(var name:String){
    fun work(){
        println("study is my work!")
    }
    companion object{

    }

}

fun Student.eat(){
    println("好吃")
}

fun Student.work(){
    println("学习是我快乐")
}


//扩展属性
val Student.grade:Int
     get() {
         println("grade的get方法")
         return 1
     }
var Student.score:Float
    get() = 84.5f
    set(value) {
        name="$name-$value"
  }

//扩展静态函数和静态属性
//在扩展静态函数和属性时 在类中必须显示写出companion object{}

//扩展静态函数
fun Student.Companion.show(){
    println("这是静态方法")
}

//扩展静态属性
val Student.Companion.url:String
    get() = "www.baidu.com"

fun main() {

   val s=Student("小王")
  /* s.work()
    s.eat()*/
   // s.grade

    println(s.name)
    s.score=80.2f
    println(s.name)
    Student.show()
    Student.url.also {
        println(it)
    }
}