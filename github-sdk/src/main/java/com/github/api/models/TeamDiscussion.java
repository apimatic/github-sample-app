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
 * This is a model class for TeamDiscussion type.
 */
public class TeamDiscussion {
    private Object author;
    private String body;
    private String bodyHtml;
    private String bodyVersion;
    private int commentsCount;
    private String commentsUrl;
    private LocalDateTime createdAt;
    private LocalDateTime lastEditedAt;
    private String htmlUrl;
    private String nodeId;
    private int number;
    private boolean pinned;
    private boolean mPrivate;
    private String teamUrl;
    private String title;
    private LocalDateTime updatedAt;
    private String url;
    private ReactionRollup reactions;

    /**
     * Default constructor.
     */
    public TeamDiscussion() {
    }

    /**
     * Initialization constructor.
     * @param  author  Object value for author.
     * @param  body  String value for body.
     * @param  bodyHtml  String value for bodyHtml.
     * @param  bodyVersion  String value for bodyVersion.
     * @param  commentsCount  int value for commentsCount.
     * @param  commentsUrl  String value for commentsUrl.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  lastEditedAt  LocalDateTime value for lastEditedAt.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  nodeId  String value for nodeId.
     * @param  number  int value for number.
     * @param  pinned  boolean value for pinned.
     * @param  mPrivate  boolean value for mPrivate.
     * @param  teamUrl  String value for teamUrl.
     * @param  title  String value for title.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  url  String value for url.
     * @param  reactions  ReactionRollup value for reactions.
     */
    public TeamDiscussion(
            Object author,
            String body,
            String bodyHtml,
            String bodyVersion,
            int commentsCount,
            String commentsUrl,
            LocalDateTime createdAt,
            LocalDateTime lastEditedAt,
            String htmlUrl,
            String nodeId,
            int number,
            boolean pinned,
            boolean mPrivate,
            String teamUrl,
            String title,
            LocalDateTime updatedAt,
            String url,
            ReactionRollup reactions) {
        this.author = author;
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.bodyVersion = bodyVersion;
        this.commentsCount = commentsCount;
        this.commentsUrl = commentsUrl;
        this.createdAt = createdAt;
        this.lastEditedAt = lastEditedAt;
        this.htmlUrl = htmlUrl;
        this.nodeId = nodeId;
        this.number = number;
        this.pinned = pinned;
        this.mPrivate = mPrivate;
        this.teamUrl = teamUrl;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.reactions = reactions;
    }

