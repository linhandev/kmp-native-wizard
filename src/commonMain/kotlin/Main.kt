expect fun getOsVersion(): String
expect fun printLog(message: String)

fun main() {
    println(getOsVersion())
    printLog("Hello Kotlin/Native!")
}