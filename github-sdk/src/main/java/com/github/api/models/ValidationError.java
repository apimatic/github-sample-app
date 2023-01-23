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
import java.util.List;

/**
 * This is a model class for ValidationError type.
 */
public class ValidationError {
    private String message;
    private String documentationUrl;
    private List<Error> errors;

    /**
     * Default constructor.
     */
    public ValidationError() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     * @param  documentationUrl  String value for documentationUrl.
     * @param  errors  List of Error value for errors.
     */
    public ValidationError(
            String message,
            String documentationUrl,
            List<Error> errors) {
        this.message = message;
        this.documentationUrl = documentationUrl;
        this.errors = errors;
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
     * Getter for DocumentationUrl.
     * @return Returns the String
     */
    @JsonGetter("documentation_url")
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
     * Getter for Errors.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Error
     */
    @JsonSetter("errors")
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    /**
     * Converts this ValidationError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ValidationError [" + "message=" + message + ", documentationUrl=" + documentationUrl
                + ", errors=" + errors + "]";
    }

    /**
     * Builds a new {@link ValidationError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ValidationError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(message, documentationUrl)
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link ValidationError}.
     */
    public static class Builder {
        private String message;
        private String documentationUrl;
        private List<Error> errors;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  message  String value for message.
         * @param  documentationUrl  String value for documentationUrl.
         */
        public Builder(String message, String documentationUrl) {
            this.message = message;
            this.documentationUrl = documentationUrl;
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
         * Setter for documentationUrl.
         * @param  documentationUrl  String value for documentationUrl.
         * @return Builder
         */
        public Builder documentationUrl(String documentationUrl) {
            this.documentationUrl = documentationUrl;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link ValidationError} object using the set fields.
         * @return {@link ValidationError}
         */
        public ValidationError build() {
            return new ValidationError(message, documentationUrl, errors);
        }
    }
}