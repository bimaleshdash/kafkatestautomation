package com.kafkatestautomation.unit;

import com.kafkatestautomation.alert.AlertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AlertServiceTest {

    @Autowired
    private AlertService alertService;

    @Test
    public void testSendAlert() {
        alertService.sendAlert("Test alert message");
        // Add assertions and mocking as needed
    }
}
