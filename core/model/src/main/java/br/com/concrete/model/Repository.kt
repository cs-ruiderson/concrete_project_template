package br.com.concrete.model

data class Repository(
    val id: String,
    val name: String,
    val description: String,
    val starCount: Int,
    val forkCount: Int,
    val username: String,
    val userImageUrl: String
)