package com.kafkatestautomation.integration;

import org.springframework.stereotype.Service;

@Service
public class ExternalSystemIntegration {

    public void integrateWithExternalSystem(String data) {
        // Implement integration logic here (e.g., send data to an external API)
        System.out.println("Integrating with external system: " + data);
    }
}

