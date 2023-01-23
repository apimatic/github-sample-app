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
 * This is a model class for Files9 type.
 */
public class Files9 {
    private String content;
    private String filename;

    /**
     * Default constructor.
     */
    public Files9() {
    }

    /**
     * Initialization constructor.
     * @param  content  String value for content.
     * @param  filename  String value for filename.
     */
    public Files9(
            String content,
            String filename) {
        this.content = content;
        this.filename = filename;
    }

    /**
     * Getter for Content.
     * The new content of the file.
     * @return Returns the String
     */
    @JsonGetter("content")
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * The new content of the file.
     * @param content Value for String
     */
    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for Filename.
     * The new filename for the file.
     * @return Returns the String
     */
    @JsonGetter("filename")
    public String getFilename() {
        return filename;
    }

    /**
     * Setter for Filename.
     * The new filename for the file.
     * @param filename Value for String
     */
    @JsonSetter("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Converts this Files9 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Files9 [" + "content=" + content + ", filename=" + filename + "]";
    }

    /**
     * Builds a new {@link Files9.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Files9.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(content, filename);
        return builder;
    }

    /**
     * Class to build instances of {@link Files9}.
     */
    public static class Builder {
        private String content;
        private String filename;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  content  String value for content.
         * @param  filename  String value for filename.
         */
        public Builder(String content, String filename) {
            this.content = content;
            this.filename = filename;
        }

        /**
         * Setter for content.
         * @param  content  String value for content.
         * @return Builder
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Setter for filename.
         * @param  filename  String value for filename.
         * @return Builder
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Builds a new {@link Files9} object using the set fields.
         * @return {@link Files9}
         */
        public Files9 build() {
            return new Files9(content, filename);
        }
    }
}
