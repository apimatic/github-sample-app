/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ShortBlob type.
 */
public class ShortBlob {
    private String url;
    private String sha;

    /**
     * Default constructor.
     */
    public ShortBlob() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  sha  String value for sha.
     */
    public ShortBlob(
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
     * Converts this ShortBlob into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ShortBlob [" + "url=" + url + ", sha=" + sha + "]";
    }

    /**
     * Builds a new {@link ShortBlob.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ShortBlob.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, sha);
        return builder;
    }

    /**
     * Class to build instances of {@link ShortBlob}.
     */
    public static class Builder {
        private String url;
        private String sha;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  sha  String value for sha.
         */
        public Builder(String url, String sha) {
            this.url = url;
            this.sha = sha;
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
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
            return this;
        }

        /**
         * Builds a new {@link ShortBlob} object using the set fields.
         * @return {@link ShortBlob}
         */
        public ShortBlob build() {
            return new ShortBlob(url, sha);
        }
    }
}
