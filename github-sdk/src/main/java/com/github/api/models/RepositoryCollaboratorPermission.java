/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for RepositoryCollaboratorPermission type.
 */
public class RepositoryCollaboratorPermission {
    private String permission;
    private String roleName;
    private Object user;

    /**
     * Default constructor.
     */
    public RepositoryCollaboratorPermission() {
    }

    /**
     * Initialization constructor.
     * @param  permission  String value for permission.
     * @param  roleName  String value for roleName.
     * @param  user  Object value for user.
     */
    public RepositoryCollaboratorPermission(
            String permission,
            String roleName,
            Object user) {
        this.permission = permission;
        this.roleName = roleName;
        this.user = user;
    }

    /**
     * Getter for Permission.
     * @return Returns the String
     */
    @JsonGetter("permission")
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * @param permission Value for String
     */
    @JsonSetter("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Getter for RoleName.
     * @return Returns the String
     */
    @JsonGetter("role_name")
    public String getRoleName() {
        return roleName;
    }

    /**
     * Setter for RoleName.
     * @param roleName Value for String
     */
    @JsonSetter("role_name")
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Getter for User.
     * @return Returns the Object
     */
    @JsonGetter("user")
    public Object getUser() {
        return user;
    }

    /**
     * Setter for User.
     * @param user Value for Object
     */
    @JsonSetter("user")
    public void setUser(Object user) {
        this.user = user;
    }

    /**
     * Converts this RepositoryCollaboratorPermission into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RepositoryCollaboratorPermission [" + "permission=" + permission + ", roleName="
                + roleName + ", user=" + user + "]";
    }

    /**
     * Builds a new {@link RepositoryCollaboratorPermission.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RepositoryCollaboratorPermission.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(permission, roleName, user);
        return builder;
    }

    /**
     * Class to build instances of {@link RepositoryCollaboratorPermission}.
     */
    public static class Builder {
        private String permission;
        private String roleName;
        private Object user;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  permission  String value for permission.
         * @param  roleName  String value for roleName.
         * @param  user  Object value for user.
         */
        public Builder(String permission, String roleName, Object user) {
            this.permission = permission;
            this.roleName = roleName;
            this.user = user;
        }

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
         * Setter for roleName.
         * @param  roleName  String value for roleName.
         * @return Builder
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link RepositoryCollaboratorPermission} object using the set fields.
         * @return {@link RepositoryCollaboratorPermission}
         */
        public RepositoryCollaboratorPermission build() {
            return new RepositoryCollaboratorPermission(permission, roleName, user);
        }
    }
}
