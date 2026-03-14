package com.aaronmg.financeappaaron

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aaronmg.financeappaaron.components.Header
import com.aaronmg.financeappaaron.components.SummarySection
import com.aaronmg.financeappaaron.models.User
import com.aaronmg.financeappaaron.ui.theme.Background
import com.aaronmg.financeappaaron.ui.theme.FinanceAppAaronTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinanceAppAaronTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FinanceApp(innerPadding)
                }
            }
        }
    }
}

@Composable
fun FinanceApp(innerPadding: PaddingValues){
    val dummyUser = User(name = "Aarón", balance = 2500.0)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Header(user = dummyUser)
        SummarySection()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinanceAppAaronTheme {
        FinanceApp(
            innerPadding = PaddingValues(10.dp)
        )
    }
}