package com.sezin.sqsdemo

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestSqsDemoApplication

fun main(args: Array<String>) {
	fromApplication<SqsDemoApplication>().with(TestSqsDemoApplication::class).run(*args)
}
