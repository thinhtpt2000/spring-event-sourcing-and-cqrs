package dev.thinhtpt.exceptions;
/**
 * The InternalServerErrorException is a class to handle exception when internal server error occurs
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:41 PM
 */
public class InternalServerErrorException extends RuntimeException {
  public InternalServerErrorException() {
    super();
  }

  public InternalServerErrorException(String message) {
    super(message);
  }
}
