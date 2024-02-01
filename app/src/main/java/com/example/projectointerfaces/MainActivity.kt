package com.example.projectointerfaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectointerfaces.Routes.Routes
import com.example.projectointerfaces.coches.Coches
import com.example.projectointerfaces.screens.ConfiCar
import com.example.projectointerfaces.screens.MainScreen
import com.example.projectointerfaces.ui.theme.ProjectoInterfacesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectoInterfacesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController, startDestination = Routes.MainScreen.routes
                    ){
                        composable(Routes.MainScreen.routes){ MainScreen(navController) }
                        composable(Routes.confiCar.routes){ ConfiCar(navController)}
                    }
                }
            }
        }
    }
}