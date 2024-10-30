package hufs.ces.rcube.domain.execption;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

    @Getter
    @RequiredArgsConstructor
    public enum CommonErrorCode implements ErrorCode {

        INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "Invalid parameter included"),
        RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND, "Resource not exists"),
        INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
        UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "Unauthorized access"),
        FORBIDDEN(HttpStatus.FORBIDDEN, "Access denied"),
        METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "Method not allowed"),
        CONFLICT(HttpStatus.CONFLICT, "Conflict occurred"),
        TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, "Too many requests"),
        SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE, "Service unavailable"),
        GATEWAY_TIMEOUT(HttpStatus.GATEWAY_TIMEOUT, "Gateway timeout");

        private final HttpStatus httpStatus;
        private final String message;
    }


}