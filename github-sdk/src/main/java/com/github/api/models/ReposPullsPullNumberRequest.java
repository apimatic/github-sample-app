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
 * This is a model class for ReposPullsPullNumberRequest type.
 */
public class ReposPullsPullNumberRequest {
    private String title;
    private String body;
    private State13Enum state;
    private String base;
    private Boolean maintainerCanModify;

    /**
     * Default constructor.
     */
    public ReposPullsPullNumberRequest() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  body  String value for body.
     * @param  state  State13Enum value for state.
     * @param  base  String value for base.
     * @param  maintainerCanModify  Boolean value for maintainerCanModify.
     */
    public ReposPullsPullNumberRequest(
            String title,
            String body,
            State13Enum state,
            String base,
            Boolean maintainerCanModify) {
        this.title = title;
        this.body = body;
        this.state = state;
        this.base = base;
        this.maintainerCanModify = maintainerCanModify;
    }

    /**
     * Getter for Title.
     * The title of the pull request.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * The title of the pull request.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Body.
     * The contents of the pull request.
     * @return Returns the String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The contents of the pull request.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for State.
     * @return Returns the State13Enum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public State13Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State13Enum
     */
    @JsonSetter("state")
    public void setState(State13Enum state) {
        this.state = state;
    }

    /**
     * Getter for Base.
     * The name of the branch you want your changes pulled into. This should be an existing branch
     * on the current repository. You cannot update the base branch on a pull request to point to
     * another repository.
     * @return Returns the String
     */
    @JsonGetter("base")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBase() {
        return base;
    }

    /**
     * Setter for Base.
     * The name of the branch you want your changes pulled into. This should be an existing branch
     * on the current repository. You cannot update the base branch on a pull request to point to
     * another repository.
     * @param base Value for String
     */
    @JsonSetter("base")
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * Getter for MaintainerCanModify.
     * Indicates whether [maintainers can
     * modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/)
     * the pull request.
     * @return Returns the Boolean
     */
    @JsonGetter("maintainer_can_modify")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    /**
     * Setter for MaintainerCanModify.
     * Indicates whether [maintainers can
     * modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/)
     * the pull request.
     * @param maintainerCanModify Value for Boolean
     */
    @JsonSetter("maintainer_can_modify")
    public void setMaintainerCanModify(Boolean maintainerCanModify) {
        this.maintainerCanModify = maintainerCanModify;
    }

    /**
     * Converts this ReposPullsPullNumberRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPullsPullNumberRequest [" + "title=" + title + ", body=" + body + ", state="
                + state + ", base=" + base + ", maintainerCanModify=" + maintainerCanModify + "]";
    }

    /**
     * Builds a new {@link ReposPullsPullNumberRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPullsPullNumberRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .title(getTitle())
                .body(getBody())
                .state(getState())
                .base(getBase())
                .maintainerCanModify(getMaintainerCanModify());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPullsPullNumberRequest}.
     */
    public static class Builder {
        private String title;
        private String body;
        private State13Enum state;
        private String base;
        private Boolean maintainerCanModify;



        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
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
         * Setter for state.
         * @param  state  State13Enum value for state.
         * @return Builder
         */
        public Builder state(State13Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for base.
         * @param  base  String value for base.
         * @return Builder
         */
        public Builder base(String base) {
            this.base = base;
            return this;
        }

        /**
         * Setter for maintainerCanModify.
         * @param  maintainerCanModify  Boolean value for maintainerCanModify.
         * @return Builder
         */
        public Builder maintainerCanModify(Boolean maintainerCanModify) {
            this.maintainerCanModify = maintainerCanModify;
            return this;
        }

        /**
         * Builds a new {@link ReposPullsPullNumberRequest} object using the set fields.
         * @return {@link ReposPullsPullNumberRequest}
         */
        public ReposPullsPullNumberRequest build() {
            return new ReposPullsPullNumberRequest(title, body, state, base, maintainerCanModify);
        }
    }
}