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
 * This is a model class for ReposPullsPullNumberCommentsRequest type.
 */
public class ReposPullsPullNumberCommentsRequest {
    private String body;
    private String commitId;
    private String path;
    private Integer position;
    private Side7Enum side;
    private int line;
    private Integer startLine;
    private StartSide7Enum startSide;
    private Integer inReplyTo;

    /**
     * Default constructor.
     */
    public ReposPullsPullNumberCommentsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  body  String value for body.
     * @param  commitId  String value for commitId.
     * @param  path  String value for path.
     * @param  line  int value for line.
     * @param  position  Integer value for position.
     * @param  side  Side7Enum value for side.
     * @param  startLine  Integer value for startLine.
     * @param  startSide  StartSide7Enum value for startSide.
     * @param  inReplyTo  Integer value for inReplyTo.
     */
    public ReposPullsPullNumberCommentsRequest(
            String body,
            String commitId,
            String path,
            int line,
            Integer position,
            Side7Enum side,
            Integer startLine,
            StartSide7Enum startSide,
            Integer inReplyTo) {
        this.body = body;
        this.commitId = commitId;
        this.path = path;
        this.position = position;
        this.side = side;
        this.line = line;
        this.startLine = startLine;
        this.startSide = startSide;
        this.inReplyTo = inReplyTo;
    }

    /**
     * Getter for Body.
     * The text of the review comment.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The text of the review comment.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for CommitId.
     * The SHA of the commit needing a comment. Not using the latest commit SHA may render your
     * comment outdated if a subsequent commit modifies the line you specify as the `position`.
     * @return Returns the String
     */
    @JsonGetter("commit_id")
    public String getCommitId() {
        return commitId;
    }

    /**
     * Setter for CommitId.
     * The SHA of the commit needing a comment. Not using the latest commit SHA may render your
     * comment outdated if a subsequent commit modifies the line you specify as the `position`.
     * @param commitId Value for String
     */
    @JsonSetter("commit_id")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * Getter for Path.
     * The relative path to the file that necessitates a comment.
     * @return Returns the String
     */
    @JsonGetter("path")
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * The relative path to the file that necessitates a comment.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Position.
     * **This parameter is deprecated. Use `line` instead**. The position in the diff where you want
     * to add a review comment. Note this value is not the same as the line number in the file. For
     * help finding the position value, read the note above.
     * @return Returns the Integer
     */
    @JsonGetter("position")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPosition() {
        return position;
    }

