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
 * This is a model class for Discussion13 type.
 */
public class Discussion13 {
    private String activeLockReason;
    private String answerChosenAt;
    private Object answerChosenBy;
    private String answerHtmlUrl;
    private AuthorAssociationEnum authorAssociation;
    private String body;
    private Category category;
    private int comments;
    private LocalDateTime createdAt;
    private String htmlUrl;
    private int id;
    private boolean locked;
    private String nodeId;
    private int number;
    private ReactionRollup reactions;
    private String repositoryUrl;
    private State27Enum state;
    private String timelineUrl;
    private String title;
    private LocalDateTime updatedAt;
    private Object user;

    /**
     * Default constructor.
     */
    public Discussion13() {
    }

    /**
     * Initialization constructor.
     * @param  activeLockReason  String value for activeLockReason.
     * @param  answerChosenAt  String value for answerChosenAt.
     * @param  answerChosenBy  Object value for answerChosenBy.
     * @param  answerHtmlUrl  String value for answerHtmlUrl.
     * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
     * @param  body  String value for body.
     * @param  category  Category value for category.
     * @param  comments  int value for comments.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  locked  boolean value for locked.
     * @param  nodeId  String value for nodeId.
     * @param  number  int value for number.
     * @param  repositoryUrl  String value for repositoryUrl.
     * @param  state  State27Enum value for state.
     * @param  title  String value for title.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  user  Object value for user.
     * @param  reactions  ReactionRollup value for reactions.
     * @param  timelineUrl  String value for timelineUrl.
     */
    public Discussion13(
            String activeLockReason,
            String answerChosenAt,
            Object answerChosenBy,
            String answerHtmlUrl,
            AuthorAssociationEnum authorAssociation,
            String body,
            Category category,
            int comments,
            LocalDateTime createdAt,
            String htmlUrl,
            int id,
            boolean locked,
            String nodeId,
            int number,
            String repositoryUrl,
            State27Enum state,
            String title,
            LocalDateTime updatedAt,
            Object user,
            ReactionRollup reactions,
            String timelineUrl) {
        this.activeLockReason = activeLockReason;
        this.answerChosenAt = answerChosenAt;
        this.answerChosenBy = answerChosenBy;
        this.answerHtmlUrl = answerHtmlUrl;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.category = category;
        this.comments = comments;
        this.createdAt = createdAt;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.locked = locked;
        this.nodeId = nodeId;
        this.number = number;
        this.reactions = reactions;
        this.repositoryUrl = repositoryUrl;
        this.state = state;
        this.timelineUrl = timelineUrl;
        this.title = title;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    /**
     * Getter for ActiveLockReason.
     * @return Returns the String
     */
    @JsonGetter("active_lock_reason")
    public String getActiveLockReason() {
        return activeLockReason;
    }

    /**
     * Setter for ActiveLockReason.
     * @param activeLockReason Value for String
     */
    @JsonSetter("active_lock_reason")
    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    /**
     * Getter for AnswerChosenAt.
     * @return Returns the String
     */
    @JsonGetter("answer_chosen_at")
    public String getAnswerChosenAt() {
        return answerChosenAt;
    }

    /**
     * Setter for AnswerChosenAt.
     * @param answerChosenAt Value for String
     */
    @JsonSetter("answer_chosen_at")
    public void setAnswerChosenAt(String answerChosenAt) {
        this.answerChosenAt = answerChosenAt;
    }

    /**
     * Getter for AnswerChosenBy.
     * @return Returns the Object
     */
    @JsonGetter("answer_chosen_by")
    public Object getAnswerChosenBy() {
        return answerChosenBy;
    }

    /**
     * Setter for AnswerChosenBy.
     * @param answerChosenBy Value for Object
     */
    @JsonSetter("answer_chosen_by")
    public void setAnswerChosenBy(Object answerChosenBy) {
        this.answerChosenBy = answerChosenBy;
    }

    /**
     * Getter for AnswerHtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("answer_html_url")
    public String getAnswerHtmlUrl() {
        return answerHtmlUrl;
    }

    /**
     * Setter for AnswerHtmlUrl.
     * @param answerHtmlUrl Value for String
     */
    @JsonSetter("answer_html_url")
    public void setAnswerHtmlUrl(String answerHtmlUrl) {
        this.answerHtmlUrl = answerHtmlUrl;
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
     * Getter for Category.
     * @return Returns the Category
     */
    @JsonGetter("category")
    public Category getCategory() {
        return category;
    }

    /**
     * Setter for Category.
     * @param category Value for Category
     */
    @JsonSetter("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Getter for Comments.
     * @return Returns the int
     */
    @JsonGetter("comments")
    public int getComments() {
        return comments;
    }

    /**
     * Setter for Comments.
     * @param comments Value for int
     */
    @JsonSetter("comments")
    public void setComments(int comments) {
        this.comments = comments;
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
     * Getter for Locked.
     * @return Returns the boolean
     */
    @JsonGetter("locked")
    public boolean getLocked() {
        return locked;
    }

    /**
     * Setter for Locked.
     * @param locked Value for boolean
     */
    @JsonSetter("locked")
    public void setLocked(boolean locked) {
        this.locked = locked;
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
     * Getter for Reactions.
     * @return Returns the ReactionRollup
     */
    @JsonGetter("reactions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for State.
     * @return Returns the State27Enum
     */
    @JsonGetter("state")
    public State27Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State27Enum
     */
    @JsonSetter("state")
    public void setState(State27Enum state) {
        this.state = state;
    }

    /**
     * Getter for TimelineUrl.
     * @return Returns the String
     */
    @JsonGetter("timeline_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimelineUrl() {
        return timelineUrl;
    }

    /**
     * Setter for TimelineUrl.
     * @param timelineUrl Value for String
     */
    @JsonSetter("timeline_url")
    public void setTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
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
     * Converts this Discussion13 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Discussion13 [" + "activeLockReason=" + activeLockReason + ", answerChosenAt="
                + answerChosenAt + ", answerChosenBy=" + answerChosenBy + ", answerHtmlUrl="
                + answerHtmlUrl + ", authorAssociation=" + authorAssociation + ", body=" + body
                + ", category=" + category + ", comments=" + comments + ", createdAt=" + createdAt
                + ", htmlUrl=" + htmlUrl + ", id=" + id + ", locked=" + locked + ", nodeId="
                + nodeId + ", number=" + number + ", repositoryUrl=" + repositoryUrl + ", state="
                + state + ", title=" + title + ", updatedAt=" + updatedAt + ", user=" + user
                + ", reactions=" + reactions + ", timelineUrl=" + timelineUrl + "]";
    }

    /**
     * Builds a new {@link Discussion13.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Discussion13.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(activeLockReason, answerChosenAt, answerChosenBy,
                answerHtmlUrl, authorAssociation, body, category, comments, createdAt, htmlUrl, id,
                locked, nodeId, number, repositoryUrl, state, title, updatedAt, user)
                .reactions(getReactions())
                .timelineUrl(getTimelineUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Discussion13}.
     */
    public static class Builder {
        private String activeLockReason;
        private String answerChosenAt;
        private Object answerChosenBy;
        private String answerHtmlUrl;
        private AuthorAssociationEnum authorAssociation;
        private String body;
        private Category category;
        private int comments;
        private LocalDateTime createdAt;
        private String htmlUrl;
        private int id;
        private boolean locked;
        private String nodeId;
        private int number;
        private String repositoryUrl;
        private State27Enum state;
        private String title;
        private LocalDateTime updatedAt;
        private Object user;
        private ReactionRollup reactions;
        private String timelineUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  activeLockReason  String value for activeLockReason.
         * @param  answerChosenAt  String value for answerChosenAt.
         * @param  answerChosenBy  Object value for answerChosenBy.
         * @param  answerHtmlUrl  String value for answerHtmlUrl.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @param  body  String value for body.
         * @param  category  Category value for category.
         * @param  comments  int value for comments.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  locked  boolean value for locked.
         * @param  nodeId  String value for nodeId.
         * @param  number  int value for number.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @param  state  State27Enum value for state.
         * @param  title  String value for title.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  user  Object value for user.
         */
        public Builder(String activeLockReason, String answerChosenAt, Object answerChosenBy,
                String answerHtmlUrl, AuthorAssociationEnum authorAssociation, String body,
                Category category, int comments, LocalDateTime createdAt, String htmlUrl, int id,
                boolean locked, String nodeId, int number, String repositoryUrl, State27Enum state,
                String title, LocalDateTime updatedAt, Object user) {
            this.activeLockReason = activeLockReason;
            this.answerChosenAt = answerChosenAt;
            this.answerChosenBy = answerChosenBy;
            this.answerHtmlUrl = answerHtmlUrl;
            this.authorAssociation = authorAssociation;
            this.body = body;
            this.category = category;
            this.comments = comments;
            this.createdAt = createdAt;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.locked = locked;
            this.nodeId = nodeId;
            this.number = number;
            this.repositoryUrl = repositoryUrl;
            this.state = state;
            this.title = title;
            this.updatedAt = updatedAt;
            this.user = user;
        }

        /**
         * Setter for activeLockReason.
         * @param  activeLockReason  String value for activeLockReason.
         * @return Builder
         */
        public Builder activeLockReason(String activeLockReason) {
            this.activeLockReason = activeLockReason;
            return this;
        }

        /**
         * Setter for answerChosenAt.
         * @param  answerChosenAt  String value for answerChosenAt.
         * @return Builder
         */
        public Builder answerChosenAt(String answerChosenAt) {
            this.answerChosenAt = answerChosenAt;
            return this;
        }

        /**
         * Setter for answerChosenBy.
         * @param  answerChosenBy  Object value for answerChosenBy.
         * @return Builder
         */
        public Builder answerChosenBy(Object answerChosenBy) {
            this.answerChosenBy = answerChosenBy;
            return this;
        }

        /**
         * Setter for answerHtmlUrl.
         * @param  answerHtmlUrl  String value for answerHtmlUrl.
         * @return Builder
         */
        public Builder answerHtmlUrl(String answerHtmlUrl) {
            this.answerHtmlUrl = answerHtmlUrl;
            return this;
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
         * Setter for category.
         * @param  category  Category value for category.
         * @return Builder
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * Setter for comments.
         * @param  comments  int value for comments.
         * @return Builder
         */
        public Builder comments(int comments) {
            this.comments = comments;
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
         * Setter for locked.
         * @param  locked  boolean value for locked.
         * @return Builder
         */
        public Builder locked(boolean locked) {
            this.locked = locked;
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
         * Setter for repositoryUrl.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @return Builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State27Enum value for state.
         * @return Builder
         */
        public Builder state(State27Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
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
         * Setter for timelineUrl.
         * @param  timelineUrl  String value for timelineUrl.
         * @return Builder
         */
        public Builder timelineUrl(String timelineUrl) {
            this.timelineUrl = timelineUrl;
            return this;
        }

        /**
         * Builds a new {@link Discussion13} object using the set fields.
         * @return {@link Discussion13}
         */
        public Discussion13 build() {
            return new Discussion13(activeLockReason, answerChosenAt, answerChosenBy, answerHtmlUrl,
                    authorAssociation, body, category, comments, createdAt, htmlUrl, id, locked,
                    nodeId, number, repositoryUrl, state, title, updatedAt, user, reactions,
                    timelineUrl);
        }
    }
}