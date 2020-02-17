/*
 * This file was generated by Guardrail (https://github.com/twilio/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
*/
package com.example.guardrailspringdemo.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import static java.util.Objects.requireNonNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {

    @JsonProperty("code")
    private final Optional<Integer> code;

    @JsonProperty("type")
    private final Optional<String> type;

    @JsonProperty("message")
    private final Optional<String> message;

    @JsonCreator
    protected ApiResponse(@JsonProperty("code") final Optional<Integer> code,
            @JsonProperty("type") final Optional<String> type,
            @JsonProperty("message") final Optional<String> message) {
        super();
        this.code = code == null ? Optional.empty() : code;
        this.type = type == null ? Optional.empty() : type;
        this.message = message == null ? Optional.empty() : message;
    }

    public Optional<Integer> getCode() {
        return this.code;
    }

    public Optional<String> getType() {
        return this.type;
    }

    public Optional<String> getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "ApiResponse{" + "code=" + getCode() + ", type=" + getType() + ", message=" + getMessage() + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ApiResponse other = (ApiResponse) o;
        return getCode().equals(other.getCode()) && getType().equals(other.getType())
                && getMessage().equals(other.getMessage());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getCode(), getType(), getMessage());
    }

    public static class Builder {

        private Optional<Integer> code = Optional.empty();

        private Optional<String> type = Optional.empty();

        private Optional<String> message = Optional.empty();

        public Builder() {
        }

        public Builder(final ApiResponse template) {
            this.code = template.getCode();
            this.type = template.getType();
            this.message = template.getMessage();
        }

        public Builder withCode(final int code) {
            this.code = Optional.of(code);
            return this;
        }

        public Builder withCode(final Optional<Integer> optionalCode) {
            this.code = requireNonNull(optionalCode, "optionalCode is required");
            return this;
        }

        public Builder withType(final String type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder withType(final Optional<String> optionalType) {
            this.type = requireNonNull(optionalType, "optionalType is required");
            return this;
        }

        public Builder withMessage(final String message) {
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder withMessage(final Optional<String> optionalMessage) {
            this.message = requireNonNull(optionalMessage, "optionalMessage is required");
            return this;
        }

        public ApiResponse build() {
            requireNonNull(this.code, "this.code is required");
            requireNonNull(this.type, "this.type is required");
            requireNonNull(this.message, "this.message is required");
            return new ApiResponse(this.code, this.type, this.message);
        }
    }
}