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
 * This is a model class for OrgsDependabotSecretsRepositoriesResponse type.
 */
public class OrgsDependabotSecretsRepositoriesResponse {
    private int totalCount;
    private List<MinimalRepository> repositories;

    /**
     * Default constructor.
     */
    public OrgsDependabotSecretsRepositoriesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  repositories  List of MinimalRepository value for repositories.
     */
    public OrgsDependabotSecretsRepositoriesResponse(
            int totalCount,
            List<MinimalRepository> repositories) {
        this.totalCount = totalCount;
        this.repositories = repositories;
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
     * Getter for Repositories.
     * @return Returns the List of MinimalRepository
     */
    @JsonGetter("repositories")
    public List<MinimalRepository> getRepositories() {
        return repositories;
    }

    /**
     * Setter for Repositories.
     * @param repositories Value for List of MinimalRepository
     */
    @JsonSetter("repositories")
    public void setRepositories(List<MinimalRepository> repositories) {
        this.repositories = repositories;
    }

    /**
     * Converts this OrgsDependabotSecretsRepositoriesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsDependabotSecretsRepositoriesResponse [" + "totalCount=" + totalCount
                + ", repositories=" + repositories + "]";
    }

    /**
     * Builds a new {@link OrgsDependabotSecretsRepositoriesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsDependabotSecretsRepositoriesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, repositories);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsDependabotSecretsRepositoriesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<MinimalRepository> repositories;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  repositories  List of MinimalRepository value for repositories.
         */
        public Builder(int totalCount, List<MinimalRepository> repositories) {
            this.totalCount = totalCount;
            this.repositories = repositories;
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
         * Setter for repositories.
         * @param  repositories  List of MinimalRepository value for repositories.
         * @return Builder
         */
        public Builder repositories(List<MinimalRepository> repositories) {
            this.repositories = repositories;
            return this;
        }

        /**
         * Builds a new {@link OrgsDependabotSecretsRepositoriesResponse} object using the set
         * fields.
         * @return {@link OrgsDependabotSecretsRepositoriesResponse}
         */
        public OrgsDependabotSecretsRepositoriesResponse build() {
            return new OrgsDependabotSecretsRepositoriesResponse(totalCount, repositories);
        }
    }
}
