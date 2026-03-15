package com.aaronmg.financeappaaron

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aaronmg.financeappaaron.components.Header
import com.aaronmg.financeappaaron.components.SummarySection
import com.aaronmg.financeappaaron.components.TransactionItem
import com.aaronmg.financeappaaron.models.User
import com.aaronmg.financeappaaron.models.transactionsList
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
    val ex = User(name = "Aarón", balance = 2500.0)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Background)
    ) {
        Header(user = ex)
        SummarySection()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "Transactions",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "See All",
                color = Color.Gray
            )
        }
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(transactionsList) { item ->
                TransactionItem(transaction = item)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinanceAppAaronTheme {
        FinanceApp(
            innerPadding = PaddingValues(15.dp)
        )
    }
}