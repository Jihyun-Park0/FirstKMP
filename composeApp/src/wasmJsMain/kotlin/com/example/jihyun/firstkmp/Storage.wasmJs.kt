package com.example.jihyun.firstkmp

import kotlinx.browser.localStorage

// TODO ④: ユーザー情報保存
actual fun persistString(key: String, value: String) {
    localStorage.setItem(key, value)
}

// TODO ④: ユーザー情報呼び出し
actual fun restoreString(key: String): String {
    return localStorage.getItem(key) ?: ""
}
