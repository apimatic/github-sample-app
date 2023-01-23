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
 * This is a model class for OrgsTeamsProjectsProjectIdResponse type.
 */
public class OrgsTeamsProjectsProjectIdResponse {
    private String ownerUrl;
    private String url;
    private String htmlUrl;
    private String columnsUrl;
    private int id;
    private String nodeId;
    private String name;
    private String body;
    private int number;
    private String state;
    private Creator creator;
    private String createdAt;
    private String updatedAt;
    private String organizationPermission;
    private Boolean mPrivate;
    private Permissions8 permissions;

    /**
     * Default constructor.
     */
    public OrgsTeamsProjectsProjectIdResponse() {
    }

    /**
     * Initialization constructor.
     * @param  ownerUrl  String value for ownerUrl.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  columnsUrl  String value for columnsUrl.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  name  String value for name.
     * @param  body  String value for body.
     * @param  number  int value for number.
     * @param  state  String value for state.
     * @param  creator  Creator value for creator.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  permissions  Permissions8 value for permissions.
     * @param  organizationPermission  String value for organizationPermission.
     * @param  mPrivate  Boolean value for mPrivate.
     */
    public OrgsTeamsProjectsProjectIdResponse(
            String ownerUrl,
            String url,
            String htmlUrl,
            String columnsUrl,
            int id,
            String nodeId,
            String name,
            String body,
            int number,
            String state,
            Creator creator,
            String createdAt,
            String updatedAt,
            Permissions8 permissions,
            String organizationPermission,
            Boolean mPrivate) {
        this.ownerUrl = ownerUrl;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.columnsUrl = columnsUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.body = body;
        this.number = number;
        this.state = state;
        this.creator = creator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.organizationPermission = organizationPermission;
        this.mPrivate = mPrivate;
        this.permissions = permissions;
    }

    /**
     * Getter for OwnerUrl.
     * @return Returns the String
     */
    @JsonGetter("owner_url")
    public String getOwnerUrl() {
        return ownerUrl;
    }

