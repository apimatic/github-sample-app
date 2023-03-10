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
 * This is a model class for Commit9 type.
 */
public class Commit9 {
    private String sha;
    private String url;

    /**
     * Default constructor.
     */
    public Commit9() {
    }

    /**
     * Initialization constructor.
     * @param  sha  String value for sha.
     * @param  url  String value for url.
     */
    public Commit9(
            String sha,
            String url) {
        this.sha = sha;
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
     * Converts this Commit9 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Commit9 [" + "sha=" + sha + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Commit9.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Commit9.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(sha, url);
        return builder;
    }

    /**
     * Class to build instances of {@link Commit9}.
     */
    public static class Builder {
        private String sha;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  sha  String value for sha.
         * @param  url  String value for url.
         */
        public Builder(String sha, String url) {
            this.sha = sha;
            this.url = url;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Commit9} object using the set fields.
         * @return {@link Commit9}
         */
        public Commit9 build() {
            return new Commit9(sha, url);
        }
    }
}
