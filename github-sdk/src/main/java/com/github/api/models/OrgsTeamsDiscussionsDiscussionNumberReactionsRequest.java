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
 * This is a model class for OrgsTeamsDiscussionsDiscussionNumberReactionsRequest type.
 */
public class OrgsTeamsDiscussionsDiscussionNumberReactionsRequest {
    private Content5Enum content;

    /**
     * Default constructor.
     */
    public OrgsTeamsDiscussionsDiscussionNumberReactionsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  content  Content5Enum value for content.
     */
    public OrgsTeamsDiscussionsDiscussionNumberReactionsRequest(
            Content5Enum content) {
        this.content = content;
    }

    /**
     * Getter for Content.
     * @return Returns the Content5Enum
     */
    @JsonGetter("content")
    public Content5Enum getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * @param content Value for Content5Enum
     */
    @JsonSetter("content")
    public void setContent(Content5Enum content) {
        this.content = content;
    }

    /**
     * Converts this OrgsTeamsDiscussionsDiscussionNumberReactionsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsTeamsDiscussionsDiscussionNumberReactionsRequest [" + "content=" + content
                + "]";
    }

    /**
     * Builds a new {@link OrgsTeamsDiscussionsDiscussionNumberReactionsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsTeamsDiscussionsDiscussionNumberReactionsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(content);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsTeamsDiscussionsDiscussionNumberReactionsRequest}.
     */
    public static class Builder {
        private Content5Enum content;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  content  Content5Enum value for content.
         */
        public Builder(Content5Enum content) {
            this.content = content;
        }

        /**
         * Setter for content.
         * @param  content  Content5Enum value for content.
         * @return Builder
         */
        public Builder content(Content5Enum content) {
            this.content = content;
            return this;
        }

        /**
         * Builds a new {@link OrgsTeamsDiscussionsDiscussionNumberReactionsRequest} object using
         * the set fields.
         * @return {@link OrgsTeamsDiscussionsDiscussionNumberReactionsRequest}
         */
        public OrgsTeamsDiscussionsDiscussionNumberReactionsRequest build() {
            return new OrgsTeamsDiscussionsDiscussionNumberReactionsRequest(content);
        }
    }
}
