package org.as.devtechsolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aditya Srivastva
 */
@RestController
public class ContactController {

 @GetMapping("/contact")
 public  String saveContactInquiryDetails () {
  return "Inquiry details are saved to the DB";
 }
}
