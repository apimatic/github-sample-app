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
 * This is a model class for Links9 type.
 */
public class Links9 {
    private String self;
    private String git;
    private String html;

    /**
     * Default constructor.
     */
    public Links9() {
    }

    /**
     * Initialization constructor.
     * @param  self  String value for self.
     * @param  git  String value for git.
     * @param  html  String value for html.
     */
    public Links9(
            String self,
            String git,
            String html) {
        this.self = self;
        this.git = git;
        this.html = html;
    }

    /**
     * Getter for Self.
     * @return Returns the String
     */
    @JsonGetter("self")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSelf() {
        return self;
    }

    /**
     * Setter for Self.
     * @param self Value for String
     */
    @JsonSetter("self")
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * Getter for Git.
     * @return Returns the String
     */
    @JsonGetter("git")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGit() {
        return git;
    }

    /**
     * Setter for Git.
     * @param git Value for String
     */
    @JsonSetter("git")
    public void setGit(String git) {
        this.git = git;
    }

    /**
     * Getter for Html.
     * @return Returns the String
     */
    @JsonGetter("html")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHtml() {
        return html;
    }

    /**
     * Setter for Html.
     * @param html Value for String
     */
    @JsonSetter("html")
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * Converts this Links9 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Links9 [" + "self=" + self + ", git=" + git + ", html=" + html + "]";
    }

    /**
     * Builds a new {@link Links9.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Links9.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .self(getSelf())
                .git(getGit())
                .html(getHtml());
        return builder;
    }

    /**
     * Class to build instances of {@link Links9}.
     */
    public static class Builder {
        private String self;
        private String git;
        private String html;



        /**
         * Setter for self.
         * @param  self  String value for self.
         * @return Builder
         */
        public Builder self(String self) {
            this.self = self;
            return this;
        }

        /**
         * Setter for git.
         * @param  git  String value for git.
         * @return Builder
         */
        public Builder git(String git) {
            this.git = git;
            return this;
        }

        /**
         * Setter for html.
         * @param  html  String value for html.
         * @return Builder
         */
        public Builder html(String html) {
            this.html = html;
            return this;
        }

        /**
         * Builds a new {@link Links9} object using the set fields.
         * @return {@link Links9}
         */
        public Links9 build() {
            return new Links9(self, git, html);
        }
    }
}
