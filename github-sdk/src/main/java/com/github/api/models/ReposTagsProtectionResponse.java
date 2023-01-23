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
 * This is a model class for ReposTagsProtectionResponse type.
 */
public class ReposTagsProtectionResponse {
    private Integer id;
    private String createdAt;
    private String updatedAt;
    private Boolean enabled;
    private String pattern;

    /**
     * Default constructor.
     */
    public ReposTagsProtectionResponse() {
    }

    /**
     * Initialization constructor.
     * @param  pattern  String value for pattern.
     * @param  id  Integer value for id.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  enabled  Boolean value for enabled.
     */
    public ReposTagsProtectionResponse(
            String pattern,
            Integer id,
            String createdAt,
            String updatedAt,
            Boolean enabled) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.enabled = enabled;
        this.pattern = pattern;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for Pattern.
     * @return Returns the String
     */
    @JsonGetter("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * Setter for Pattern.
     * @param pattern Value for String
     */
    @JsonSetter("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * Converts this ReposTagsProtectionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposTagsProtectionResponse [" + "pattern=" + pattern + ", id=" + id
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", enabled=" + enabled
                + "]";
    }

    /**
     * Builds a new {@link ReposTagsProtectionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposTagsProtectionResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pattern)
                .id(getId())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .enabled(getEnabled());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposTagsProtectionResponse}.
     */
    public static class Builder {
        private String pattern;
        private Integer id;
        private String createdAt;
        private String updatedAt;
        private Boolean enabled;

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
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Builds a new {@link ReposTagsProtectionResponse} object using the set fields.
         * @return {@link ReposTagsProtectionResponse}
         */
        public ReposTagsProtectionResponse build() {
            return new ReposTagsProtectionResponse(pattern, id, createdAt, updatedAt, enabled);
        }
    }
}
