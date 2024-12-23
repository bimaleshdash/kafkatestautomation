package com.kafkatestautomation.listener;

import com.kafkatestautomation.integration.ExternalSystemIntegration;
import com.kafkatestautomation.monitor.ResponseMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

import org.springframework.stereotype.Service;

@Service
public class QueueListener {

    private final Counter messageCounter;

    @Autowired
    private ResponseMonitor responseMonitor;

    @Autowired
    private ExternalSystemIntegration externalSystemIntegration;

    public QueueListener(MeterRegistry meterRegistry) {
        this.messageCounter = meterRegistry.counter("kaka.messages.processed");
    }

    @KafkaListener(topics = "kaka-response-queue", groupId = "kaka-group")
    public void listen(String message) {
        messageCounter.increment();
        System.out.println("Received Message in group kaka-group: " + message);
        responseMonitor.monitorResponse(message);
        externalSystemIntegration.integrateWithExternalSystem(message);
    }
}
