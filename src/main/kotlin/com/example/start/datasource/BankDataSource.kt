package com.example.start.datasource

import com.example.start.model.Bank

interface BankDataSource {

    fun retrieveBank(): Collection<Bank>
}