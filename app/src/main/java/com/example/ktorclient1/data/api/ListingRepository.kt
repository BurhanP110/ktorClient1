package com.example.ktorclient1.data.api

import com.example.ktorclient1.data.model.Listing

interface ListingRepository {
    suspend fun getListingByPhoneName(phoneName: String): Listing?
}