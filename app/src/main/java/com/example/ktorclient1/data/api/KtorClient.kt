package com.example.ktorclient1.data.api

import com.example.ktorclient1.data.model.Listing
import io.ktor.client.*
import io.ktor.client.request.get

class ListingApi(private val client: HttpClient) {
    suspend fun getListingByPhoneName(phoneName: String): Listing? {
        return client.get("http://yourapi.com/listing/$phoneName")
    }
}