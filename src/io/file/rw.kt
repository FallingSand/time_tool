package io.file

import java.io.File

const val dir = "\\data.txt"
val file = File(dir)
fun init() {
    if (!file.exists()) file.createNewFile()
}