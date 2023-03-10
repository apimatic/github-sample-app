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
 * This is a model class for BasicError type.
 */
public class BasicError {
    private String message;
    private String documentationUrl;
    private String url;
    private String status;

    /**
     * Default constructor.
     */
    public BasicError() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     * @param  documentationUrl  String value for documentationUrl.
     * @param  url  String value for url.
     * @param  status  String value for status.
     */
    public BasicError(
            String message,
            String documentationUrl,
            String url,
            String status) {
        this.message = message;
        this.documentationUrl = documentationUrl;
        this.url = url;
        this.status = status;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for DocumentationUrl.
     * @return Returns the String
     */
    @JsonGetter("documentation_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * Setter for DocumentationUrl.
     * @param documentationUrl Value for String
     */
    @JsonSetter("documentation_url")
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this BasicError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BasicError [" + "message=" + message + ", documentationUrl=" + documentationUrl
                + ", url=" + url + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link BasicError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BasicError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .message(getMessage())
                .documentationUrl(getDocumentationUrl())
                .url(getUrl())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link BasicError}.
     */
    public static class Builder {
        private String message;
        private String documentationUrl;
        private String url;
        private String status;



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
         * Setter for documentationUrl.
         * @param  documentationUrl  String value for documentationUrl.
         * @return Builder
         */
        public Builder documentationUrl(String documentationUrl) {
            this.documentationUrl = documentationUrl;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Builds a new {@link BasicError} object using the set fields.
         * @return {@link BasicError}
         */
        public BasicError build() {
            return new BasicError(message, documentationUrl, url, status);
        }
    }
}
