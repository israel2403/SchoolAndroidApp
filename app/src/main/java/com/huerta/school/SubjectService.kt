package com.huerta.school

import retrofit2.Response
import retrofit2.http.GET

interface SubjectService {
    @GET(value = "localhost:8080/")
    suspend fun getSubjects(): Response<Subject>
}