package dev.thinhtpt.exceptions;
/**
 * The UnknownEventTypeException is a class to handle exception when event type is unknown
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:42 PM
 */
public class UnknownEventTypeException extends RuntimeException {
  public UnknownEventTypeException() {}

  public UnknownEventTypeException(String eventType) {
    super("Unknown event type: " + eventType);
  }
}
