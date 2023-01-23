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
 * This is a model class for ReposDependabotAlertsAlertNumberRequest type.
 */
public class ReposDependabotAlertsAlertNumberRequest {
    private State172Enum state;
    private DismissedReason5Enum dismissedReason;
    private String dismissedComment;

    /**
     * Default constructor.
     */
    public ReposDependabotAlertsAlertNumberRequest() {
    }

    /**
     * Initialization constructor.
     * @param  state  State172Enum value for state.
     * @param  dismissedReason  DismissedReason5Enum value for dismissedReason.
     * @param  dismissedComment  String value for dismissedComment.
     */
    public ReposDependabotAlertsAlertNumberRequest(
            State172Enum state,
            DismissedReason5Enum dismissedReason,
            String dismissedComment) {
        this.state = state;
        this.dismissedReason = dismissedReason;
        this.dismissedComment = dismissedComment;
    }

    /**
     * Getter for State.
     * @return Returns the State172Enum
     */
    @JsonGetter("state")
    public State172Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State172Enum
     */
    @JsonSetter("state")
    public void setState(State172Enum state) {
        this.state = state;
    }

    /**
     * Getter for DismissedReason.
     * @return Returns the DismissedReason5Enum
     */
    @JsonGetter("dismissed_reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DismissedReason5Enum getDismissedReason() {
        return dismissedReason;
    }

    /**
     * Setter for DismissedReason.
     * @param dismissedReason Value for DismissedReason5Enum
     */
    @JsonSetter("dismissed_reason")
    public void setDismissedReason(DismissedReason5Enum dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    /**
     * Getter for DismissedComment.
     * An optional comment associated with dismissing the alert.
     * @return Returns the String
     */
    @JsonGetter("dismissed_comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDismissedComment() {
        return dismissedComment;
    }

    /**
     * Setter for DismissedComment.
     * An optional comment associated with dismissing the alert.
     * @param dismissedComment Value for String
     */
    @JsonSetter("dismissed_comment")
    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    /**
     * Converts this ReposDependabotAlertsAlertNumberRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposDependabotAlertsAlertNumberRequest [" + "state=" + state + ", dismissedReason="
                + dismissedReason + ", dismissedComment=" + dismissedComment + "]";
    }

    /**
     * Builds a new {@link ReposDependabotAlertsAlertNumberRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposDependabotAlertsAlertNumberRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state)
                .dismissedReason(getDismissedReason())
                .dismissedComment(getDismissedComment());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposDependabotAlertsAlertNumberRequest}.
     */
    public static class Builder {
        private State172Enum state;
        private DismissedReason5Enum dismissedReason;
        private String dismissedComment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  State172Enum value for state.
         */
        public Builder(State172Enum state) {
            this.state = state;
        }

        /**
         * Setter for state.
         * @param  state  State172Enum value for state.
         * @return Builder
         */
        public Builder state(State172Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for dismissedReason.
         * @param  dismissedReason  DismissedReason5Enum value for dismissedReason.
         * @return Builder
         */
        public Builder dismissedReason(DismissedReason5Enum dismissedReason) {
            this.dismissedReason = dismissedReason;
            return this;
        }

        /**
         * Setter for dismissedComment.
         * @param  dismissedComment  String value for dismissedComment.
         * @return Builder
         */
        public Builder dismissedComment(String dismissedComment) {
            this.dismissedComment = dismissedComment;
            return this;
        }

        /**
         * Builds a new {@link ReposDependabotAlertsAlertNumberRequest} object using the set fields.
         * @return {@link ReposDependabotAlertsAlertNumberRequest}
         */
        public ReposDependabotAlertsAlertNumberRequest build() {
            return new ReposDependabotAlertsAlertNumberRequest(state, dismissedReason,
                    dismissedComment);
        }
    }
}