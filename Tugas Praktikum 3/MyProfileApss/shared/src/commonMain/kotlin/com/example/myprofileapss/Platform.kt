package com.example.myprofileapss

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform