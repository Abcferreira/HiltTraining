package com.example.hilttraining

import javax.inject.Inject

class MyImageRepository @Inject constructor(
    private val service: MyImageUrlService
) {

    fun getRandomImageUrl(): String {
        return service.getImageUrl()
    }
}
