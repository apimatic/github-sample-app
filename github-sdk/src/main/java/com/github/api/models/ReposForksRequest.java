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

/**
 * This is a model class for ReposForksRequest type.
 */
public class ReposForksRequest {
    private String organization;
    private String name;
    private Boolean defaultBranchOnly;

    /**
     * Default constructor.
     */
    public ReposForksRequest() {
    }

    /**
     * Initialization constructor.
     * @param  organization  String value for organization.
     * @param  name  String value for name.
     * @param  defaultBranchOnly  Boolean value for defaultBranchOnly.
     */
    public ReposForksRequest(
            String organization,
            String name,
            Boolean defaultBranchOnly) {
        this.organization = organization;
        this.name = name;
        this.defaultBranchOnly = defaultBranchOnly;
    }

    /**
     * Getter for Organization.
     * Optional parameter to specify the organization name if forking into an organization.
     * @return Returns the String
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * Optional parameter to specify the organization name if forking into an organization.
     * @param organization Value for String
     */
    @JsonSetter("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Getter for Name.
     * When forking from an existing repository, a new name for the fork.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * When forking from an existing repository, a new name for the fork.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DefaultBranchOnly.
     * When forking from an existing repository, fork with only the default branch.
     * @return Returns the Boolean
     */
    @JsonGetter("default_branch_only")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDefaultBranchOnly() {
        return defaultBranchOnly;
    }

    /**
     * Setter for DefaultBranchOnly.
     * When forking from an existing repository, fork with only the default branch.
     * @param defaultBranchOnly Value for Boolean
     */
    @JsonSetter("default_branch_only")
    public void setDefaultBranchOnly(Boolean defaultBranchOnly) {
        this.defaultBranchOnly = defaultBranchOnly;
    }

    /**
     * Converts this ReposForksRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposForksRequest [" + "organization=" + organization + ", name=" + name
                + ", defaultBranchOnly=" + defaultBranchOnly + "]";
    }

    /**
     * Builds a new {@link ReposForksRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposForksRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .organization(getOrganization())
                .name(getName())
                .defaultBranchOnly(getDefaultBranchOnly());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposForksRequest}.
     */
    public static class Builder {
        private String organization;
        private String name;
        private Boolean defaultBranchOnly;



        /**
         * Setter for organization.
         * @param  organization  String value for organization.
         * @return Builder
         */
        public Builder organization(String organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for defaultBranchOnly.
         * @param  defaultBranchOnly  Boolean value for defaultBranchOnly.
         * @return Builder
         */
        public Builder defaultBranchOnly(Boolean defaultBranchOnly) {
            this.defaultBranchOnly = defaultBranchOnly;
            return this;
        }

        /**
         * Builds a new {@link ReposForksRequest} object using the set fields.
         * @return {@link ReposForksRequest}
         */
        public ReposForksRequest build() {
            return new ReposForksRequest(organization, name, defaultBranchOnly);
        }
    }
}
