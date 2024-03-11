package com.example.ktorclient1.data.model

data class Listing(
    val id: String,
    val userId: String,
    val phoneName: String,
    val phoneImage: String,
    val phoneBrand: String,
    val phoneModel: String,
    val phoneRAM: Int,
    val phoneStorage: Int,
    val phoneColor: String,
    val phonePrice: Double,
    val quantity: Int
)