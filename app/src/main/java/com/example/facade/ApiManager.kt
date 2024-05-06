package com.example.facade

class ApiManager {

    fun getUserData(userId: Int): String {
        return "User data from ApiManager for user $userId"
    }
}