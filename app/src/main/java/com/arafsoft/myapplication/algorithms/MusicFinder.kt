package com.arafsoft.myapplication.algorithms

import android.util.Log
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

object MusicFinder {
    var musics = emptyArray<String>()
    public fun findAllMusic() {
        try {
            var path: String = "/storage/emulated/0/"
            var myFiles = Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)

                for(item in myFiles) {
                    Log.d("Test", "findAllMusic: " + item.fileName.toString())
                }

        } catch (e: IOException){
            Log.d("Test", "findAllMusic: " + e.message)
        }

    }
}

