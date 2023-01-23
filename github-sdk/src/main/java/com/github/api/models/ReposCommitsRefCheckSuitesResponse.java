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
 * This is a model class for ReposCommitsRefCheckSuitesResponse type.
 */
public class ReposCommitsRefCheckSuitesResponse {
    private int totalCount;
    private List<CheckSuite> checkSuites;

    /**
     * Default constructor.
     */
    public ReposCommitsRefCheckSuitesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  checkSuites  List of CheckSuite value for checkSuites.
     */
    public ReposCommitsRefCheckSuitesResponse(
            int totalCount,
            List<CheckSuite> checkSuites) {
        this.totalCount = totalCount;
        this.checkSuites = checkSuites;
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
     * Getter for CheckSuites.
     * @return Returns the List of CheckSuite
     */
    @JsonGetter("check_suites")
    public List<CheckSuite> getCheckSuites() {
        return checkSuites;
    }

    /**
     * Setter for CheckSuites.
     * @param checkSuites Value for List of CheckSuite
     */
    @JsonSetter("check_suites")
    public void setCheckSuites(List<CheckSuite> checkSuites) {
        this.checkSuites = checkSuites;
    }

    /**
     * Converts this ReposCommitsRefCheckSuitesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCommitsRefCheckSuitesResponse [" + "totalCount=" + totalCount
                + ", checkSuites=" + checkSuites + "]";
    }

    /**
     * Builds a new {@link ReposCommitsRefCheckSuitesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCommitsRefCheckSuitesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, checkSuites);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCommitsRefCheckSuitesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<CheckSuite> checkSuites;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  checkSuites  List of CheckSuite value for checkSuites.
         */
        public Builder(int totalCount, List<CheckSuite> checkSuites) {
            this.totalCount = totalCount;
            this.checkSuites = checkSuites;
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
         * Setter for checkSuites.
         * @param  checkSuites  List of CheckSuite value for checkSuites.
         * @return Builder
         */
        public Builder checkSuites(List<CheckSuite> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }

        /**
         * Builds a new {@link ReposCommitsRefCheckSuitesResponse} object using the set fields.
         * @return {@link ReposCommitsRefCheckSuitesResponse}
         */
        public ReposCommitsRefCheckSuitesResponse build() {
            return new ReposCommitsRefCheckSuitesResponse(totalCount, checkSuites);
        }
    }
}