package me.black9p.webclientplayground

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

/**
 * 애플리케이션 실행시 함께 실행될 코드
 * 비동기 논블로킹 코드를 테스트 하는 예제
 * @see PostController
 * @author black9p
 */
@Component
class MyRunner : CommandLineRunner {

    override fun run(vararg args: String?) {
        var id = 1
        val webClient = WebClient.builder()
            .baseUrl("http://localhost:8080")
            .build()

        while (id < 10) {
            val result = webClient.get()
                .uri("/api/post/{id}", id++)
                .retrieve()
                .bodyToMono(Int::class.java)

            println(result.block())
        }
    }
}