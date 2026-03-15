package com.aaronmg.financeappaaron.models

import androidx.compose.ui.graphics.Color
import com.aaronmg.financeappaaron.R

data class User(
    val name : String,
    val balance : Double
)

data class SummaryCard(
    val title : String,
    val amount : String,
    val color : Color,
)

data class Transaction(
    val estName : String,
    val category : String,
    val amount : Double,
    val time : String,
    val icon : Int
)

val transactionsList = listOf(
    Transaction("Walmart", "Groceries", -45.99, "10:30 AM", R.drawable.ic_shopping_cart),
    Transaction("Gasolinera Oxxo", "Fuel", -850.00, "11:15 AM", R.drawable.ic_gas_station),
    Transaction("Starbucks", "Food & Drinks", -120.50, "12:45 PM", R.drawable.ic_coffee),
    Transaction("Best Buy", "Electronics", -12999.00, "02:20 PM", R.drawable.ic_laptop),
    Transaction("Librería Gandhi", "Books", -350.00, "04:10 PM", R.drawable.ic_book),
    Transaction("Restaurante Leon", "Dining", -550.00, "08:30 PM", R.drawable.ic_restaurant)
)