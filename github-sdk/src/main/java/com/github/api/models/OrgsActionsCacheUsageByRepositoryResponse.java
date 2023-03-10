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
 * This is a model class for OrgsActionsCacheUsageByRepositoryResponse type.
 */
public class OrgsActionsCacheUsageByRepositoryResponse {
    private int totalCount;
    private List<ActionsCacheUsagebyrepository> repositoryCacheUsages;

    /**
     * Default constructor.
     */
    public OrgsActionsCacheUsageByRepositoryResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  repositoryCacheUsages  List of ActionsCacheUsagebyrepository value for
     *         repositoryCacheUsages.
     */
    public OrgsActionsCacheUsageByRepositoryResponse(
            int totalCount,
            List<ActionsCacheUsagebyrepository> repositoryCacheUsages) {
        this.totalCount = totalCount;
        this.repositoryCacheUsages = repositoryCacheUsages;
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
     * Getter for RepositoryCacheUsages.
     * @return Returns the List of ActionsCacheUsagebyrepository
     */
    @JsonGetter("repository_cache_usages")
    public List<ActionsCacheUsagebyrepository> getRepositoryCacheUsages() {
        return repositoryCacheUsages;
    }

    /**
     * Setter for RepositoryCacheUsages.
     * @param repositoryCacheUsages Value for List of ActionsCacheUsagebyrepository
     */
    @JsonSetter("repository_cache_usages")
    public void setRepositoryCacheUsages(List<ActionsCacheUsagebyrepository> repositoryCacheUsages) {
        this.repositoryCacheUsages = repositoryCacheUsages;
    }

    /**
     * Converts this OrgsActionsCacheUsageByRepositoryResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsCacheUsageByRepositoryResponse [" + "totalCount=" + totalCount
                + ", repositoryCacheUsages=" + repositoryCacheUsages + "]";
    }

    /**
     * Builds a new {@link OrgsActionsCacheUsageByRepositoryResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsCacheUsageByRepositoryResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, repositoryCacheUsages);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsCacheUsageByRepositoryResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<ActionsCacheUsagebyrepository> repositoryCacheUsages;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  repositoryCacheUsages  List of ActionsCacheUsagebyrepository value for
         *         repositoryCacheUsages.
         */
        public Builder(int totalCount, List<ActionsCacheUsagebyrepository> repositoryCacheUsages) {
            this.totalCount = totalCount;
            this.repositoryCacheUsages = repositoryCacheUsages;
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
         * Setter for repositoryCacheUsages.
         * @param  repositoryCacheUsages  List of ActionsCacheUsagebyrepository value for
         *         repositoryCacheUsages.
         * @return Builder
         */
        public Builder repositoryCacheUsages(
                List<ActionsCacheUsagebyrepository> repositoryCacheUsages) {
            this.repositoryCacheUsages = repositoryCacheUsages;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsCacheUsageByRepositoryResponse} object using the set
         * fields.
         * @return {@link OrgsActionsCacheUsageByRepositoryResponse}
         */
        public OrgsActionsCacheUsageByRepositoryResponse build() {
            return new OrgsActionsCacheUsageByRepositoryResponse(totalCount, repositoryCacheUsages);
        }
    }
}
