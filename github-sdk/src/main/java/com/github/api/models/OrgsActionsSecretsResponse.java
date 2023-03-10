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
 * This is a model class for OrgsActionsSecretsResponse type.
 */
public class OrgsActionsSecretsResponse {
    private int totalCount;
    private List<ActionsSecretforanOrganization> secrets;

    /**
     * Default constructor.
     */
    public OrgsActionsSecretsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  secrets  List of ActionsSecretforanOrganization value for secrets.
     */
    public OrgsActionsSecretsResponse(
            int totalCount,
            List<ActionsSecretforanOrganization> secrets) {
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
     * @return Returns the List of ActionsSecretforanOrganization
     */
    @JsonGetter("secrets")
    public List<ActionsSecretforanOrganization> getSecrets() {
        return secrets;
    }

    /**
     * Setter for Secrets.
     * @param secrets Value for List of ActionsSecretforanOrganization
     */
    @JsonSetter("secrets")
    public void setSecrets(List<ActionsSecretforanOrganization> secrets) {
        this.secrets = secrets;
    }

    /**
     * Converts this OrgsActionsSecretsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsSecretsResponse [" + "totalCount=" + totalCount + ", secrets=" + secrets
                + "]";
    }

    /**
     * Builds a new {@link OrgsActionsSecretsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsSecretsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, secrets);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsSecretsResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<ActionsSecretforanOrganization> secrets;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  secrets  List of ActionsSecretforanOrganization value for secrets.
         */
        public Builder(int totalCount, List<ActionsSecretforanOrganization> secrets) {
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
         * @param  secrets  List of ActionsSecretforanOrganization value for secrets.
         * @return Builder
         */
        public Builder secrets(List<ActionsSecretforanOrganization> secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsSecretsResponse} object using the set fields.
         * @return {@link OrgsActionsSecretsResponse}
         */
        public OrgsActionsSecretsResponse build() {
            return new OrgsActionsSecretsResponse(totalCount, secrets);
        }
    }
}
