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
import java.util.List;

/**
 * This is a model class for InstallationRepositoriesResponse type.
 */
public class InstallationRepositoriesResponse {
    private int totalCount;
    private List<Repository> repositories;
    private String repositorySelection;

    /**
     * Default constructor.
     */
    public InstallationRepositoriesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  repositories  List of Repository value for repositories.
     * @param  repositorySelection  String value for repositorySelection.
     */
    public InstallationRepositoriesResponse(
            int totalCount,
            List<Repository> repositories,
            String repositorySelection) {
        this.totalCount = totalCount;
        this.repositories = repositories;
        this.repositorySelection = repositorySelection;
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
     * Getter for RepositorySelection.
     * @return Returns the String
     */
    @JsonGetter("repository_selection")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRepositorySelection() {
        return repositorySelection;
    }

    /**
     * Setter for RepositorySelection.
     * @param repositorySelection Value for String
     */
    @JsonSetter("repository_selection")
    public void setRepositorySelection(String repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    /**
     * Converts this InstallationRepositoriesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InstallationRepositoriesResponse [" + "totalCount=" + totalCount + ", repositories="
                + repositories + ", repositorySelection=" + repositorySelection + "]";
    }

    /**
     * Builds a new {@link InstallationRepositoriesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InstallationRepositoriesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, repositories)
                .repositorySelection(getRepositorySelection());
        return builder;
    }

    /**
     * Class to build instances of {@link InstallationRepositoriesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<Repository> repositories;
        private String repositorySelection;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  repositories  List of Repository value for repositories.
         */
        public Builder(int totalCount, List<Repository> repositories) {
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
         * @param  repositories  List of Repository value for repositories.
         * @return Builder
         */
        public Builder repositories(List<Repository> repositories) {
            this.repositories = repositories;
            return this;
        }

        /**
         * Setter for repositorySelection.
         * @param  repositorySelection  String value for repositorySelection.
         * @return Builder
         */
        public Builder repositorySelection(String repositorySelection) {
            this.repositorySelection = repositorySelection;
            return this;
        }

        /**
         * Builds a new {@link InstallationRepositoriesResponse} object using the set fields.
         * @return {@link InstallationRepositoriesResponse}
         */
        public InstallationRepositoriesResponse build() {
            return new InstallationRepositoriesResponse(totalCount, repositories,
                    repositorySelection);
        }
    }
}
