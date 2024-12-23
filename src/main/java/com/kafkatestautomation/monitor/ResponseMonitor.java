package com.kafkatestautomation.monitor;

import com.kafkatestautomation.alert.AlertService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResponseMonitor {

    public void monitorResponse(String message) {
        // Implement monitoring logic here
        System.out.println("Monitoring response: " + message);
    }

    @Autowired
    private AlertService alertService;

    public void monitorResponseWithAlert(String message) {
        // Implement sophisticated monitoring logic here
        if (message.contains("error")) {
            alertService.sendAlert("Error detected in response: " + message);
        } else {
            System.out.println("Monitoring response: " + message);
        }
    }

}

