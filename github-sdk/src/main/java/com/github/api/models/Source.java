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
 * This is a model class for Source type.
 */
public class Source {
    private String type;
    private Issue1 issue;

    /**
     * Default constructor.
     */
    public Source() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  issue  Issue1 value for issue.
     */
    public Source(
            String type,
            Issue1 issue) {
        this.type = type;
        this.issue = issue;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Issue.
     * @return Returns the Issue1
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Issue1 getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for Issue1
     */
    @JsonSetter("issue")
    public void setIssue(Issue1 issue) {
        this.issue = issue;
    }

    /**
     * Converts this Source into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Source [" + "type=" + type + ", issue=" + issue + "]";
    }

    /**
     * Builds a new {@link Source.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Source.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .issue(getIssue());
        return builder;
    }

    /**
     * Class to build instances of {@link Source}.
     */
    public static class Builder {
        private String type;
        private Issue1 issue;



        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for issue.
         * @param  issue  Issue1 value for issue.
         * @return Builder
         */
        public Builder issue(Issue1 issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Builds a new {@link Source} object using the set fields.
         * @return {@link Source}
         */
        public Source build() {
            return new Source(type, issue);
        }
    }
}