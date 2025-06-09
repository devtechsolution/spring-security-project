package org.as.devtechsolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aditya Srivastva
 */

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public  String getAccountDetails () {
        return "Here are the account details from the DB";
    }
}
