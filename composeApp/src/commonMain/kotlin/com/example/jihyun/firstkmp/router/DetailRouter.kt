package com.example.jihyun.firstkmp.router

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.jihyun.firstkmp.screen.DetailScreen
import kotlinx.serialization.Serializable

/**
 * 詳細 Router
 *
 * @param navController 画面操作
 */
fun NavGraphBuilder.detailRouter(navController: NavHostController) {
    composable<DetailRoute> { entry ->
        val detail = entry.toRoute<DetailRoute>()
        DetailScreen(navController = navController, id = detail.id)
    }
}

@Serializable
data class DetailRoute(
    /** 識別子 */
    val id: Int
)
