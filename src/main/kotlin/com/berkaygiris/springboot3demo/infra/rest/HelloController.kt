package com.berkaygiris.springboot3demo.infra.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class HelloController {

    @GetMapping("")
    fun getHello(): ResponseEntity<String> {
        return ResponseEntity.ok("hello")
    }
}