package com.kafkatestautomation.alert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    @Autowired
    private EmailAlertService emailAlertService;

    public void sendAlert(String message) {
        // Send email alert
        emailAlertService.sendEmailAlert("admin@example.com", "Alert", message);
        System.out.println("Alert: " + message);
    }
}

