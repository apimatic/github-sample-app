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
 * This is a model class for Membership type.
 */
public class Membership {
    private String organizationUrl;
    private String role;
    private String state;
    private String url;
    private Object user;

    /**
     * Default constructor.
     */
    public Membership() {
    }

    /**
     * Initialization constructor.
     * @param  organizationUrl  String value for organizationUrl.
     * @param  role  String value for role.
     * @param  state  String value for state.
     * @param  url  String value for url.
     * @param  user  Object value for user.
     */
    public Membership(
            String organizationUrl,
            String role,
            String state,
            String url,
            Object user) {
        this.organizationUrl = organizationUrl;
        this.role = role;
        this.state = state;
        this.url = url;
        this.user = user;
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
     * Getter for Role.
     * @return Returns the String
     */
    @JsonGetter("role")
    public String getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * @param role Value for String
     */
    @JsonSetter("role")
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
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
     * Converts this Membership into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Membership [" + "organizationUrl=" + organizationUrl + ", role=" + role + ", state="
                + state + ", url=" + url + ", user=" + user + "]";
    }

    /**
     * Builds a new {@link Membership.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Membership.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(organizationUrl, role, state, url, user);
        return builder;
    }

    /**
     * Class to build instances of {@link Membership}.
     */
    public static class Builder {
        private String organizationUrl;
        private String role;
        private String state;
        private String url;
        private Object user;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  organizationUrl  String value for organizationUrl.
         * @param  role  String value for role.
         * @param  state  String value for state.
         * @param  url  String value for url.
         * @param  user  Object value for user.
         */
        public Builder(String organizationUrl, String role, String state, String url, Object user) {
            this.organizationUrl = organizationUrl;
            this.role = role;
            this.state = state;
            this.url = url;
            this.user = user;
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
         * Setter for role.
         * @param  role  String value for role.
         * @return Builder
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link Membership} object using the set fields.
         * @return {@link Membership}
         */
        public Membership build() {
            return new Membership(organizationUrl, role, state, url, user);
        }
    }
}
