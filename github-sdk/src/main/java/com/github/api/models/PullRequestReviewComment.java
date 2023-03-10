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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;

/**
 * This is a model class for PullRequestReviewComment type.
 */
public class PullRequestReviewComment {
    private String url;
    private Integer pullRequestReviewId;
    private int id;
    private String nodeId;
    private String diffHunk;
    private String path;
    private int position;
    private int originalPosition;
    private String commitId;
    private String originalCommitId;
    private Integer inReplyToId;
    private User2 user;
    private String body;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String htmlUrl;
    private String pullRequestUrl;
    private AuthorAssociationEnum authorAssociation;
    private Links11 links;
    private OptionalNullable<Integer> startLine;
    private OptionalNullable<Integer> originalStartLine;
    private Object startSide;
    private Integer line;
    private Integer originalLine;
    private SideEnum side;
    private ReactionRollup reactions;
    private String bodyHtml;
    private String bodyText;

    /**
     * Default constructor.
     */
    public PullRequestReviewComment() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  pullRequestReviewId  Integer value for pullRequestReviewId.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  diffHunk  String value for diffHunk.
     * @param  path  String value for path.
     * @param  position  int value for position.
     * @param  originalPosition  int value for originalPosition.
     * @param  commitId  String value for commitId.
     * @param  originalCommitId  String value for originalCommitId.
     * @param  user  User2 value for user.
     * @param  body  String value for body.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  pullRequestUrl  String value for pullRequestUrl.
     * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
     * @param  links  Links11 value for links.
     * @param  inReplyToId  Integer value for inReplyToId.
     * @param  startLine  Integer value for startLine.
     * @param  originalStartLine  Integer value for originalStartLine.
     * @param  startSide  Object value for startSide.
     * @param  line  Integer value for line.
     * @param  originalLine  Integer value for originalLine.
     * @param  side  SideEnum value for side.
     * @param  reactions  ReactionRollup value for reactions.
     * @param  bodyHtml  String value for bodyHtml.
     * @param  bodyText  String value for bodyText.
     */
    public PullRequestReviewComment(
            String url,
            Integer pullRequestReviewId,
            int id,
            String nodeId,
            String diffHunk,
            String path,
            int position,
            int originalPosition,
            String commitId,
            String originalCommitId,
            User2 user,
            String body,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            String htmlUrl,
            String pullRequestUrl,
            AuthorAssociationEnum authorAssociation,
            Links11 links,
            Integer inReplyToId,
            Integer startLine,
            Integer originalStartLine,
            Object startSide,
            Integer line,
            Integer originalLine,
            SideEnum side,
            ReactionRollup reactions,
            String bodyHtml,
            String bodyText) {
        this.url = url;
        this.pullRequestReviewId = pullRequestReviewId;
        this.id = id;
        this.nodeId = nodeId;
        this.diffHunk = diffHunk;
        this.path = path;
        this.position = position;
        this.originalPosition = originalPosition;
        this.commitId = commitId;
        this.originalCommitId = originalCommitId;
        this.inReplyToId = inReplyToId;
        this.user = user;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.htmlUrl = htmlUrl;
        this.pullRequestUrl = pullRequestUrl;
        this.authorAssociation = authorAssociation;
        this.links = links;
        this.startLine = OptionalNullable.of(startLine);
        this.originalStartLine = OptionalNullable.of(originalStartLine);
        this.startSide = startSide;
        this.line = line;
        this.originalLine = originalLine;
        this.side = side;
        this.reactions = reactions;
        this.bodyHtml = bodyHtml;
        this.bodyText = bodyText;
    }

