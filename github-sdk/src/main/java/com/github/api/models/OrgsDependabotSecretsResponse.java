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
 * This is a model class for OrgsDependabotSecretsResponse type.
 */
public class OrgsDependabotSecretsResponse {
    private int totalCount;
    private List<DependabotSecretforanOrganization> secrets;

    /**
     * Default constructor.
     */
    public OrgsDependabotSecretsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  secrets  List of DependabotSecretforanOrganization value for secrets.
     */
    public OrgsDependabotSecretsResponse(
            int totalCount,
            List<DependabotSecretforanOrganization> secrets) {
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
     * @return Returns the List of DependabotSecretforanOrganization
     */
    @JsonGetter("secrets")
    public List<DependabotSecretforanOrganization> getSecrets() {
        return secrets;
    }

    /**
     * Setter for Secrets.
     * @param secrets Value for List of DependabotSecretforanOrganization
     */
    @JsonSetter("secrets")
    public void setSecrets(List<DependabotSecretforanOrganization> secrets) {
        this.secrets = secrets;
    }

    /**
     * Converts this OrgsDependabotSecretsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsDependabotSecretsResponse [" + "totalCount=" + totalCount + ", secrets="
                + secrets + "]";
    }

    /**
     * Builds a new {@link OrgsDependabotSecretsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsDependabotSecretsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, secrets);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsDependabotSecretsResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<DependabotSecretforanOrganization> secrets;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  secrets  List of DependabotSecretforanOrganization value for secrets.
         */
        public Builder(int totalCount, List<DependabotSecretforanOrganization> secrets) {
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
         * @param  secrets  List of DependabotSecretforanOrganization value for secrets.
         * @return Builder
         */
        public Builder secrets(List<DependabotSecretforanOrganization> secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * Builds a new {@link OrgsDependabotSecretsResponse} object using the set fields.
         * @return {@link OrgsDependabotSecretsResponse}
         */
        public OrgsDependabotSecretsResponse build() {
            return new OrgsDependabotSecretsResponse(totalCount, secrets);
        }
    }
}
