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

/**
 * This is a model class for Files52 type.
 */
public class Files52 {
    private String content;
    private OptionalNullable<String> filename;

    /**
     * Default constructor.
     */
    public Files52() {
    }

    /**
     * Initialization constructor.
     * @param  content  String value for content.
     * @param  filename  String value for filename.
     */
    public Files52(
            String content,
            String filename) {
        this.content = content;
        this.filename = OptionalNullable.of(filename);
    }

    /**
     * Internal initialization constructor.
     */
    protected Files52(String content, OptionalNullable<String> filename) {
        this.content = content;
        this.filename = filename;
    }

    /**
     * Getter for Content.
     * The new content of the file.
     * @return Returns the String
     */
    @JsonGetter("content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Internal Getter for Filename.
     * The new filename for the file.
     * @return Returns the Internal String
     */
    @JsonGetter("filename")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFilename() {
        return this.filename;
    }

    /**
     * Getter for Filename.
     * The new filename for the file.
     * @return Returns the String
     */
    public String getFilename() {
        return OptionalNullable.getFrom(filename);
    }

    /**
     * Setter for Filename.
     * The new filename for the file.
     * @param filename Value for String
     */
    @JsonSetter("filename")
    public void setFilename(String filename) {
        this.filename = OptionalNullable.of(filename);
    }

    /**
     * UnSetter for Filename.
     * The new filename for the file.
     */
    public void unsetFilename() {
        filename = null;
    }

    /**
     * Converts this Files52 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Files52 [" + "content=" + content + ", filename=" + filename + "]";
    }

    /**
     * Builds a new {@link Files52.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Files52.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .content(getContent());
        builder.filename = internalGetFilename();
        return builder;
    }

    /**
     * Class to build instances of {@link Files52}.
     */
    public static class Builder {
        private String content;
        private OptionalNullable<String> filename;



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
            this.filename = OptionalNullable.of(filename);
            return this;
        }

        /**
         * UnSetter for filename.
         * @return Builder
         */
        public Builder unsetFilename() {
            filename = null;
            return this;
        }

        /**
         * Builds a new {@link Files52} object using the set fields.
         * @return {@link Files52}
         */
        public Files52 build() {
            return new Files52(content, filename);
        }
    }
}
