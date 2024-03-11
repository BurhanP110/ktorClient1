package com.example.ktorclient1.ui.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ktorclient1.data.model.Listing
import com.example.ktorclient1.data.api.ListingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListingViewModel @Inject constructor(private val repository: ListingRepository) : ViewModel() {

    private val _listing = MutableStateFlow<Listing?>(null)
    val listing: StateFlow<Listing?> = _listing

    fun fetchListingByPhoneName(phoneName: String) {
        viewModelScope.launch {
            _listing.value = repository.getListingByPhoneName(phoneName)
        }
    }
}