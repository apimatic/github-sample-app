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
 * This is a model class for PullRequestReviewComment3 type.
 */
public class PullRequestReviewComment3 {
    private Links11 links;
    private AuthorAssociationEnum authorAssociation;
    private String body;
    private String commitId;
    private LocalDateTime createdAt;
    private String diffHunk;
    private String htmlUrl;
    private int id;
    private Integer inReplyToId;
    private Integer line;
    private String nodeId;
    private String originalCommitId;
    private int originalLine;
    private int originalPosition;
    private Integer originalStartLine;
    private String path;
    private Integer position;
    private Integer pullRequestReviewId;
    private String pullRequestUrl;
    private ReactionRollup reactions;
    private Side1Enum side;
    private Integer startLine;
    private Object startSide;
    private LocalDateTime updatedAt;
    private String url;
    private Object user;

    /**
     * Default constructor.
     */
    public PullRequestReviewComment3() {
    }

    /**
     * Initialization constructor.
     * @param  links  Links11 value for links.
     * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
     * @param  body  String value for body.
     * @param  commitId  String value for commitId.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  diffHunk  String value for diffHunk.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  line  Integer value for line.
     * @param  nodeId  String value for nodeId.
     * @param  originalCommitId  String value for originalCommitId.
     * @param  originalLine  int value for originalLine.
     * @param  originalPosition  int value for originalPosition.
     * @param  originalStartLine  Integer value for originalStartLine.
     * @param  path  String value for path.
     * @param  position  Integer value for position.
     * @param  pullRequestReviewId  Integer value for pullRequestReviewId.
     * @param  pullRequestUrl  String value for pullRequestUrl.
     * @param  reactions  ReactionRollup value for reactions.
     * @param  side  Side1Enum value for side.
     * @param  startLine  Integer value for startLine.
     * @param  startSide  Object value for startSide.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  url  String value for url.
     * @param  user  Object value for user.
     * @param  inReplyToId  Integer value for inReplyToId.
     */
    public PullRequestReviewComment3(
            Links11 links,
            AuthorAssociationEnum authorAssociation,
            String body,
            String commitId,
            LocalDateTime createdAt,
            String diffHunk,
            String htmlUrl,
            int id,
            Integer line,
            String nodeId,
            String originalCommitId,
            int originalLine,
            int originalPosition,
            Integer originalStartLine,
            String path,
            Integer position,
            Integer pullRequestReviewId,
            String pullRequestUrl,
            ReactionRollup reactions,
            Side1Enum side,
            Integer startLine,
            Object startSide,
            LocalDateTime updatedAt,
            String url,
            Object user,
            Integer inReplyToId) {
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.commitId = commitId;
        this.createdAt = createdAt;
        this.diffHunk = diffHunk;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.inReplyToId = inReplyToId;
        this.line = line;
        this.nodeId = nodeId;
        this.originalCommitId = originalCommitId;
        this.originalLine = originalLine;
        this.originalPosition = originalPosition;
        this.originalStartLine = originalStartLine;
        this.path = path;
        this.position = position;
        this.pullRequestReviewId = pullRequestReviewId;
        this.pullRequestUrl = pullRequestUrl;
        this.reactions = reactions;
        this.side = side;
        this.startLine = startLine;
        this.startSide = startSide;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    /**
     * Getter for Links.
     * @return Returns the Links11
     */
    @JsonGetter("_links")
    public Links11 getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for Links11
     */
    @JsonSetter("_links")
    public void setLinks(Links11 links) {
        this.links = links;
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
     * The text of the comment.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The text of the comment.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for CommitId.
     * The SHA of the commit to which the comment applies.
     * @return Returns the String
     */
    @JsonGetter("commit_id")
    public String getCommitId() {
        return commitId;
    }

    /**
     * Setter for CommitId.
     * The SHA of the commit to which the comment applies.
     * @param commitId Value for String
     */
    @JsonSetter("commit_id")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
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
     * Getter for DiffHunk.
     * The diff of the line that the comment refers to.
     * @return Returns the String
     */
    @JsonGetter("diff_hunk")
    public String getDiffHunk() {
        return diffHunk;
    }

    /**
     * Setter for DiffHunk.
     * The diff of the line that the comment refers to.
     * @param diffHunk Value for String
     */
    @JsonSetter("diff_hunk")
    public void setDiffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
    }

    /**
     * Getter for HtmlUrl.
     * HTML URL for the pull request review comment.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * HTML URL for the pull request review comment.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for Id.
     * The ID of the pull request review comment.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the pull request review comment.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for InReplyToId.
     * The comment ID to reply to.
     * @return Returns the Integer
     */
    @JsonGetter("in_reply_to_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInReplyToId() {
        return inReplyToId;
    }

    /**
     * Setter for InReplyToId.
     * The comment ID to reply to.
     * @param inReplyToId Value for Integer
     */
    @JsonSetter("in_reply_to_id")
    public void setInReplyToId(Integer inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    /**
     * Getter for Line.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @return Returns the Integer
     */
    @JsonGetter("line")
    public Integer getLine() {
        return line;
    }

    /**
     * Setter for Line.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @param line Value for Integer
     */
    @JsonSetter("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Getter for NodeId.
     * The node ID of the pull request review comment.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * The node ID of the pull request review comment.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for OriginalCommitId.
     * The SHA of the original commit to which the comment applies.
     * @return Returns the String
     */
    @JsonGetter("original_commit_id")
    public String getOriginalCommitId() {
        return originalCommitId;
    }

    /**
     * Setter for OriginalCommitId.
     * The SHA of the original commit to which the comment applies.
     * @param originalCommitId Value for String
     */
    @JsonSetter("original_commit_id")
    public void setOriginalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
    }

    /**
     * Getter for OriginalLine.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @return Returns the int
     */
    @JsonGetter("original_line")
    public int getOriginalLine() {
        return originalLine;
    }

    /**
     * Setter for OriginalLine.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @param originalLine Value for int
     */
    @JsonSetter("original_line")
    public void setOriginalLine(int originalLine) {
        this.originalLine = originalLine;
    }

    /**
     * Getter for OriginalPosition.
     * The index of the original line in the diff to which the comment applies.
     * @return Returns the int
     */
    @JsonGetter("original_position")
    public int getOriginalPosition() {
        return originalPosition;
    }

    /**
     * Setter for OriginalPosition.
     * The index of the original line in the diff to which the comment applies.
     * @param originalPosition Value for int
     */
    @JsonSetter("original_position")
    public void setOriginalPosition(int originalPosition) {
        this.originalPosition = originalPosition;
    }

    /**
     * Getter for OriginalStartLine.
     * The first line of the range for a multi-line comment.
     * @return Returns the Integer
     */
    @JsonGetter("original_start_line")
    public Integer getOriginalStartLine() {
        return originalStartLine;
    }

    /**
     * Setter for OriginalStartLine.
     * The first line of the range for a multi-line comment.
     * @param originalStartLine Value for Integer
     */
    @JsonSetter("original_start_line")
    public void setOriginalStartLine(Integer originalStartLine) {
        this.originalStartLine = originalStartLine;
    }

    /**
     * Getter for Path.
     * The relative path of the file to which the comment applies.
     * @return Returns the String
     */
    @JsonGetter("path")
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * The relative path of the file to which the comment applies.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Position.
     * The line index in the diff to which the comment applies.
     * @return Returns the Integer
     */
    @JsonGetter("position")
    public Integer getPosition() {
        return position;
    }

    /**
     * Setter for Position.
     * The line index in the diff to which the comment applies.
     * @param position Value for Integer
     */
    @JsonSetter("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Getter for PullRequestReviewId.
     * The ID of the pull request review to which the comment belongs.
     * @return Returns the Integer
     */
    @JsonGetter("pull_request_review_id")
    public Integer getPullRequestReviewId() {
        return pullRequestReviewId;
    }

    /**
     * Setter for PullRequestReviewId.
     * The ID of the pull request review to which the comment belongs.
     * @param pullRequestReviewId Value for Integer
     */
    @JsonSetter("pull_request_review_id")
    public void setPullRequestReviewId(Integer pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

    /**
     * Getter for PullRequestUrl.
     * URL for the pull request that the review comment belongs to.
     * @return Returns the String
     */
    @JsonGetter("pull_request_url")
    public String getPullRequestUrl() {
        return pullRequestUrl;
    }

    /**
     * Setter for PullRequestUrl.
     * URL for the pull request that the review comment belongs to.
     * @param pullRequestUrl Value for String
     */
    @JsonSetter("pull_request_url")
    public void setPullRequestUrl(String pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
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
     * Getter for Side.
     * @return Returns the Side1Enum
     */
    @JsonGetter("side")
    public Side1Enum getSide() {
        return side;
    }

    /**
     * Setter for Side.
     * @param side Value for Side1Enum
     */
    @JsonSetter("side")
    public void setSide(Side1Enum side) {
        this.side = side;
    }

    /**
     * Getter for StartLine.
     * The first line of the range for a multi-line comment.
     * @return Returns the Integer
     */
    @JsonGetter("start_line")
    public Integer getStartLine() {
        return startLine;
    }

    /**
     * Setter for StartLine.
     * The first line of the range for a multi-line comment.
     * @param startLine Value for Integer
     */
    @JsonSetter("start_line")
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * Getter for StartSide.
     * @return Returns the Object
     */
    @JsonGetter("start_side")
    public Object getStartSide() {
        return startSide;
    }

    /**
     * Setter for StartSide.
     * @param startSide Value for Object
     */
    @JsonSetter("start_side")
    public void setStartSide(Object startSide) {
        this.startSide = startSide;
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
     * URL for the pull request review comment
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * URL for the pull request review comment
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
     * Converts this PullRequestReviewComment3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequestReviewComment3 [" + "links=" + links + ", authorAssociation="
                + authorAssociation + ", body=" + body + ", commitId=" + commitId + ", createdAt="
                + createdAt + ", diffHunk=" + diffHunk + ", htmlUrl=" + htmlUrl + ", id=" + id
                + ", line=" + line + ", nodeId=" + nodeId + ", originalCommitId=" + originalCommitId
                + ", originalLine=" + originalLine + ", originalPosition=" + originalPosition
                + ", originalStartLine=" + originalStartLine + ", path=" + path + ", position="
                + position + ", pullRequestReviewId=" + pullRequestReviewId + ", pullRequestUrl="
                + pullRequestUrl + ", reactions=" + reactions + ", side=" + side + ", startLine="
                + startLine + ", startSide=" + startSide + ", updatedAt=" + updatedAt + ", url="
                + url + ", user=" + user + ", inReplyToId=" + inReplyToId + "]";
    }

    /**
     * Builds a new {@link PullRequestReviewComment3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequestReviewComment3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(links, authorAssociation, body, commitId, createdAt, diffHunk,
                htmlUrl, id, line, nodeId, originalCommitId, originalLine, originalPosition,
                originalStartLine, path, position, pullRequestReviewId, pullRequestUrl, reactions,
                side, startLine, startSide, updatedAt, url, user)
                .inReplyToId(getInReplyToId());
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequestReviewComment3}.
     */
    public static class Builder {
        private Links11 links;
        private AuthorAssociationEnum authorAssociation;
        private String body;
        private String commitId;
        private LocalDateTime createdAt;
        private String diffHunk;
        private String htmlUrl;
        private int id;
        private Integer line;
        private String nodeId;
        private String originalCommitId;
        private int originalLine;
        private int originalPosition;
        private Integer originalStartLine;
        private String path;
        private Integer position;
        private Integer pullRequestReviewId;
        private String pullRequestUrl;
        private ReactionRollup reactions;
        private Side1Enum side;
        private Integer startLine;
        private Object startSide;
        private LocalDateTime updatedAt;
        private String url;
        private Object user;
        private Integer inReplyToId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  links  Links11 value for links.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @param  body  String value for body.
         * @param  commitId  String value for commitId.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  diffHunk  String value for diffHunk.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  line  Integer value for line.
         * @param  nodeId  String value for nodeId.
         * @param  originalCommitId  String value for originalCommitId.
         * @param  originalLine  int value for originalLine.
         * @param  originalPosition  int value for originalPosition.
         * @param  originalStartLine  Integer value for originalStartLine.
         * @param  path  String value for path.
         * @param  position  Integer value for position.
         * @param  pullRequestReviewId  Integer value for pullRequestReviewId.
         * @param  pullRequestUrl  String value for pullRequestUrl.
         * @param  reactions  ReactionRollup value for reactions.
         * @param  side  Side1Enum value for side.
         * @param  startLine  Integer value for startLine.
         * @param  startSide  Object value for startSide.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  url  String value for url.
         * @param  user  Object value for user.
         */
        public Builder(Links11 links, AuthorAssociationEnum authorAssociation, String body,
                String commitId, LocalDateTime createdAt, String diffHunk, String htmlUrl, int id,
                Integer line, String nodeId, String originalCommitId, int originalLine,
                int originalPosition, Integer originalStartLine, String path, Integer position,
                Integer pullRequestReviewId, String pullRequestUrl, ReactionRollup reactions,
                Side1Enum side, Integer startLine, Object startSide, LocalDateTime updatedAt,
                String url, Object user) {
            this.links = links;
            this.authorAssociation = authorAssociation;
            this.body = body;
            this.commitId = commitId;
            this.createdAt = createdAt;
            this.diffHunk = diffHunk;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.line = line;
            this.nodeId = nodeId;
            this.originalCommitId = originalCommitId;
            this.originalLine = originalLine;
            this.originalPosition = originalPosition;
            this.originalStartLine = originalStartLine;
            this.path = path;
            this.position = position;
            this.pullRequestReviewId = pullRequestReviewId;
            this.pullRequestUrl = pullRequestUrl;
            this.reactions = reactions;
            this.side = side;
            this.startLine = startLine;
            this.startSide = startSide;
            this.updatedAt = updatedAt;
            this.url = url;
            this.user = user;
        }

        /**
         * Setter for links.
         * @param  links  Links11 value for links.
         * @return Builder
         */
        public Builder links(Links11 links) {
            this.links = links;
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
         * Setter for commitId.
         * @param  commitId  String value for commitId.
         * @return Builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
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
         * Setter for diffHunk.
         * @param  diffHunk  String value for diffHunk.
         * @return Builder
         */
        public Builder diffHunk(String diffHunk) {
            this.diffHunk = diffHunk;
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
         * Setter for line.
         * @param  line  Integer value for line.
         * @return Builder
         */
        public Builder line(Integer line) {
            this.line = line;
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
         * Setter for originalCommitId.
         * @param  originalCommitId  String value for originalCommitId.
         * @return Builder
         */
        public Builder originalCommitId(String originalCommitId) {
            this.originalCommitId = originalCommitId;
            return this;
        }

        /**
         * Setter for originalLine.
         * @param  originalLine  int value for originalLine.
         * @return Builder
         */
        public Builder originalLine(int originalLine) {
            this.originalLine = originalLine;
            return this;
        }

        /**
         * Setter for originalPosition.
         * @param  originalPosition  int value for originalPosition.
         * @return Builder
         */
        public Builder originalPosition(int originalPosition) {
            this.originalPosition = originalPosition;
            return this;
        }

        /**
         * Setter for originalStartLine.
         * @param  originalStartLine  Integer value for originalStartLine.
         * @return Builder
         */
        public Builder originalStartLine(Integer originalStartLine) {
            this.originalStartLine = originalStartLine;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for position.
         * @param  position  Integer value for position.
         * @return Builder
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /**
         * Setter for pullRequestReviewId.
         * @param  pullRequestReviewId  Integer value for pullRequestReviewId.
         * @return Builder
         */
        public Builder pullRequestReviewId(Integer pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
            return this;
        }

        /**
         * Setter for pullRequestUrl.
         * @param  pullRequestUrl  String value for pullRequestUrl.
         * @return Builder
         */
        public Builder pullRequestUrl(String pullRequestUrl) {
            this.pullRequestUrl = pullRequestUrl;
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
         * Setter for side.
         * @param  side  Side1Enum value for side.
         * @return Builder
         */
        public Builder side(Side1Enum side) {
            this.side = side;
            return this;
        }

        /**
         * Setter for startLine.
         * @param  startLine  Integer value for startLine.
         * @return Builder
         */
        public Builder startLine(Integer startLine) {
            this.startLine = startLine;
            return this;
        }

        /**
         * Setter for startSide.
         * @param  startSide  Object value for startSide.
         * @return Builder
         */
        public Builder startSide(Object startSide) {
            this.startSide = startSide;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Setter for inReplyToId.
         * @param  inReplyToId  Integer value for inReplyToId.
         * @return Builder
         */
        public Builder inReplyToId(Integer inReplyToId) {
            this.inReplyToId = inReplyToId;
            return this;
        }

        /**
         * Builds a new {@link PullRequestReviewComment3} object using the set fields.
         * @return {@link PullRequestReviewComment3}
         */
        public PullRequestReviewComment3 build() {
            return new PullRequestReviewComment3(links, authorAssociation, body, commitId,
                    createdAt, diffHunk, htmlUrl, id, line, nodeId, originalCommitId, originalLine,
                    originalPosition, originalStartLine, path, position, pullRequestReviewId,
                    pullRequestUrl, reactions, side, startLine, startSide, updatedAt, url, user,
                    inReplyToId);
        }
    }
}
