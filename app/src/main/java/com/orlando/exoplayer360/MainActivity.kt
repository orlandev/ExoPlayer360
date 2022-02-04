package com.orlando.exoplayer360

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.orlando.exoplayer360.ui.theme.ExoPlayer360Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExoPlayer360Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    VideoPlayer(
                        useArtworks = true,
                        useControllerB = true,
                        loadFromYoutube = true,
                        playWhenReady = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                        url = "https://youtu.be/QKm-SOOMC4c"
                        // url = "https://youtu.be/jJdlgKzVsnI?list=RD0I647GU3Jsc"
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExoPlayer360Theme {
        Greeting("Android")
    }
}