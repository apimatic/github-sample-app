/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ProjectsRequest type.
 */
public class ProjectsRequest {
    private String name;
    private OptionalNullable<String> body;
    private String state;
    private OrganizationPermission1Enum organizationPermission;
    private Boolean mPrivate;

    /**
     * Default constructor.
     */
    public ProjectsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  body  String value for body.
     * @param  state  String value for state.
     * @param  organizationPermission  OrganizationPermission1Enum value for organizationPermission.
     * @param  mPrivate  Boolean value for mPrivate.
     */
    public ProjectsRequest(
            String name,
            String body,
            String state,
            OrganizationPermission1Enum organizationPermission,
            Boolean mPrivate) {
        this.name = name;
        this.body = OptionalNullable.of(body);
        this.state = state;
        this.organizationPermission = organizationPermission;
        this.mPrivate = mPrivate;
    }

    /**
     * Internal initialization constructor.
     */
    protected ProjectsRequest(String name, OptionalNullable<String> body, String state,
            OrganizationPermission1Enum organizationPermission, Boolean mPrivate) {
        this.name = name;
        this.body = body;
        this.state = state;
        this.organizationPermission = organizationPermission;
        this.mPrivate = mPrivate;
    }

    /**
     * Getter for Name.
     * Name of the project
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the project
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Body.
     * Body of the project
     * @return Returns the Internal String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBody() {
        return this.body;
    }

    /**
     * Getter for Body.
     * Body of the project
     * @return Returns the String
     */
    public String getBody() {
        return OptionalNullable.getFrom(body);
    }

    /**
     * Setter for Body.
     * Body of the project
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = OptionalNullable.of(body);
    }

    /**
     * UnSetter for Body.
     * Body of the project
     */
    public void unsetBody() {
        body = null;
    }

    /**
     * Getter for State.
     * State of the project; either 'open' or 'closed'
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * State of the project; either 'open' or 'closed'
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for OrganizationPermission.
     * @return Returns the OrganizationPermission1Enum
     */
    @JsonGetter("organization_permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrganizationPermission1Enum getOrganizationPermission() {
        return organizationPermission;
    }

    /**
     * Setter for OrganizationPermission.
     * @param organizationPermission Value for OrganizationPermission1Enum
     */
    @JsonSetter("organization_permission")
    public void setOrganizationPermission(OrganizationPermission1Enum organizationPermission) {
        this.organizationPermission = organizationPermission;
    }

    /**
     * Getter for Private.
     * Whether or not this project can be seen by everyone.
     * @return Returns the Boolean
     */
    @JsonGetter("private")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrivate() {
        return mPrivate;
    }

    /**
     * Setter for Private.
     * Whether or not this project can be seen by everyone.
     * @param mPrivate Value for Boolean
     */
    @JsonSetter("private")
    public void setPrivate(Boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    /**
     * Converts this ProjectsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProjectsRequest [" + "name=" + name + ", body=" + body + ", state=" + state
                + ", organizationPermission=" + organizationPermission + ", mPrivate=" + mPrivate
                + "]";
    }

    /**
     * Builds a new {@link ProjectsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProjectsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .state(getState())
                .organizationPermission(getOrganizationPermission())
                .mPrivate(getPrivate());
        builder.body = internalGetBody();
        return builder;
    }

    /**
     * Class to build instances of {@link ProjectsRequest}.
     */
    public static class Builder {
        private String name;
        private OptionalNullable<String> body;
        private String state;
        private OrganizationPermission1Enum organizationPermission;
        private Boolean mPrivate;



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
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = OptionalNullable.of(body);
            return this;
        }

        /**
         * UnSetter for body.
         * @return Builder
         */
        public Builder unsetBody() {
            body = null;
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
         * Setter for organizationPermission.
         * @param  organizationPermission  OrganizationPermission1Enum value for
         *         organizationPermission.
         * @return Builder
         */
        public Builder organizationPermission(
                OrganizationPermission1Enum organizationPermission) {
            this.organizationPermission = organizationPermission;
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
         * Builds a new {@link ProjectsRequest} object using the set fields.
         * @return {@link ProjectsRequest}
         */
        public ProjectsRequest build() {
            return new ProjectsRequest(name, body, state, organizationPermission, mPrivate);
        }
    }
}
