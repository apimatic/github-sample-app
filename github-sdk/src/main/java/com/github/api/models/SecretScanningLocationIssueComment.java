/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SecretScanningLocationIssueComment type.
 */
public class SecretScanningLocationIssueComment {
    private String issueCommentUrl;

    /**
     * Default constructor.
     */
    public SecretScanningLocationIssueComment() {
    }

    /**
     * Initialization constructor.
     * @param  issueCommentUrl  String value for issueCommentUrl.
     */
    @JsonCreator
    public SecretScanningLocationIssueComment(
            @JsonProperty("issue_comment_url") String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     * Getter for IssueCommentUrl.
     * The API URL to get the issue comment where the secret was detected.
     * @return Returns the String
     */
    @JsonGetter("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     * Setter for IssueCommentUrl.
     * The API URL to get the issue comment where the secret was detected.
     * @param issueCommentUrl Value for String
     */
    @JsonSetter("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     * Converts this SecretScanningLocationIssueComment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecretScanningLocationIssueComment [" + "issueCommentUrl=" + issueCommentUrl + "]";
    }

    /**
     * Builds a new {@link SecretScanningLocationIssueComment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecretScanningLocationIssueComment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(issueCommentUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link SecretScanningLocationIssueComment}.
     */
    public static class Builder {
        private String issueCommentUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  issueCommentUrl  String value for issueCommentUrl.
         */
        public Builder(String issueCommentUrl) {
            this.issueCommentUrl = issueCommentUrl;
        }

        /**
         * Setter for issueCommentUrl.
         * @param  issueCommentUrl  String value for issueCommentUrl.
         * @return Builder
         */
        public Builder issueCommentUrl(String issueCommentUrl) {
            this.issueCommentUrl = issueCommentUrl;
            return this;
        }

        /**
         * Builds a new {@link SecretScanningLocationIssueComment} object using the set fields.
         * @return {@link SecretScanningLocationIssueComment}
         */
        public SecretScanningLocationIssueComment build() {
            return new SecretScanningLocationIssueComment(issueCommentUrl);
        }
    }
}