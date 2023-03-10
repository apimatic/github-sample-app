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
 * This is a model class for Key1 type.
 */
public class Key1 {
    private OptionalNullable<String> addedBy;
    private String createdAt;
    private int id;
    private String key;
    private OptionalNullable<String> lastUsed;
    private boolean readOnly;
    private String title;
    private String url;
    private boolean verified;

    /**
     * Default constructor.
     */
    public Key1() {
    }

    /**
     * Initialization constructor.
     * @param  createdAt  String value for createdAt.
     * @param  id  int value for id.
     * @param  key  String value for key.
     * @param  readOnly  boolean value for readOnly.
     * @param  title  String value for title.
     * @param  url  String value for url.
     * @param  verified  boolean value for verified.
     * @param  addedBy  String value for addedBy.
     * @param  lastUsed  String value for lastUsed.
     */
    public Key1(
            String createdAt,
            int id,
            String key,
            boolean readOnly,
            String title,
            String url,
            boolean verified,
            String addedBy,
            String lastUsed) {
        this.addedBy = OptionalNullable.of(addedBy);
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.lastUsed = OptionalNullable.of(lastUsed);
        this.readOnly = readOnly;
        this.title = title;
        this.url = url;
        this.verified = verified;
    }

    /**
     * Internal initialization constructor.
     */
    protected Key1(String createdAt, int id, String key, boolean readOnly, String title, String url,
            boolean verified, OptionalNullable<String> addedBy,
            OptionalNullable<String> lastUsed) {
        this.addedBy = addedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.lastUsed = lastUsed;
        this.readOnly = readOnly;
        this.title = title;
        this.url = url;
        this.verified = verified;
    }

    /**
     * Internal Getter for AddedBy.
     * @return Returns the Internal String
     */
    @JsonGetter("added_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddedBy() {
        return this.addedBy;
    }

    /**
     * Getter for AddedBy.
     * @return Returns the String
     */
    public String getAddedBy() {
        return OptionalNullable.getFrom(addedBy);
    }

    /**
     * Setter for AddedBy.
     * @param addedBy Value for String
     */
    @JsonSetter("added_by")
    public void setAddedBy(String addedBy) {
        this.addedBy = OptionalNullable.of(addedBy);
    }

    /**
     * UnSetter for AddedBy.
     */
    public void unsetAddedBy() {
        addedBy = null;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
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
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
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
     * Internal Getter for LastUsed.
     * @return Returns the Internal String
     */
    @JsonGetter("last_used")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLastUsed() {
        return this.lastUsed;
    }

    /**
     * Getter for LastUsed.
     * @return Returns the String
     */
    public String getLastUsed() {
        return OptionalNullable.getFrom(lastUsed);
    }

    /**
     * Setter for LastUsed.
     * @param lastUsed Value for String
     */
    @JsonSetter("last_used")
    public void setLastUsed(String lastUsed) {
        this.lastUsed = OptionalNullable.of(lastUsed);
    }

    /**
     * UnSetter for LastUsed.
     */
    public void unsetLastUsed() {
        lastUsed = null;
    }

    /**
     * Getter for ReadOnly.
     * @return Returns the boolean
     */
    @JsonGetter("read_only")
    public boolean getReadOnly() {
        return readOnly;
    }

    /**
     * Setter for ReadOnly.
     * @param readOnly Value for boolean
     */
    @JsonSetter("read_only")
    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
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
     * Getter for Verified.
     * @return Returns the boolean
     */
    @JsonGetter("verified")
    public boolean getVerified() {
        return verified;
    }

    /**
     * Setter for Verified.
     * @param verified Value for boolean
     */
    @JsonSetter("verified")
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * Converts this Key1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Key1 [" + "createdAt=" + createdAt + ", id=" + id + ", key=" + key + ", readOnly="
                + readOnly + ", title=" + title + ", url=" + url + ", verified=" + verified
                + ", addedBy=" + addedBy + ", lastUsed=" + lastUsed + "]";
    }

    /**
     * Builds a new {@link Key1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Key1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdAt, id, key, readOnly, title, url, verified);
        builder.addedBy = internalGetAddedBy();
        builder.lastUsed = internalGetLastUsed();
        return builder;
    }

    /**
     * Class to build instances of {@link Key1}.
     */
    public static class Builder {
        private String createdAt;
        private int id;
        private String key;
        private boolean readOnly;
        private String title;
        private String url;
        private boolean verified;
        private OptionalNullable<String> addedBy;
        private OptionalNullable<String> lastUsed;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdAt  String value for createdAt.
         * @param  id  int value for id.
         * @param  key  String value for key.
         * @param  readOnly  boolean value for readOnly.
         * @param  title  String value for title.
         * @param  url  String value for url.
         * @param  verified  boolean value for verified.
         */
        public Builder(String createdAt, int id, String key, boolean readOnly, String title,
                String url, boolean verified) {
            this.createdAt = createdAt;
            this.id = id;
            this.key = key;
            this.readOnly = readOnly;
            this.title = title;
            this.url = url;
            this.verified = verified;
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
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
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
         * Setter for readOnly.
         * @param  readOnly  boolean value for readOnly.
         * @return Builder
         */
        public Builder readOnly(boolean readOnly) {
            this.readOnly = readOnly;
            return this;
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
         * Setter for verified.
         * @param  verified  boolean value for verified.
         * @return Builder
         */
        public Builder verified(boolean verified) {
            this.verified = verified;
            return this;
        }

        /**
         * Setter for addedBy.
         * @param  addedBy  String value for addedBy.
         * @return Builder
         */
        public Builder addedBy(String addedBy) {
            this.addedBy = OptionalNullable.of(addedBy);
            return this;
        }

        /**
         * UnSetter for addedBy.
         * @return Builder
         */
        public Builder unsetAddedBy() {
            addedBy = null;
            return this;
        }

        /**
         * Setter for lastUsed.
         * @param  lastUsed  String value for lastUsed.
         * @return Builder
         */
        public Builder lastUsed(String lastUsed) {
            this.lastUsed = OptionalNullable.of(lastUsed);
            return this;
        }

        /**
         * UnSetter for lastUsed.
         * @return Builder
         */
        public Builder unsetLastUsed() {
            lastUsed = null;
            return this;
        }

        /**
         * Builds a new {@link Key1} object using the set fields.
         * @return {@link Key1}
         */
        public Key1 build() {
            return new Key1(createdAt, id, key, readOnly, title, url, verified, addedBy, lastUsed);
        }
    }
}
