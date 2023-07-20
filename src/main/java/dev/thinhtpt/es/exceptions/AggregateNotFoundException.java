package dev.thinhtpt.es.exceptions;

/**
 * The AggregateNotFoundException is a class to handle exception when aggregate not found
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:36 PM
 */
public class AggregateNotFoundException extends RuntimeException {
  public AggregateNotFoundException() {
    super();
  }

  public AggregateNotFoundException(String aggregateId) {
    super("Aggregate not found id:" + aggregateId);
  }
}
