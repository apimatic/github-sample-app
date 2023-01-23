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
 * This is a model class for ReposPullsCommentsCommentIdReactionsResponse type.
 */
public class ReposPullsCommentsCommentIdReactionsResponse {
    private int id;
    private String nodeId;
    private Object user;
    private ContentEnum content;
    private LocalDateTime createdAt;

    /**
     * Default constructor.
     */
    public ReposPullsCommentsCommentIdReactionsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  user  Object value for user.
     * @param  content  ContentEnum value for content.
     * @param  createdAt  LocalDateTime value for createdAt.
     */
    public ReposPullsCommentsCommentIdReactionsResponse(
            int id,
            String nodeId,
            Object user,
            ContentEnum content,
            LocalDateTime createdAt) {
        this.id = id;
        this.nodeId = nodeId;
        this.user = user;
        this.content = content;
        this.createdAt = createdAt;
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
     * Getter for Content.
     * @return Returns the ContentEnum
     */
    @JsonGetter("content")
    public ContentEnum getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * @param content Value for ContentEnum
     */
    @JsonSetter("content")
    public void setContent(ContentEnum content) {
        this.content = content;
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
     * Converts this ReposPullsCommentsCommentIdReactionsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPullsCommentsCommentIdReactionsResponse [" + "id=" + id + ", nodeId=" + nodeId
                + ", user=" + user + ", content=" + content + ", createdAt=" + createdAt + "]";
    }

    /**
     * Builds a new {@link ReposPullsCommentsCommentIdReactionsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPullsCommentsCommentIdReactionsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, user, content, createdAt);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPullsCommentsCommentIdReactionsResponse}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private Object user;
        private ContentEnum content;
        private LocalDateTime createdAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  user  Object value for user.
         * @param  content  ContentEnum value for content.
         * @param  createdAt  LocalDateTime value for createdAt.
         */
        public Builder(int id, String nodeId, Object user, ContentEnum content,
                LocalDateTime createdAt) {
            this.id = id;
            this.nodeId = nodeId;
            this.user = user;
            this.content = content;
            this.createdAt = createdAt;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Setter for content.
         * @param  content  ContentEnum value for content.
         * @return Builder
         */
        public Builder content(ContentEnum content) {
            this.content = content;
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
         * Builds a new {@link ReposPullsCommentsCommentIdReactionsResponse} object using the set
         * fields.
         * @return {@link ReposPullsCommentsCommentIdReactionsResponse}
         */
        public ReposPullsCommentsCommentIdReactionsResponse build() {
            return new ReposPullsCommentsCommentIdReactionsResponse(id, nodeId, user, content,
                    createdAt);
        }
    }
}
