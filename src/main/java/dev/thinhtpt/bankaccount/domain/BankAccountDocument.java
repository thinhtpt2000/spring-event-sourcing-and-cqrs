package dev.thinhtpt.bankaccount.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The BankAccountDocument is a class that provides the BankAccount document.
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:54 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "bankAccounts")
public class BankAccountDocument {
  @BsonProperty(value = "_id")
  private String id;

  @BsonProperty(value = "aggregateId")
  private String aggregateId;

  @BsonProperty(value = "email")
  private String email;

  @BsonProperty(value = "userName")
  private String userName;

  @BsonProperty(value = "address")
  private String address;

  @BsonProperty(value = "balance")
  private BigDecimal balance;
}
