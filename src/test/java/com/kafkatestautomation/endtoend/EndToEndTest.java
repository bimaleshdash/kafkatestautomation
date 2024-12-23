package com.kafkatestautomation.endtoend;

import com.kafkatestautomation.listener.QueueListener;
import com.kafkatestautomation.monitor.ResponseMonitor;
import com.kafkatestautomation.integration.ExternalSystemIntegration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = { "kaka-response-queue" })
@DirtiesContext
public class EndToEndTest {

    @Autowired
    private QueueListener queueListener;

    @Autowired
    private ResponseMonitor responseMonitor;

    @Autowired
    private ExternalSystemIntegration externalSystemIntegration;

    @Test
    public void testEndToEndFlow() {
        // Simulate message consumption
        queueListener.listen("Test message");

        // Verify monitoring logic
        responseMonitor.monitorResponse("Test message");

        // Verify integration logic
        externalSystemIntegration.integrateWithExternalSystem("Test message");

        // Add assertions and mocking as needed
    }
}
