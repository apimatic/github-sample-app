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
import java.util.List;

/**
 * This is a model class for ApplicationsTokenScopedRequest type.
 */
public class ApplicationsTokenScopedRequest {
    private String accessToken;
    private String target;
    private Integer targetId;
    private List<String> repositories;
    private List<Integer> repositoryIds;
    private Permissions3 permissions;

    /**
     * Default constructor.
     */
    public ApplicationsTokenScopedRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accessToken  String value for accessToken.
     * @param  target  String value for target.
     * @param  targetId  Integer value for targetId.
     * @param  repositories  List of String value for repositories.
     * @param  repositoryIds  List of Integer value for repositoryIds.
     * @param  permissions  Permissions3 value for permissions.
     */
    public ApplicationsTokenScopedRequest(
            String accessToken,
            String target,
            Integer targetId,
            List<String> repositories,
            List<Integer> repositoryIds,
            Permissions3 permissions) {
        this.accessToken = accessToken;
        this.target = target;
        this.targetId = targetId;
        this.repositories = repositories;
        this.repositoryIds = repositoryIds;
        this.permissions = permissions;
    }

    /**
     * Getter for AccessToken.
     * The OAuth access token used to authenticate to the GitHub API.
     * @return Returns the String
     */
    @JsonGetter("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter for AccessToken.
     * The OAuth access token used to authenticate to the GitHub API.
     * @param accessToken Value for String
     */
    @JsonSetter("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Getter for Target.
     * The name of the user or organization to scope the user-to-server access token to.
     * **Required** unless `target_id` is specified.
     * @return Returns the String
     */
    @JsonGetter("target")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTarget() {
        return target;
    }

    /**
     * Setter for Target.
     * The name of the user or organization to scope the user-to-server access token to.
     * **Required** unless `target_id` is specified.
     * @param target Value for String
     */
    @JsonSetter("target")
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Getter for TargetId.
     * The ID of the user or organization to scope the user-to-server access token to. **Required**
     * unless `target` is specified.
     * @return Returns the Integer
     */
    @JsonGetter("target_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * Setter for TargetId.
     * The ID of the user or organization to scope the user-to-server access token to. **Required**
     * unless `target` is specified.
     * @param targetId Value for Integer
     */
    @JsonSetter("target_id")
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /**
     * Getter for Repositories.
     * The list of repository names to scope the user-to-server access token to. `repositories` may
     * not be specified if `repository_ids` is specified.
     * @return Returns the List of String
     */
    @JsonGetter("repositories")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRepositories() {
        return repositories;
    }

    /**
     * Setter for Repositories.
     * The list of repository names to scope the user-to-server access token to. `repositories` may
     * not be specified if `repository_ids` is specified.
     * @param repositories Value for List of String
     */
    @JsonSetter("repositories")
    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    /**
     * Getter for RepositoryIds.
     * The list of repository IDs to scope the user-to-server access token to. `repository_ids` may
     * not be specified if `repositories` is specified.
     * @return Returns the List of Integer
     */
    @JsonGetter("repository_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getRepositoryIds() {
        return repositoryIds;
    }

    /**
     * Setter for RepositoryIds.
     * The list of repository IDs to scope the user-to-server access token to. `repository_ids` may
     * not be specified if `repositories` is specified.
     * @param repositoryIds Value for List of Integer
     */
    @JsonSetter("repository_ids")
    public void setRepositoryIds(List<Integer> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    /**
     * Getter for Permissions.
     * @return Returns the Permissions3
     */
    @JsonGetter("permissions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Permissions3 getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions3
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions3 permissions) {
        this.permissions = permissions;
    }

    /**
     * Converts this ApplicationsTokenScopedRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplicationsTokenScopedRequest [" + "accessToken=" + accessToken + ", target="
                + target + ", targetId=" + targetId + ", repositories=" + repositories
                + ", repositoryIds=" + repositoryIds + ", permissions=" + permissions + "]";
    }

    /**
     * Builds a new {@link ApplicationsTokenScopedRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplicationsTokenScopedRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accessToken)
                .target(getTarget())
                .targetId(getTargetId())
                .repositories(getRepositories())
                .repositoryIds(getRepositoryIds())
                .permissions(getPermissions());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplicationsTokenScopedRequest}.
     */
    public static class Builder {
        private String accessToken;
        private String target;
        private Integer targetId;
        private List<String> repositories;
        private List<Integer> repositoryIds;
        private Permissions3 permissions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accessToken  String value for accessToken.
         */
        public Builder(String accessToken) {
            this.accessToken = accessToken;
        }

        /**
         * Setter for accessToken.
         * @param  accessToken  String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Setter for target.
         * @param  target  String value for target.
         * @return Builder
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * Setter for targetId.
         * @param  targetId  Integer value for targetId.
         * @return Builder
         */
        public Builder targetId(Integer targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * Setter for repositories.
         * @param  repositories  List of String value for repositories.
         * @return Builder
         */
        public Builder repositories(List<String> repositories) {
            this.repositories = repositories;
            return this;
        }

        /**
         * Setter for repositoryIds.
         * @param  repositoryIds  List of Integer value for repositoryIds.
         * @return Builder
         */
        public Builder repositoryIds(List<Integer> repositoryIds) {
            this.repositoryIds = repositoryIds;
            return this;
        }

        /**
         * Setter for permissions.
         * @param  permissions  Permissions3 value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions3 permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Builds a new {@link ApplicationsTokenScopedRequest} object using the set fields.
         * @return {@link ApplicationsTokenScopedRequest}
         */
        public ApplicationsTokenScopedRequest build() {
            return new ApplicationsTokenScopedRequest(accessToken, target, targetId, repositories,
                    repositoryIds, permissions);
        }
    }
}
