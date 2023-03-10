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
 * This is a model class for TeamsDiscussionsCommentsCommentNumberReactionsRequest type.
 */
public class TeamsDiscussionsCommentsCommentNumberReactionsRequest {
    private Content3Enum content;

    /**
     * Default constructor.
     */
    public TeamsDiscussionsCommentsCommentNumberReactionsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  content  Content3Enum value for content.
     */
    public TeamsDiscussionsCommentsCommentNumberReactionsRequest(
            Content3Enum content) {
        this.content = content;
    }

    /**
     * Getter for Content.
     * @return Returns the Content3Enum
     */
    @JsonGetter("content")
    public Content3Enum getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * @param content Value for Content3Enum
     */
    @JsonSetter("content")
    public void setContent(Content3Enum content) {
        this.content = content;
    }

    /**
     * Converts this TeamsDiscussionsCommentsCommentNumberReactionsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TeamsDiscussionsCommentsCommentNumberReactionsRequest [" + "content=" + content
                + "]";
    }

    /**
     * Builds a new {@link TeamsDiscussionsCommentsCommentNumberReactionsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TeamsDiscussionsCommentsCommentNumberReactionsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(content);
        return builder;
    }

    /**
     * Class to build instances of {@link TeamsDiscussionsCommentsCommentNumberReactionsRequest}.
     */
    public static class Builder {
        private Content3Enum content;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  content  Content3Enum value for content.
         */
        public Builder(Content3Enum content) {
            this.content = content;
        }

        /**
         * Setter for content.
         * @param  content  Content3Enum value for content.
         * @return Builder
         */
        public Builder content(Content3Enum content) {
            this.content = content;
            return this;
        }

        /**
         * Builds a new {@link TeamsDiscussionsCommentsCommentNumberReactionsRequest} object using
         * the set fields.
         * @return {@link TeamsDiscussionsCommentsCommentNumberReactionsRequest}
         */
        public TeamsDiscussionsCommentsCommentNumberReactionsRequest build() {
            return new TeamsDiscussionsCommentsCommentNumberReactionsRequest(content);
        }
    }
}
