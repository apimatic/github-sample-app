/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for Project1 type.
 */
public class Project1 {
    private String body;
    private String columnsUrl;
    private LocalDateTime createdAt;
    private Object creator;
    private String htmlUrl;
    private int id;
    private String name;
    private String nodeId;
    private int number;
    private String ownerUrl;
    private State93Enum state;
    private LocalDateTime updatedAt;
    private String url;

    /**
     * Default constructor.
     */
    public Project1() {
    }

    /**
     * Initialization constructor.
     * @param  body  String value for body.
     * @param  columnsUrl  String value for columnsUrl.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  creator  Object value for creator.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  nodeId  String value for nodeId.
     * @param  number  int value for number.
     * @param  ownerUrl  String value for ownerUrl.
     * @param  state  State93Enum value for state.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  url  String value for url.
     */
    public Project1(
            String body,
            String columnsUrl,
            LocalDateTime createdAt,
            Object creator,
            String htmlUrl,
            int id,
            String name,
            String nodeId,
            int number,
            String ownerUrl,
            State93Enum state,
            LocalDateTime updatedAt,
            String url) {
        this.body = body;
        this.columnsUrl = columnsUrl;
        this.createdAt = createdAt;
        this.creator = creator;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.number = number;
        this.ownerUrl = ownerUrl;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
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
     * Getter for State.
     * @return Returns the State93Enum
     */
    @JsonGetter("state")
    public State93Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State93Enum
     */
    @JsonSetter("state")
    public void setState(State93Enum state) {
        this.state = state;
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
     * Converts this Project1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Project1 [" + "body=" + body + ", columnsUrl=" + columnsUrl + ", createdAt="
                + createdAt + ", creator=" + creator + ", htmlUrl=" + htmlUrl + ", id=" + id
                + ", name=" + name + ", nodeId=" + nodeId + ", number=" + number + ", ownerUrl="
                + ownerUrl + ", state=" + state + ", updatedAt=" + updatedAt + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Project1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Project1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body, columnsUrl, createdAt, creator, htmlUrl, id, name,
                nodeId, number, ownerUrl, state, updatedAt, url);
        return builder;
    }

    /**
     * Class to build instances of {@link Project1}.
     */
    public static class Builder {
        private String body;
        private String columnsUrl;
        private LocalDateTime createdAt;
        private Object creator;
        private String htmlUrl;
        private int id;
        private String name;
        private String nodeId;
        private int number;
        private String ownerUrl;
        private State93Enum state;
        private LocalDateTime updatedAt;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  body  String value for body.
         * @param  columnsUrl  String value for columnsUrl.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  creator  Object value for creator.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  nodeId  String value for nodeId.
         * @param  number  int value for number.
         * @param  ownerUrl  String value for ownerUrl.
         * @param  state  State93Enum value for state.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  url  String value for url.
         */
        public Builder(String body, String columnsUrl, LocalDateTime createdAt, Object creator,
                String htmlUrl, int id, String name, String nodeId, int number, String ownerUrl,
                State93Enum state, LocalDateTime updatedAt, String url) {
            this.body = body;
            this.columnsUrl = columnsUrl;
            this.createdAt = createdAt;
            this.creator = creator;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.name = name;
            this.nodeId = nodeId;
            this.number = number;
            this.ownerUrl = ownerUrl;
            this.state = state;
            this.updatedAt = updatedAt;
            this.url = url;
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
         * Setter for columnsUrl.
         * @param  columnsUrl  String value for columnsUrl.
         * @return Builder
         */
        public Builder columnsUrl(String columnsUrl) {
            this.columnsUrl = columnsUrl;
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
         * Setter for creator.
         * @param  creator  Object value for creator.
         * @return Builder
         */
        public Builder creator(Object creator) {
            this.creator = creator;
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
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
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
         * Setter for ownerUrl.
         * @param  ownerUrl  String value for ownerUrl.
         * @return Builder
         */
        public Builder ownerUrl(String ownerUrl) {
            this.ownerUrl = ownerUrl;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State93Enum value for state.
         * @return Builder
         */
        public Builder state(State93Enum state) {
            this.state = state;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Project1} object using the set fields.
         * @return {@link Project1}
         */
        public Project1 build() {
            return new Project1(body, columnsUrl, createdAt, creator, htmlUrl, id, name, nodeId,
                    number, ownerUrl, state, updatedAt, url);
        }
    }
}