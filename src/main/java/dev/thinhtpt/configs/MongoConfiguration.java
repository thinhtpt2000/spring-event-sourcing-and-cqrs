package dev.thinhtpt.configs;

import dev.thinhtpt.bankaccount.domain.BankAccountDocument;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;

/**
 * The MongoConfiguration is a class that provides the configuration for MongoDB.
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:53 PM
 */
@Configuration
@Slf4j
@RequiredArgsConstructor
public class MongoConfiguration {
  private final MongoTemplate mongoTemplate;

  @PostConstruct
  public void mongoInit() {
    final var bankAccounts = mongoTemplate.getCollection("bankAccounts");
    final var aggregateIdIndex =
        mongoTemplate
            .indexOps(BankAccountDocument.class)
            .ensureIndex(new Index("aggregateId", Sort.Direction.ASC).unique());
    final var indexInfo = mongoTemplate.indexOps(BankAccountDocument.class).getIndexInfo();
    log.info("MongoDB connected, bankAccounts aggregateId index created: {}", indexInfo);
  }
}
