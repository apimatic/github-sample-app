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
 * This is a model class for ReposActionsPermissionsRequest type.
 */
public class ReposActionsPermissionsRequest {
    private boolean enabled;
    private AllowedActionsEnum allowedActions;

    /**
     * Default constructor.
     */
    public ReposActionsPermissionsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  boolean value for enabled.
     * @param  allowedActions  AllowedActionsEnum value for allowedActions.
     */
    public ReposActionsPermissionsRequest(
            boolean enabled,
            AllowedActionsEnum allowedActions) {
        this.enabled = enabled;
        this.allowedActions = allowedActions;
    }

    /**
     * Getter for Enabled.
     * Whether GitHub Actions is enabled on the repository.
     * @return Returns the boolean
     */
    @JsonGetter("enabled")
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether GitHub Actions is enabled on the repository.
     * @param enabled Value for boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for AllowedActions.
     * @return Returns the AllowedActionsEnum
     */
    @JsonGetter("allowed_actions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowedActionsEnum getAllowedActions() {
        return allowedActions;
    }

    /**
     * Setter for AllowedActions.
     * @param allowedActions Value for AllowedActionsEnum
     */
    @JsonSetter("allowed_actions")
    public void setAllowedActions(AllowedActionsEnum allowedActions) {
        this.allowedActions = allowedActions;
    }

    /**
     * Converts this ReposActionsPermissionsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsPermissionsRequest [" + "enabled=" + enabled + ", allowedActions="
                + allowedActions + "]";
    }

    /**
     * Builds a new {@link ReposActionsPermissionsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsPermissionsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(enabled)
                .allowedActions(getAllowedActions());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsPermissionsRequest}.
     */
    public static class Builder {
        private boolean enabled;
        private AllowedActionsEnum allowedActions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  enabled  boolean value for enabled.
         */
        public Builder(boolean enabled) {
            this.enabled = enabled;
        }

        /**
         * Setter for enabled.
         * @param  enabled  boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for allowedActions.
         * @param  allowedActions  AllowedActionsEnum value for allowedActions.
         * @return Builder
         */
        public Builder allowedActions(AllowedActionsEnum allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }

        /**
         * Builds a new {@link ReposActionsPermissionsRequest} object using the set fields.
         * @return {@link ReposActionsPermissionsRequest}
         */
        public ReposActionsPermissionsRequest build() {
            return new ReposActionsPermissionsRequest(enabled, allowedActions);
        }
    }
}
