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
 * This is a model class for ReposCheckRunsCheckRunIdRequest type.
 */
public class ReposCheckRunsCheckRunIdRequest {
    private ActionEnum status;

    /**
     * Default constructor.
     */
    public ReposCheckRunsCheckRunIdRequest() {
    }

    /**
     * Initialization constructor.
     * @param  status  ActionEnum value for status.
     */
    public ReposCheckRunsCheckRunIdRequest(
            ActionEnum status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * @return Returns the ActionEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ActionEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for ActionEnum
     */
    @JsonSetter("status")
    public void setStatus(ActionEnum status) {
        this.status = status;
    }

    /**
     * Converts this ReposCheckRunsCheckRunIdRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCheckRunsCheckRunIdRequest [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link ReposCheckRunsCheckRunIdRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCheckRunsCheckRunIdRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCheckRunsCheckRunIdRequest}.
     */
    public static class Builder {
        private ActionEnum status;



        /**
         * Setter for status.
         * @param  status  ActionEnum value for status.
         * @return Builder
         */
        public Builder status(ActionEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link ReposCheckRunsCheckRunIdRequest} object using the set fields.
         * @return {@link ReposCheckRunsCheckRunIdRequest}
         */
        public ReposCheckRunsCheckRunIdRequest build() {
            return new ReposCheckRunsCheckRunIdRequest(status);
        }
    }
}