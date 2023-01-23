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
 * This is a model class for ReposCheckRunsCheckRunIdRequest1 type.
 */
public class ReposCheckRunsCheckRunIdRequest1 {
    private Status33Enum status;

    /**
     * Default constructor.
     */
    public ReposCheckRunsCheckRunIdRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  status  Status33Enum value for status.
     */
    public ReposCheckRunsCheckRunIdRequest1(
            Status33Enum status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * @return Returns the Status33Enum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status33Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status33Enum
     */
    @JsonSetter("status")
    public void setStatus(Status33Enum status) {
        this.status = status;
    }

    /**
     * Converts this ReposCheckRunsCheckRunIdRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCheckRunsCheckRunIdRequest1 [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link ReposCheckRunsCheckRunIdRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCheckRunsCheckRunIdRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCheckRunsCheckRunIdRequest1}.
     */
    public static class Builder {
        private Status33Enum status;



        /**
         * Setter for status.
         * @param  status  Status33Enum value for status.
         * @return Builder
         */
        public Builder status(Status33Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link ReposCheckRunsCheckRunIdRequest1} object using the set fields.
         * @return {@link ReposCheckRunsCheckRunIdRequest1}
         */
        public ReposCheckRunsCheckRunIdRequest1 build() {
            return new ReposCheckRunsCheckRunIdRequest1(status);
        }
    }
}
