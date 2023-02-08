package com.example.start.service

import com.example.start.datasource.BankDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest{

    private val dataSource: BankDataSource = mockk(relaxed = true)
    val bankService = BankService(dataSource)


    @Test
    fun `should call its data source to retrieve banks` (){
        //given specify specifically what it should return
        //every { dataSource.retrieveBank() } returns emptyList()

        //when
        bankService.getBanks()

        //then
        verify(exactly = 1) { dataSource.retrieveBanks() }


    }
}