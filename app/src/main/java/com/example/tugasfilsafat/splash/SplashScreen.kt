package com.example.tugasfilsafat.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfilsafat.R
import com.example.tugasfilsafat.navigation.Screen
import com.example.tugasfilsafat.ui.theme.TugasFilsafatTheme
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(
    modifier : Modifier = Modifier,
    navController: NavController
){
    LaunchedEffect(Unit){
        delay(2000)
        navController.navigate(Screen.Home.route){
            popUpTo(Screen.SplashScreen.route){
                inclusive = true
            }
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.layer_front),
            contentDescription = "SplasScreeen",
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Filsafat App",
            modifier = modifier
                .padding(
                    top = 20.dp
                ),
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
@Composable
fun SplashScreenPreview(){
    TugasFilsafatTheme {
        SplashScreen(navController = rememberNavController())
    }
}