package com.example.jihyun.firstkmp.router

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

/**
 * Root Router
 *
 * @param modifier 装飾
 */
@Composable
fun RootRouter(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = LoginRoute,
        modifier = modifier
    ) {
        // ログイン
        loginRouter(navController)

        // 一覧
        listRouter(navController)

        // 詳細
        detailRouter(navController)
    }
}
