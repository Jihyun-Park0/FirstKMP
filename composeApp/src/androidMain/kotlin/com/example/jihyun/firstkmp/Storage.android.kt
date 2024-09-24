package com.example.jihyun.firstkmp

import android.content.Context


val context get() = ContextHelper.currentContext!!

// TODO ④: ユーザー情報保存
actual fun persistString(key: String, value: String) {

}

// TODO ④: ユーザー情報呼び出し
actual fun restoreString(key: String): String {
    return ""
}
