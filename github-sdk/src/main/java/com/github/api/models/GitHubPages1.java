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
 * This is a model class for GitHubPages1 type.
 */
public class GitHubPages1 {
    private String statusUrl;
    private String pageUrl;
    private String previewUrl;

    /**
     * Default constructor.
     */
    public GitHubPages1() {
    }

    /**
     * Initialization constructor.
     * @param  statusUrl  String value for statusUrl.
     * @param  pageUrl  String value for pageUrl.
     * @param  previewUrl  String value for previewUrl.
     */
    public GitHubPages1(
            String statusUrl,
            String pageUrl,
            String previewUrl) {
        this.statusUrl = statusUrl;
        this.pageUrl = pageUrl;
        this.previewUrl = previewUrl;
    }

    /**
     * Getter for StatusUrl.
     * The URI to monitor GitHub Pages deployment status.
     * @return Returns the String
     */
    @JsonGetter("status_url")
    public String getStatusUrl() {
        return statusUrl;
    }

    /**
     * Setter for StatusUrl.
     * The URI to monitor GitHub Pages deployment status.
     * @param statusUrl Value for String
     */
    @JsonSetter("status_url")
    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    /**
     * Getter for PageUrl.
     * The URI to the deployed GitHub Pages.
     * @return Returns the String
     */
    @JsonGetter("page_url")
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * Setter for PageUrl.
     * The URI to the deployed GitHub Pages.
     * @param pageUrl Value for String
     */
    @JsonSetter("page_url")
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /**
     * Getter for PreviewUrl.
     * The URI to the deployed GitHub Pages preview.
     * @return Returns the String
     */
    @JsonGetter("preview_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Setter for PreviewUrl.
     * The URI to the deployed GitHub Pages preview.
     * @param previewUrl Value for String
     */
    @JsonSetter("preview_url")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * Converts this GitHubPages1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GitHubPages1 [" + "statusUrl=" + statusUrl + ", pageUrl=" + pageUrl
                + ", previewUrl=" + previewUrl + "]";
    }

    /**
     * Builds a new {@link GitHubPages1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GitHubPages1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(statusUrl, pageUrl)
                .previewUrl(getPreviewUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link GitHubPages1}.
     */
    public static class Builder {
        private String statusUrl;
        private String pageUrl;
        private String previewUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  statusUrl  String value for statusUrl.
         * @param  pageUrl  String value for pageUrl.
         */
        public Builder(String statusUrl, String pageUrl) {
            this.statusUrl = statusUrl;
            this.pageUrl = pageUrl;
        }

        /**
         * Setter for statusUrl.
         * @param  statusUrl  String value for statusUrl.
         * @return Builder
         */
        public Builder statusUrl(String statusUrl) {
            this.statusUrl = statusUrl;
            return this;
        }

        /**
         * Setter for pageUrl.
         * @param  pageUrl  String value for pageUrl.
         * @return Builder
         */
        public Builder pageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
            return this;
        }

        /**
         * Setter for previewUrl.
         * @param  previewUrl  String value for previewUrl.
         * @return Builder
         */
        public Builder previewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }

        /**
         * Builds a new {@link GitHubPages1} object using the set fields.
         * @return {@link GitHubPages1}
         */
        public GitHubPages1 build() {
            return new GitHubPages1(statusUrl, pageUrl, previewUrl);
        }
    }
}
