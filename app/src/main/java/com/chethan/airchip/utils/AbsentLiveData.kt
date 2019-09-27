package com.chethan.airchip.utils

import androidx.lifecycle.LiveData

/**
 * Created by Chethan on 9/17/2019.
 * A LiveData class that has `null` value.
 */

class AbsentLiveData<T : Any?> private constructor(): LiveData<T>() {
    init {
        // use post instead of set since this can be created on any thread
        postValue(null)
    }

    companion object {
        fun <T> create(): LiveData<T> {
            return AbsentLiveData()
        }
    }
}