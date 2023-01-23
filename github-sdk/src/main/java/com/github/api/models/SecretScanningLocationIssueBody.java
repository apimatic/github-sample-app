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
 * This is a model class for SecretScanningLocationIssueBody type.
 */
public class SecretScanningLocationIssueBody {
    private String issueBodyUrl;

    /**
     * Default constructor.
     */
    public SecretScanningLocationIssueBody() {
    }

    /**
     * Initialization constructor.
     * @param  issueBodyUrl  String value for issueBodyUrl.
     */
    @JsonCreator
    public SecretScanningLocationIssueBody(
            @JsonProperty("issue_body_url") String issueBodyUrl) {
        this.issueBodyUrl = issueBodyUrl;
    }

    /**
     * Getter for IssueBodyUrl.
     * The API URL to get the issue where the secret was detected.
     * @return Returns the String
     */
    @JsonGetter("issue_body_url")
    public String getIssueBodyUrl() {
        return issueBodyUrl;
    }

    /**
     * Setter for IssueBodyUrl.
     * The API URL to get the issue where the secret was detected.
     * @param issueBodyUrl Value for String
     */
    @JsonSetter("issue_body_url")
    public void setIssueBodyUrl(String issueBodyUrl) {
        this.issueBodyUrl = issueBodyUrl;
    }

    /**
     * Converts this SecretScanningLocationIssueBody into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecretScanningLocationIssueBody [" + "issueBodyUrl=" + issueBodyUrl + "]";
    }

    /**
     * Builds a new {@link SecretScanningLocationIssueBody.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecretScanningLocationIssueBody.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(issueBodyUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link SecretScanningLocationIssueBody}.
     */
    public static class Builder {
        private String issueBodyUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  issueBodyUrl  String value for issueBodyUrl.
         */
        public Builder(String issueBodyUrl) {
            this.issueBodyUrl = issueBodyUrl;
        }

        /**
         * Setter for issueBodyUrl.
         * @param  issueBodyUrl  String value for issueBodyUrl.
         * @return Builder
         */
        public Builder issueBodyUrl(String issueBodyUrl) {
            this.issueBodyUrl = issueBodyUrl;
            return this;
        }

        /**
         * Builds a new {@link SecretScanningLocationIssueBody} object using the set fields.
         * @return {@link SecretScanningLocationIssueBody}
         */
        public SecretScanningLocationIssueBody build() {
            return new SecretScanningLocationIssueBody(issueBodyUrl);
        }
    }
}