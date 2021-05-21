package com.everis.bootcamp.threading

data class AstrosResult(
    @SerializedName("message") val message: String,
    @SerializedName("number") val number: Int,
    @SerializedName("people") val people: List<AstrosPeople>
)