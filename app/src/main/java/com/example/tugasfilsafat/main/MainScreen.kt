package com.example.tugasfilsafat.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfilsafat.R
import com.example.tugasfilsafat.component.AddButton
import com.example.tugasfilsafat.ui.theme.TugasFilsafatTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navController: NavController
){
    Scaffold { innerPadding ->
        Column (
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            GetPicturePreview()
            AddButton(
                text = stringResource(R.string.open_file),
                onClick = {

                }
            )
            AddButton(
                text = stringResource(R.string.generate),
                onClick = {

                }
            )
        }
    }
}

@Composable
fun GetPicturePreview(
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_image_24),
            contentDescription = "Photo Preview",
            modifier = modifier
                .width(50.dp)
                .height(50.dp)
        )
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
    device = Devices.PIXEL_4
)
@Composable
fun MainScreenPreview(){
    TugasFilsafatTheme {
        MainScreen(navController = rememberNavController())
        //GetPicturePreview()
    }
}