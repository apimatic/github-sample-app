/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for UserSshSigningKeysResponse type.
 */
public class UserSshSigningKeysResponse {
    private String key;
    private int id;
    private String title;
    private LocalDateTime createdAt;

    /**
     * Default constructor.
     */
    public UserSshSigningKeysResponse() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  id  int value for id.
     * @param  title  String value for title.
     * @param  createdAt  LocalDateTime value for createdAt.
     */
    public UserSshSigningKeysResponse(
            String key,
            int id,
            String title,
            LocalDateTime createdAt) {
        this.key = key;
        this.id = id;
        this.title = title;
        this.createdAt = createdAt;
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
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
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
     * Converts this UserSshSigningKeysResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserSshSigningKeysResponse [" + "key=" + key + ", id=" + id + ", title=" + title
                + ", createdAt=" + createdAt + "]";
    }

    /**
     * Builds a new {@link UserSshSigningKeysResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserSshSigningKeysResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, id, title, createdAt);
        return builder;
    }

    /**
     * Class to build instances of {@link UserSshSigningKeysResponse}.
     */
    public static class Builder {
        private String key;
        private int id;
        private String title;
        private LocalDateTime createdAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  String value for key.
         * @param  id  int value for id.
         * @param  title  String value for title.
         * @param  createdAt  LocalDateTime value for createdAt.
         */
        public Builder(String key, int id, String title, LocalDateTime createdAt) {
            this.key = key;
            this.id = id;
            this.title = title;
            this.createdAt = createdAt;
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
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
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
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link UserSshSigningKeysResponse} object using the set fields.
         * @return {@link UserSshSigningKeysResponse}
         */
        public UserSshSigningKeysResponse build() {
            return new UserSshSigningKeysResponse(key, id, title, createdAt);
        }
    }
}
