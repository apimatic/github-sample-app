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
 * This is a model class for ReposSubscriptionRequest type.
 */
public class ReposSubscriptionRequest {
    private Boolean subscribed;
    private Boolean ignored;

    /**
     * Default constructor.
     */
    public ReposSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  subscribed  Boolean value for subscribed.
     * @param  ignored  Boolean value for ignored.
     */
    public ReposSubscriptionRequest(
            Boolean subscribed,
            Boolean ignored) {
        this.subscribed = subscribed;
        this.ignored = ignored;
    }

    /**
     * Getter for Subscribed.
     * Determines if notifications should be received from this repository.
     * @return Returns the Boolean
     */
    @JsonGetter("subscribed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSubscribed() {
        return subscribed;
    }

    /**
     * Setter for Subscribed.
     * Determines if notifications should be received from this repository.
     * @param subscribed Value for Boolean
     */
    @JsonSetter("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    /**
     * Getter for Ignored.
     * Determines if all notifications should be blocked from this repository.
     * @return Returns the Boolean
     */
    @JsonGetter("ignored")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIgnored() {
        return ignored;
    }

    /**
     * Setter for Ignored.
     * Determines if all notifications should be blocked from this repository.
     * @param ignored Value for Boolean
     */
    @JsonSetter("ignored")
    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    /**
     * Converts this ReposSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposSubscriptionRequest [" + "subscribed=" + subscribed + ", ignored=" + ignored
                + "]";
    }

    /**
     * Builds a new {@link ReposSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .subscribed(getSubscribed())
                .ignored(getIgnored());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposSubscriptionRequest}.
     */
    public static class Builder {
        private Boolean subscribed;
        private Boolean ignored;



        /**
         * Setter for subscribed.
         * @param  subscribed  Boolean value for subscribed.
         * @return Builder
         */
        public Builder subscribed(Boolean subscribed) {
            this.subscribed = subscribed;
            return this;
        }

        /**
         * Setter for ignored.
         * @param  ignored  Boolean value for ignored.
         * @return Builder
         */
        public Builder ignored(Boolean ignored) {
            this.ignored = ignored;
            return this;
        }

        /**
         * Builds a new {@link ReposSubscriptionRequest} object using the set fields.
         * @return {@link ReposSubscriptionRequest}
         */
        public ReposSubscriptionRequest build() {
            return new ReposSubscriptionRequest(subscribed, ignored);
        }
    }
}