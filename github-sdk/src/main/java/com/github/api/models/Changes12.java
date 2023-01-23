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
 * This is a model class for Changes12 type.
 */
public class Changes12 {
    private OldPermission oldPermission;
    private Body5 permission;

    /**
     * Default constructor.
     */
    public Changes12() {
    }

    /**
     * Initialization constructor.
     * @param  oldPermission  OldPermission value for oldPermission.
     * @param  permission  Body5 value for permission.
     */
    public Changes12(
            OldPermission oldPermission,
            Body5 permission) {
        this.oldPermission = oldPermission;
        this.permission = permission;
    }

    /**
     * Getter for OldPermission.
     * @return Returns the OldPermission
     */
    @JsonGetter("old_permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OldPermission getOldPermission() {
        return oldPermission;
    }

    /**
     * Setter for OldPermission.
     * @param oldPermission Value for OldPermission
     */
    @JsonSetter("old_permission")
    public void setOldPermission(OldPermission oldPermission) {
        this.oldPermission = oldPermission;
    }

    /**
     * Getter for Permission.
     * @return Returns the Body5
     */
    @JsonGetter("permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Body5 getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * @param permission Value for Body5
     */
    @JsonSetter("permission")
    public void setPermission(Body5 permission) {
        this.permission = permission;
    }

    /**
     * Converts this Changes12 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes12 [" + "oldPermission=" + oldPermission + ", permission=" + permission
                + "]";
    }

    /**
     * Builds a new {@link Changes12.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes12.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .oldPermission(getOldPermission())
                .permission(getPermission());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes12}.
     */
    public static class Builder {
        private OldPermission oldPermission;
        private Body5 permission;



        /**
         * Setter for oldPermission.
         * @param  oldPermission  OldPermission value for oldPermission.
         * @return Builder
         */
        public Builder oldPermission(OldPermission oldPermission) {
            this.oldPermission = oldPermission;
            return this;
        }

        /**
         * Setter for permission.
         * @param  permission  Body5 value for permission.
         * @return Builder
         */
        public Builder permission(Body5 permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Builds a new {@link Changes12} object using the set fields.
         * @return {@link Changes12}
         */
        public Changes12 build() {
            return new Changes12(oldPermission, permission);
        }
    }
}
