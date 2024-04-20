package com.igorbavand.apiproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

  @Value("${topics.send-message}")
  private String sendMessageTopic;

  @Bean
  public NewTopic createSendMessageTopic() {
    return TopicBuilder
        .name(sendMessageTopic)
        .partitions(1)
        .replicas(1)
        .build();
  }

}