    /**
     * Setter for OwnerUrl.
     * @param ownerUrl Value for String
     */
    @JsonSetter("owner_url")
    public void setOwnerUrl(String ownerUrl) {
        this.ownerUrl = ownerUrl;
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
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for ColumnsUrl.
     * @return Returns the String
     */
    @JsonGetter("columns_url")
    public String getColumnsUrl() {
        return columnsUrl;
    }

    /**
     * Setter for ColumnsUrl.
     * @param columnsUrl Value for String
     */
    @JsonSetter("columns_url")
    public void setColumnsUrl(String columnsUrl) {
        this.columnsUrl = columnsUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Body.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for Number.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
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
     * Getter for Creator.
     * @return Returns the Creator
     */
    @JsonGetter("creator")
    public Creator getCreator() {
        return creator;
    }

    /**
     * Setter for Creator.
     * @param creator Value for Creator
     */
    @JsonSetter("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for OrganizationPermission.
     * The organization permission for this project. Only present when owner is an organization.
     * @return Returns the String
     */
    @JsonGetter("organization_permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrganizationPermission() {
        return organizationPermission;
    }

    /**
     * Setter for OrganizationPermission.
     * The organization permission for this project. Only present when owner is an organization.
     * @param organizationPermission Value for String
     */
    @JsonSetter("organization_permission")
    public void setOrganizationPermission(String organizationPermission) {
        this.organizationPermission = organizationPermission;
    }

    /**
     * Getter for Private.
     * Whether the project is private or not. Only present when owner is an organization.
     * @return Returns the Boolean
     */
    @JsonGetter("private")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrivate() {
        return mPrivate;
    }

    /**
     * Setter for Private.
     * Whether the project is private or not. Only present when owner is an organization.
     * @param mPrivate Value for Boolean
     */
    @JsonSetter("private")
    public void setPrivate(Boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    /**
     * Getter for Permissions.
     * @return Returns the Permissions8
     */
    @JsonGetter("permissions")
    public Permissions8 getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions8
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions8 permissions) {
        this.permissions = permissions;
    }

    /**
     * Converts this OrgsTeamsProjectsProjectIdResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsTeamsProjectsProjectIdResponse [" + "ownerUrl=" + ownerUrl + ", url=" + url
                + ", htmlUrl=" + htmlUrl + ", columnsUrl=" + columnsUrl + ", id=" + id + ", nodeId="
                + nodeId + ", name=" + name + ", body=" + body + ", number=" + number + ", state="
                + state + ", creator=" + creator + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", permissions=" + permissions + ", organizationPermission="
                + organizationPermission + ", mPrivate=" + mPrivate + "]";
    }

    /**
     * Builds a new {@link OrgsTeamsProjectsProjectIdResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsTeamsProjectsProjectIdResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ownerUrl, url, htmlUrl, columnsUrl, id, nodeId, name, body,
                number, state, creator, createdAt, updatedAt, permissions)
                .organizationPermission(getOrganizationPermission())
                .mPrivate(getPrivate());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsTeamsProjectsProjectIdResponse}.
     */
    public static class Builder {
        private String ownerUrl;
        private String url;
        private String htmlUrl;
        private String columnsUrl;
        private int id;
        private String nodeId;
        private String name;
        private String body;
        private int number;
        private String state;
        private Creator creator;
        private String createdAt;
        private String updatedAt;
        private Permissions8 permissions;
        private String organizationPermission;
        private Boolean mPrivate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ownerUrl  String value for ownerUrl.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  columnsUrl  String value for columnsUrl.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  name  String value for name.
         * @param  body  String value for body.
         * @param  number  int value for number.
         * @param  state  String value for state.
         * @param  creator  Creator value for creator.
         * @param  createdAt  String value for createdAt.
         * @param  updatedAt  String value for updatedAt.
         * @param  permissions  Permissions8 value for permissions.
         */
        public Builder(String ownerUrl, String url, String htmlUrl, String columnsUrl, int id,
                String nodeId, String name, String body, int number, String state, Creator creator,
                String createdAt, String updatedAt, Permissions8 permissions) {
            this.ownerUrl = ownerUrl;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.columnsUrl = columnsUrl;
            this.id = id;
            this.nodeId = nodeId;
            this.name = name;
            this.body = body;
            this.number = number;
            this.state = state;
            this.creator = creator;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.permissions = permissions;
        }

        /**
         * Setter for ownerUrl.
         * @param  ownerUrl  String value for ownerUrl.
         * @return Builder
         */
        public Builder ownerUrl(String ownerUrl) {
            this.ownerUrl = ownerUrl;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * Setter for columnsUrl.
         * @param  columnsUrl  String value for columnsUrl.
         * @return Builder
         */
        public Builder columnsUrl(String columnsUrl) {
            this.columnsUrl = columnsUrl;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

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
            this.body = body;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
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
         * Setter for creator.
         * @param  creator  Creator value for creator.
         * @return Builder
         */
        public Builder creator(Creator creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for permissions.
         * @param  permissions  Permissions8 value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions8 permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Setter for organizationPermission.
         * @param  organizationPermission  String value for organizationPermission.
         * @return Builder
         */
        public Builder organizationPermission(String organizationPermission) {
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
         * Builds a new {@link OrgsTeamsProjectsProjectIdResponse} object using the set fields.
         * @return {@link OrgsTeamsProjectsProjectIdResponse}
         */
        public OrgsTeamsProjectsProjectIdResponse build() {
            return new OrgsTeamsProjectsProjectIdResponse(ownerUrl, url, htmlUrl, columnsUrl, id,
                    nodeId, name, body, number, state, creator, createdAt, updatedAt, permissions,
                    organizationPermission, mPrivate);
        }
    }
}