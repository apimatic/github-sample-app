/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for Thread2 type.
 */
public class Thread2 {
    private List<PullRequestReviewComment3> comments;
    private String nodeId;

    /**
     * Default constructor.
     */
    public Thread2() {
    }

    /**
     * Initialization constructor.
     * @param  comments  List of PullRequestReviewComment3 value for comments.
     * @param  nodeId  String value for nodeId.
     */
    public Thread2(
            List<PullRequestReviewComment3> comments,
            String nodeId) {
        this.comments = comments;
        this.nodeId = nodeId;
    }

    /**
     * Getter for Comments.
     * @return Returns the List of PullRequestReviewComment3
     */
    @JsonGetter("comments")
    public List<PullRequestReviewComment3> getComments() {
        return comments;
    }

    /**
     * Setter for Comments.
     * @param comments Value for List of PullRequestReviewComment3
     */
    @JsonSetter("comments")
    public void setComments(List<PullRequestReviewComment3> comments) {
        this.comments = comments;
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
     * Converts this Thread2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Thread2 [" + "comments=" + comments + ", nodeId=" + nodeId + "]";
    }

    /**
     * Builds a new {@link Thread2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Thread2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(comments, nodeId);
        return builder;
    }

    /**
     * Class to build instances of {@link Thread2}.
     */
    public static class Builder {
        private List<PullRequestReviewComment3> comments;
        private String nodeId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  comments  List of PullRequestReviewComment3 value for comments.
         * @param  nodeId  String value for nodeId.
         */
        public Builder(List<PullRequestReviewComment3> comments, String nodeId) {
            this.comments = comments;
            this.nodeId = nodeId;
        }

        /**
         * Setter for comments.
         * @param  comments  List of PullRequestReviewComment3 value for comments.
         * @return Builder
         */
        public Builder comments(List<PullRequestReviewComment3> comments) {
            this.comments = comments;
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
         * Builds a new {@link Thread2} object using the set fields.
         * @return {@link Thread2}
         */
        public Thread2 build() {
            return new Thread2(comments, nodeId);
        }
    }
}
