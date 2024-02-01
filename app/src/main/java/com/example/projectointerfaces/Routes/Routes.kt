package com.example.projectointerfaces.Routes

sealed class Routes (val routes: String) {
    object MainScreen: Routes ("MainScreen")
    object confiCar: Routes ("ConfiCar")


}