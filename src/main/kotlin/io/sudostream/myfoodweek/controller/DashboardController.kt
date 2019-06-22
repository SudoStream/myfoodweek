package io.sudostream.myfoodweek.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class DashboardController {

    @RequestMapping("/hello")
    fun helloWord(): String {
        return "Hey there, the time is " + LocalDateTime.now() + "\n"
    }

}
