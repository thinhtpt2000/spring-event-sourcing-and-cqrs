package dev.thinhtpt.es.exceptions;
/**
 * The InvalidEventException is a class to handle exception when event is invalid
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:38 PM
 */
public class InvalidEventException extends RuntimeException {
  public InvalidEventException() {}

  public InvalidEventException(String message) {
    super("Invalid event: " + message);
  }
}
