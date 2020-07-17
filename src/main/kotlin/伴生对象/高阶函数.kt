package 伴生对象

/**
启动app ->登陆 -> 加载主页数据
              -> 保存用户信息

 */
fun login(name:String,funParam:(Int)->String){
    //登陆 返回一个ID
    val id=1

    //进一步操作 需要条件选择什么操作
    //val result= loadHomedata(id)
    //val result= saveUserinfo(id)

    //在调用此函数时 我们明确什么操作 直接传递函数 函数对象
    funParam(1).also {
        println(it)
    }
}


fun loadHomedata(id:Int): String {
    println("加载主页数据")
    return "加载成功。。。数据"
}

fun saveUserinfo(id:Int): String {
    println("保存信息")
    return "保存信息。。。。成功"
}

fun main() {

    //匿名函数
    var funA = fun(id: Int): String {
        println("加载主页数据")
        return "加载成功。。。数据"
    }

    //lambda表达式  匿名函数
    //注意如果函数有返回值 不能使用return 默认返回最后一行
    //函数使用大括号括起来{
    //函数参数 -> 返回类型
    //}
    //（）->Unit
    var funB={

    }


    //(Int,Int)->Int
    var funD={a:Int,b:Int->Int
           a+b
    }

    //(Int)- >String
    var funC={id:Int->String
        "$id 加载成功。。。数据"
    }


    //login("Avicii",funC)
    //函数直接作为参数传递
    login("Avicii",{id:Int-> String
        "Avicii $id"
    })

    //如果参数作为参数 而且函数是最后一个参数 可以将函数放在外面
    login("Avicii"){id:Int-> String
        "Avicii $id"
    }

    //如果表达式中只有一个参数 这个参数可以省略 但是在函数对象中是不可以省略的
    login("Avicii"){Int-> String
        "Avicii"
    }
    /**
     *  //函数名仅仅是这个函数的名称
    //函数名前加::表示这个函数的对象
    var funA=::loadHomedata
    var funB=::saveUserinfo

    //invoke函数就是函数对象调用自己的函数
    funA.invoke(10)
    funB.invoke(20)

    //通过函数对象来调用
    funA(1).also {
    println(it)
    }
    funB(2).also {
    println(it)
    }

    (::saveUserinfo).invoke(1)
    (::loadHomedata).invoke(2)
     *
     * */

}