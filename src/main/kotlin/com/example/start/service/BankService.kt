package com.example.start.service

import com.example.start.datasource.BankDataSource
import com.example.start.datasource.mock.MockBankDataSource
import com.example.start.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource){

    fun getBanks(): Collection<Bank> = dataSource.retrieveBank()

}
