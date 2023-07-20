package dev.thinhtpt.configs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The KafkaConfigProperties is a class that contains all the properties of Kafka.
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:46 PM
 */
@Configuration
@ConfigurationProperties(prefix = "kafka")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class KafkaConfigProperties {
  private String acks = "0";
  private String compressionType = "snappy";
  private int retries = 3;
  private int deliveryTimeoutMs = 120000;
  private int maxRequestSize = 1068576;
  private int requestTimeoutMs = 30000;
  private String orderMongoProjectionGroupId = "projection-group";
  private String enableAutoCommit = "false";
  private int consumerParallelism = 16;
  private int eventsTopicPartitions = 6;
  private int eventsTopicReplicationFactor = 1;
}