    /**
     * Getter for Author.
     * @return Returns the Object
     */
    @JsonGetter("author")
    public Object getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for Object
     */
    @JsonSetter("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    /**
     * Getter for Body.
     * The main text of the discussion.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The main text of the discussion.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for BodyHtml.
     * @return Returns the String
     */
    @JsonGetter("body_html")
    public String getBodyHtml() {
        return bodyHtml;
    }

    /**
     * Setter for BodyHtml.
     * @param bodyHtml Value for String
     */
    @JsonSetter("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    /**
     * Getter for BodyVersion.
     * The current version of the body content. If provided, this update operation will be rejected
     * if the given version does not match the latest version on the server.
     * @return Returns the String
     */
    @JsonGetter("body_version")
    public String getBodyVersion() {
        return bodyVersion;
    }

    /**
     * Setter for BodyVersion.
     * The current version of the body content. If provided, this update operation will be rejected
     * if the given version does not match the latest version on the server.
     * @param bodyVersion Value for String
     */
    @JsonSetter("body_version")
    public void setBodyVersion(String bodyVersion) {
        this.bodyVersion = bodyVersion;
    }

    /**
     * Getter for CommentsCount.
     * @return Returns the int
     */
    @JsonGetter("comments_count")
    public int getCommentsCount() {
        return commentsCount;
    }

    /**
     * Setter for CommentsCount.
     * @param commentsCount Value for int
     */
    @JsonSetter("comments_count")
    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     * Getter for CommentsUrl.
     * @return Returns the String
     */
    @JsonGetter("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * Setter for CommentsUrl.
     * @param commentsUrl Value for String
     */
    @JsonSetter("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
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
     * Getter for LastEditedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("last_edited_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLastEditedAt() {
        return lastEditedAt;
    }

    /**
     * Setter for LastEditedAt.
     * @param lastEditedAt Value for LocalDateTime
     */
    @JsonSetter("last_edited_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastEditedAt(LocalDateTime lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
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
     * The unique sequence number of a team discussion.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The unique sequence number of a team discussion.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for Pinned.
     * Whether or not this discussion should be pinned for easy retrieval.
     * @return Returns the boolean
     */
    @JsonGetter("pinned")
    public boolean getPinned() {
        return pinned;
    }

    /**
     * Setter for Pinned.
     * Whether or not this discussion should be pinned for easy retrieval.
     * @param pinned Value for boolean
     */
    @JsonSetter("pinned")
    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * Getter for Private.
     * Whether or not this discussion should be restricted to team members and organization
     * administrators.
     * @return Returns the boolean
     */
    @JsonGetter("private")
    public boolean getPrivate() {
        return mPrivate;
    }

    /**
     * Setter for Private.
     * Whether or not this discussion should be restricted to team members and organization
     * administrators.
     * @param mPrivate Value for boolean
     */
    @JsonSetter("private")
    public void setPrivate(boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    /**
     * Getter for TeamUrl.
     * @return Returns the String
     */
    @JsonGetter("team_url")
    public String getTeamUrl() {
        return teamUrl;
    }

    /**
     * Setter for TeamUrl.
     * @param teamUrl Value for String
     */
    @JsonSetter("team_url")
    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
    }

    /**
     * Getter for Title.
     * The title of the discussion.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * The title of the discussion.
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
     * Converts this TeamDiscussion into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TeamDiscussion [" + "author=" + author + ", body=" + body + ", bodyHtml=" + bodyHtml
                + ", bodyVersion=" + bodyVersion + ", commentsCount=" + commentsCount
                + ", commentsUrl=" + commentsUrl + ", createdAt=" + createdAt + ", lastEditedAt="
                + lastEditedAt + ", htmlUrl=" + htmlUrl + ", nodeId=" + nodeId + ", number="
                + number + ", pinned=" + pinned + ", mPrivate=" + mPrivate + ", teamUrl=" + teamUrl
                + ", title=" + title + ", updatedAt=" + updatedAt + ", url=" + url + ", reactions="
                + reactions + "]";
    }

    /**
     * Builds a new {@link TeamDiscussion.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TeamDiscussion.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(author, body, bodyHtml, bodyVersion, commentsCount,
                commentsUrl, createdAt, lastEditedAt, htmlUrl, nodeId, number, pinned, mPrivate,
                teamUrl, title, updatedAt, url)
                .reactions(getReactions());
        return builder;
    }

    /**
     * Class to build instances of {@link TeamDiscussion}.
     */
    public static class Builder {
        private Object author;
        private String body;
        private String bodyHtml;
        private String bodyVersion;
        private int commentsCount;
        private String commentsUrl;
        private LocalDateTime createdAt;
        private LocalDateTime lastEditedAt;
        private String htmlUrl;
        private String nodeId;
        private int number;
        private boolean pinned;
        private boolean mPrivate;
        private String teamUrl;
        private String title;
        private LocalDateTime updatedAt;
        private String url;
        private ReactionRollup reactions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  author  Object value for author.
         * @param  body  String value for body.
         * @param  bodyHtml  String value for bodyHtml.
         * @param  bodyVersion  String value for bodyVersion.
         * @param  commentsCount  int value for commentsCount.
         * @param  commentsUrl  String value for commentsUrl.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  lastEditedAt  LocalDateTime value for lastEditedAt.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  nodeId  String value for nodeId.
         * @param  number  int value for number.
         * @param  pinned  boolean value for pinned.
         * @param  mPrivate  boolean value for mPrivate.
         * @param  teamUrl  String value for teamUrl.
         * @param  title  String value for title.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  url  String value for url.
         */
        public Builder(Object author, String body, String bodyHtml, String bodyVersion,
                int commentsCount, String commentsUrl, LocalDateTime createdAt,
                LocalDateTime lastEditedAt, String htmlUrl, String nodeId, int number,
                boolean pinned, boolean mPrivate, String teamUrl, String title,
                LocalDateTime updatedAt, String url) {
            this.author = author;
            this.body = body;
            this.bodyHtml = bodyHtml;
            this.bodyVersion = bodyVersion;
            this.commentsCount = commentsCount;
            this.commentsUrl = commentsUrl;
            this.createdAt = createdAt;
            this.lastEditedAt = lastEditedAt;
            this.htmlUrl = htmlUrl;
            this.nodeId = nodeId;
            this.number = number;
            this.pinned = pinned;
            this.mPrivate = mPrivate;
            this.teamUrl = teamUrl;
            this.title = title;
            this.updatedAt = updatedAt;
            this.url = url;
        }

        /**
         * Setter for author.
         * @param  author  Object value for author.
         * @return Builder
         */
        public Builder author(Object author) {
            this.author = author;
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
         * Setter for bodyHtml.
         * @param  bodyHtml  String value for bodyHtml.
         * @return Builder
         */
        public Builder bodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        /**
         * Setter for bodyVersion.
         * @param  bodyVersion  String value for bodyVersion.
         * @return Builder
         */
        public Builder bodyVersion(String bodyVersion) {
            this.bodyVersion = bodyVersion;
            return this;
        }

        /**
         * Setter for commentsCount.
         * @param  commentsCount  int value for commentsCount.
         * @return Builder
         */
        public Builder commentsCount(int commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }

        /**
         * Setter for commentsUrl.
         * @param  commentsUrl  String value for commentsUrl.
         * @return Builder
         */
        public Builder commentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
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
         * Setter for lastEditedAt.
         * @param  lastEditedAt  LocalDateTime value for lastEditedAt.
         * @return Builder
         */
        public Builder lastEditedAt(LocalDateTime lastEditedAt) {
            this.lastEditedAt = lastEditedAt;
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
         * Setter for pinned.
         * @param  pinned  boolean value for pinned.
         * @return Builder
         */
        public Builder pinned(boolean pinned) {
            this.pinned = pinned;
            return this;
        }

        /**
         * Setter for mPrivate.
         * @param  mPrivate  boolean value for mPrivate.
         * @return Builder
         */
        public Builder mPrivate(boolean mPrivate) {
            this.mPrivate = mPrivate;
            return this;
        }

        /**
         * Setter for teamUrl.
         * @param  teamUrl  String value for teamUrl.
         * @return Builder
         */
        public Builder teamUrl(String teamUrl) {
            this.teamUrl = teamUrl;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Builds a new {@link TeamDiscussion} object using the set fields.
         * @return {@link TeamDiscussion}
         */
        public TeamDiscussion build() {
            return new TeamDiscussion(author, body, bodyHtml, bodyVersion, commentsCount,
                    commentsUrl, createdAt, lastEditedAt, htmlUrl, nodeId, number, pinned, mPrivate,
                    teamUrl, title, updatedAt, url, reactions);
        }
    }
}
