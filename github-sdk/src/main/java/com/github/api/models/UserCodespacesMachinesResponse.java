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
 * This is a model class for UserCodespacesMachinesResponse type.
 */
public class UserCodespacesMachinesResponse {
    private int totalCount;
    private List<Codespacemachine> machines;

    /**
     * Default constructor.
     */
    public UserCodespacesMachinesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  machines  List of Codespacemachine value for machines.
     */
    public UserCodespacesMachinesResponse(
            int totalCount,
            List<Codespacemachine> machines) {
        this.totalCount = totalCount;
        this.machines = machines;
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
     * Getter for Machines.
     * @return Returns the List of Codespacemachine
     */
    @JsonGetter("machines")
    public List<Codespacemachine> getMachines() {
        return machines;
    }

    /**
     * Setter for Machines.
     * @param machines Value for List of Codespacemachine
     */
    @JsonSetter("machines")
    public void setMachines(List<Codespacemachine> machines) {
        this.machines = machines;
    }

    /**
     * Converts this UserCodespacesMachinesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserCodespacesMachinesResponse [" + "totalCount=" + totalCount + ", machines="
                + machines + "]";
    }

    /**
     * Builds a new {@link UserCodespacesMachinesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserCodespacesMachinesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, machines);
        return builder;
    }

    /**
     * Class to build instances of {@link UserCodespacesMachinesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<Codespacemachine> machines;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  machines  List of Codespacemachine value for machines.
         */
        public Builder(int totalCount, List<Codespacemachine> machines) {
            this.totalCount = totalCount;
            this.machines = machines;
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
         * Setter for machines.
         * @param  machines  List of Codespacemachine value for machines.
         * @return Builder
         */
        public Builder machines(List<Codespacemachine> machines) {
            this.machines = machines;
            return this;
        }

        /**
         * Builds a new {@link UserCodespacesMachinesResponse} object using the set fields.
         * @return {@link UserCodespacesMachinesResponse}
         */
        public UserCodespacesMachinesResponse build() {
            return new UserCodespacesMachinesResponse(totalCount, machines);
        }
    }
}
