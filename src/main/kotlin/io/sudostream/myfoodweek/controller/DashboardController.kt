package io.sudostream.myfoodweek.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.LocalDateTime

@RestController
class DashboardController {

    @GetMapping("/hello")
    fun helloWord(): Mono<String> {
        return Mono.just("Hey there! And the time is " + LocalDateTime.now() + "\n")
    }

}
