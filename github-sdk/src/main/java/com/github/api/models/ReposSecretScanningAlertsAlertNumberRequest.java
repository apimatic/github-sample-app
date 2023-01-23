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
 * This is a model class for ReposSecretScanningAlertsAlertNumberRequest type.
 */
public class ReposSecretScanningAlertsAlertNumberRequest {
    private SecretScanningAlertStateEnum state;
    private Object resolution;
    private OptionalNullable<String> resolutionComment;

    /**
     * Default constructor.
     */
    public ReposSecretScanningAlertsAlertNumberRequest() {
    }

    /**
     * Initialization constructor.
     * @param  state  SecretScanningAlertStateEnum value for state.
     * @param  resolution  Object value for resolution.
     * @param  resolutionComment  String value for resolutionComment.
     */
    public ReposSecretScanningAlertsAlertNumberRequest(
            SecretScanningAlertStateEnum state,
            Object resolution,
            String resolutionComment) {
        this.state = state;
        this.resolution = resolution;
        this.resolutionComment = OptionalNullable.of(resolutionComment);
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposSecretScanningAlertsAlertNumberRequest(SecretScanningAlertStateEnum state,
            Object resolution, OptionalNullable<String> resolutionComment) {
        this.state = state;
        this.resolution = resolution;
        this.resolutionComment = resolutionComment;
    }

    /**
     * Getter for State.
     * @return Returns the SecretScanningAlertStateEnum
     */
    @JsonGetter("state")
    public SecretScanningAlertStateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for SecretScanningAlertStateEnum
     */
    @JsonSetter("state")
    public void setState(SecretScanningAlertStateEnum state) {
        this.state = state;
    }

    /**
     * Getter for Resolution.
     * @return Returns the Object
     */
    @JsonGetter("resolution")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getResolution() {
        return resolution;
    }

    /**
     * Setter for Resolution.
     * @param resolution Value for Object
     */
    @JsonSetter("resolution")
    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    /**
     * Internal Getter for ResolutionComment.
     * An optional comment when closing an alert. Cannot be updated or deleted. Must be `null` when
     * changing `state` to `open`.
     * @return Returns the Internal String
     */
    @JsonGetter("resolution_comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetResolutionComment() {
        return this.resolutionComment;
    }

    /**
     * Getter for ResolutionComment.
     * An optional comment when closing an alert. Cannot be updated or deleted. Must be `null` when
     * changing `state` to `open`.
     * @return Returns the String
     */
    public String getResolutionComment() {
        return OptionalNullable.getFrom(resolutionComment);
    }

    /**
     * Setter for ResolutionComment.
     * An optional comment when closing an alert. Cannot be updated or deleted. Must be `null` when
     * changing `state` to `open`.
     * @param resolutionComment Value for String
     */
    @JsonSetter("resolution_comment")
    public void setResolutionComment(String resolutionComment) {
        this.resolutionComment = OptionalNullable.of(resolutionComment);
    }

    /**
     * UnSetter for ResolutionComment.
     * An optional comment when closing an alert. Cannot be updated or deleted. Must be `null` when
     * changing `state` to `open`.
     */
    public void unsetResolutionComment() {
        resolutionComment = null;
    }

    /**
     * Converts this ReposSecretScanningAlertsAlertNumberRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposSecretScanningAlertsAlertNumberRequest [" + "state=" + state + ", resolution="
                + resolution + ", resolutionComment=" + resolutionComment + "]";
    }

    /**
     * Builds a new {@link ReposSecretScanningAlertsAlertNumberRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposSecretScanningAlertsAlertNumberRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state)
                .resolution(getResolution());
        builder.resolutionComment = internalGetResolutionComment();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposSecretScanningAlertsAlertNumberRequest}.
     */
    public static class Builder {
        private SecretScanningAlertStateEnum state;
        private Object resolution;
        private OptionalNullable<String> resolutionComment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  SecretScanningAlertStateEnum value for state.
         */
        public Builder(SecretScanningAlertStateEnum state) {
            this.state = state;
        }

        /**
         * Setter for state.
         * @param  state  SecretScanningAlertStateEnum value for state.
         * @return Builder
         */
        public Builder state(SecretScanningAlertStateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for resolution.
         * @param  resolution  Object value for resolution.
         * @return Builder
         */
        public Builder resolution(Object resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * Setter for resolutionComment.
         * @param  resolutionComment  String value for resolutionComment.
         * @return Builder
         */
        public Builder resolutionComment(String resolutionComment) {
            this.resolutionComment = OptionalNullable.of(resolutionComment);
            return this;
        }

        /**
         * UnSetter for resolutionComment.
         * @return Builder
         */
        public Builder unsetResolutionComment() {
            resolutionComment = null;
            return this;
        }

        /**
         * Builds a new {@link ReposSecretScanningAlertsAlertNumberRequest} object using the set
         * fields.
         * @return {@link ReposSecretScanningAlertsAlertNumberRequest}
         */
        public ReposSecretScanningAlertsAlertNumberRequest build() {
            return new ReposSecretScanningAlertsAlertNumberRequest(state, resolution,
                    resolutionComment);
        }
    }
}