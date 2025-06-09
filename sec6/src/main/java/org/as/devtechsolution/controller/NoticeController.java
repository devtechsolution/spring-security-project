package org.as.devtechsolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aditya Srivastva
 */
@RestController
public class NoticeController {

    @GetMapping("/notices")
    public  String getNotices () {
        return "Here are the notices details from the DB";
    }
}
