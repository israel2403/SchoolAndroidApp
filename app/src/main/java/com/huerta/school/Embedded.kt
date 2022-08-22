package com.huerta.school

import com.google.gson.annotations.SerializedName

data class Embedded(
    @SerializedName("subjects") val subjects: List<SubjectX>
)