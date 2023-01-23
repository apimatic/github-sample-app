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
 * This is a model class for Checks30 type.
 */
public class Checks30 {
    private String context;
    private Integer appId;

    /**
     * Default constructor.
     */
    public Checks30() {
    }

    /**
     * Initialization constructor.
     * @param  context  String value for context.
     * @param  appId  Integer value for appId.
     */
    public Checks30(
            String context,
            Integer appId) {
        this.context = context;
        this.appId = appId;
    }

    /**
     * Getter for Context.
     * The name of the required check
     * @return Returns the String
     */
    @JsonGetter("context")
    public String getContext() {
        return context;
    }

    /**
     * Setter for Context.
     * The name of the required check
     * @param context Value for String
     */
    @JsonSetter("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Getter for AppId.
     * The ID of the GitHub App that must provide this check. Omit this field to automatically
     * select the GitHub App that has recently provided this check, or any app if it was not set by
     * a GitHub App. Pass -1 to explicitly allow any app to set the status.
     * @return Returns the Integer
     */
    @JsonGetter("app_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAppId() {
        return appId;
    }

    /**
     * Setter for AppId.
     * The ID of the GitHub App that must provide this check. Omit this field to automatically
     * select the GitHub App that has recently provided this check, or any app if it was not set by
     * a GitHub App. Pass -1 to explicitly allow any app to set the status.
     * @param appId Value for Integer
     */
    @JsonSetter("app_id")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * Converts this Checks30 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Checks30 [" + "context=" + context + ", appId=" + appId + "]";
    }

    /**
     * Builds a new {@link Checks30.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Checks30.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(context)
                .appId(getAppId());
        return builder;
    }

    /**
     * Class to build instances of {@link Checks30}.
     */
    public static class Builder {
        private String context;
        private Integer appId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  context  String value for context.
         */
        public Builder(String context) {
            this.context = context;
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
         * Setter for appId.
         * @param  appId  Integer value for appId.
         * @return Builder
         */
        public Builder appId(Integer appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Builds a new {@link Checks30} object using the set fields.
         * @return {@link Checks30}
         */
        public Checks30 build() {
            return new Checks30(context, appId);
        }
    }
}
