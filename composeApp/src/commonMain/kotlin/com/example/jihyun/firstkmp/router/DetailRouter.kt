package com.example.jihyun.firstkmp.router

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.jihyun.firstkmp.repository.BirdImage
import com.example.jihyun.firstkmp.screen.DetailScreen

/**
 * 詳細 Router
 *
 * @param navController 画面操作
 */
fun NavGraphBuilder.detailRouter(navController: NavHostController) {
    composable<BirdImage>(
        enterTransition = {
            fadeIn(
                animationSpec = tween(durationMillis = 300, easing = LinearEasing)
            ) + slideIntoContainer(
                animationSpec = tween(durationMillis = 300, easing = EaseIn),
                towards = AnimatedContentTransitionScope.SlideDirection.Start
            )
        },
        exitTransition = {
            fadeOut(
                animationSpec = tween(durationMillis = 300, easing = LinearEasing)
            ) + slideOutOfContainer(
                animationSpec = tween(durationMillis = 300, easing = EaseOut),
                towards = AnimatedContentTransitionScope.SlideDirection.End
            )
        }
    ) { entry ->
        val birdImage = entry.toRoute<BirdImage>()
        DetailScreen(navController = navController, birdImage = birdImage)
    }
}
