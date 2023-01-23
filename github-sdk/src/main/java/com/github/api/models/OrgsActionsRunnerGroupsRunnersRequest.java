/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for OrgsActionsRunnerGroupsRunnersRequest type.
 */
public class OrgsActionsRunnerGroupsRunnersRequest {
    private List<Integer> runners;

    /**
     * Default constructor.
     */
    public OrgsActionsRunnerGroupsRunnersRequest() {
    }

    /**
     * Initialization constructor.
     * @param  runners  List of Integer value for runners.
     */
    public OrgsActionsRunnerGroupsRunnersRequest(
            List<Integer> runners) {
        this.runners = runners;
    }

    /**
     * Getter for Runners.
     * List of runner IDs to add to the runner group.
     * @return Returns the List of Integer
     */
    @JsonGetter("runners")
    public List<Integer> getRunners() {
        return runners;
    }

    /**
     * Setter for Runners.
     * List of runner IDs to add to the runner group.
     * @param runners Value for List of Integer
     */
    @JsonSetter("runners")
    public void setRunners(List<Integer> runners) {
        this.runners = runners;
    }

    /**
     * Converts this OrgsActionsRunnerGroupsRunnersRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsRunnerGroupsRunnersRequest [" + "runners=" + runners + "]";
    }

    /**
     * Builds a new {@link OrgsActionsRunnerGroupsRunnersRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsRunnerGroupsRunnersRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(runners);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsRunnerGroupsRunnersRequest}.
     */
    public static class Builder {
        private List<Integer> runners;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  runners  List of Integer value for runners.
         */
        public Builder(List<Integer> runners) {
            this.runners = runners;
        }

        /**
         * Setter for runners.
         * @param  runners  List of Integer value for runners.
         * @return Builder
         */
        public Builder runners(List<Integer> runners) {
            this.runners = runners;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsRunnerGroupsRunnersRequest} object using the set fields.
         * @return {@link OrgsActionsRunnerGroupsRunnersRequest}
         */
        public OrgsActionsRunnerGroupsRunnersRequest build() {
            return new OrgsActionsRunnerGroupsRunnersRequest(runners);
        }
    }
}