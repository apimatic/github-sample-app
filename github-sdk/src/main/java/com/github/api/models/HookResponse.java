/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for HookResponse type.
 */
public class HookResponse {
    private Integer code;
    private String status;
    private String message;

    /**
     * Default constructor.
     */
    public HookResponse() {
    }

    /**
     * Initialization constructor.
     * @param  code  Integer value for code.
     * @param  status  String value for status.
     * @param  message  String value for message.
     */
    public HookResponse(
            Integer code,
            String status,
            String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    /**
     * Getter for Code.
     * @return Returns the Integer
     */
    @JsonGetter("code")
    public Integer getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for Integer
     */
    @JsonSetter("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this HookResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HookResponse [" + "code=" + code + ", status=" + status + ", message=" + message
                + "]";
    }

    /**
     * Builds a new {@link HookResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HookResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(code, status, message);
        return builder;
    }

    /**
     * Class to build instances of {@link HookResponse}.
     */
    public static class Builder {
        private Integer code;
        private String status;
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  Integer value for code.
         * @param  status  String value for status.
         * @param  message  String value for message.
         */
        public Builder(Integer code, String status, String message) {
            this.code = code;
            this.status = status;
            this.message = message;
        }

        /**
         * Setter for code.
         * @param  code  Integer value for code.
         * @return Builder
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link HookResponse} object using the set fields.
         * @return {@link HookResponse}
         */
        public HookResponse build() {
            return new HookResponse(code, status, message);
        }
    }
}
