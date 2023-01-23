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
 * This is a model class for Tree1 type.
 */
public class Tree1 {
    private String url;
    private String sha;

    /**
     * Default constructor.
     */
    public Tree1() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  sha  String value for sha.
     */
    public Tree1(
            String url,
            String sha) {
        this.url = url;
        this.sha = sha;
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
     * Getter for Sha.
     * @return Returns the String
     */
    @JsonGetter("sha")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSha() {
        return sha;
    }

    /**
     * Setter for Sha.
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * Converts this Tree1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Tree1 [" + "url=" + url + ", sha=" + sha + "]";
    }

    /**
     * Builds a new {@link Tree1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Tree1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl())
                .sha(getSha());
        return builder;
    }

    /**
     * Class to build instances of {@link Tree1}.
     */
    public static class Builder {
        private String url;
        private String sha;



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
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
            return this;
        }

        /**
         * Builds a new {@link Tree1} object using the set fields.
         * @return {@link Tree1}
         */
        public Tree1 build() {
            return new Tree1(url, sha);
        }
    }
}
