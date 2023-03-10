/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for ScimError type.
 */
public class ScimError {
    private OptionalNullable<String> message;
    private OptionalNullable<String> documentationUrl;
    private OptionalNullable<String> detail;
    private Integer status;
    private OptionalNullable<String> scimType;
    private List<String> schemas;

    /**
     * Default constructor.
     */
    public ScimError() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     * @param  documentationUrl  String value for documentationUrl.
     * @param  detail  String value for detail.
     * @param  status  Integer value for status.
     * @param  scimType  String value for scimType.
     * @param  schemas  List of String value for schemas.
     */
    public ScimError(
            String message,
            String documentationUrl,
            String detail,
            Integer status,
            String scimType,
            List<String> schemas) {
        this.message = OptionalNullable.of(message);
        this.documentationUrl = OptionalNullable.of(documentationUrl);
        this.detail = OptionalNullable.of(detail);
        this.status = status;
        this.scimType = OptionalNullable.of(scimType);
        this.schemas = schemas;
    }

    /**
     * Internal initialization constructor.
     */
    protected ScimError(OptionalNullable<String> message, OptionalNullable<String> documentationUrl,
            OptionalNullable<String> detail, Integer status, OptionalNullable<String> scimType,
            List<String> schemas) {
        this.message = message;
        this.documentationUrl = documentationUrl;
        this.detail = detail;
        this.status = status;
        this.scimType = scimType;
        this.schemas = schemas;
    }

    /**
     * Internal Getter for Message.
     * @return Returns the Internal String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMessage() {
        return this.message;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    public String getMessage() {
        return OptionalNullable.getFrom(message);
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = OptionalNullable.of(message);
    }

    /**
     * UnSetter for Message.
     */
    public void unsetMessage() {
        message = null;
    }

    /**
     * Internal Getter for DocumentationUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("documentation_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentationUrl() {
        return this.documentationUrl;
    }

    /**
     * Getter for DocumentationUrl.
     * @return Returns the String
     */
    public String getDocumentationUrl() {
        return OptionalNullable.getFrom(documentationUrl);
    }

    /**
     * Setter for DocumentationUrl.
     * @param documentationUrl Value for String
     */
    @JsonSetter("documentation_url")
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = OptionalNullable.of(documentationUrl);
    }

    /**
     * UnSetter for DocumentationUrl.
     */
    public void unsetDocumentationUrl() {
        documentationUrl = null;
    }

    /**
     * Internal Getter for Detail.
     * @return Returns the Internal String
     */
    @JsonGetter("detail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDetail() {
        return this.detail;
    }

    /**
     * Getter for Detail.
     * @return Returns the String
     */
    public String getDetail() {
        return OptionalNullable.getFrom(detail);
    }

    /**
     * Setter for Detail.
     * @param detail Value for String
     */
    @JsonSetter("detail")
    public void setDetail(String detail) {
        this.detail = OptionalNullable.of(detail);
    }

    /**
     * UnSetter for Detail.
     */
    public void unsetDetail() {
        detail = null;
    }

    /**
     * Getter for Status.
     * @return Returns the Integer
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Integer
     */
    @JsonSetter("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Internal Getter for ScimType.
     * @return Returns the Internal String
     */
    @JsonGetter("scimType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetScimType() {
        return this.scimType;
    }

    /**
     * Getter for ScimType.
     * @return Returns the String
     */
    public String getScimType() {
        return OptionalNullable.getFrom(scimType);
    }

    /**
     * Setter for ScimType.
     * @param scimType Value for String
     */
    @JsonSetter("scimType")
    public void setScimType(String scimType) {
        this.scimType = OptionalNullable.of(scimType);
    }

    /**
     * UnSetter for ScimType.
     */
    public void unsetScimType() {
        scimType = null;
    }

    /**
     * Getter for Schemas.
     * @return Returns the List of String
     */
    @JsonGetter("schemas")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSchemas() {
        return schemas;
    }

    /**
     * Setter for Schemas.
     * @param schemas Value for List of String
     */
    @JsonSetter("schemas")
    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    /**
     * Converts this ScimError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScimError [" + "message=" + message + ", documentationUrl=" + documentationUrl
                + ", detail=" + detail + ", status=" + status + ", scimType=" + scimType
                + ", schemas=" + schemas + "]";
    }

    /**
     * Builds a new {@link ScimError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScimError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .schemas(getSchemas());
        builder.message = internalGetMessage();
        builder.documentationUrl = internalGetDocumentationUrl();
        builder.detail = internalGetDetail();
        builder.scimType = internalGetScimType();
        return builder;
    }

    /**
     * Class to build instances of {@link ScimError}.
     */
    public static class Builder {
        private OptionalNullable<String> message;
        private OptionalNullable<String> documentationUrl;
        private OptionalNullable<String> detail;
        private Integer status;
        private OptionalNullable<String> scimType;
        private List<String> schemas;



        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = OptionalNullable.of(message);
            return this;
        }

        /**
         * UnSetter for message.
         * @return Builder
         */
        public Builder unsetMessage() {
            message = null;
            return this;
        }

        /**
         * Setter for documentationUrl.
         * @param  documentationUrl  String value for documentationUrl.
         * @return Builder
         */
        public Builder documentationUrl(String documentationUrl) {
            this.documentationUrl = OptionalNullable.of(documentationUrl);
            return this;
        }

        /**
         * UnSetter for documentationUrl.
         * @return Builder
         */
        public Builder unsetDocumentationUrl() {
            documentationUrl = null;
            return this;
        }

        /**
         * Setter for detail.
         * @param  detail  String value for detail.
         * @return Builder
         */
        public Builder detail(String detail) {
            this.detail = OptionalNullable.of(detail);
            return this;
        }

        /**
         * UnSetter for detail.
         * @return Builder
         */
        public Builder unsetDetail() {
            detail = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Integer value for status.
         * @return Builder
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for scimType.
         * @param  scimType  String value for scimType.
         * @return Builder
         */
        public Builder scimType(String scimType) {
            this.scimType = OptionalNullable.of(scimType);
            return this;
        }

        /**
         * UnSetter for scimType.
         * @return Builder
         */
        public Builder unsetScimType() {
            scimType = null;
            return this;
        }

        /**
         * Setter for schemas.
         * @param  schemas  List of String value for schemas.
         * @return Builder
         */
        public Builder schemas(List<String> schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * Builds a new {@link ScimError} object using the set fields.
         * @return {@link ScimError}
         */
        public ScimError build() {
            return new ScimError(message, documentationUrl, detail, status, scimType, schemas);
        }
    }
}
