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
 * This is a model class for ProjectCollaboratorPermission type.
 */
public class ProjectCollaboratorPermission {
    private String permission;
    private Object user;

    /**
     * Default constructor.
     */
    public ProjectCollaboratorPermission() {
    }

    /**
     * Initialization constructor.
     * @param  permission  String value for permission.
     * @param  user  Object value for user.
     */
    public ProjectCollaboratorPermission(
            String permission,
            Object user) {
        this.permission = permission;
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
     * Converts this ProjectCollaboratorPermission into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProjectCollaboratorPermission [" + "permission=" + permission + ", user=" + user
                + "]";
    }

    /**
     * Builds a new {@link ProjectCollaboratorPermission.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProjectCollaboratorPermission.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(permission, user);
        return builder;
    }

    /**
     * Class to build instances of {@link ProjectCollaboratorPermission}.
     */
    public static class Builder {
        private String permission;
        private Object user;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  permission  String value for permission.
         * @param  user  Object value for user.
         */
        public Builder(String permission, Object user) {
            this.permission = permission;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link ProjectCollaboratorPermission} object using the set fields.
         * @return {@link ProjectCollaboratorPermission}
         */
        public ProjectCollaboratorPermission build() {
            return new ProjectCollaboratorPermission(permission, user);
        }
    }
}
