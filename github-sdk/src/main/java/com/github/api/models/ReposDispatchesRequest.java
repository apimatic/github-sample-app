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
 * This is a model class for ReposDispatchesRequest type.
 */
public class ReposDispatchesRequest {
    private String eventType;
    private Object clientPayload;

    /**
     * Default constructor.
     */
    public ReposDispatchesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  eventType  String value for eventType.
     * @param  clientPayload  Object value for clientPayload.
     */
    public ReposDispatchesRequest(
            String eventType,
            Object clientPayload) {
        this.eventType = eventType;
        this.clientPayload = clientPayload;
    }

    /**
     * Getter for EventType.
     * A custom webhook event name. Must be 100 characters or fewer.
     * @return Returns the String
     */
    @JsonGetter("event_type")
    public String getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * A custom webhook event name. Must be 100 characters or fewer.
     * @param eventType Value for String
     */
    @JsonSetter("event_type")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for ClientPayload.
     * JSON payload with extra information about the webhook event that your action or workflow may
     * use. The maximum number of top-level properties is 10.
     * @return Returns the Object
     */
    @JsonGetter("client_payload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getClientPayload() {
        return clientPayload;
    }

    /**
     * Setter for ClientPayload.
     * JSON payload with extra information about the webhook event that your action or workflow may
     * use. The maximum number of top-level properties is 10.
     * @param clientPayload Value for Object
     */
    @JsonSetter("client_payload")
    public void setClientPayload(Object clientPayload) {
        this.clientPayload = clientPayload;
    }

    /**
     * Converts this ReposDispatchesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposDispatchesRequest [" + "eventType=" + eventType + ", clientPayload="
                + clientPayload + "]";
    }

    /**
     * Builds a new {@link ReposDispatchesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposDispatchesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(eventType)
                .clientPayload(getClientPayload());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposDispatchesRequest}.
     */
    public static class Builder {
        private String eventType;
        private Object clientPayload;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  eventType  String value for eventType.
         */
        public Builder(String eventType) {
            this.eventType = eventType;
        }

        /**
         * Setter for eventType.
         * @param  eventType  String value for eventType.
         * @return Builder
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Setter for clientPayload.
         * @param  clientPayload  Object value for clientPayload.
         * @return Builder
         */
        public Builder clientPayload(Object clientPayload) {
            this.clientPayload = clientPayload;
            return this;
        }

        /**
         * Builds a new {@link ReposDispatchesRequest} object using the set fields.
         * @return {@link ReposDispatchesRequest}
         */
        public ReposDispatchesRequest build() {
            return new ReposDispatchesRequest(eventType, clientPayload);
        }
    }
}
