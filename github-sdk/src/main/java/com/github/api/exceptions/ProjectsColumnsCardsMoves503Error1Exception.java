/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.Error5;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for ProjectsColumnsCardsMoves503Error1Exception type.
 */
public class ProjectsColumnsCardsMoves503Error1Exception extends ApiException {
    private static final long serialVersionUID = -6561098250073675068L;
    private String code;
    private String message;
    private String documentationUrl;
    private List<Error5> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ProjectsColumnsCardsMoves503Error1Exception(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    private void setCode(String code) {
        this.code = code;
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
     * @return Returns the List of Error5
     */
    @JsonGetter("errors")
    public List<Error5> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Error5
     */
    @JsonSetter("errors")
    private void setErrors(List<Error5> errors) {
        this.errors = errors;
    }
}