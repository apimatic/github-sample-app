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
 * This is a model class for Comment1 type.
 */
public class Comment1 {
    private AuthorAssociationEnum authorAssociation;
    private String body;
    private int childCommentCount;
    private String createdAt;
    private int discussionId;
    private String htmlUrl;
    private int id;
    private String nodeId;
    private Integer parentId;
    private ReactionRollup reactions;
    private String repositoryUrl;
    private String updatedAt;
    private Object user;

    /**
     * Default constructor.
     */
    public Comment1() {
    }

    /**
     * Initialization constructor.
     * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
     * @param  body  String value for body.
     * @param  childCommentCount  int value for childCommentCount.
     * @param  createdAt  String value for createdAt.
     * @param  discussionId  int value for discussionId.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  parentId  Integer value for parentId.
     * @param  reactions  ReactionRollup value for reactions.
     * @param  repositoryUrl  String value for repositoryUrl.
     * @param  updatedAt  String value for updatedAt.
     * @param  user  Object value for user.
     */
    public Comment1(
            AuthorAssociationEnum authorAssociation,
            String body,
            int childCommentCount,
            String createdAt,
            int discussionId,
            String htmlUrl,
            int id,
            String nodeId,
            Integer parentId,
            ReactionRollup reactions,
            String repositoryUrl,
            String updatedAt,
            Object user) {
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.childCommentCount = childCommentCount;
        this.createdAt = createdAt;
        this.discussionId = discussionId;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.parentId = parentId;
        this.reactions = reactions;
        this.repositoryUrl = repositoryUrl;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    /**
     * Getter for AuthorAssociation.
     * @return Returns the AuthorAssociationEnum
     */
    @JsonGetter("author_association")
    public AuthorAssociationEnum getAuthorAssociation() {
        return authorAssociation;
    }

    /**
     * Setter for AuthorAssociation.
     * @param authorAssociation Value for AuthorAssociationEnum
     */
    @JsonSetter("author_association")
    public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
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
     * Getter for ChildCommentCount.
     * @return Returns the int
     */
    @JsonGetter("child_comment_count")
    public int getChildCommentCount() {
        return childCommentCount;
    }

    /**
     * Setter for ChildCommentCount.
     * @param childCommentCount Value for int
     */
    @JsonSetter("child_comment_count")
    public void setChildCommentCount(int childCommentCount) {
        this.childCommentCount = childCommentCount;
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
     * Getter for DiscussionId.
     * @return Returns the int
     */
    @JsonGetter("discussion_id")
    public int getDiscussionId() {
        return discussionId;
    }

    /**
     * Setter for DiscussionId.
     * @param discussionId Value for int
     */
    @JsonSetter("discussion_id")
    public void setDiscussionId(int discussionId) {
        this.discussionId = discussionId;
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
     * Getter for ParentId.
     * @return Returns the Integer
     */
    @JsonGetter("parent_id")
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Setter for ParentId.
     * @param parentId Value for Integer
     */
    @JsonSetter("parent_id")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Getter for Reactions.
     * @return Returns the ReactionRollup
     */
    @JsonGetter("reactions")
    public ReactionRollup getReactions() {
        return reactions;
    }

    /**
     * Setter for Reactions.
     * @param reactions Value for ReactionRollup
     */
    @JsonSetter("reactions")
    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
    }

    /**
     * Getter for RepositoryUrl.
     * @return Returns the String
     */
    @JsonGetter("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * Setter for RepositoryUrl.
     * @param repositoryUrl Value for String
     */
    @JsonSetter("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
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
     * Converts this Comment1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Comment1 [" + "authorAssociation=" + authorAssociation + ", body=" + body
                + ", childCommentCount=" + childCommentCount + ", createdAt=" + createdAt
                + ", discussionId=" + discussionId + ", htmlUrl=" + htmlUrl + ", id=" + id
                + ", nodeId=" + nodeId + ", parentId=" + parentId + ", reactions=" + reactions
                + ", repositoryUrl=" + repositoryUrl + ", updatedAt=" + updatedAt + ", user=" + user
                + "]";
    }

    /**
     * Builds a new {@link Comment1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Comment1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(authorAssociation, body, childCommentCount, createdAt,
                discussionId, htmlUrl, id, nodeId, parentId, reactions, repositoryUrl, updatedAt,
                user);
        return builder;
    }

    /**
     * Class to build instances of {@link Comment1}.
     */
    public static class Builder {
        private AuthorAssociationEnum authorAssociation;
        private String body;
        private int childCommentCount;
        private String createdAt;
        private int discussionId;
        private String htmlUrl;
        private int id;
        private String nodeId;
        private Integer parentId;
        private ReactionRollup reactions;
        private String repositoryUrl;
        private String updatedAt;
        private Object user;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @param  body  String value for body.
         * @param  childCommentCount  int value for childCommentCount.
         * @param  createdAt  String value for createdAt.
         * @param  discussionId  int value for discussionId.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  parentId  Integer value for parentId.
         * @param  reactions  ReactionRollup value for reactions.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @param  updatedAt  String value for updatedAt.
         * @param  user  Object value for user.
         */
        public Builder(AuthorAssociationEnum authorAssociation, String body, int childCommentCount,
                String createdAt, int discussionId, String htmlUrl, int id, String nodeId,
                Integer parentId, ReactionRollup reactions, String repositoryUrl, String updatedAt,
                Object user) {
            this.authorAssociation = authorAssociation;
            this.body = body;
            this.childCommentCount = childCommentCount;
            this.createdAt = createdAt;
            this.discussionId = discussionId;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.nodeId = nodeId;
            this.parentId = parentId;
            this.reactions = reactions;
            this.repositoryUrl = repositoryUrl;
            this.updatedAt = updatedAt;
            this.user = user;
        }

        /**
         * Setter for authorAssociation.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @return Builder
         */
        public Builder authorAssociation(AuthorAssociationEnum authorAssociation) {
            this.authorAssociation = authorAssociation;
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
         * Setter for childCommentCount.
         * @param  childCommentCount  int value for childCommentCount.
         * @return Builder
         */
        public Builder childCommentCount(int childCommentCount) {
            this.childCommentCount = childCommentCount;
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
         * Setter for discussionId.
         * @param  discussionId  int value for discussionId.
         * @return Builder
         */
        public Builder discussionId(int discussionId) {
            this.discussionId = discussionId;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for parentId.
         * @param  parentId  Integer value for parentId.
         * @return Builder
         */
        public Builder parentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Setter for reactions.
         * @param  reactions  ReactionRollup value for reactions.
         * @return Builder
         */
        public Builder reactions(ReactionRollup reactions) {
            this.reactions = reactions;
            return this;
        }

        /**
         * Setter for repositoryUrl.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @return Builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link Comment1} object using the set fields.
         * @return {@link Comment1}
         */
        public Comment1 build() {
            return new Comment1(authorAssociation, body, childCommentCount, createdAt, discussionId,
                    htmlUrl, id, nodeId, parentId, reactions, repositoryUrl, updatedAt, user);
        }
    }
}