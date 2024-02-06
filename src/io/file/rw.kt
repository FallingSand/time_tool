package io.file

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter

const val dir = "data.txt"
val file = File(dir)
private val keywords = listOf(
    "setting",
    "todo",
    "timer",
    "chrono"
    )
fun init() {
    if (!file.exists()) {
        file.createNewFile()
        val files = Files()
        files.bw.write("[setting]\n\n[todo]")
        /*files.bw.write("")
    files.bw.write("[todo]")
    files.bw.write("")
    files.bw.write("[timer]")
    files.bw.write("")
    files.bw.write("[chrono]")
    files.bw.write("")*/
        Public.fileInited = true
    }
}

fun check() {
    val files = Files()
    val checked = MutableList(keywords.size) {false}
    do {
        val lines: String? = files.br.readLine()
        keywords.forEach { if (it == lines) checked[keywords.indexOf(it)] = true}
    } while (lines != null)
    if (checked.count{ it } != checked.size) println()
}

data class Files(val bw: BufferedWriter = BufferedWriter(FileWriter(dir)),
                 val br: BufferedReader = BufferedReader(FileReader(dir)))