package com.siamchamnankit.banking.api;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class TransactionCodeGeneratorTest {

    @Test
    public void account_no_38200015_gen_at_25032019_194500_transaction_code_should_be_3820001520190325194500 () {
        //Arrange
        TransactionCodeGenerator generator = new TransactionCodeGenerator();
        String accountNo = "38200015";
        LocalDateTime date = null;

        //Act
        String code = generator.generateCode(accountNo, date);

        //Assert
        assertEquals("3820001520190325194500", code);
    }
}
