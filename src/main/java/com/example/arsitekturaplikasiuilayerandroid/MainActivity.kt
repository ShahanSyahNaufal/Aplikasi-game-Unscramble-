package com.example.arsitekturaplikasiuilayerandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.arsitekturaplikasiuilayerandroid.ui.GameScreen
import com.example.arsitekturaplikasiuilayerandroid.ui.theme.ArsitekturAplikasiUILayerAndroidTheme

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MainActivity created/re-created!")
        enableEdgeToEdge()
        setContent {
            ArsitekturAplikasiUILayerAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    GameScreen()
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity destroyed!")
    }
}
