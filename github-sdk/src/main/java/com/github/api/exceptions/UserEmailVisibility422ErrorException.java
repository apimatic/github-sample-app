/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.Error;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for UserEmailVisibility422ErrorException type.
 */
public class UserEmailVisibility422ErrorException extends ApiException {
    private static final long serialVersionUID = -6625533876774681267L;
    private String message;
    private String documentationUrl;
    private List<Error> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public UserEmailVisibility422ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }

    /**
     * Getter for DocumentationUrl.
     * @return Returns the String
     */
    @JsonGetter("documentation_url")
    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    /**
     * Setter for DocumentationUrl.
     * @param documentationUrl Value for String
     */
    @JsonSetter("documentation_url")
    private void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * Getter for Errors.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Error
     */
    @JsonSetter("errors")
    private void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
