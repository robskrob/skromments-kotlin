package com.skromments.comment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommentApplication

fun main(args: Array<String>) {
	runApplication<CommentApplication>(*args)
}

data class Comment(val id: String?, val content: String)
