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
 * This is a model class for ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse type.
 */
public class ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse {
    private int totalCount;
    private List<Deploymentbranchpolicy> branchPolicies;

    /**
     * Default constructor.
     */
    public ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  branchPolicies  List of Deploymentbranchpolicy value for branchPolicies.
     */
    public ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse(
            int totalCount,
            List<Deploymentbranchpolicy> branchPolicies) {
        this.totalCount = totalCount;
        this.branchPolicies = branchPolicies;
    }

    /**
     * Getter for TotalCount.
     * The number of deployment branch policies for the environment.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * The number of deployment branch policies for the environment.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for BranchPolicies.
     * @return Returns the List of Deploymentbranchpolicy
     */
    @JsonGetter("branch_policies")
    public List<Deploymentbranchpolicy> getBranchPolicies() {
        return branchPolicies;
    }

    /**
     * Setter for BranchPolicies.
     * @param branchPolicies Value for List of Deploymentbranchpolicy
     */
    @JsonSetter("branch_policies")
    public void setBranchPolicies(List<Deploymentbranchpolicy> branchPolicies) {
        this.branchPolicies = branchPolicies;
    }

    /**
     * Converts this ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse [" + "totalCount="
                + totalCount + ", branchPolicies=" + branchPolicies + "]";
    }

    /**
     * Builds a new {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, branchPolicies);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<Deploymentbranchpolicy> branchPolicies;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  branchPolicies  List of Deploymentbranchpolicy value for branchPolicies.
         */
        public Builder(int totalCount, List<Deploymentbranchpolicy> branchPolicies) {
            this.totalCount = totalCount;
            this.branchPolicies = branchPolicies;
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
         * Setter for branchPolicies.
         * @param  branchPolicies  List of Deploymentbranchpolicy value for branchPolicies.
         * @return Builder
         */
        public Builder branchPolicies(List<Deploymentbranchpolicy> branchPolicies) {
            this.branchPolicies = branchPolicies;
            return this;
        }

        /**
         * Builds a new {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse}
         * object using the set fields.
         * @return {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse}
         */
        public ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse build() {
            return new ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse(totalCount,
                    branchPolicies);
        }
    }
}