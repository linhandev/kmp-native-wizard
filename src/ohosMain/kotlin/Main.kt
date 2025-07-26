import platform.ohos.hilog.OH_LOG_PrintMsg
import platform.ohos.hilog.LOG_FATAL
import platform.ohos.hilog.LOG_APP

actual fun getOsVersion(): String {
    return "unknown"
}

actual fun printLog(message: String) {
    OH_LOG_PrintMsg(LOG_APP,LOG_FATAL, 0u, "KMP_WIZARD_LOG", message)
}
