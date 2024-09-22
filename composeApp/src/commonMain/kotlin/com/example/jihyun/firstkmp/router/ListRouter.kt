package com.example.jihyun.firstkmp.router

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.jihyun.firstkmp.screen.ListScreen
import kotlinx.serialization.Serializable

/**
 * 一覧 Router
 *
 * @param navController 画面操作
 */
fun NavGraphBuilder.listRouter(navController: NavHostController) {
    composable<ListRoute> {
        ListScreen(navController = navController)
    }
}

@Serializable
object ListRoute
