package com.example.jihyun.firstkmp

import java.io.File

// TODO ④: ユーザー情報保存
actual fun persistString(key: String, value: String) {
    File("$key.txt").writeText(value)
}

// TODO ④: ユーザー情報呼び出し
actual fun restoreString(key: String): String {
    val file = File("$key.txt")
    if (!file.exists()) return ""
    return file.readText()
}
