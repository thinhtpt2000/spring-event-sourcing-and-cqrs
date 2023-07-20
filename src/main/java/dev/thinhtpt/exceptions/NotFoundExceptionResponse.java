package dev.thinhtpt.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The NotFoundExceptionResponse is a class to handle exception when not found
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:42 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotFoundExceptionResponse {
  private String message;
  private String timestamp;
  private int status;
}
