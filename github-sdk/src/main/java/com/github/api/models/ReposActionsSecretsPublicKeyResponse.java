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
 * This is a model class for ReposActionsSecretsPublicKeyResponse type.
 */
public class ReposActionsSecretsPublicKeyResponse {
    private String keyId;
    private String key;
    private Integer id;
    private String url;
    private String title;
    private String createdAt;

    /**
     * Default constructor.
     */
    public ReposActionsSecretsPublicKeyResponse() {
    }

    /**
     * Initialization constructor.
     * @param  keyId  String value for keyId.
     * @param  key  String value for key.
     * @param  id  Integer value for id.
     * @param  url  String value for url.
     * @param  title  String value for title.
     * @param  createdAt  String value for createdAt.
     */
    public ReposActionsSecretsPublicKeyResponse(
            String keyId,
            String key,
            Integer id,
            String url,
            String title,
            String createdAt) {
        this.keyId = keyId;
        this.key = key;
        this.id = id;
        this.url = url;
        this.title = title;
        this.createdAt = createdAt;
    }

    /**
     * Getter for KeyId.
     * The identifier for the key.
     * @return Returns the String
     */
    @JsonGetter("key_id")
    public String getKeyId() {
        return keyId;
    }

    /**
     * Setter for KeyId.
     * The identifier for the key.
     * @param keyId Value for String
     */
    @JsonSetter("key_id")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * Getter for Key.
     * The Base64 encoded public key.
     * @return Returns the String
     */
    @JsonGetter("key")
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * The Base64 encoded public key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
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
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ReposActionsSecretsPublicKeyResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsSecretsPublicKeyResponse [" + "keyId=" + keyId + ", key=" + key
                + ", id=" + id + ", url=" + url + ", title=" + title + ", createdAt=" + createdAt
                + "]";
    }

    /**
     * Builds a new {@link ReposActionsSecretsPublicKeyResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsSecretsPublicKeyResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(keyId, key)
                .id(getId())
                .url(getUrl())
                .title(getTitle())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsSecretsPublicKeyResponse}.
     */
    public static class Builder {
        private String keyId;
        private String key;
        private Integer id;
        private String url;
        private String title;
        private String createdAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  keyId  String value for keyId.
         * @param  key  String value for key.
         */
        public Builder(String keyId, String key) {
            this.keyId = keyId;
            this.key = key;
        }

        /**
         * Setter for keyId.
         * @param  keyId  String value for keyId.
         * @return Builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
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
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
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
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
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
         * Builds a new {@link ReposActionsSecretsPublicKeyResponse} object using the set fields.
         * @return {@link ReposActionsSecretsPublicKeyResponse}
         */
        public ReposActionsSecretsPublicKeyResponse build() {
            return new ReposActionsSecretsPublicKeyResponse(keyId, key, id, url, title, createdAt);
        }
    }
}