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
 * This is a model class for CodeScanningSarifsReceipt type.
 */
public class CodeScanningSarifsReceipt {
    private String id;
    private String url;

    /**
     * Default constructor.
     */
    public CodeScanningSarifsReceipt() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  url  String value for url.
     */
    public CodeScanningSarifsReceipt(
            String id,
            String url) {
        this.id = id;
        this.url = url;
    }

    /**
     * Getter for Id.
     * An identifier for the upload.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * An identifier for the upload.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Url.
     * The REST API URL for checking the status of the upload.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The REST API URL for checking the status of the upload.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this CodeScanningSarifsReceipt into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CodeScanningSarifsReceipt [" + "id=" + id + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link CodeScanningSarifsReceipt.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CodeScanningSarifsReceipt.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link CodeScanningSarifsReceipt}.
     */
    public static class Builder {
        private String id;
        private String url;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
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
         * Builds a new {@link CodeScanningSarifsReceipt} object using the set fields.
         * @return {@link CodeScanningSarifsReceipt}
         */
        public CodeScanningSarifsReceipt build() {
            return new CodeScanningSarifsReceipt(id, url);
        }
    }
}