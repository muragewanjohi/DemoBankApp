package com.example.start.controller

import com.example.start.model.Bank
import com.example.start.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("api/")
class BankController(private val service: BankService) {

    @GetMapping("banks")
    fun getAllBanks(): Collection<Bank> = service
        .getBanks()
}