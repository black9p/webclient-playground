package me.black9p.webclientplayground.post

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * @author black9p
 */
@SpringBootTest
internal class PostServiceTest {

    @Autowired
    lateinit var postService: PostService

    @DisplayName("블록 테스트")
    @Test
    fun test_block() {
        var id = 0
        while (id < 10) {
            val actual = postService.call(id++)
            println(actual.block())
        }
    }

    @DisplayName("논블록 테스트")
    @Test
    fun test_noneblock() {
        var id = 1
        while (id < 10) {
            val actual = postService.call(id++)
            actual.subscribe{ println(it) }
        }
    }
}