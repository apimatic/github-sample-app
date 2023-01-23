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
 * This is a model class for ReposCommentsCommentIdReactions404ErrorException type.
 */
public class ReposCommentsCommentIdReactions404ErrorException extends ApiException {
    private static final long serialVersionUID = -3752283754506911781L;
    private String message;
    private String documentationUrl;
    private String url;
    private String status;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ReposCommentsCommentIdReactions404ErrorException(String reason, Context context) {
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
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    private void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    private void setStatus(String status) {
        this.status = status;
    }
}
