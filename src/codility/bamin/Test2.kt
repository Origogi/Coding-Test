package codility.bamin

import java.lang.StringBuilder

fun main() {
//    Test2().solution("my.song.mp3 11b\nngreatSong.flac 1000b\nnnot3.txt 5b\nnvideo.mp4 200b\nngame.exe 100b\nnmov!e.mkv 10000b")
        Test2().solution("")

}


class Test2 {

    enum class Type(val typeName: String) {
        MUSIC("music"),
        IMAGE("images"),
        MOVIES("movies"),
        OTHER("other")
    }

    fun solution(S: String): String {
        // write your code in Kotlin

        val musicType = hashSetOf("mp3", "aac", "flac")
        val imageType = hashSetOf("jpg", "bmp", "gif")
        val videoType = hashSetOf("mp4", "avi", "mkv")

        val typeMap = mapOf(
            Type.IMAGE to imageType,
            Type.MUSIC to musicType,
            Type.MOVIES to videoType
        )

        val sizeMap = mutableMapOf(
            Type.IMAGE to 0L,
            Type.MUSIC to 0L,
            Type.MOVIES to 0L,
            Type.OTHER to 0L
        )


       S.lines()
           .filter { it.isNotEmpty() }
           .forEach { line ->

            val fileInfo = line.split(" ")
            val fileType = fileInfo[0].split(".").last()
            val fileSize = fileInfo[1].replace("b", "").toLong()

            var isOtherType = true

            for (types in typeMap) {
                if (fileType in types.value) {
                    sizeMap[types.key] = sizeMap[types.key]!! + fileSize
                    isOtherType = false
                    break
                }
            }

            if (isOtherType) {
                sizeMap[Type.OTHER] = sizeMap[Type.OTHER]!! + fileSize
            }
        }

        val sb = StringBuilder()

        Type.values().forEach {
            sb.append("${it.typeName} ${sizeMap[it]}b")
            sb.append(System.lineSeparator());
        }

        return sb.toString()
    }

}