package com.example.projectointerfaces.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projectointerfaces.exteriorselect.ExteriorSelect
import com.example.projectointerfaces.final.Final
import com.example.projectointerfaces.interior.Interior
import com.example.projectointerfaces.intselect.IntSelect
import com.example.projectointerfaces.irexterior.IrExterior
import com.example.projectointerfaces.irinteri.IrInteri
import com.example.projectointerfaces.menufijodown.MenuFijoDown
import com.example.projectointerfaces.menufijotop2.MenuFijoTop2
import com.example.projectointerfaces.menutop.MenuTop
import com.example.projectointerfaces.partearriba.ParteArriba
import com.example.projectointerfaces.partetextos.ParteTextos
import com.example.projectointerfaces.totalpestana.TotalPestana
import com.google.relay.compose.RowScopeInstanceImpl.align

@Composable
fun ConfiCar(navController: NavController){
    Box(
        modifier = Modifier
        .align(Alignment.CenterVertically)) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .verticalScroll(
                    rememberScrollState(30000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(top = 123.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            //MenuFijoTop2(modifier = Modifier.size(430.dp,123.dp))
            ParteArriba(modifier = Modifier.size(430.dp,583.dp))
            Spacer(modifier = Modifier.height(16.dp))
            ParteTextos(modifier = Modifier.size(430.dp,510.dp))
            Spacer(modifier = Modifier.height(60.dp))
            ExteriorSelect(modifier = Modifier.size(430.dp,32.dp))
            Spacer(modifier = Modifier.height(16.dp))
            IrExterior(modifier = Modifier.size(430.dp,370.dp))
            Spacer(modifier = Modifier.height(120.dp))
            com.example.projectointerfaces.exterior.Exterior(modifier = Modifier.size(430.dp,480.dp))
            Spacer(modifier = Modifier.height(16.dp))
            IrInteri(modifier = Modifier.size(430.dp,24.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Interior(modifier = Modifier.size(430.dp,884.dp))
            Spacer(modifier = Modifier.height(16.dp))
            IntSelect(modifier = Modifier.size(430.dp,32.dp))
            Spacer(modifier = Modifier.height(16.dp))
            TotalPestana(modifier = Modifier.size(430.dp,583.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Final(modifier = Modifier.size(430.dp,190.dp))
        }
        Box(
            modifier = Modifier
                .size(430.dp,123.dp)
                .align(Alignment.TopCenter))
        {
            MenuFijoTop2()
        }
        Box(
            modifier = Modifier
                .size(width = 439.dp, height = 30.dp)
                .align(alignment = Alignment.BottomCenter)
        ) {
            MenuFijoDown()
        }
    }
}
