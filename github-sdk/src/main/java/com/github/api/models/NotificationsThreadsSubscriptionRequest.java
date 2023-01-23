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
 * This is a model class for NotificationsThreadsSubscriptionRequest type.
 */
public class NotificationsThreadsSubscriptionRequest {
    private Boolean ignored;

    /**
     * Default constructor.
     */
    public NotificationsThreadsSubscriptionRequest() {
        ignored = false;
    }

    /**
     * Initialization constructor.
     * @param  ignored  Boolean value for ignored.
     */
    public NotificationsThreadsSubscriptionRequest(
            Boolean ignored) {
        this.ignored = ignored;
    }

    /**
     * Getter for Ignored.
     * Whether to block all notifications from a thread.
     * @return Returns the Boolean
     */
    @JsonGetter("ignored")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIgnored() {
        return ignored;
    }

    /**
     * Setter for Ignored.
     * Whether to block all notifications from a thread.
     * @param ignored Value for Boolean
     */
    @JsonSetter("ignored")
    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    /**
     * Converts this NotificationsThreadsSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NotificationsThreadsSubscriptionRequest [" + "ignored=" + ignored + "]";
    }

    /**
     * Builds a new {@link NotificationsThreadsSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NotificationsThreadsSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ignored(getIgnored());
        return builder;
    }

    /**
     * Class to build instances of {@link NotificationsThreadsSubscriptionRequest}.
     */
    public static class Builder {
        private Boolean ignored = false;



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
         * Builds a new {@link NotificationsThreadsSubscriptionRequest} object using the set fields.
         * @return {@link NotificationsThreadsSubscriptionRequest}
         */
        public NotificationsThreadsSubscriptionRequest build() {
            return new NotificationsThreadsSubscriptionRequest(ignored);
        }
    }
}
