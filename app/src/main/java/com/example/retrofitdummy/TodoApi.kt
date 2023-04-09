package com.example.retrofitdummy

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface TodoApi {
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>
//    here we get response from api -->types -->a list of todos

//    @POST("/createTodo")
//    fun createTodo():Response<>

}
//fou types of http request
//get request-->to retrieve some data to get some data
//post request-->to post some data from ur device to remote server
//delete request->to delete some data  from ur server
//put request-->to update the server