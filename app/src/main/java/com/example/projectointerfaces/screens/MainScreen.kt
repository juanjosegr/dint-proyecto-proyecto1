package com.example.projectointerfaces.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projectointerfaces.Routes.Routes
import com.example.projectointerfaces.buscador.Buscador
import com.example.projectointerfaces.coches.Coches
import com.example.projectointerfaces.final.Final
import com.example.projectointerfaces.group1.Group1
import com.example.projectointerfaces.menufijotop2.MenuFijoTop2

@Composable
fun MainScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize(),
        ) {
            Group1(Modifier.size(430.dp, 123.dp))
            Buscador(modifier = Modifier
                .size(330.dp, 120.dp)
                .padding(start = 40.dp))
            Coches(modifier = Modifier.size(420.dp, 400.dp), bottonCoche1 = {navController.navigate(Routes.confiCar.routes)})
            Final(modifier = Modifier.size(420.dp, 300.dp))
    }
    }
}