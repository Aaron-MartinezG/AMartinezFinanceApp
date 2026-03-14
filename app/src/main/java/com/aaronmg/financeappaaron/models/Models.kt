package com.aaronmg.financeappaaron.models

import androidx.compose.ui.graphics.Color

data class User(
    val name : String,
    val balance : Double
)

data class SummaryCard(
    val title : String,
    val amount : Double,
    val color : Color
)

data class Transaction(
    val id: Int,
    val estName : String,
    val category : String,
    val amount : Double,
    val time : String,
    val icon : Int
)