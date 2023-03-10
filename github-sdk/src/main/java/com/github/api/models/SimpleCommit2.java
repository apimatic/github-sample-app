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
 * This is a model class for SimpleCommit2 type.
 */
public class SimpleCommit2 {
    private Author62 author;
    private Committer4 committer;
    private String id;
    private String message;
    private String timestamp;
    private String treeId;

    /**
     * Default constructor.
     */
    public SimpleCommit2() {
    }

    /**
     * Initialization constructor.
     * @param  author  Author62 value for author.
     * @param  committer  Committer4 value for committer.
     * @param  id  String value for id.
     * @param  message  String value for message.
     * @param  timestamp  String value for timestamp.
     * @param  treeId  String value for treeId.
     */
    public SimpleCommit2(
            Author62 author,
            Committer4 committer,
            String id,
            String message,
            String timestamp,
            String treeId) {
        this.author = author;
        this.committer = committer;
        this.id = id;
        this.message = message;
        this.timestamp = timestamp;
        this.treeId = treeId;
    }

    /**
     * Getter for Author.
     * @return Returns the Author62
     */
    @JsonGetter("author")
    public Author62 getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for Author62
     */
    @JsonSetter("author")
    public void setAuthor(Author62 author) {
        this.author = author;
    }

    /**
     * Getter for Committer.
     * @return Returns the Committer4
     */
    @JsonGetter("committer")
    public Committer4 getCommitter() {
        return committer;
    }

    /**
     * Setter for Committer.
     * @param committer Value for Committer4
     */
    @JsonSetter("committer")
    public void setCommitter(Committer4 committer) {
        this.committer = committer;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the String
     */
    @JsonGetter("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for String
     */
    @JsonSetter("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for TreeId.
     * @return Returns the String
     */
    @JsonGetter("tree_id")
    public String getTreeId() {
        return treeId;
    }

    /**
     * Setter for TreeId.
     * @param treeId Value for String
     */
    @JsonSetter("tree_id")
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * Converts this SimpleCommit2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SimpleCommit2 [" + "author=" + author + ", committer=" + committer + ", id=" + id
                + ", message=" + message + ", timestamp=" + timestamp + ", treeId=" + treeId + "]";
    }

    /**
     * Builds a new {@link SimpleCommit2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SimpleCommit2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(author, committer, id, message, timestamp, treeId);
        return builder;
    }

    /**
     * Class to build instances of {@link SimpleCommit2}.
     */
    public static class Builder {
        private Author62 author;
        private Committer4 committer;
        private String id;
        private String message;
        private String timestamp;
        private String treeId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  author  Author62 value for author.
         * @param  committer  Committer4 value for committer.
         * @param  id  String value for id.
         * @param  message  String value for message.
         * @param  timestamp  String value for timestamp.
         * @param  treeId  String value for treeId.
         */
        public Builder(Author62 author, Committer4 committer, String id, String message,
                String timestamp, String treeId) {
            this.author = author;
            this.committer = committer;
            this.id = id;
            this.message = message;
            this.timestamp = timestamp;
            this.treeId = treeId;
        }

        /**
         * Setter for author.
         * @param  author  Author62 value for author.
         * @return Builder
         */
        public Builder author(Author62 author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for committer.
         * @param  committer  Committer4 value for committer.
         * @return Builder
         */
        public Builder committer(Committer4 committer) {
            this.committer = committer;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  String value for timestamp.
         * @return Builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for treeId.
         * @param  treeId  String value for treeId.
         * @return Builder
         */
        public Builder treeId(String treeId) {
            this.treeId = treeId;
            return this;
        }

        /**
         * Builds a new {@link SimpleCommit2} object using the set fields.
         * @return {@link SimpleCommit2}
         */
        public SimpleCommit2 build() {
            return new SimpleCommit2(author, committer, id, message, timestamp, treeId);
        }
    }
}