    /**
     * Setter for Position.
     * **This parameter is deprecated. Use `line` instead**. The position in the diff where you want
     * to add a review comment. Note this value is not the same as the line number in the file. For
     * help finding the position value, read the note above.
     * @param position Value for Integer
     */
    @JsonSetter("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Getter for Side.
     * @return Returns the Side7Enum
     */
    @JsonGetter("side")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Side7Enum getSide() {
        return side;
    }

    /**
     * Setter for Side.
     * @param side Value for Side7Enum
     */
    @JsonSetter("side")
    public void setSide(Side7Enum side) {
        this.side = side;
    }

    /**
     * Getter for Line.
     * The line of the blob in the pull request diff that the comment applies to. For a multi-line
     * comment, the last line of the range that your comment applies to.
     * @return Returns the int
     */
    @JsonGetter("line")
    public int getLine() {
        return line;
    }

    /**
     * Setter for Line.
     * The line of the blob in the pull request diff that the comment applies to. For a multi-line
     * comment, the last line of the range that your comment applies to.
     * @param line Value for int
     */
    @JsonSetter("line")
    public void setLine(int line) {
        this.line = line;
    }

    /**
     * Getter for StartLine.
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is
     * the first line in the pull request diff that your multi-line comment applies to. To learn
     * more about multi-line comments, see "[Commenting on a pull
     * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)"
     * in the GitHub Help documentation.
     * @return Returns the Integer
     */
    @JsonGetter("start_line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStartLine() {
        return startLine;
    }

    /**
     * Setter for StartLine.
     * **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is
     * the first line in the pull request diff that your multi-line comment applies to. To learn
     * more about multi-line comments, see "[Commenting on a pull
     * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)"
     * in the GitHub Help documentation.
     * @param startLine Value for Integer
     */
    @JsonSetter("start_line")
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * Getter for StartSide.
     * @return Returns the StartSide7Enum
     */
    @JsonGetter("start_side")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StartSide7Enum getStartSide() {
        return startSide;
    }

    /**
     * Setter for StartSide.
     * @param startSide Value for StartSide7Enum
     */
    @JsonSetter("start_side")
    public void setStartSide(StartSide7Enum startSide) {
        this.startSide = startSide;
    }

    /**
     * Getter for InReplyTo.
     * The ID of the review comment to reply to. To find the ID of a review comment with ["List
     * review comments on a pull request"](#list-review-comments-on-a-pull-request). When specified,
     * all parameters other than `body` in the request body are ignored.
     * @return Returns the Integer
     */
    @JsonGetter("in_reply_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInReplyTo() {
        return inReplyTo;
    }

    /**
     * Setter for InReplyTo.
     * The ID of the review comment to reply to. To find the ID of a review comment with ["List
     * review comments on a pull request"](#list-review-comments-on-a-pull-request). When specified,
     * all parameters other than `body` in the request body are ignored.
     * @param inReplyTo Value for Integer
     */
    @JsonSetter("in_reply_to")
    public void setInReplyTo(Integer inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    /**
     * Converts this ReposPullsPullNumberCommentsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPullsPullNumberCommentsRequest [" + "body=" + body + ", commitId=" + commitId
                + ", path=" + path + ", line=" + line + ", position=" + position + ", side=" + side
                + ", startLine=" + startLine + ", startSide=" + startSide + ", inReplyTo="
                + inReplyTo + "]";
    }

    /**
     * Builds a new {@link ReposPullsPullNumberCommentsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPullsPullNumberCommentsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body, commitId, path, line)
                .position(getPosition())
                .side(getSide())
                .startLine(getStartLine())
                .startSide(getStartSide())
                .inReplyTo(getInReplyTo());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPullsPullNumberCommentsRequest}.
     */
    public static class Builder {
        private String body;
        private String commitId;
        private String path;
        private int line;
        private Integer position;
        private Side7Enum side;
        private Integer startLine;
        private StartSide7Enum startSide;
        private Integer inReplyTo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  body  String value for body.
         * @param  commitId  String value for commitId.
         * @param  path  String value for path.
         * @param  line  int value for line.
         */
        public Builder(String body, String commitId, String path, int line) {
            this.body = body;
            this.commitId = commitId;
            this.path = path;
            this.line = line;
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
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for line.
         * @param  line  int value for line.
         * @return Builder
         */
        public Builder line(int line) {
            this.line = line;
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
         * Setter for side.
         * @param  side  Side7Enum value for side.
         * @return Builder
         */
        public Builder side(Side7Enum side) {
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
         * @param  startSide  StartSide7Enum value for startSide.
         * @return Builder
         */
        public Builder startSide(StartSide7Enum startSide) {
            this.startSide = startSide;
            return this;
        }

        /**
         * Setter for inReplyTo.
         * @param  inReplyTo  Integer value for inReplyTo.
         * @return Builder
         */
        public Builder inReplyTo(Integer inReplyTo) {
            this.inReplyTo = inReplyTo;
            return this;
        }

        /**
         * Builds a new {@link ReposPullsPullNumberCommentsRequest} object using the set fields.
         * @return {@link ReposPullsPullNumberCommentsRequest}
         */
        public ReposPullsPullNumberCommentsRequest build() {
            return new ReposPullsPullNumberCommentsRequest(body, commitId, path, line, position,
                    side, startLine, startSide, inReplyTo);
        }
    }
}
