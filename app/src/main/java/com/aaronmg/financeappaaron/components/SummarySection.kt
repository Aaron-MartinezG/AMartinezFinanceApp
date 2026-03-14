package com.aaronmg.financeappaaron.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaronmg.financeappaaron.models.SummaryCard
import com.aaronmg.financeappaaron.models.User
import com.aaronmg.financeappaaron.ui.theme.CardAct
import com.aaronmg.financeappaaron.ui.theme.FinanceAppAaronTheme

@Composable
fun SummarySection() {
    val ven = SummaryCard("Ventas", "$280.99", MaterialTheme.colorScheme.secondaryContainer)
    val gan = SummaryCard("Ganancias", "$280.99", MaterialTheme.colorScheme.tertiaryContainer)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Card(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "face"
                )
                Text(
                    text = "Actividad",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = "de la Semana",
                    color = Color.Gray,
                    style = MaterialTheme.typography.labelSmall,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 6.dp)
                )
            }
        }

        Column(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SummaryCardItem(data = ven, modifier = Modifier.weight(1f).fillMaxWidth())
            SummaryCardItem(data = gan, modifier = Modifier.weight(1f).fillMaxWidth())
        }
    }
}

@Composable
fun SummaryCardItem(data: SummaryCard, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = data.color
        )
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = data.title,
                color = Color.Gray,
                fontSize = 18.sp
            )
            Text(
                text = data.amount,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SummaryPreview() {
    val dummyUser = User(name = "Aarón", balance = 2500.0)
    FinanceAppAaronTheme {
        SummarySection()
    }
}