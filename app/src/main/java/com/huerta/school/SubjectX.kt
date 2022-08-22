package com.huerta.school

import com.google.gson.annotations.SerializedName

data class SubjectX(
    @SerializedName("_links") val _links: LinksX,
    @SerializedName("endTime") val endTime: String,
    @SerializedName("id") val id: String,
    @SerializedName("starTime") val starTime: String,
    @SerializedName("units") val units: Int
)