package com.nvous.calc

import android.icu.util.IslamicCalendar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nvous.calc.ui.theme.CALCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CALCTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CalculatorUI()
                }
            }
        }
    }
}

@Composable
fun CalculatorUI() {
    Column {
        val btnGroupModifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
        ButtonGroup(btnGroupModifier)
    }
}

@Composable
fun ButtonGroup(modifier: Modifier) {
    val stringAry = arrayOf(
        arrayOf("", "AC", "Del", "/"),
        arrayOf("7", "8", "9", "x"),
        arrayOf("4", "5", "6", "-"),
        arrayOf("1", "2", "3", "+"),
        arrayOf("", "0", ".", "="),
    )
    Column(modifier) {
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CALCTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            CalculatorUI()
        }
    }
}