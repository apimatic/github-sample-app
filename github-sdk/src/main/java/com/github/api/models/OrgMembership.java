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
 * This is a model class for OrgMembership type.
 */
public class OrgMembership {
    private String url;
    private State4Enum state;
    private RoleEnum role;
    private String organizationUrl;
    private Organization2 organization;
    private Object user;
    private Permissions6 permissions;

    /**
     * Default constructor.
     */
    public OrgMembership() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  state  State4Enum value for state.
     * @param  role  RoleEnum value for role.
     * @param  organizationUrl  String value for organizationUrl.
     * @param  organization  Organization2 value for organization.
     * @param  user  Object value for user.
     * @param  permissions  Permissions6 value for permissions.
     */
    public OrgMembership(
            String url,
            State4Enum state,
            RoleEnum role,
            String organizationUrl,
            Organization2 organization,
            Object user,
            Permissions6 permissions) {
        this.url = url;
        this.state = state;
        this.role = role;
        this.organizationUrl = organizationUrl;
        this.organization = organization;
        this.user = user;
        this.permissions = permissions;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for State.
     * @return Returns the State4Enum
     */
    @JsonGetter("state")
    public State4Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State4Enum
     */
    @JsonSetter("state")
    public void setState(State4Enum state) {
        this.state = state;
    }

    /**
     * Getter for Role.
     * @return Returns the RoleEnum
     */
    @JsonGetter("role")
    public RoleEnum getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * @param role Value for RoleEnum
     */
    @JsonSetter("role")
    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * Getter for OrganizationUrl.
     * @return Returns the String
     */
    @JsonGetter("organization_url")
    public String getOrganizationUrl() {
        return organizationUrl;
    }

    /**
     * Setter for OrganizationUrl.
     * @param organizationUrl Value for String
     */
    @JsonSetter("organization_url")
    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    /**
     * Getter for Organization.
     * @return Returns the Organization2
     */
    @JsonGetter("organization")
    public Organization2 getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * @param organization Value for Organization2
     */
    @JsonSetter("organization")
    public void setOrganization(Organization2 organization) {
        this.organization = organization;
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
     * Getter for Permissions.
     * @return Returns the Permissions6
     */
    @JsonGetter("permissions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Permissions6 getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions6
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions6 permissions) {
        this.permissions = permissions;
    }

    /**
     * Converts this OrgMembership into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgMembership [" + "url=" + url + ", state=" + state + ", role=" + role
                + ", organizationUrl=" + organizationUrl + ", organization=" + organization
                + ", user=" + user + ", permissions=" + permissions + "]";
    }

    /**
     * Builds a new {@link OrgMembership.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgMembership.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, state, role, organizationUrl, organization, user)
                .permissions(getPermissions());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgMembership}.
     */
    public static class Builder {
        private String url;
        private State4Enum state;
        private RoleEnum role;
        private String organizationUrl;
        private Organization2 organization;
        private Object user;
        private Permissions6 permissions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  state  State4Enum value for state.
         * @param  role  RoleEnum value for role.
         * @param  organizationUrl  String value for organizationUrl.
         * @param  organization  Organization2 value for organization.
         * @param  user  Object value for user.
         */
        public Builder(String url, State4Enum state, RoleEnum role, String organizationUrl,
                Organization2 organization, Object user) {
            this.url = url;
            this.state = state;
            this.role = role;
            this.organizationUrl = organizationUrl;
            this.organization = organization;
            this.user = user;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State4Enum value for state.
         * @return Builder
         */
        public Builder state(State4Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  RoleEnum value for role.
         * @return Builder
         */
        public Builder role(RoleEnum role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for organizationUrl.
         * @param  organizationUrl  String value for organizationUrl.
         * @return Builder
         */
        public Builder organizationUrl(String organizationUrl) {
            this.organizationUrl = organizationUrl;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  Organization2 value for organization.
         * @return Builder
         */
        public Builder organization(Organization2 organization) {
            this.organization = organization;
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
         * Setter for permissions.
         * @param  permissions  Permissions6 value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions6 permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Builds a new {@link OrgMembership} object using the set fields.
         * @return {@link OrgMembership}
         */
        public OrgMembership build() {
            return new OrgMembership(url, state, role, organizationUrl, organization, user,
                    permissions);
        }
    }
}
