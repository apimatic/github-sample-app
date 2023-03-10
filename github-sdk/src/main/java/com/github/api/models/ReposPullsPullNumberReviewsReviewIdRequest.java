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
 * This is a model class for ReposPullsPullNumberReviewsReviewIdRequest type.
 */
public class ReposPullsPullNumberReviewsReviewIdRequest {
    private String body;

    /**
     * Default constructor.
     */
    public ReposPullsPullNumberReviewsReviewIdRequest() {
    }

    /**
     * Initialization constructor.
     * @param  body  String value for body.
     */
    public ReposPullsPullNumberReviewsReviewIdRequest(
            String body) {
        this.body = body;
    }

    /**
     * Getter for Body.
     * The body text of the pull request review.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The body text of the pull request review.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Converts this ReposPullsPullNumberReviewsReviewIdRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPullsPullNumberReviewsReviewIdRequest [" + "body=" + body + "]";
    }

    /**
     * Builds a new {@link ReposPullsPullNumberReviewsReviewIdRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPullsPullNumberReviewsReviewIdRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPullsPullNumberReviewsReviewIdRequest}.
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
         * Builds a new {@link ReposPullsPullNumberReviewsReviewIdRequest} object using the set
         * fields.
         * @return {@link ReposPullsPullNumberReviewsReviewIdRequest}
         */
        public ReposPullsPullNumberReviewsReviewIdRequest build() {
            return new ReposPullsPullNumberReviewsReviewIdRequest(body);
        }
    }
}
