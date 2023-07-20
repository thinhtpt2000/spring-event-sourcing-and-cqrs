package dev.thinhtpt.es.exceptions;
/**
 * The InvalidEventTypeException is a class to handle exception when event type is invalid
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:38 PM
 */
public class InvalidEventTypeException extends RuntimeException {
  public InvalidEventTypeException() {}

  public InvalidEventTypeException(String eventType) {
    super("Invalid event type: " + eventType);
  }
}
