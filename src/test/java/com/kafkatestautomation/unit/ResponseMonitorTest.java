package com.kafkatestautomation.unit;

import com.kafkatestautomation.alert.AlertService;
import com.kafkatestautomation.monitor.ResponseMonitor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResponseMonitorTest {

    @Autowired
    private ResponseMonitor responseMonitor;

    @Autowired
    private AlertService alertService;

    @Test
    public void testMonitorResponse() {
        responseMonitor.monitorResponse("error message");
        // Add assertions and mocking as needed
    }

    @Test
    public void testSendAlert() {
        alertService.sendAlert("Test alert message");
        // Add assertions and mocking as needed
    }
}

