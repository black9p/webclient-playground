package me.black9p.webclientplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebclientPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<WebclientPlaygroundApplication>(*args)
}
