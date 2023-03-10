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
 * This is a model class for Subject type.
 */
public class Subject {
    private String title;
    private String url;
    private String latestCommentUrl;
    private String type;

    /**
     * Default constructor.
     */
    public Subject() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  url  String value for url.
     * @param  latestCommentUrl  String value for latestCommentUrl.
     * @param  type  String value for type.
     */
    public Subject(
            String title,
            String url,
            String latestCommentUrl,
            String type) {
        this.title = title;
        this.url = url;
        this.latestCommentUrl = latestCommentUrl;
        this.type = type;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
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
     * Getter for LatestCommentUrl.
     * @return Returns the String
     */
    @JsonGetter("latest_comment_url")
    public String getLatestCommentUrl() {
        return latestCommentUrl;
    }

    /**
     * Setter for LatestCommentUrl.
     * @param latestCommentUrl Value for String
     */
    @JsonSetter("latest_comment_url")
    public void setLatestCommentUrl(String latestCommentUrl) {
        this.latestCommentUrl = latestCommentUrl;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this Subject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Subject [" + "title=" + title + ", url=" + url + ", latestCommentUrl="
                + latestCommentUrl + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link Subject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Subject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, url, latestCommentUrl, type);
        return builder;
    }

    /**
     * Class to build instances of {@link Subject}.
     */
    public static class Builder {
        private String title;
        private String url;
        private String latestCommentUrl;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  url  String value for url.
         * @param  latestCommentUrl  String value for latestCommentUrl.
         * @param  type  String value for type.
         */
        public Builder(String title, String url, String latestCommentUrl, String type) {
            this.title = title;
            this.url = url;
            this.latestCommentUrl = latestCommentUrl;
            this.type = type;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
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
         * Setter for latestCommentUrl.
         * @param  latestCommentUrl  String value for latestCommentUrl.
         * @return Builder
         */
        public Builder latestCommentUrl(String latestCommentUrl) {
            this.latestCommentUrl = latestCommentUrl;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link Subject} object using the set fields.
         * @return {@link Subject}
         */
        public Subject build() {
            return new Subject(title, url, latestCommentUrl, type);
        }
    }
}
