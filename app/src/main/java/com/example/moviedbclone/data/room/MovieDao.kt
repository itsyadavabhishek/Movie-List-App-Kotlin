package com.example.moviedbclone.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.moviedbclone.data.Movie

@Dao
interface MovieDao {

    @Query("SELECT  * from  moviedb ")
    fun getAll(): List<Movie>

    @Insert
    suspend fun insertMovie(movie: Movie)

    @Insert
    suspend fun insertMovie(movies: List<Movie>)

    @Query("DELETE  from moviedb")
    suspend fun deleteAll()
}