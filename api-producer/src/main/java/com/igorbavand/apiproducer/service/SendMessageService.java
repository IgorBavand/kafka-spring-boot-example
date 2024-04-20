package com.igorbavand.apiproducer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class SendMessageService {

  @Value("${topics.send-message}")
  private String sendMessageTopic;

  private final KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(String message) {
    kafkaTemplate.send(sendMessageTopic, message);
    log.info("message sent");
  }

}
