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
 * This is a model class for InteractionLimits type.
 */
public class InteractionLimits {
    private InteractionGroupEnum limit;
    private String origin;
    private LocalDateTime expiresAt;

    /**
     * Default constructor.
     */
    public InteractionLimits() {
    }

    /**
     * Initialization constructor.
     * @param  limit  InteractionGroupEnum value for limit.
     * @param  origin  String value for origin.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     */
    @JsonCreator
    public InteractionLimits(
            @JsonProperty("limit") InteractionGroupEnum limit,
            @JsonProperty("origin") String origin,
            @JsonProperty("expires_at") LocalDateTime expiresAt) {
        this.limit = limit;
        this.origin = origin;
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for Limit.
     * @return Returns the InteractionGroupEnum
     */
    @JsonGetter("limit")
    public InteractionGroupEnum getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * @param limit Value for InteractionGroupEnum
     */
    @JsonSetter("limit")
    public void setLimit(InteractionGroupEnum limit) {
        this.limit = limit;
    }

    /**
     * Getter for Origin.
     * @return Returns the String
     */
    @JsonGetter("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Setter for Origin.
     * @param origin Value for String
     */
    @JsonSetter("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expires_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for LocalDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Converts this InteractionLimits into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InteractionLimits [" + "limit=" + limit + ", origin=" + origin + ", expiresAt="
                + expiresAt + "]";
    }

    /**
     * Builds a new {@link InteractionLimits.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InteractionLimits.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(limit, origin, expiresAt);
        return builder;
    }

    /**
     * Class to build instances of {@link InteractionLimits}.
     */
    public static class Builder {
        private InteractionGroupEnum limit;
        private String origin;
        private LocalDateTime expiresAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  limit  InteractionGroupEnum value for limit.
         * @param  origin  String value for origin.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         */
        public Builder(InteractionGroupEnum limit, String origin, LocalDateTime expiresAt) {
            this.limit = limit;
            this.origin = origin;
            this.expiresAt = expiresAt;
        }

        /**
         * Setter for limit.
         * @param  limit  InteractionGroupEnum value for limit.
         * @return Builder
         */
        public Builder limit(InteractionGroupEnum limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for origin.
         * @param  origin  String value for origin.
         * @return Builder
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Builds a new {@link InteractionLimits} object using the set fields.
         * @return {@link InteractionLimits}
         */
        public InteractionLimits build() {
            return new InteractionLimits(limit, origin, expiresAt);
        }
    }
}
