package com.example.facade

class UserManager(private val apiManager: ApiManager, private val cacheManager: CacheManager) {

    fun getUserData(userId: Int): String {
        val cachedData = cacheManager.getUserData(userId)
        if (cachedData != null) {
            println("Returning cached data for user $userId")
            return cachedData
        }

        val apiData = apiManager.getUserData(userId)

        cacheManager.saveUserData(userId,apiData)
        return apiData
    }

}