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
 * This is a model class for Tree7 type.
 */
public class Tree7 {
    private String path;
    private Mode1Enum mode;
    private Type614Enum type;
    private OptionalNullable<String> sha;
    private String content;

    /**
     * Default constructor.
     */
    public Tree7() {
    }

    /**
     * Initialization constructor.
     * @param  path  String value for path.
     * @param  mode  Mode1Enum value for mode.
     * @param  type  Type614Enum value for type.
     * @param  sha  String value for sha.
     * @param  content  String value for content.
     */
    public Tree7(
            String path,
            Mode1Enum mode,
            Type614Enum type,
            String sha,
            String content) {
        this.path = path;
        this.mode = mode;
        this.type = type;
        this.sha = OptionalNullable.of(sha);
        this.content = content;
    }

    /**
     * Internal initialization constructor.
     */
    protected Tree7(String path, Mode1Enum mode, Type614Enum type, OptionalNullable<String> sha,
            String content) {
        this.path = path;
        this.mode = mode;
        this.type = type;
        this.sha = sha;
        this.content = content;
    }

    /**
     * Getter for Path.
     * The file referenced in the tree.
     * @return Returns the String
     */
    @JsonGetter("path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * The file referenced in the tree.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Mode.
     * @return Returns the Mode1Enum
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Mode1Enum getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * @param mode Value for Mode1Enum
     */
    @JsonSetter("mode")
    public void setMode(Mode1Enum mode) {
        this.mode = mode;
    }

    /**
     * Getter for Type.
     * @return Returns the Type614Enum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Type614Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for Type614Enum
     */
    @JsonSetter("type")
    public void setType(Type614Enum type) {
        this.type = type;
    }

    /**
     * Internal Getter for Sha.
     * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is
     * `null` then the file will be deleted. **Note:** Use either `tree.sha` or `content` to specify
     * the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @return Returns the Internal String
     */
    @JsonGetter("sha")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSha() {
        return this.sha;
    }

    /**
     * Getter for Sha.
     * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is
     * `null` then the file will be deleted. **Note:** Use either `tree.sha` or `content` to specify
     * the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @return Returns the String
     */
    public String getSha() {
        return OptionalNullable.getFrom(sha);
    }

    /**
     * Setter for Sha.
     * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is
     * `null` then the file will be deleted. **Note:** Use either `tree.sha` or `content` to specify
     * the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = OptionalNullable.of(sha);
    }

    /**
     * UnSetter for Sha.
     * The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is
     * `null` then the file will be deleted. **Note:** Use either `tree.sha` or `content` to specify
     * the contents of the entry. Using both `tree.sha` and `content` will return an error.
     */
    public void unsetSha() {
        sha = null;
    }

    /**
     * Getter for Content.
     * The content you want this file to have. GitHub will write this blob out and use that SHA for
     * this entry. Use either this, or `tree.sha`. **Note:** Use either `tree.sha` or `content` to
     * specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @return Returns the String
     */
    @JsonGetter("content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * The content you want this file to have. GitHub will write this blob out and use that SHA for
     * this entry. Use either this, or `tree.sha`. **Note:** Use either `tree.sha` or `content` to
     * specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
     * @param content Value for String
     */
    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Converts this Tree7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Tree7 [" + "path=" + path + ", mode=" + mode + ", type=" + type + ", sha=" + sha
                + ", content=" + content + "]";
    }

    /**
     * Builds a new {@link Tree7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Tree7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .path(getPath())
                .mode(getMode())
                .type(getType())
                .content(getContent());
        builder.sha = internalGetSha();
        return builder;
    }

    /**
     * Class to build instances of {@link Tree7}.
     */
    public static class Builder {
        private String path;
        private Mode1Enum mode;
        private Type614Enum type;
        private OptionalNullable<String> sha;
        private String content;



        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for mode.
         * @param  mode  Mode1Enum value for mode.
         * @return Builder
         */
        public Builder mode(Mode1Enum mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Type614Enum value for type.
         * @return Builder
         */
        public Builder type(Type614Enum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = OptionalNullable.of(sha);
            return this;
        }

        /**
         * UnSetter for sha.
         * @return Builder
         */
        public Builder unsetSha() {
            sha = null;
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
         * Builds a new {@link Tree7} object using the set fields.
         * @return {@link Tree7}
         */
        public Tree7 build() {
            return new Tree7(path, mode, type, sha, content);
        }
    }
}
