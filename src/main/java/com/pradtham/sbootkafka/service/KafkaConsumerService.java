package com.pradtham.sbootkafka.service;

import com.pradtham.sbootkafka.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);


    @KafkaListener(topics = Constants.TOPIC_NAME, groupId = Constants.GROUP_ID)
    public void consume(String message)
    {

    }


}
