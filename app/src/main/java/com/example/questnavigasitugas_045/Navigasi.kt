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
) {}
