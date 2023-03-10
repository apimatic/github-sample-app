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
 * This is a model class for AutoTriggerCheck1 type.
 */
public class AutoTriggerCheck1 {
    private int appId;
    private boolean setting;

    /**
     * Default constructor.
     */
    public AutoTriggerCheck1() {
    }

    /**
     * Initialization constructor.
     * @param  appId  int value for appId.
     * @param  setting  boolean value for setting.
     */
    public AutoTriggerCheck1(
            int appId,
            boolean setting) {
        this.appId = appId;
        this.setting = setting;
    }

    /**
     * Getter for AppId.
     * The `id` of the GitHub App.
     * @return Returns the int
     */
    @JsonGetter("app_id")
    public int getAppId() {
        return appId;
    }

    /**
     * Setter for AppId.
     * The `id` of the GitHub App.
     * @param appId Value for int
     */
    @JsonSetter("app_id")
    public void setAppId(int appId) {
        this.appId = appId;
    }

    /**
     * Getter for Setting.
     * Set to `true` to enable automatic creation of CheckSuite events upon pushes to the
     * repository, or `false` to disable them.
     * @return Returns the boolean
     */
    @JsonGetter("setting")
    public boolean getSetting() {
        return setting;
    }

    /**
     * Setter for Setting.
     * Set to `true` to enable automatic creation of CheckSuite events upon pushes to the
     * repository, or `false` to disable them.
     * @param setting Value for boolean
     */
    @JsonSetter("setting")
    public void setSetting(boolean setting) {
        this.setting = setting;
    }

    /**
     * Converts this AutoTriggerCheck1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutoTriggerCheck1 [" + "appId=" + appId + ", setting=" + setting + "]";
    }

    /**
     * Builds a new {@link AutoTriggerCheck1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AutoTriggerCheck1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(appId, setting);
        return builder;
    }

    /**
     * Class to build instances of {@link AutoTriggerCheck1}.
     */
    public static class Builder {
        private int appId;
        private boolean setting;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  appId  int value for appId.
         * @param  setting  boolean value for setting.
         */
        public Builder(int appId, boolean setting) {
            this.appId = appId;
            this.setting = setting;
        }

        /**
         * Setter for appId.
         * @param  appId  int value for appId.
         * @return Builder
         */
        public Builder appId(int appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Setter for setting.
         * @param  setting  boolean value for setting.
         * @return Builder
         */
        public Builder setting(boolean setting) {
            this.setting = setting;
            return this;
        }

        /**
         * Builds a new {@link AutoTriggerCheck1} object using the set fields.
         * @return {@link AutoTriggerCheck1}
         */
        public AutoTriggerCheck1 build() {
            return new AutoTriggerCheck1(appId, setting);
        }
    }
}
