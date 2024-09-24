package com.example.jihyun.firstkmp

import platform.Foundation.NSUserDefaults

// TODO ④: ユーザー情報保存
actual fun persistString(key: String, value: String) {
    NSUserDefaults.standardUserDefaults.setObject(value, forKey = key)
}

// TODO ④: ユーザー情報呼び出し
actual fun restoreString(key: String): String {
    return NSUserDefaults.standardUserDefaults.stringForKey(key) ?: ""
}
