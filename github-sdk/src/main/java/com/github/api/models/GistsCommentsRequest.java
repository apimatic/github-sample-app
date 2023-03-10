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
 * This is a model class for GistsCommentsRequest type.
 */
public class GistsCommentsRequest {
    private String body;

    /**
     * Default constructor.
     */
    public GistsCommentsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  body  String value for body.
     */
    public GistsCommentsRequest(
            String body) {
        this.body = body;
    }

    /**
     * Getter for Body.
     * The comment text.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The comment text.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Converts this GistsCommentsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GistsCommentsRequest [" + "body=" + body + "]";
    }

    /**
     * Builds a new {@link GistsCommentsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GistsCommentsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body);
        return builder;
    }

    /**
     * Class to build instances of {@link GistsCommentsRequest}.
     */
    public static class Builder {
        private String body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  body  String value for body.
         */
        public Builder(String body) {
            this.body = body;
        }

        /**
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link GistsCommentsRequest} object using the set fields.
         * @return {@link GistsCommentsRequest}
         */
        public GistsCommentsRequest build() {
            return new GistsCommentsRequest(body);
        }
    }
}
