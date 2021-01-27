package com.example.android.guesstheword.screens

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "GameViewModel"

class GameViewModel : ViewModel() {
    init {
        Log.d(TAG, "initialized")
    }

    override fun onCleared() {
        Log.d(TAG, "onCleared: called.")
        super.onCleared()
    }
}