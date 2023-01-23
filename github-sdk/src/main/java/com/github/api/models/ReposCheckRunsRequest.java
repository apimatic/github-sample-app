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
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ReposCheckRunsRequest type.
 */
public class ReposCheckRunsRequest {
    private String status;

    /**
     * Default constructor.
     */
    public ReposCheckRunsRequest() {
        status = "completed";
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     */
    @JsonCreator
    public ReposCheckRunsRequest(
            @JsonProperty("status") String status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    private void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this ReposCheckRunsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCheckRunsRequest [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link ReposCheckRunsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCheckRunsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(status);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCheckRunsRequest}.
     */
    public static class Builder {
        private String status = "completed";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  status  String value for status.
         */
        public Builder(String status) {
            this.status = status;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link ReposCheckRunsRequest} object using the set fields.
         * @return {@link ReposCheckRunsRequest}
         */
        public ReposCheckRunsRequest build() {
            return new ReposCheckRunsRequest(status);
        }
    }
}