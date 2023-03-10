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
 * This is a model class for UserInteractionLimitsRequest type.
 */
public class UserInteractionLimitsRequest {
    private InteractionGroupEnum limit;
    private InteractionExpiryEnum expiry;

    /**
     * Default constructor.
     */
    public UserInteractionLimitsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  limit  InteractionGroupEnum value for limit.
     * @param  expiry  InteractionExpiryEnum value for expiry.
     */
    public UserInteractionLimitsRequest(
            InteractionGroupEnum limit,
            InteractionExpiryEnum expiry) {
        this.limit = limit;
        this.expiry = expiry;
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
     * Getter for Expiry.
     * @return Returns the InteractionExpiryEnum
     */
    @JsonGetter("expiry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InteractionExpiryEnum getExpiry() {
        return expiry;
    }

    /**
     * Setter for Expiry.
     * @param expiry Value for InteractionExpiryEnum
     */
    @JsonSetter("expiry")
    public void setExpiry(InteractionExpiryEnum expiry) {
        this.expiry = expiry;
    }

    /**
     * Converts this UserInteractionLimitsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserInteractionLimitsRequest [" + "limit=" + limit + ", expiry=" + expiry + "]";
    }

    /**
     * Builds a new {@link UserInteractionLimitsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserInteractionLimitsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(limit)
                .expiry(getExpiry());
        return builder;
    }

    /**
     * Class to build instances of {@link UserInteractionLimitsRequest}.
     */
    public static class Builder {
        private InteractionGroupEnum limit;
        private InteractionExpiryEnum expiry;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  limit  InteractionGroupEnum value for limit.
         */
        public Builder(InteractionGroupEnum limit) {
            this.limit = limit;
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
         * Setter for expiry.
         * @param  expiry  InteractionExpiryEnum value for expiry.
         * @return Builder
         */
        public Builder expiry(InteractionExpiryEnum expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Builds a new {@link UserInteractionLimitsRequest} object using the set fields.
         * @return {@link UserInteractionLimitsRequest}
         */
        public UserInteractionLimitsRequest build() {
            return new UserInteractionLimitsRequest(limit, expiry);
        }
    }
}
