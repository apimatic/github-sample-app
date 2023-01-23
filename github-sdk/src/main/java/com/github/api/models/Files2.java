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
 * This is a model class for Files2 type.
 */
public class Files2 {
    private String filename;
    private String type;
    private String language;
    private String rawUrl;
    private Integer size;
    private Boolean truncated;
    private String content;

    /**
     * Default constructor.
     */
    public Files2() {
    }

    /**
     * Initialization constructor.
     * @param  filename  String value for filename.
     * @param  type  String value for type.
     * @param  language  String value for language.
     * @param  rawUrl  String value for rawUrl.
     * @param  size  Integer value for size.
     * @param  truncated  Boolean value for truncated.
     * @param  content  String value for content.
     */
    public Files2(
            String filename,
            String type,
            String language,
            String rawUrl,
            Integer size,
            Boolean truncated,
            String content) {
        this.filename = filename;
        this.type = type;
        this.language = language;
        this.rawUrl = rawUrl;
        this.size = size;
        this.truncated = truncated;
        this.content = content;
    }

    /**
     * Getter for Filename.
     * @return Returns the String
     */
    @JsonGetter("filename")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilename() {
        return filename;
    }

    /**
     * Setter for Filename.
     * @param filename Value for String
     */
    @JsonSetter("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Language.
     * @return Returns the String
     */
    @JsonGetter("language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLanguage() {
        return language;
    }

    /**
     * Setter for Language.
     * @param language Value for String
     */
    @JsonSetter("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Getter for RawUrl.
     * @return Returns the String
     */
    @JsonGetter("raw_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRawUrl() {
        return rawUrl;
    }

    /**
     * Setter for RawUrl.
     * @param rawUrl Value for String
     */
    @JsonSetter("raw_url")
    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    /**
     * Getter for Size.
     * @return Returns the Integer
     */
    @JsonGetter("size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * @param size Value for Integer
     */
    @JsonSetter("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Getter for Truncated.
     * @return Returns the Boolean
     */
    @JsonGetter("truncated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * Setter for Truncated.
     * @param truncated Value for Boolean
     */
    @JsonSetter("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * Getter for Content.
     * @return Returns the String
     */
    @JsonGetter("content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * @param content Value for String
     */
    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Converts this Files2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Files2 [" + "filename=" + filename + ", type=" + type + ", language=" + language
                + ", rawUrl=" + rawUrl + ", size=" + size + ", truncated=" + truncated
                + ", content=" + content + "]";
    }

    /**
     * Builds a new {@link Files2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Files2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .filename(getFilename())
                .type(getType())
                .language(getLanguage())
                .rawUrl(getRawUrl())
                .size(getSize())
                .truncated(getTruncated())
                .content(getContent());
        return builder;
    }

    /**
     * Class to build instances of {@link Files2}.
     */
    public static class Builder {
        private String filename;
        private String type;
        private String language;
        private String rawUrl;
        private Integer size;
        private Boolean truncated;
        private String content;



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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for language.
         * @param  language  String value for language.
         * @return Builder
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * Setter for rawUrl.
         * @param  rawUrl  String value for rawUrl.
         * @return Builder
         */
        public Builder rawUrl(String rawUrl) {
            this.rawUrl = rawUrl;
            return this;
        }

        /**
         * Setter for size.
         * @param  size  Integer value for size.
         * @return Builder
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for truncated.
         * @param  truncated  Boolean value for truncated.
         * @return Builder
         */
        public Builder truncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
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
         * Builds a new {@link Files2} object using the set fields.
         * @return {@link Files2}
         */
        public Files2 build() {
            return new Files2(filename, type, language, rawUrl, size, truncated, content);
        }
    }
}