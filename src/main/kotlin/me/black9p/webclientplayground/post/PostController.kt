package me.black9p.webclientplayground.post

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * @author black9p
 */
@RestController
class PostController(val postService: PostService) {

    @ApiOperation("id 조회", notes = "id를 조회해 옵니다.")
    @GetMapping("/api/post/{id}")
    fun post(@PathVariable id : Int): Int {
        val result = postService.call(id)
        result.doOnNext { println("Oh! Yes $id") }.subscribe()
//        result.subscribe{ println("It came! $id") }
        return id
    }
}