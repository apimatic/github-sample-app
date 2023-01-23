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
 * This is a model class for ReposActionsRunnersResponse type.
 */
public class ReposActionsRunnersResponse {
    private int totalCount;
    private List<Selfhostedrunners> runners;

    /**
     * Default constructor.
     */
    public ReposActionsRunnersResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  runners  List of Selfhostedrunners value for runners.
     */
    public ReposActionsRunnersResponse(
            int totalCount,
            List<Selfhostedrunners> runners) {
        this.totalCount = totalCount;
        this.runners = runners;
    }

    /**
     * Getter for TotalCount.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
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
     * Converts this ReposActionsRunnersResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsRunnersResponse [" + "totalCount=" + totalCount + ", runners=" + runners
                + "]";
    }

    /**
     * Builds a new {@link ReposActionsRunnersResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsRunnersResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, runners);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsRunnersResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<Selfhostedrunners> runners;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  runners  List of Selfhostedrunners value for runners.
         */
        public Builder(int totalCount, List<Selfhostedrunners> runners) {
            this.totalCount = totalCount;
            this.runners = runners;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  int value for totalCount.
         * @return Builder
         */
        public Builder totalCount(int totalCount) {
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
         * Builds a new {@link ReposActionsRunnersResponse} object using the set fields.
         * @return {@link ReposActionsRunnersResponse}
         */
        public ReposActionsRunnersResponse build() {
            return new ReposActionsRunnersResponse(totalCount, runners);
        }
    }
}
