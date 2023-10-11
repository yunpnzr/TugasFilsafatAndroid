package com.example.tugasfilsafat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tugasfilsafat.ui.theme.TugasFilsafatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasFilsafatTheme {
                FilsafatApp()
            }
        }
    }
}