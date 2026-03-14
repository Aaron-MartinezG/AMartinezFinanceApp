package com.aaronmg.financeappaaron.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aaronmg.financeappaaron.FinanceApp
import com.aaronmg.financeappaaron.models.User
import com.aaronmg.financeappaaron.ui.theme.Background
import com.aaronmg.financeappaaron.ui.theme.CardVen
import com.aaronmg.financeappaaron.ui.theme.FinanceAppAaronTheme

@Composable
fun Header(user: User){
    val colors = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Background),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .clip(CircleShape)
                .background(colors.secondaryContainer)
                .size(58.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "User Profile",
                modifier = Modifier.size(48.dp)
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Hola ${user.name}",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp
            )
            Text(
                text = "Bienvenido",
                fontSize = 15.sp,
                color = Color.Gray
            )
        }
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    val dummyUser = User(name = "Aarón", balance = 2500.0)
    FinanceAppAaronTheme {
        Header(user = dummyUser)
    }
}