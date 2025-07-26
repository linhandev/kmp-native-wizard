import platform.Foundation.NSLog
import platform.Foundation.NSProcessInfo

actual fun getOsVersion(): String = NSProcessInfo.processInfo.operatingSystemVersionString

actual fun printLog(message: String) {
    NSLog("[KMP_WIZARD_LOG] %@", message) // %@ is the format specifier for objects (like String)
}