/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for OrgsProjectsResponse type.
 */
public class OrgsProjectsResponse {
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
    private Object creator;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private OrganizationPermissionEnum organizationPermission;
    private Boolean mPrivate;

    /**
     * Default constructor.
     */
    public OrgsProjectsResponse() {
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
     * @param  creator  Object value for creator.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  organizationPermission  OrganizationPermissionEnum value for organizationPermission.
     * @param  mPrivate  Boolean value for mPrivate.
     */
    public OrgsProjectsResponse(
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
            Object creator,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            OrganizationPermissionEnum organizationPermission,
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
     * Name of the project
     * @return Returns the String
     */
    @JsonGetter("name")
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
     * Getter for Body.
     * Body of the project
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * Body of the project
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
     * State of the project; either 'open' or 'closed'
     * @return Returns the String
     */
    @JsonGetter("state")
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
     * Getter for Creator.
     * @return Returns the Object
     */
    @JsonGetter("creator")
    public Object getCreator() {
        return creator;
    }

    /**
     * Setter for Creator.
     * @param creator Value for Object
     */
    @JsonSetter("creator")
    public void setCreator(Object creator) {
        this.creator = creator;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for OrganizationPermission.
     * @return Returns the OrganizationPermissionEnum
     */
    @JsonGetter("organization_permission")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrganizationPermissionEnum getOrganizationPermission() {
        return organizationPermission;
    }

    /**
     * Setter for OrganizationPermission.
     * @param organizationPermission Value for OrganizationPermissionEnum
     */
    @JsonSetter("organization_permission")
    public void setOrganizationPermission(OrganizationPermissionEnum organizationPermission) {
        this.organizationPermission = organizationPermission;
    }

    /**
     * Getter for Private.
     * Whether or not this project can be seen by everyone. Only present if owner is an
     * organization.
     * @return Returns the Boolean
     */
    @JsonGetter("private")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrivate() {
        return mPrivate;
    }

    /**
     * Setter for Private.
     * Whether or not this project can be seen by everyone. Only present if owner is an
     * organization.
     * @param mPrivate Value for Boolean
     */
    @JsonSetter("private")
    public void setPrivate(Boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    /**
     * Converts this OrgsProjectsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsProjectsResponse [" + "ownerUrl=" + ownerUrl + ", url=" + url + ", htmlUrl="
                + htmlUrl + ", columnsUrl=" + columnsUrl + ", id=" + id + ", nodeId=" + nodeId
                + ", name=" + name + ", body=" + body + ", number=" + number + ", state=" + state
                + ", creator=" + creator + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", organizationPermission=" + organizationPermission + ", mPrivate=" + mPrivate
                + "]";
    }

    /**
     * Builds a new {@link OrgsProjectsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsProjectsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ownerUrl, url, htmlUrl, columnsUrl, id, nodeId, name, body,
                number, state, creator, createdAt, updatedAt)
                .organizationPermission(getOrganizationPermission())
                .mPrivate(getPrivate());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsProjectsResponse}.
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
        private Object creator;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private OrganizationPermissionEnum organizationPermission;
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
         * @param  creator  Object value for creator.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         */
        public Builder(String ownerUrl, String url, String htmlUrl, String columnsUrl, int id,
                String nodeId, String name, String body, int number, String state, Object creator,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
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
         * @param  creator  Object value for creator.
         * @return Builder
         */
        public Builder creator(Object creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for organizationPermission.
         * @param  organizationPermission  OrganizationPermissionEnum value for
         *         organizationPermission.
         * @return Builder
         */
        public Builder organizationPermission(OrganizationPermissionEnum organizationPermission) {
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
         * Builds a new {@link OrgsProjectsResponse} object using the set fields.
         * @return {@link OrgsProjectsResponse}
         */
        public OrgsProjectsResponse build() {
            return new OrgsProjectsResponse(ownerUrl, url, htmlUrl, columnsUrl, id, nodeId, name,
                    body, number, state, creator, createdAt, updatedAt, organizationPermission,
                    mPrivate);
        }
    }
}
