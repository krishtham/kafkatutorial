package com.pradtham.sbootkafka.controller;


import com.pradtham.sbootkafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/kafka")
public class Kafkacontroller
{
    private final KafkaProducerService producerService;

    @Autowired
    public Kafkacontroller(KafkaProducerService producerService)
    {
        this.producerService = producerService;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message)
    {
        this.producerService.sendMessage(message);
    }

}