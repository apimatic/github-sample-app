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
 * This is a model class for Request type.
 */
public class Request {
    private Object headers;
    private Object payload;

    /**
     * Default constructor.
     */
    public Request() {
    }

    /**
     * Initialization constructor.
     * @param  headers  Object value for headers.
     * @param  payload  Object value for payload.
     */
    public Request(
            Object headers,
            Object payload) {
        this.headers = headers;
        this.payload = payload;
    }

    /**
     * Getter for Headers.
     * The request headers sent with the webhook delivery.
     * @return Returns the Object
     */
    @JsonGetter("headers")
    public Object getHeaders() {
        return headers;
    }

    /**
     * Setter for Headers.
     * The request headers sent with the webhook delivery.
     * @param headers Value for Object
     */
    @JsonSetter("headers")
    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    /**
     * Getter for Payload.
     * The webhook payload.
     * @return Returns the Object
     */
    @JsonGetter("payload")
    public Object getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * The webhook payload.
     * @param payload Value for Object
     */
    @JsonSetter("payload")
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    /**
     * Converts this Request into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Request [" + "headers=" + headers + ", payload=" + payload + "]";
    }

    /**
     * Builds a new {@link Request.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Request.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(headers, payload);
        return builder;
    }

    /**
     * Class to build instances of {@link Request}.
     */
    public static class Builder {
        private Object headers;
        private Object payload;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  headers  Object value for headers.
         * @param  payload  Object value for payload.
         */
        public Builder(Object headers, Object payload) {
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
         * @param  payload  Object value for payload.
         * @return Builder
         */
        public Builder payload(Object payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Builds a new {@link Request} object using the set fields.
         * @return {@link Request}
         */
        public Request build() {
            return new Request(headers, payload);
        }
    }
}