package com.siamchamnankit.banking.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckDepositController {

    @PostMapping("/check_deposit")
    public CheckDepositResponse checkDeposit() {
        CheckDepositResponse checkDepositResponse = new CheckDepositResponse();
        checkDepositResponse.setTransaction_code("3820001520190325194500");
        return checkDepositResponse;
    }
}
