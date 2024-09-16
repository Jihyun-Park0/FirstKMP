package com.example.jihyun.firstkmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "FirstKMP",
    ) {
        App()
    }
}