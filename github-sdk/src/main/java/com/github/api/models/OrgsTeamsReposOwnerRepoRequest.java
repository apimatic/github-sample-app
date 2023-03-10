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
 * This is a model class for OrgsTeamsReposOwnerRepoRequest type.
 */
public class OrgsTeamsReposOwnerRepoRequest {
    private String permission;

    /**
     * Default constructor.
     */
    public OrgsTeamsReposOwnerRepoRequest() {
        permission = "push";
    }

    /**
     * Initialization constructor.
     * @param  permission  String value for permission.
     */
    public OrgsTeamsReposOwnerRepoRequest(
            String permission) {
        this.permission = permission;
    }

    /**
     * Getter for Permission.
     * The permission to grant the team on this repository. We accept the following permissions to
     * be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom
     * repository role name, if the owning organization has defined any. If no permission is
     * specified, the team's `permission` attribute will be used to determine what permission to
     * grant the team on this repository.
     * @return Returns the String
     */
    @JsonGetter("permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * The permission to grant the team on this repository. We accept the following permissions to
     * be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom
     * repository role name, if the owning organization has defined any. If no permission is
     * specified, the team's `permission` attribute will be used to determine what permission to
     * grant the team on this repository.
     * @param permission Value for String
     */
    @JsonSetter("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Converts this OrgsTeamsReposOwnerRepoRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsTeamsReposOwnerRepoRequest [" + "permission=" + permission + "]";
    }

    /**
     * Builds a new {@link OrgsTeamsReposOwnerRepoRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsTeamsReposOwnerRepoRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .permission(getPermission());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsTeamsReposOwnerRepoRequest}.
     */
    public static class Builder {
        private String permission = "push";



        /**
         * Setter for permission.
         * @param  permission  String value for permission.
         * @return Builder
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Builds a new {@link OrgsTeamsReposOwnerRepoRequest} object using the set fields.
         * @return {@link OrgsTeamsReposOwnerRepoRequest}
         */
        public OrgsTeamsReposOwnerRepoRequest build() {
            return new OrgsTeamsReposOwnerRepoRequest(permission);
        }
    }
}
