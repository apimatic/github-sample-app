/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ReposGitBlobsRequest type.
 */
public class ReposGitBlobsRequest {
    private String content;
    private String encoding;

    /**
     * Default constructor.
     */
    public ReposGitBlobsRequest() {
        encoding = "utf-8";
    }

    /**
     * Initialization constructor.
     * @param  content  String value for content.
     * @param  encoding  String value for encoding.
     */
    public ReposGitBlobsRequest(
            String content,
            String encoding) {
        this.content = content;
        this.encoding = encoding;
    }

    /**
     * Getter for Content.
     * The new blob's content.
     * @return Returns the String
     */
    @JsonGetter("content")
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * The new blob's content.
     * @param content Value for String
     */
    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for Encoding.
     * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
     * @return Returns the String
     */
    @JsonGetter("encoding")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEncoding() {
        return encoding;
    }

    /**
     * Setter for Encoding.
     * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
     * @param encoding Value for String
     */
    @JsonSetter("encoding")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * Converts this ReposGitBlobsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposGitBlobsRequest [" + "content=" + content + ", encoding=" + encoding + "]";
    }

    /**
     * Builds a new {@link ReposGitBlobsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposGitBlobsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(content)
                .encoding(getEncoding());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposGitBlobsRequest}.
     */
    public static class Builder {
        private String content;
        private String encoding = "utf-8";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  content  String value for content.
         */
        public Builder(String content) {
            this.content = content;
        }

        /**
         * Setter for content.
         * @param  content  String value for content.
         * @return Builder
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Setter for encoding.
         * @param  encoding  String value for encoding.
         * @return Builder
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * Builds a new {@link ReposGitBlobsRequest} object using the set fields.
         * @return {@link ReposGitBlobsRequest}
         */
        public ReposGitBlobsRequest build() {
            return new ReposGitBlobsRequest(content, encoding);
        }
    }
}
