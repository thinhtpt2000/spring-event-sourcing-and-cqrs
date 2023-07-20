package dev.thinhtpt.exceptions;

import java.time.LocalDateTime;

/**
 * The ExceptionResponseDto is a record to handle exception response
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:40 PM
 */
public record ExceptionResponseDto(int Status, String message, LocalDateTime timestamp) {}
