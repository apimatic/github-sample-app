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
 * This is a model class for OrgsActionsRequiredWorkflowsRepositoriesResponse type.
 */
public class OrgsActionsRequiredWorkflowsRepositoriesResponse {
    private double totalCount;
    private List<Repository> repositories;

    /**
     * Default constructor.
     */
    public OrgsActionsRequiredWorkflowsRepositoriesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  double value for totalCount.
     * @param  repositories  List of Repository value for repositories.
     */
    public OrgsActionsRequiredWorkflowsRepositoriesResponse(
            double totalCount,
            List<Repository> repositories) {
        this.totalCount = totalCount;
        this.repositories = repositories;
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
     * Getter for Repositories.
     * @return Returns the List of Repository
     */
    @JsonGetter("repositories")
    public List<Repository> getRepositories() {
        return repositories;
    }

    /**
     * Setter for Repositories.
     * @param repositories Value for List of Repository
     */
    @JsonSetter("repositories")
    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    /**
     * Converts this OrgsActionsRequiredWorkflowsRepositoriesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsRequiredWorkflowsRepositoriesResponse [" + "totalCount=" + totalCount
                + ", repositories=" + repositories + "]";
    }

    /**
     * Builds a new {@link OrgsActionsRequiredWorkflowsRepositoriesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsRequiredWorkflowsRepositoriesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, repositories);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsRequiredWorkflowsRepositoriesResponse}.
     */
    public static class Builder {
        private double totalCount;
        private List<Repository> repositories;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  double value for totalCount.
         * @param  repositories  List of Repository value for repositories.
         */
        public Builder(double totalCount, List<Repository> repositories) {
            this.totalCount = totalCount;
            this.repositories = repositories;
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
         * Setter for repositories.
         * @param  repositories  List of Repository value for repositories.
         * @return Builder
         */
        public Builder repositories(List<Repository> repositories) {
            this.repositories = repositories;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsRequiredWorkflowsRepositoriesResponse} object using the
         * set fields.
         * @return {@link OrgsActionsRequiredWorkflowsRepositoriesResponse}
         */
        public OrgsActionsRequiredWorkflowsRepositoriesResponse build() {
            return new OrgsActionsRequiredWorkflowsRepositoriesResponse(totalCount, repositories);
        }
    }
}
