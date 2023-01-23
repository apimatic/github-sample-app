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
 * This is a model class for ReposInvitationsInvitationIdRequest type.
 */
public class ReposInvitationsInvitationIdRequest {
    private Permissions124Enum permissions;

    /**
     * Default constructor.
     */
    public ReposInvitationsInvitationIdRequest() {
    }

    /**
     * Initialization constructor.
     * @param  permissions  Permissions124Enum value for permissions.
     */
    public ReposInvitationsInvitationIdRequest(
            Permissions124Enum permissions) {
        this.permissions = permissions;
    }

    /**
     * Getter for Permissions.
     * @return Returns the Permissions124Enum
     */
    @JsonGetter("permissions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Permissions124Enum getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions124Enum
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions124Enum permissions) {
        this.permissions = permissions;
    }

    /**
     * Converts this ReposInvitationsInvitationIdRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposInvitationsInvitationIdRequest [" + "permissions=" + permissions + "]";
    }

    /**
     * Builds a new {@link ReposInvitationsInvitationIdRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposInvitationsInvitationIdRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .permissions(getPermissions());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposInvitationsInvitationIdRequest}.
     */
    public static class Builder {
        private Permissions124Enum permissions;



        /**
         * Setter for permissions.
         * @param  permissions  Permissions124Enum value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions124Enum permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Builds a new {@link ReposInvitationsInvitationIdRequest} object using the set fields.
         * @return {@link ReposInvitationsInvitationIdRequest}
         */
        public ReposInvitationsInvitationIdRequest build() {
            return new ReposInvitationsInvitationIdRequest(permissions);
        }
    }
}