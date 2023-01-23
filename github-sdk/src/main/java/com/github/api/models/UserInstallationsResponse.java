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
 * This is a model class for UserInstallationsResponse type.
 */
public class UserInstallationsResponse {
    private int totalCount;
    private List<Installation> installations;

    /**
     * Default constructor.
     */
    public UserInstallationsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  installations  List of Installation value for installations.
     */
    public UserInstallationsResponse(
            int totalCount,
            List<Installation> installations) {
        this.totalCount = totalCount;
        this.installations = installations;
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
     * Getter for Installations.
     * @return Returns the List of Installation
     */
    @JsonGetter("installations")
    public List<Installation> getInstallations() {
        return installations;
    }

    /**
     * Setter for Installations.
     * @param installations Value for List of Installation
     */
    @JsonSetter("installations")
    public void setInstallations(List<Installation> installations) {
        this.installations = installations;
    }

    /**
     * Converts this UserInstallationsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserInstallationsResponse [" + "totalCount=" + totalCount + ", installations="
                + installations + "]";
    }

    /**
     * Builds a new {@link UserInstallationsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserInstallationsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, installations);
        return builder;
    }

    /**
     * Class to build instances of {@link UserInstallationsResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<Installation> installations;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  installations  List of Installation value for installations.
         */
        public Builder(int totalCount, List<Installation> installations) {
            this.totalCount = totalCount;
            this.installations = installations;
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
         * Setter for installations.
         * @param  installations  List of Installation value for installations.
         * @return Builder
         */
        public Builder installations(List<Installation> installations) {
            this.installations = installations;
            return this;
        }

        /**
         * Builds a new {@link UserInstallationsResponse} object using the set fields.
         * @return {@link UserInstallationsResponse}
         */
        public UserInstallationsResponse build() {
            return new UserInstallationsResponse(totalCount, installations);
        }
    }
}
