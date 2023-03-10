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
 * This is a model class for ReposGenerateRequest type.
 */
public class ReposGenerateRequest {
    private String owner;
    private String name;
    private String description;
    private Boolean includeAllBranches;
    private Boolean mPrivate;

    /**
     * Default constructor.
     */
    public ReposGenerateRequest() {
        includeAllBranches = false;
        mPrivate = false;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  owner  String value for owner.
     * @param  description  String value for description.
     * @param  includeAllBranches  Boolean value for includeAllBranches.
     * @param  mPrivate  Boolean value for mPrivate.
     */
    public ReposGenerateRequest(
            String name,
            String owner,
            String description,
            Boolean includeAllBranches,
            Boolean mPrivate) {
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.includeAllBranches = includeAllBranches;
        this.mPrivate = mPrivate;
    }

    /**
     * Getter for Owner.
     * The organization or person who will own the new repository. To create a new repository in an
     * organization, the authenticated user must be a member of the specified organization.
     * @return Returns the String
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * The organization or person who will own the new repository. To create a new repository in an
     * organization, the authenticated user must be a member of the specified organization.
     * @param owner Value for String
     */
    @JsonSetter("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Getter for Name.
     * The name of the new repository.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the new repository.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * A short description of the new repository.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A short description of the new repository.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for IncludeAllBranches.
     * Set to `true` to include the directory structure and files from all branches in the template
     * repository, and not just the default branch. Default: `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("include_all_branches")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeAllBranches() {
        return includeAllBranches;
    }

    /**
     * Setter for IncludeAllBranches.
     * Set to `true` to include the directory structure and files from all branches in the template
     * repository, and not just the default branch. Default: `false`.
     * @param includeAllBranches Value for Boolean
     */
    @JsonSetter("include_all_branches")
    public void setIncludeAllBranches(Boolean includeAllBranches) {
        this.includeAllBranches = includeAllBranches;
    }

    /**
     * Getter for Private.
     * Either `true` to create a new private repository or `false` to create a new public one.
     * @return Returns the Boolean
     */
    @JsonGetter("private")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrivate() {
        return mPrivate;
    }

    /**
     * Setter for Private.
     * Either `true` to create a new private repository or `false` to create a new public one.
     * @param mPrivate Value for Boolean
     */
    @JsonSetter("private")
    public void setPrivate(Boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    /**
     * Converts this ReposGenerateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposGenerateRequest [" + "name=" + name + ", owner=" + owner + ", description="
                + description + ", includeAllBranches=" + includeAllBranches + ", mPrivate="
                + mPrivate + "]";
    }

    /**
     * Builds a new {@link ReposGenerateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposGenerateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .owner(getOwner())
                .description(getDescription())
                .includeAllBranches(getIncludeAllBranches())
                .mPrivate(getPrivate());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposGenerateRequest}.
     */
    public static class Builder {
        private String name;
        private String owner;
        private String description;
        private Boolean includeAllBranches = false;
        private Boolean mPrivate = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for owner.
         * @param  owner  String value for owner.
         * @return Builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for includeAllBranches.
         * @param  includeAllBranches  Boolean value for includeAllBranches.
         * @return Builder
         */
        public Builder includeAllBranches(Boolean includeAllBranches) {
            this.includeAllBranches = includeAllBranches;
            return this;
        }

        /**
         * Setter for mPrivate.
         * @param  mPrivate  Boolean value for mPrivate.
         * @return Builder
         */
        public Builder mPrivate(Boolean mPrivate) {
            this.mPrivate = mPrivate;
            return this;
        }

        /**
         * Builds a new {@link ReposGenerateRequest} object using the set fields.
         * @return {@link ReposGenerateRequest}
         */
        public ReposGenerateRequest build() {
            return new ReposGenerateRequest(name, owner, description, includeAllBranches, mPrivate);
        }
    }
}
