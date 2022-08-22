package com.huerta.school

import com.google.gson.annotations.SerializedName

data class Subject(
    @SerializedName("_embedded") val _embedded: Embedded,
    @SerializedName("_links") val _links: LinksX
)