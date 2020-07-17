package 伴生对象
/**
 * Companion Object 伴生对象
 * HttpRwquesst类 -> 加载到内存类对象 Class (静态属性 静态方法) -> 对象（成员属性 实例方法）
 *
 * */

fun main() {
    HttpRequest.url
    HttpRequest.loaddata()

    Image.mohu()
    Image.saveBitmapToFile()
    Image.scale()
}

//如果一个类里面全是静态方法 静态属性
//替换JAVA里面的工具类
object Image{
    fun scale(){

    }
    fun saveBitmapToFile(){

    }
    fun mohu(){

    }
}

class HttpRequest{
    companion object{
        var url:String="www.baidu.com"
        fun loaddata(){
            println("下载数据")
        }
    }
}