package com.igorbavand.apiconsumer.service.listenner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SendMessageListenner {

  @KafkaListener(topics = "${topics.send-message}", groupId = "test_group_id"

  )
  public void consumer(String message) {
    System.out.println(message);
  }

}
