package Chapter2

fun main() {
    //設定變數
    var a: Int = 5
    var msg: String = "hello"
    var b: Boolean = false
    var c: Char = 'f'
    var e: List<Int> = arrayListOf(1, 2, 5)
    var r: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    r[0] = 1

    //顯示以上變數
    println(a)
    println(msg)
    println(b)
    println(c)
    println(e)
    println(r[3])

}