package com.example.jihyun.firstkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform