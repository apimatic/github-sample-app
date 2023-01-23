/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ReposStatusesShaRequest type.
 */
public class ReposStatusesShaRequest {
    private State182Enum state;
    private OptionalNullable<String> targetUrl;
    private OptionalNullable<String> description;
    private String context;

    /**
     * Default constructor.
     */
    public ReposStatusesShaRequest() {
        context = "default";
    }

    /**
     * Initialization constructor.
     * @param  state  State182Enum value for state.
     * @param  targetUrl  String value for targetUrl.
     * @param  description  String value for description.
     * @param  context  String value for context.
     */
    public ReposStatusesShaRequest(
            State182Enum state,
            String targetUrl,
            String description,
            String context) {
        this.state = state;
        this.targetUrl = OptionalNullable.of(targetUrl);
        this.description = OptionalNullable.of(description);
        this.context = context;
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposStatusesShaRequest(State182Enum state, OptionalNullable<String> targetUrl,
            OptionalNullable<String> description, String context) {
        this.state = state;
        this.targetUrl = targetUrl;
        this.description = description;
        this.context = context;
    }

    /**
     * Getter for State.
     * @return Returns the State182Enum
     */
    @JsonGetter("state")
    public State182Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State182Enum
     */
    @JsonSetter("state")
    public void setState(State182Enum state) {
        this.state = state;
    }

    /**
     * Internal Getter for TargetUrl.
     * The target URL to associate with this status. This URL will be linked from the GitHub UI to
     * allow users to easily see the source of the status. For example, if your continuous
     * integration system is posting build status, you would want to provide the deep link for the
     * build output for this specific SHA: `http://ci.example.com/user/repo/build/sha`
     * @return Returns the Internal String
     */
    @JsonGetter("target_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTargetUrl() {
        return this.targetUrl;
    }

    /**
     * Getter for TargetUrl.
     * The target URL to associate with this status. This URL will be linked from the GitHub UI to
     * allow users to easily see the source of the status. For example, if your continuous
     * integration system is posting build status, you would want to provide the deep link for the
     * build output for this specific SHA: `http://ci.example.com/user/repo/build/sha`
     * @return Returns the String
     */
    public String getTargetUrl() {
        return OptionalNullable.getFrom(targetUrl);
    }

    /**
     * Setter for TargetUrl.
     * The target URL to associate with this status. This URL will be linked from the GitHub UI to
     * allow users to easily see the source of the status. For example, if your continuous
     * integration system is posting build status, you would want to provide the deep link for the
     * build output for this specific SHA: `http://ci.example.com/user/repo/build/sha`
     * @param targetUrl Value for String
     */
    @JsonSetter("target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = OptionalNullable.of(targetUrl);
    }

    /**
     * UnSetter for TargetUrl.
     * The target URL to associate with this status. This URL will be linked from the GitHub UI to
     * allow users to easily see the source of the status. For example, if your continuous
     * integration system is posting build status, you would want to provide the deep link for the
     * build output for this specific SHA: `http://ci.example.com/user/repo/build/sha`
     */
    public void unsetTargetUrl() {
        targetUrl = null;
    }

    /**
     * Internal Getter for Description.
     * A short description of the status.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * A short description of the status.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * A short description of the status.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * A short description of the status.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Context.
     * A string label to differentiate this status from the status of other systems. This field is
     * case-insensitive.
     * @return Returns the String
     */
    @JsonGetter("context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContext() {
        return context;
    }

    /**
     * Setter for Context.
     * A string label to differentiate this status from the status of other systems. This field is
     * case-insensitive.
     * @param context Value for String
     */
    @JsonSetter("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Converts this ReposStatusesShaRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposStatusesShaRequest [" + "state=" + state + ", targetUrl=" + targetUrl
                + ", description=" + description + ", context=" + context + "]";
    }

    /**
     * Builds a new {@link ReposStatusesShaRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposStatusesShaRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state)
                .context(getContext());
        builder.targetUrl = internalGetTargetUrl();
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposStatusesShaRequest}.
     */
    public static class Builder {
        private State182Enum state;
        private OptionalNullable<String> targetUrl;
        private OptionalNullable<String> description;
        private String context = "default";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  State182Enum value for state.
         */
        public Builder(State182Enum state) {
            this.state = state;
        }

        /**
         * Setter for state.
         * @param  state  State182Enum value for state.
         * @return Builder
         */
        public Builder state(State182Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for targetUrl.
         * @param  targetUrl  String value for targetUrl.
         * @return Builder
         */
        public Builder targetUrl(String targetUrl) {
            this.targetUrl = OptionalNullable.of(targetUrl);
            return this;
        }

        /**
         * UnSetter for targetUrl.
         * @return Builder
         */
        public Builder unsetTargetUrl() {
            targetUrl = null;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for context.
         * @param  context  String value for context.
         * @return Builder
         */
        public Builder context(String context) {
            this.context = context;
            return this;
        }

        /**
         * Builds a new {@link ReposStatusesShaRequest} object using the set fields.
         * @return {@link ReposStatusesShaRequest}
         */
        public ReposStatusesShaRequest build() {
            return new ReposStatusesShaRequest(state, targetUrl, description, context);
        }
    }
}
