package com.kei.login.utils

object Const {
    val COLLECTION_PATH = "recipes"

    fun setTimeStamp(): Long{
        val time = (-1 * System.currentTimeMillis())
        return time
    }
}