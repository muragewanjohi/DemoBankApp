package com.example.start.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest{

    private val mockBankDataSource = MockBankDataSource()
    @Test
    fun `should provide a collection of banks` (){

        //when
        val banks = mockBankDataSource.retrieveBank()
        
        
        //then
        Assertions.assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data` (){

        //when
        val banks = mockBankDataSource.retrieveBank()

        //then
        Assertions.assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        Assertions.assertThat(banks).anyMatch { it.trust != 0.0 }
        Assertions.assertThat(banks).anyMatch { it.transactionFee != 0 }


    }
}