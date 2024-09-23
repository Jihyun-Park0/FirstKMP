package com.example.jihyun.firstkmp.router

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.jihyun.firstkmp.repository.BirdRepository
import com.example.jihyun.firstkmp.screen.ListScreen
import com.example.jihyun.firstkmp.viewmodel.ListViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable

/**
 * 一覧 Router
 *
 * @param navController 画面操作
 */
fun NavGraphBuilder.listRouter(navController: NavHostController) {

    val birdRepository = BirdRepository(httpClient)

    val listViewModel = ListViewModel(birdRepository)

    composable<ListRoute> {
        val uiState = listViewModel.uiState.collectAsState()

        LaunchedEffect(listViewModel) {
            listViewModel.updateImages()
        }

        ListScreen(
            navController = navController,
            list = uiState.value.images
        )
    }
}

val httpClient = HttpClient {
    install(ContentNegotiation) {
        json()
    }
}

@Serializable
object ListRoute
