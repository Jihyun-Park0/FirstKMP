package com.example.jihyun.firstkmp.router

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.jihyun.firstkmp.screen.LoginScreen
import kotlinx.serialization.Serializable

/**
 * ログイン Router
 *
 * @param navController 画面操作
 */
fun NavGraphBuilder.loginRouter(navController: NavHostController) {
    composable<LoginRoute> {
        LoginScreen(navController = navController)
    }
}

@Serializable
object LoginRoute
