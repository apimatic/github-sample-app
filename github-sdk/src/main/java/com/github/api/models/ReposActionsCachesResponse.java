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
 * This is a model class for ReposActionsCachesResponse type.
 */
public class ReposActionsCachesResponse {
    private int totalCount;
    private List<ActionsCach> actionsCaches;

    /**
     * Default constructor.
     */
    public ReposActionsCachesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  actionsCaches  List of ActionsCach value for actionsCaches.
     */
    public ReposActionsCachesResponse(
            int totalCount,
            List<ActionsCach> actionsCaches) {
        this.totalCount = totalCount;
        this.actionsCaches = actionsCaches;
    }

    /**
     * Getter for TotalCount.
     * Total number of caches
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * Total number of caches
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for ActionsCaches.
     * Array of caches
     * @return Returns the List of ActionsCach
     */
    @JsonGetter("actions_caches")
    public List<ActionsCach> getActionsCaches() {
        return actionsCaches;
    }

    /**
     * Setter for ActionsCaches.
     * Array of caches
     * @param actionsCaches Value for List of ActionsCach
     */
    @JsonSetter("actions_caches")
    public void setActionsCaches(List<ActionsCach> actionsCaches) {
        this.actionsCaches = actionsCaches;
    }

    /**
     * Converts this ReposActionsCachesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsCachesResponse [" + "totalCount=" + totalCount + ", actionsCaches="
                + actionsCaches + "]";
    }

    /**
     * Builds a new {@link ReposActionsCachesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsCachesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, actionsCaches);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsCachesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<ActionsCach> actionsCaches;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  actionsCaches  List of ActionsCach value for actionsCaches.
         */
        public Builder(int totalCount, List<ActionsCach> actionsCaches) {
            this.totalCount = totalCount;
            this.actionsCaches = actionsCaches;
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
         * Setter for actionsCaches.
         * @param  actionsCaches  List of ActionsCach value for actionsCaches.
         * @return Builder
         */
        public Builder actionsCaches(List<ActionsCach> actionsCaches) {
            this.actionsCaches = actionsCaches;
            return this;
        }

        /**
         * Builds a new {@link ReposActionsCachesResponse} object using the set fields.
         * @return {@link ReposActionsCachesResponse}
         */
        public ReposActionsCachesResponse build() {
            return new ReposActionsCachesResponse(totalCount, actionsCaches);
        }
    }
}
