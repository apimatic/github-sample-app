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
 * This is a model class for OrgsActionsRunnerGroupsRunnersResponse type.
 */
public class OrgsActionsRunnerGroupsRunnersResponse {
    private double totalCount;
    private List<Selfhostedrunners> runners;

    /**
     * Default constructor.
     */
    public OrgsActionsRunnerGroupsRunnersResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  double value for totalCount.
     * @param  runners  List of Selfhostedrunners value for runners.
     */
    public OrgsActionsRunnerGroupsRunnersResponse(
            double totalCount,
            List<Selfhostedrunners> runners) {
        this.totalCount = totalCount;
        this.runners = runners;
    }

    /**
     * Getter for TotalCount.
     * @return Returns the double
     */
    @JsonGetter("total_count")
    public double getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * @param totalCount Value for double
     */
    @JsonSetter("total_count")
    public void setTotalCount(double totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for Runners.
     * @return Returns the List of Selfhostedrunners
     */
    @JsonGetter("runners")
    public List<Selfhostedrunners> getRunners() {
        return runners;
    }

    /**
     * Setter for Runners.
     * @param runners Value for List of Selfhostedrunners
     */
    @JsonSetter("runners")
    public void setRunners(List<Selfhostedrunners> runners) {
        this.runners = runners;
    }

    /**
     * Converts this OrgsActionsRunnerGroupsRunnersResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsRunnerGroupsRunnersResponse [" + "totalCount=" + totalCount
                + ", runners=" + runners + "]";
    }

    /**
     * Builds a new {@link OrgsActionsRunnerGroupsRunnersResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsRunnerGroupsRunnersResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, runners);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsRunnerGroupsRunnersResponse}.
     */
    public static class Builder {
        private double totalCount;
        private List<Selfhostedrunners> runners;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  double value for totalCount.
         * @param  runners  List of Selfhostedrunners value for runners.
         */
        public Builder(double totalCount, List<Selfhostedrunners> runners) {
            this.totalCount = totalCount;
            this.runners = runners;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  double value for totalCount.
         * @return Builder
         */
        public Builder totalCount(double totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for runners.
         * @param  runners  List of Selfhostedrunners value for runners.
         * @return Builder
         */
        public Builder runners(List<Selfhostedrunners> runners) {
            this.runners = runners;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsRunnerGroupsRunnersResponse} object using the set fields.
         * @return {@link OrgsActionsRunnerGroupsRunnersResponse}
         */
        public OrgsActionsRunnerGroupsRunnersResponse build() {
            return new OrgsActionsRunnerGroupsRunnersResponse(totalCount, runners);
        }
    }
}