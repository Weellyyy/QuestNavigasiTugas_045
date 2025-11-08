package com.example.questnavigasitugas_045

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasitugas_045.view.FormScreen
import com.example.questnavigasitugas_045.view.HomeScreen
import com.example.questnavigasitugas_045.view.ListScreen


enum class Page {
    Home,
    List,
    Formulir
}

@Composable
fun AppNavigasi(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Page.Home.name,
        modifier = modifier
    ) {
        composable(route = Page.Home.name) {
            HomeScreen(
                onLoginClicked = {
                    navController.navigate(Page.List.name)
                }
            )
        }

        composable(route = Page.List.name) {
            ListScreen(
                onBerandaClicked = {
                    kembaliKeHome(navController)
                },
                onFormulirClicked = {
                    navController.navigate(Page.Formulir.name)
                }
            )
        }

        composable(route = Page.Formulir.name) {
            FormScreen(
                onBackToListClicked = {
                    kembaliKeList(navController)
                }
            )
        }
    }
}


private fun kembaliKeHome(
    navController: NavHostController
) {
    navController.popBackStack(Page.Home.name, inclusive = false)
}


private fun kembaliKeList(
    navController: NavHostController
) {
    navController.popBackStack()
}
