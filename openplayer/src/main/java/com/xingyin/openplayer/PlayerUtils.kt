package com.xingyin.openplayer

import android.util.Base64

object PlayerUtils {

    @JvmStatic
    fun decodeBase64(videoURLEncoder: String): String {
        val bytes = Base64.decode(videoURLEncoder, 0)
        return String(bytes)
    }
}