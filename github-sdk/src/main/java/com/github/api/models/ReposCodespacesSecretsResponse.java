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
 * This is a model class for ReposCodespacesSecretsResponse type.
 */
public class ReposCodespacesSecretsResponse {
    private int totalCount;
    private List<CodespacesSecret1> secrets;

    /**
     * Default constructor.
     */
    public ReposCodespacesSecretsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  secrets  List of CodespacesSecret1 value for secrets.
     */
    public ReposCodespacesSecretsResponse(
            int totalCount,
            List<CodespacesSecret1> secrets) {
        this.totalCount = totalCount;
        this.secrets = secrets;
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
     * Getter for Secrets.
     * @return Returns the List of CodespacesSecret1
     */
    @JsonGetter("secrets")
    public List<CodespacesSecret1> getSecrets() {
        return secrets;
    }

    /**
     * Setter for Secrets.
     * @param secrets Value for List of CodespacesSecret1
     */
    @JsonSetter("secrets")
    public void setSecrets(List<CodespacesSecret1> secrets) {
        this.secrets = secrets;
    }

    /**
     * Converts this ReposCodespacesSecretsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCodespacesSecretsResponse [" + "totalCount=" + totalCount + ", secrets="
                + secrets + "]";
    }

    /**
     * Builds a new {@link ReposCodespacesSecretsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCodespacesSecretsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, secrets);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCodespacesSecretsResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<CodespacesSecret1> secrets;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  secrets  List of CodespacesSecret1 value for secrets.
         */
        public Builder(int totalCount, List<CodespacesSecret1> secrets) {
            this.totalCount = totalCount;
            this.secrets = secrets;
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
         * Setter for secrets.
         * @param  secrets  List of CodespacesSecret1 value for secrets.
         * @return Builder
         */
        public Builder secrets(List<CodespacesSecret1> secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * Builds a new {@link ReposCodespacesSecretsResponse} object using the set fields.
         * @return {@link ReposCodespacesSecretsResponse}
         */
        public ReposCodespacesSecretsResponse build() {
            return new ReposCodespacesSecretsResponse(totalCount, secrets);
        }
    }
}