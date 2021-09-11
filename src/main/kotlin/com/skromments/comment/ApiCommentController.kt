package com.skromments.comment

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/v1/comments")
class ApiCommentController() {


  @GetMapping
  fun index(): List<Comment> {
    return listOf(
      Comment("1", "Comment One"),
      Comment("2", "Comment Two")
    )
  }

}
