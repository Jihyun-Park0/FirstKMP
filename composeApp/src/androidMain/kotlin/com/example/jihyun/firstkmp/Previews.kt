package com.example.jihyun.firstkmp

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jihyun.firstkmp.screen.DetailScreen
import com.example.jihyun.firstkmp.screen.ListScreen
import com.example.jihyun.firstkmp.screen.LoginScreen
import com.example.jihyun.firstkmp.theme.FirstKMPTheme

/**
 * ログイン画面 Preview
 */
@Preview
@Composable
fun LoginScreen_Preview() {
    FirstKMPTheme {
        LoginScreen()
    }
}

/**
 * 一覧画面 Preview
 */
@Preview(showSystemUi = false)
@Composable
fun ListScreen_Preview() {
    FirstKMPTheme {
        ListScreen()
    }
}

/**
 * 詳細画面 Preview
 */
@Preview(showSystemUi = false)
@Composable
fun DetailScreen_Preview() {
    FirstKMPTheme {
        DetailScreen()
    }
}
