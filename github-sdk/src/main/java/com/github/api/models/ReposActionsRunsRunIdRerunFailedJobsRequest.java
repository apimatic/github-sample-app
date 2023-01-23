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
 * This is a model class for ReposActionsRunsRunIdRerunFailedJobsRequest type.
 */
public class ReposActionsRunsRunIdRerunFailedJobsRequest {
    private Boolean enableDebugLogging;

    /**
     * Default constructor.
     */
    public ReposActionsRunsRunIdRerunFailedJobsRequest() {
        enableDebugLogging = false;
    }

    /**
     * Initialization constructor.
     * @param  enableDebugLogging  Boolean value for enableDebugLogging.
     */
    public ReposActionsRunsRunIdRerunFailedJobsRequest(
            Boolean enableDebugLogging) {
        this.enableDebugLogging = enableDebugLogging;
    }

    /**
     * Getter for EnableDebugLogging.
     * Whether to enable debug logging for the re-run.
     * @return Returns the Boolean
     */
    @JsonGetter("enable_debug_logging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnableDebugLogging() {
        return enableDebugLogging;
    }

    /**
     * Setter for EnableDebugLogging.
     * Whether to enable debug logging for the re-run.
     * @param enableDebugLogging Value for Boolean
     */
    @JsonSetter("enable_debug_logging")
    public void setEnableDebugLogging(Boolean enableDebugLogging) {
        this.enableDebugLogging = enableDebugLogging;
    }

    /**
     * Converts this ReposActionsRunsRunIdRerunFailedJobsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsRunsRunIdRerunFailedJobsRequest [" + "enableDebugLogging="
                + enableDebugLogging + "]";
    }

    /**
     * Builds a new {@link ReposActionsRunsRunIdRerunFailedJobsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsRunsRunIdRerunFailedJobsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enableDebugLogging(getEnableDebugLogging());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsRunsRunIdRerunFailedJobsRequest}.
     */
    public static class Builder {
        private Boolean enableDebugLogging = false;



        /**
         * Setter for enableDebugLogging.
         * @param  enableDebugLogging  Boolean value for enableDebugLogging.
         * @return Builder
         */
        public Builder enableDebugLogging(Boolean enableDebugLogging) {
            this.enableDebugLogging = enableDebugLogging;
            return this;
        }

        /**
         * Builds a new {@link ReposActionsRunsRunIdRerunFailedJobsRequest} object using the set
         * fields.
         * @return {@link ReposActionsRunsRunIdRerunFailedJobsRequest}
         */
        public ReposActionsRunsRunIdRerunFailedJobsRequest build() {
            return new ReposActionsRunsRunIdRerunFailedJobsRequest(enableDebugLogging);
        }
    }
}
