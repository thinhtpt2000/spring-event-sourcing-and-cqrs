package dev.thinhtpt.exceptions;
/**
 * The InternalServerErrorResponse is a record to handle exception when internal server error occurs
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:41 PM
 */
public record InternalServerErrorResponse(int status, String message, String timestamp) {}
