package com.sezin.sqsdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SqsDemoApplication

fun main(args: Array<String>) {
	runApplication<SqsDemoApplication>(*args)
}
