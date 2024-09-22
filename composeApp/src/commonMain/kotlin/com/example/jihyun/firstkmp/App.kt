package com.example.jihyun.firstkmp

import androidx.compose.runtime.Composable
import com.example.jihyun.firstkmp.router.RootRouter
import com.example.jihyun.firstkmp.theme.FirstKMPTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    FirstKMPTheme {
        RootRouter()
    }
}
