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
 * This is a model class for ReposTagsProtectionRequest type.
 */
public class ReposTagsProtectionRequest {
    private String pattern;

    /**
     * Default constructor.
     */
    public ReposTagsProtectionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  pattern  String value for pattern.
     */
    public ReposTagsProtectionRequest(
            String pattern) {
        this.pattern = pattern;
    }

    /**
     * Getter for Pattern.
     * An optional glob pattern to match against when enforcing tag protection.
     * @return Returns the String
     */
    @JsonGetter("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * Setter for Pattern.
     * An optional glob pattern to match against when enforcing tag protection.
     * @param pattern Value for String
     */
    @JsonSetter("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * Converts this ReposTagsProtectionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposTagsProtectionRequest [" + "pattern=" + pattern + "]";
    }

    /**
     * Builds a new {@link ReposTagsProtectionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposTagsProtectionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pattern);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposTagsProtectionRequest}.
     */
    public static class Builder {
        private String pattern;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pattern  String value for pattern.
         */
        public Builder(String pattern) {
            this.pattern = pattern;
        }

        /**
         * Setter for pattern.
         * @param  pattern  String value for pattern.
         * @return Builder
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Builds a new {@link ReposTagsProtectionRequest} object using the set fields.
         * @return {@link ReposTagsProtectionRequest}
         */
        public ReposTagsProtectionRequest build() {
            return new ReposTagsProtectionRequest(pattern);
        }
    }
}
