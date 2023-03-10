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
 * This is a model class for ReposActionsJobsJobIdRerunRequest type.
 */
public class ReposActionsJobsJobIdRerunRequest {
    private Boolean enableDebugLogging;

    /**
     * Default constructor.
     */
    public ReposActionsJobsJobIdRerunRequest() {
        enableDebugLogging = false;
    }

    /**
     * Initialization constructor.
     * @param  enableDebugLogging  Boolean value for enableDebugLogging.
     */
    public ReposActionsJobsJobIdRerunRequest(
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
     * Converts this ReposActionsJobsJobIdRerunRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsJobsJobIdRerunRequest [" + "enableDebugLogging=" + enableDebugLogging
                + "]";
    }

    /**
     * Builds a new {@link ReposActionsJobsJobIdRerunRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsJobsJobIdRerunRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enableDebugLogging(getEnableDebugLogging());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsJobsJobIdRerunRequest}.
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
         * Builds a new {@link ReposActionsJobsJobIdRerunRequest} object using the set fields.
         * @return {@link ReposActionsJobsJobIdRerunRequest}
         */
        public ReposActionsJobsJobIdRerunRequest build() {
            return new ReposActionsJobsJobIdRerunRequest(enableDebugLogging);
        }
    }
}
