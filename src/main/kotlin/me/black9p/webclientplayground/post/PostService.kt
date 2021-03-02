package me.black9p.webclientplayground.post

import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

/**
 * @author black9p
 */
@Service
class PostService {

    fun call(id: Int): Mono<Post> {
        val webClient = WebClient.builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .build()

        return webClient.get()
            .uri("/posts/{id}", id)
            .retrieve()
            .bodyToMono(Post::class.java)
    }
}