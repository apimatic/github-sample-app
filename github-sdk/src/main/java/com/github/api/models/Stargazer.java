/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for Stargazer type.
 */
public class Stargazer {
    private LocalDateTime starredAt;
    private Object user;

    /**
     * Default constructor.
     */
    public Stargazer() {
    }

    /**
     * Initialization constructor.
     * @param  starredAt  LocalDateTime value for starredAt.
     * @param  user  Object value for user.
     */
    @JsonCreator
    public Stargazer(
            @JsonProperty("starred_at") LocalDateTime starredAt,
            @JsonProperty("user") Object user) {
        this.starredAt = starredAt;
        this.user = user;
    }

    /**
     * Getter for StarredAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("starred_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStarredAt() {
        return starredAt;
    }

    /**
     * Setter for StarredAt.
     * @param starredAt Value for LocalDateTime
     */
    @JsonSetter("starred_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStarredAt(LocalDateTime starredAt) {
        this.starredAt = starredAt;
    }

    /**
     * Getter for User.
     * @return Returns the Object
     */
    @JsonGetter("user")
    public Object getUser() {
        return user;
    }

    /**
     * Setter for User.
     * @param user Value for Object
     */
    @JsonSetter("user")
    public void setUser(Object user) {
        this.user = user;
    }

    /**
     * Converts this Stargazer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Stargazer [" + "starredAt=" + starredAt + ", user=" + user + "]";
    }

    /**
     * Builds a new {@link Stargazer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Stargazer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(starredAt, user);
        return builder;
    }

    /**
     * Class to build instances of {@link Stargazer}.
     */
    public static class Builder {
        private LocalDateTime starredAt;
        private Object user;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  starredAt  LocalDateTime value for starredAt.
         * @param  user  Object value for user.
         */
        public Builder(LocalDateTime starredAt, Object user) {
            this.starredAt = starredAt;
            this.user = user;
        }

        /**
         * Setter for starredAt.
         * @param  starredAt  LocalDateTime value for starredAt.
         * @return Builder
         */
        public Builder starredAt(LocalDateTime starredAt) {
            this.starredAt = starredAt;
            return this;
        }

        /**
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link Stargazer} object using the set fields.
         * @return {@link Stargazer}
         */
        public Stargazer build() {
            return new Stargazer(starredAt, user);
        }
    }
}
