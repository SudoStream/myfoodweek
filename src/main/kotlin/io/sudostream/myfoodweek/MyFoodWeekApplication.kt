package io.sudostream.myfoodweek

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("io.sudostream.myfoodweek.controller"))
class MyFoodWeekApplication

fun main(args: Array<String>) {
	runApplication<MyFoodWeekApplication>(*args)
}
