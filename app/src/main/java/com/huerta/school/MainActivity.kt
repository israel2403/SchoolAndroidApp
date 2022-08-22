package com.huerta.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofitService =
            RetrofitInstance.getRetrofitInstance().create(SubjectService::class.java)
        val responseLiveData: LiveData<Response<Subject>> = liveData {
            val response: Response<Subject> = retrofitService.getSubjects()
            emit(response)
        }
        responseLiveData.observe(this, Observer {
            val subjectList = it.body()
        })
    }
}