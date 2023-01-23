/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for OrgsTeamsProjectsProjectId403ErrorException type.
 */
public class OrgsTeamsProjectsProjectId403ErrorException extends ApiException {
    private static final long serialVersionUID = 5999809988860151599L;
    private String message;
    private String documentationUrl;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public OrgsTeamsProjectsProjectId403ErrorException(String reason, Context context) {
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
}