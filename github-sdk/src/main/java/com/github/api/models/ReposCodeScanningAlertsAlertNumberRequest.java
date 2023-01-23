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
 * This is a model class for ReposCodeScanningAlertsAlertNumberRequest type.
 */
public class ReposCodeScanningAlertsAlertNumberRequest {
    private CodeScanningAlertSetStateEnum state;
    private Object dismissedReason;
    private OptionalNullable<String> dismissedComment;

    /**
     * Default constructor.
     */
    public ReposCodeScanningAlertsAlertNumberRequest() {
    }

    /**
     * Initialization constructor.
     * @param  state  CodeScanningAlertSetStateEnum value for state.
     * @param  dismissedReason  Object value for dismissedReason.
     * @param  dismissedComment  String value for dismissedComment.
     */
    public ReposCodeScanningAlertsAlertNumberRequest(
            CodeScanningAlertSetStateEnum state,
            Object dismissedReason,
            String dismissedComment) {
        this.state = state;
        this.dismissedReason = dismissedReason;
        this.dismissedComment = OptionalNullable.of(dismissedComment);
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposCodeScanningAlertsAlertNumberRequest(CodeScanningAlertSetStateEnum state,
            Object dismissedReason, OptionalNullable<String> dismissedComment) {
        this.state = state;
        this.dismissedReason = dismissedReason;
        this.dismissedComment = dismissedComment;
    }

    /**
     * Getter for State.
     * @return Returns the CodeScanningAlertSetStateEnum
     */
    @JsonGetter("state")
    public CodeScanningAlertSetStateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for CodeScanningAlertSetStateEnum
     */
    @JsonSetter("state")
    public void setState(CodeScanningAlertSetStateEnum state) {
        this.state = state;
    }

    /**
     * Getter for DismissedReason.
     * @return Returns the Object
     */
    @JsonGetter("dismissed_reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getDismissedReason() {
        return dismissedReason;
    }

    /**
     * Setter for DismissedReason.
     * @param dismissedReason Value for Object
     */
    @JsonSetter("dismissed_reason")
    public void setDismissedReason(Object dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    /**
     * Internal Getter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     * @return Returns the Internal String
     */
    @JsonGetter("dismissed_comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDismissedComment() {
        return this.dismissedComment;
    }

    /**
     * Getter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     * @return Returns the String
     */
    public String getDismissedComment() {
        return OptionalNullable.getFrom(dismissedComment);
    }

    /**
     * Setter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     * @param dismissedComment Value for String
     */
    @JsonSetter("dismissed_comment")
    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = OptionalNullable.of(dismissedComment);
    }

    /**
     * UnSetter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     */
    public void unsetDismissedComment() {
        dismissedComment = null;
    }

    /**
     * Converts this ReposCodeScanningAlertsAlertNumberRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCodeScanningAlertsAlertNumberRequest [" + "state=" + state
                + ", dismissedReason=" + dismissedReason + ", dismissedComment=" + dismissedComment
                + "]";
    }

    /**
     * Builds a new {@link ReposCodeScanningAlertsAlertNumberRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCodeScanningAlertsAlertNumberRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state)
                .dismissedReason(getDismissedReason());
        builder.dismissedComment = internalGetDismissedComment();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCodeScanningAlertsAlertNumberRequest}.
     */
    public static class Builder {
        private CodeScanningAlertSetStateEnum state;
        private Object dismissedReason;
        private OptionalNullable<String> dismissedComment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  CodeScanningAlertSetStateEnum value for state.
         */
        public Builder(CodeScanningAlertSetStateEnum state) {
            this.state = state;
        }

        /**
         * Setter for state.
         * @param  state  CodeScanningAlertSetStateEnum value for state.
         * @return Builder
         */
        public Builder state(CodeScanningAlertSetStateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for dismissedReason.
         * @param  dismissedReason  Object value for dismissedReason.
         * @return Builder
         */
        public Builder dismissedReason(Object dismissedReason) {
            this.dismissedReason = dismissedReason;
            return this;
        }

        /**
         * Setter for dismissedComment.
         * @param  dismissedComment  String value for dismissedComment.
         * @return Builder
         */
        public Builder dismissedComment(String dismissedComment) {
            this.dismissedComment = OptionalNullable.of(dismissedComment);
            return this;
        }

        /**
         * UnSetter for dismissedComment.
         * @return Builder
         */
        public Builder unsetDismissedComment() {
            dismissedComment = null;
            return this;
        }

        /**
         * Builds a new {@link ReposCodeScanningAlertsAlertNumberRequest} object using the set
         * fields.
         * @return {@link ReposCodeScanningAlertsAlertNumberRequest}
         */
        public ReposCodeScanningAlertsAlertNumberRequest build() {
            return new ReposCodeScanningAlertsAlertNumberRequest(state, dismissedReason,
                    dismissedComment);
        }
    }
}
