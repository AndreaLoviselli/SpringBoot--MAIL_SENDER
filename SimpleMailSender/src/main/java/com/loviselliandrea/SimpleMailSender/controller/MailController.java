package com.loviselliandrea.SimpleMailSender.controller;

import com.loviselliandrea.SimpleMailSender.model.MailStructure;
import com.loviselliandrea.SimpleMailSender.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mailRecipient}")
    public String sendMail(@PathVariable String mailRecipient, @RequestBody MailStructure mailStructure) {
         return mailService.sendMail(mailRecipient, mailStructure);

    }
}
