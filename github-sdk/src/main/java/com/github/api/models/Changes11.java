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
 * This is a model class for Changes11 type.
 */
public class Changes11 {
    private Permission permission;

    /**
     * Default constructor.
     */
    public Changes11() {
    }

    /**
     * Initialization constructor.
     * @param  permission  Permission value for permission.
     */
    public Changes11(
            Permission permission) {
        this.permission = permission;
    }

    /**
     * Getter for Permission.
     * @return Returns the Permission
     */
    @JsonGetter("permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Permission getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * @param permission Value for Permission
     */
    @JsonSetter("permission")
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    /**
     * Converts this Changes11 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes11 [" + "permission=" + permission + "]";
    }

    /**
     * Builds a new {@link Changes11.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes11.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .permission(getPermission());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes11}.
     */
    public static class Builder {
        private Permission permission;



        /**
         * Setter for permission.
         * @param  permission  Permission value for permission.
         * @return Builder
         */
        public Builder permission(Permission permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Builds a new {@link Changes11} object using the set fields.
         * @return {@link Changes11}
         */
        public Changes11 build() {
            return new Changes11(permission);
        }
    }
}
