/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for ActionsCach type.
 */
public class ActionsCach {
    private Integer id;
    private String ref;
    private String key;
    private String version;
    private LocalDateTime lastAccessedAt;
    private LocalDateTime createdAt;
    private Integer sizeInBytes;

    /**
     * Default constructor.
     */
    public ActionsCach() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  ref  String value for ref.
     * @param  key  String value for key.
     * @param  version  String value for version.
     * @param  lastAccessedAt  LocalDateTime value for lastAccessedAt.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  sizeInBytes  Integer value for sizeInBytes.
     */
    public ActionsCach(
            Integer id,
            String ref,
            String key,
            String version,
            LocalDateTime lastAccessedAt,
            LocalDateTime createdAt,
            Integer sizeInBytes) {
        this.id = id;
        this.ref = ref;
        this.key = key;
        this.version = version;
        this.lastAccessedAt = lastAccessedAt;
        this.createdAt = createdAt;
        this.sizeInBytes = sizeInBytes;
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
     * Getter for Ref.
     * @return Returns the String
     */
    @JsonGetter("ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Version.
     * @return Returns the String
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for LastAccessedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("last_accessed_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLastAccessedAt() {
        return lastAccessedAt;
    }

    /**
     * Setter for LastAccessedAt.
     * @param lastAccessedAt Value for LocalDateTime
     */
    @JsonSetter("last_accessed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastAccessedAt(LocalDateTime lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for SizeInBytes.
     * @return Returns the Integer
     */
    @JsonGetter("size_in_bytes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * Setter for SizeInBytes.
     * @param sizeInBytes Value for Integer
     */
    @JsonSetter("size_in_bytes")
    public void setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * Converts this ActionsCach into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActionsCach [" + "id=" + id + ", ref=" + ref + ", key=" + key + ", version="
                + version + ", lastAccessedAt=" + lastAccessedAt + ", createdAt=" + createdAt
                + ", sizeInBytes=" + sizeInBytes + "]";
    }

    /**
     * Builds a new {@link ActionsCach.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActionsCach.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .ref(getRef())
                .key(getKey())
                .version(getVersion())
                .lastAccessedAt(getLastAccessedAt())
                .createdAt(getCreatedAt())
                .sizeInBytes(getSizeInBytes());
        return builder;
    }

    /**
     * Class to build instances of {@link ActionsCach}.
     */
    public static class Builder {
        private Integer id;
        private String ref;
        private String key;
        private String version;
        private LocalDateTime lastAccessedAt;
        private LocalDateTime createdAt;
        private Integer sizeInBytes;



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
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for lastAccessedAt.
         * @param  lastAccessedAt  LocalDateTime value for lastAccessedAt.
         * @return Builder
         */
        public Builder lastAccessedAt(LocalDateTime lastAccessedAt) {
            this.lastAccessedAt = lastAccessedAt;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for sizeInBytes.
         * @param  sizeInBytes  Integer value for sizeInBytes.
         * @return Builder
         */
        public Builder sizeInBytes(Integer sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        /**
         * Builds a new {@link ActionsCach} object using the set fields.
         * @return {@link ActionsCach}
         */
        public ActionsCach build() {
            return new ActionsCach(id, ref, key, version, lastAccessedAt, createdAt, sizeInBytes);
        }
    }
}
