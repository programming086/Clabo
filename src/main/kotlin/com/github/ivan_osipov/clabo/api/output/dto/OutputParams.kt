package com.github.ivan_osipov.clabo.api.output.dto

interface OutputParams {
    val queryId : String

    fun toListOfPairs(): List<Pair<String, *>>
}