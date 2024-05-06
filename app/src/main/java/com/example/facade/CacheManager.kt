package com.example.facade

class CacheManager {

    private val cache = mutableMapOf<Int, String>()

    fun getUserData (userId: Int): String? {
        return cache[userId]
    }

    fun saveUserData (userId: Int, userData: String) {
        cache[userId] = userData
    }
}