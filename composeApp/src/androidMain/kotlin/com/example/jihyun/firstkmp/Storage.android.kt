package com.example.jihyun.firstkmp

import android.content.Context


val context get() = ContextHelper.currentContext!!
val preferences = context.getSharedPreferences("first-kmp", Context.MODE_PRIVATE)

// TODO ④: ユーザー情報保存
actual fun persistString(key: String, value: String) {
    preferences.edit().putString(key, value).apply()
}

// TODO ④: ユーザー情報呼び出し
actual fun restoreString(key: String): String {
    return preferences.getString(key, "") ?: ""
}
