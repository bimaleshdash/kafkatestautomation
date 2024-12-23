package com.kafkatestautomation.unit;

import com.kafkatestautomation.alert.EmailAlertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailAlertServiceTest {

    @Autowired
    private EmailAlertService emailAlertService;

    @Test
    public void testSendEmailAlert() {
        emailAlertService.sendEmailAlert("test@example.com", "Test Subject", "Test Message");
        // Add assertions and mocking as needed
    }
}

