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
 * This is a model class for Parent1 type.
 */
public class Parent1 {
    private String url;
    private String htmlUrl;
    private String sha;

    /**
     * Default constructor.
     */
    public Parent1() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  sha  String value for sha.
     */
    public Parent1(
            String url,
            String htmlUrl,
            String sha) {
        this.url = url;
        this.htmlUrl = htmlUrl;
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
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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
     * Converts this Parent1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Parent1 [" + "url=" + url + ", htmlUrl=" + htmlUrl + ", sha=" + sha + "]";
    }

    /**
     * Builds a new {@link Parent1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Parent1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl())
                .htmlUrl(getHtmlUrl())
                .sha(getSha());
        return builder;
    }

    /**
     * Class to build instances of {@link Parent1}.
     */
    public static class Builder {
        private String url;
        private String htmlUrl;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Builds a new {@link Parent1} object using the set fields.
         * @return {@link Parent1}
         */
        public Parent1 build() {
            return new Parent1(url, htmlUrl, sha);
        }
    }
}
