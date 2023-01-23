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
 * This is a model class for CheckRunReRequestedEvent1 type.
 */
public class CheckRunReRequestedEvent1 {
    private String payload;

    /**
     * Default constructor.
     */
    public CheckRunReRequestedEvent1() {
    }

    /**
     * Initialization constructor.
     * @param  payload  String value for payload.
     */
    public CheckRunReRequestedEvent1(
            String payload) {
        this.payload = payload;
    }

    /**
     * Getter for Payload.
     * A URL-encoded string of the check_run.rerequested JSON payload. The decoded payload is a JSON
     * object.
     * @return Returns the String
     */
    @JsonGetter("payload")
    public String getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * A URL-encoded string of the check_run.rerequested JSON payload. The decoded payload is a JSON
     * object.
     * @param payload Value for String
     */
    @JsonSetter("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Converts this CheckRunReRequestedEvent1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckRunReRequestedEvent1 [" + "payload=" + payload + "]";
    }

    /**
     * Builds a new {@link CheckRunReRequestedEvent1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckRunReRequestedEvent1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payload);
        return builder;
    }

    /**
     * Class to build instances of {@link CheckRunReRequestedEvent1}.
     */
    public static class Builder {
        private String payload;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payload  String value for payload.
         */
        public Builder(String payload) {
            this.payload = payload;
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
         * Builds a new {@link CheckRunReRequestedEvent1} object using the set fields.
         * @return {@link CheckRunReRequestedEvent1}
         */
        public CheckRunReRequestedEvent1 build() {
            return new CheckRunReRequestedEvent1(payload);
        }
    }
}