package dev.thinhtpt.configs;

import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

/**
 * The KafkaTopicConfiguration is a class that provides the configuration for Kafka topics.
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:50 PM
 */
@Configuration
@Slf4j
@RequiredArgsConstructor
public class KafkaTopicConfiguration {

  @Value(value = "${kafka.bootstrapServers:localhost:9093}")
  private String bootstrapServers;

  @Value(value = "${microservice.kafka.topics.bank-account-event-store:bank-account-event-store}")
  private String bankAccountTopicName;

  @Bean
  public KafkaAdmin kafkaAdmin() {
    final Map<String, Object> configs = new HashMap<>();
    configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    return new KafkaAdmin(configs);
  }

  @Bean
  public NewTopic bankAccountEventStoreTopicInitializer(KafkaAdmin kafkaAdmin) {
    try {
      final var topic = new NewTopic(bankAccountTopicName, 3, (short) 1);
      kafkaAdmin.createOrModifyTopics(topic);
      log.info("(bankAccountEventStoreTopicInitializer) topic: {}", topic);
      return topic;
    } catch (Exception e) {
      log.error(e.getMessage());
      return null;
    }
  }
}
