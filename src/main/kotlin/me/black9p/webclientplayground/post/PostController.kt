package me.black9p.webclientplayground.post

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * @author black9p
 */
@RestController
class PostController(val postService: PostService) {

    @GetMapping("/api/post/{id}")
    fun post(@PathVariable id : Int): Int {
        val result = postService.call(id)
        result.subscribe{ println("It came! $id") }
        return id
    }
}