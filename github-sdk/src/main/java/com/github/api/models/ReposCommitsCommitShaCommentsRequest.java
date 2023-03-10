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
 * This is a model class for ReposCommitsCommitShaCommentsRequest type.
 */
public class ReposCommitsCommitShaCommentsRequest {
    private String body;
    private String path;
    private Integer position;
    private Integer line;

    /**
     * Default constructor.
     */
    public ReposCommitsCommitShaCommentsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  body  String value for body.
     * @param  path  String value for path.
     * @param  position  Integer value for position.
     * @param  line  Integer value for line.
     */
    public ReposCommitsCommitShaCommentsRequest(
            String body,
            String path,
            Integer position,
            Integer line) {
        this.body = body;
        this.path = path;
        this.position = position;
        this.line = line;
    }

    /**
     * Getter for Body.
     * The contents of the comment.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The contents of the comment.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for Path.
     * Relative path of the file to comment on.
     * @return Returns the String
     */
    @JsonGetter("path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * Relative path of the file to comment on.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Position.
     * Line index in the diff to comment on.
     * @return Returns the Integer
     */
    @JsonGetter("position")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPosition() {
        return position;
    }

    /**
     * Setter for Position.
     * Line index in the diff to comment on.
     * @param position Value for Integer
     */
    @JsonSetter("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Getter for Line.
     * **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
     * @return Returns the Integer
     */
    @JsonGetter("line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLine() {
        return line;
    }

    /**
     * Setter for Line.
     * **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
     * @param line Value for Integer
     */
    @JsonSetter("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Converts this ReposCommitsCommitShaCommentsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCommitsCommitShaCommentsRequest [" + "body=" + body + ", path=" + path
                + ", position=" + position + ", line=" + line + "]";
    }

    /**
     * Builds a new {@link ReposCommitsCommitShaCommentsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCommitsCommitShaCommentsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body)
                .path(getPath())
                .position(getPosition())
                .line(getLine());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCommitsCommitShaCommentsRequest}.
     */
    public static class Builder {
        private String body;
        private String path;
        private Integer position;
        private Integer line;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  body  String value for body.
         */
        public Builder(String body) {
            this.body = body;
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
         * Setter for line.
         * @param  line  Integer value for line.
         * @return Builder
         */
        public Builder line(Integer line) {
            this.line = line;
            return this;
        }

        /**
         * Builds a new {@link ReposCommitsCommitShaCommentsRequest} object using the set fields.
         * @return {@link ReposCommitsCommitShaCommentsRequest}
         */
        public ReposCommitsCommitShaCommentsRequest build() {
            return new ReposCommitsCommitShaCommentsRequest(body, path, position, line);
        }
    }
}
