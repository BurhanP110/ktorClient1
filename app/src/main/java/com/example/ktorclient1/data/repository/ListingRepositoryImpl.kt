package com.example.ktorclient1.data.repository

import com.example.ktorclient1.data.api.ListingApi
import com.example.ktorclient1.data.api.ListingRepository
import com.example.ktorclient1.data.model.Listing

class ListingRepositoryImpl(private val api: ListingApi) : ListingRepository {
    override suspend fun getListingByPhoneName(phoneName: String): Listing? {
        return api.getListingByPhoneName(phoneName)
    }
}