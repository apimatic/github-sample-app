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
 * This is a model class for Response type.
 */
public class Response {
    private Object headers;
    private String payload;

    /**
     * Default constructor.
     */
    public Response() {
    }

    /**
     * Initialization constructor.
     * @param  headers  Object value for headers.
     * @param  payload  String value for payload.
     */
    public Response(
            Object headers,
            String payload) {
        this.headers = headers;
        this.payload = payload;
    }

    /**
     * Getter for Headers.
     * The response headers received when the delivery was made.
     * @return Returns the Object
     */
    @JsonGetter("headers")
    public Object getHeaders() {
        return headers;
    }

    /**
     * Setter for Headers.
     * The response headers received when the delivery was made.
     * @param headers Value for Object
     */
    @JsonSetter("headers")
    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    /**
     * Getter for Payload.
     * The response payload received.
     * @return Returns the String
     */
    @JsonGetter("payload")
    public String getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * The response payload received.
     * @param payload Value for String
     */
    @JsonSetter("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Converts this Response into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Response [" + "headers=" + headers + ", payload=" + payload + "]";
    }

    /**
     * Builds a new {@link Response.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Response.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(headers, payload);
        return builder;
    }

    /**
     * Class to build instances of {@link Response}.
     */
    public static class Builder {
        private Object headers;
        private String payload;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  headers  Object value for headers.
         * @param  payload  String value for payload.
         */
        public Builder(Object headers, String payload) {
            this.headers = headers;
            this.payload = payload;
        }

        /**
         * Setter for headers.
         * @param  headers  Object value for headers.
         * @return Builder
         */
        public Builder headers(Object headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Setter for payload.
         * @param  payload  String value for payload.
         * @return Builder
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Builds a new {@link Response} object using the set fields.
         * @return {@link Response}
         */
        public Response build() {
            return new Response(headers, payload);
        }
    }
}
