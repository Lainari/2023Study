package myFirstSpring.firstProject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstProjectApplication

fun main(args: Array<String>) {
	runApplication<FirstProjectApplication>(*args)
}
