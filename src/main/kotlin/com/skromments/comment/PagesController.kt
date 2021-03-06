package com.skromments.comment

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PagesController {

  @GetMapping("/")
  fun home(model: Model): String {
    model["title"] = "Comment Application"
    return "home"
  }

}