    /**
     * Internal initialization constructor.
     */
    protected PullRequestReviewComment(String url, Integer pullRequestReviewId, int id,
            String nodeId, String diffHunk, String path, int position, int originalPosition,
            String commitId, String originalCommitId, User2 user, String body,
            LocalDateTime createdAt, LocalDateTime updatedAt, String htmlUrl, String pullRequestUrl,
            AuthorAssociationEnum authorAssociation, Links11 links, Integer inReplyToId,
            OptionalNullable<Integer> startLine, OptionalNullable<Integer> originalStartLine,
            Object startSide, Integer line, Integer originalLine, SideEnum side,
            ReactionRollup reactions, String bodyHtml, String bodyText) {
        this.url = url;
        this.pullRequestReviewId = pullRequestReviewId;
        this.id = id;
        this.nodeId = nodeId;
        this.diffHunk = diffHunk;
        this.path = path;
        this.position = position;
        this.originalPosition = originalPosition;
        this.commitId = commitId;
        this.originalCommitId = originalCommitId;
        this.inReplyToId = inReplyToId;
        this.user = user;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.htmlUrl = htmlUrl;
        this.pullRequestUrl = pullRequestUrl;
        this.authorAssociation = authorAssociation;
        this.links = links;
        this.startLine = startLine;
        this.originalStartLine = originalStartLine;
        this.startSide = startSide;
        this.line = line;
        this.originalLine = originalLine;
        this.side = side;
        this.reactions = reactions;
        this.bodyHtml = bodyHtml;
        this.bodyText = bodyText;
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
     * The line index in the diff to which the comment applies. This field is deprecated; use `line`
     * instead.
     * @return Returns the int
     */
    @JsonGetter("position")
    public int getPosition() {
        return position;
    }

    /**
     * Setter for Position.
     * The line index in the diff to which the comment applies. This field is deprecated; use `line`
     * instead.
     * @param position Value for int
     */
    @JsonSetter("position")
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Getter for OriginalPosition.
     * The index of the original line in the diff to which the comment applies. This field is
     * deprecated; use `original_line` instead.
     * @return Returns the int
     */
    @JsonGetter("original_position")
    public int getOriginalPosition() {
        return originalPosition;
    }

    /**
     * Setter for OriginalPosition.
     * The index of the original line in the diff to which the comment applies. This field is
     * deprecated; use `original_line` instead.
     * @param originalPosition Value for int
     */
    @JsonSetter("original_position")
    public void setOriginalPosition(int originalPosition) {
        this.originalPosition = originalPosition;
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
     * Getter for User.
     * @return Returns the User2
     */
    @JsonGetter("user")
    public User2 getUser() {
        return user;
    }

    /**
     * Setter for User.
     * @param user Value for User2
     */
    @JsonSetter("user")
    public void setUser(User2 user) {
        this.user = user;
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
     * Internal Getter for StartLine.
     * The first line of the range for a multi-line comment.
     * @return Returns the Internal Integer
     */
    @JsonGetter("start_line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetStartLine() {
        return this.startLine;
    }

    /**
     * Getter for StartLine.
     * The first line of the range for a multi-line comment.
     * @return Returns the Integer
     */
    public Integer getStartLine() {
        return OptionalNullable.getFrom(startLine);
    }

    /**
     * Setter for StartLine.
     * The first line of the range for a multi-line comment.
     * @param startLine Value for Integer
     */
    @JsonSetter("start_line")
    public void setStartLine(Integer startLine) {
        this.startLine = OptionalNullable.of(startLine);
    }

    /**
     * UnSetter for StartLine.
     * The first line of the range for a multi-line comment.
     */
    public void unsetStartLine() {
        startLine = null;
    }

    /**
     * Internal Getter for OriginalStartLine.
     * The first line of the range for a multi-line comment.
     * @return Returns the Internal Integer
     */
    @JsonGetter("original_start_line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetOriginalStartLine() {
        return this.originalStartLine;
    }

    /**
     * Getter for OriginalStartLine.
     * The first line of the range for a multi-line comment.
     * @return Returns the Integer
     */
    public Integer getOriginalStartLine() {
        return OptionalNullable.getFrom(originalStartLine);
    }

    /**
     * Setter for OriginalStartLine.
     * The first line of the range for a multi-line comment.
     * @param originalStartLine Value for Integer
     */
    @JsonSetter("original_start_line")
    public void setOriginalStartLine(Integer originalStartLine) {
        this.originalStartLine = OptionalNullable.of(originalStartLine);
    }

    /**
     * UnSetter for OriginalStartLine.
     * The first line of the range for a multi-line comment.
     */
    public void unsetOriginalStartLine() {
        originalStartLine = null;
    }

    /**
     * Getter for StartSide.
     * @return Returns the Object
     */
    @JsonGetter("start_side")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Line.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @return Returns the Integer
     */
    @JsonGetter("line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for OriginalLine.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @return Returns the Integer
     */
    @JsonGetter("original_line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOriginalLine() {
        return originalLine;
    }

    /**
     * Setter for OriginalLine.
     * The line of the blob to which the comment applies. The last line of the range for a
     * multi-line comment
     * @param originalLine Value for Integer
     */
    @JsonSetter("original_line")
    public void setOriginalLine(Integer originalLine) {
        this.originalLine = originalLine;
    }

    /**
     * Getter for Side.
     * @return Returns the SideEnum
     */
    @JsonGetter("side")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SideEnum getSide() {
        return side;
    }

    /**
     * Setter for Side.
     * @param side Value for SideEnum
     */
    @JsonSetter("side")
    public void setSide(SideEnum side) {
        this.side = side;
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
     * Getter for BodyHtml.
     * @return Returns the String
     */
    @JsonGetter("body_html")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for BodyText.
     * @return Returns the String
     */
    @JsonGetter("body_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBodyText() {
        return bodyText;
    }

    /**
     * Setter for BodyText.
     * @param bodyText Value for String
     */
    @JsonSetter("body_text")
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    /**
     * Converts this PullRequestReviewComment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequestReviewComment [" + "url=" + url + ", pullRequestReviewId="
                + pullRequestReviewId + ", id=" + id + ", nodeId=" + nodeId + ", diffHunk="
                + diffHunk + ", path=" + path + ", position=" + position + ", originalPosition="
                + originalPosition + ", commitId=" + commitId + ", originalCommitId="
                + originalCommitId + ", user=" + user + ", body=" + body + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", htmlUrl=" + htmlUrl
                + ", pullRequestUrl=" + pullRequestUrl + ", authorAssociation=" + authorAssociation
                + ", links=" + links + ", inReplyToId=" + inReplyToId + ", startLine=" + startLine
                + ", originalStartLine=" + originalStartLine + ", startSide=" + startSide
                + ", line=" + line + ", originalLine=" + originalLine + ", side=" + side
                + ", reactions=" + reactions + ", bodyHtml=" + bodyHtml + ", bodyText=" + bodyText
                + "]";
    }

    /**
     * Builds a new {@link PullRequestReviewComment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequestReviewComment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, pullRequestReviewId, id, nodeId, diffHunk, path,
                position, originalPosition, commitId, originalCommitId, user, body, createdAt,
                updatedAt, htmlUrl, pullRequestUrl, authorAssociation, links)
                .inReplyToId(getInReplyToId())
                .startSide(getStartSide())
                .line(getLine())
                .originalLine(getOriginalLine())
                .side(getSide())
                .reactions(getReactions())
                .bodyHtml(getBodyHtml())
                .bodyText(getBodyText());
        builder.startLine = internalGetStartLine();
        builder.originalStartLine = internalGetOriginalStartLine();
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequestReviewComment}.
     */
    public static class Builder {
        private String url;
        private Integer pullRequestReviewId;
        private int id;
        private String nodeId;
        private String diffHunk;
        private String path;
        private int position;
        private int originalPosition;
        private String commitId;
        private String originalCommitId;
        private User2 user;
        private String body;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String htmlUrl;
        private String pullRequestUrl;
        private AuthorAssociationEnum authorAssociation;
        private Links11 links;
        private Integer inReplyToId;
        private OptionalNullable<Integer> startLine;
        private OptionalNullable<Integer> originalStartLine;
        private Object startSide;
        private Integer line;
        private Integer originalLine;
        private SideEnum side;
        private ReactionRollup reactions;
        private String bodyHtml;
        private String bodyText;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  pullRequestReviewId  Integer value for pullRequestReviewId.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  diffHunk  String value for diffHunk.
         * @param  path  String value for path.
         * @param  position  int value for position.
         * @param  originalPosition  int value for originalPosition.
         * @param  commitId  String value for commitId.
         * @param  originalCommitId  String value for originalCommitId.
         * @param  user  User2 value for user.
         * @param  body  String value for body.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  pullRequestUrl  String value for pullRequestUrl.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @param  links  Links11 value for links.
         */
        public Builder(String url, Integer pullRequestReviewId, int id, String nodeId,
                String diffHunk, String path, int position, int originalPosition, String commitId,
                String originalCommitId, User2 user, String body, LocalDateTime createdAt,
                LocalDateTime updatedAt, String htmlUrl, String pullRequestUrl,
                AuthorAssociationEnum authorAssociation, Links11 links) {
            this.url = url;
            this.pullRequestReviewId = pullRequestReviewId;
            this.id = id;
            this.nodeId = nodeId;
            this.diffHunk = diffHunk;
            this.path = path;
            this.position = position;
            this.originalPosition = originalPosition;
            this.commitId = commitId;
            this.originalCommitId = originalCommitId;
            this.user = user;
            this.body = body;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.htmlUrl = htmlUrl;
            this.pullRequestUrl = pullRequestUrl;
            this.authorAssociation = authorAssociation;
            this.links = links;
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
         * Setter for pullRequestReviewId.
         * @param  pullRequestReviewId  Integer value for pullRequestReviewId.
         * @return Builder
         */
        public Builder pullRequestReviewId(Integer pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
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
         * Setter for diffHunk.
         * @param  diffHunk  String value for diffHunk.
         * @return Builder
         */
        public Builder diffHunk(String diffHunk) {
            this.diffHunk = diffHunk;
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
         * @param  position  int value for position.
         * @return Builder
         */
        public Builder position(int position) {
            this.position = position;
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
         * Setter for commitId.
         * @param  commitId  String value for commitId.
         * @return Builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
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
         * Setter for user.
         * @param  user  User2 value for user.
         * @return Builder
         */
        public Builder user(User2 user) {
            this.user = user;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for authorAssociation.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @return Builder
         */
        public Builder authorAssociation(AuthorAssociationEnum authorAssociation) {
            this.authorAssociation = authorAssociation;
            return this;
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
         * Setter for inReplyToId.
         * @param  inReplyToId  Integer value for inReplyToId.
         * @return Builder
         */
        public Builder inReplyToId(Integer inReplyToId) {
            this.inReplyToId = inReplyToId;
            return this;
        }

        /**
         * Setter for startLine.
         * @param  startLine  Integer value for startLine.
         * @return Builder
         */
        public Builder startLine(Integer startLine) {
            this.startLine = OptionalNullable.of(startLine);
            return this;
        }

        /**
         * UnSetter for startLine.
         * @return Builder
         */
        public Builder unsetStartLine() {
            startLine = null;
            return this;
        }

        /**
         * Setter for originalStartLine.
         * @param  originalStartLine  Integer value for originalStartLine.
         * @return Builder
         */
        public Builder originalStartLine(Integer originalStartLine) {
            this.originalStartLine = OptionalNullable.of(originalStartLine);
            return this;
        }

        /**
         * UnSetter for originalStartLine.
         * @return Builder
         */
        public Builder unsetOriginalStartLine() {
            originalStartLine = null;
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
         * Setter for line.
         * @param  line  Integer value for line.
         * @return Builder
         */
        public Builder line(Integer line) {
            this.line = line;
            return this;
        }

        /**
         * Setter for originalLine.
         * @param  originalLine  Integer value for originalLine.
         * @return Builder
         */
        public Builder originalLine(Integer originalLine) {
            this.originalLine = originalLine;
            return this;
        }

        /**
         * Setter for side.
         * @param  side  SideEnum value for side.
         * @return Builder
         */
        public Builder side(SideEnum side) {
            this.side = side;
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
         * Setter for bodyHtml.
         * @param  bodyHtml  String value for bodyHtml.
         * @return Builder
         */
        public Builder bodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        /**
         * Setter for bodyText.
         * @param  bodyText  String value for bodyText.
         * @return Builder
         */
        public Builder bodyText(String bodyText) {
            this.bodyText = bodyText;
            return this;
        }

        /**
         * Builds a new {@link PullRequestReviewComment} object using the set fields.
         * @return {@link PullRequestReviewComment}
         */
        public PullRequestReviewComment build() {
            return new PullRequestReviewComment(url, pullRequestReviewId, id, nodeId, diffHunk,
                    path, position, originalPosition, commitId, originalCommitId, user, body,
                    createdAt, updatedAt, htmlUrl, pullRequestUrl, authorAssociation, links,
                    inReplyToId, startLine, originalStartLine, startSide, line, originalLine, side,
                    reactions, bodyHtml, bodyText);
        }
    }
}
