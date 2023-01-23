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
 * This is a model class for ProtectedBranchAdminEnforced type.
 */
public class ProtectedBranchAdminEnforced {
    private String url;
    private boolean enabled;

    /**
     * Default constructor.
     */
    public ProtectedBranchAdminEnforced() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  enabled  boolean value for enabled.
     */
    public ProtectedBranchAdminEnforced(
            String url,
            boolean enabled) {
        this.url = url;
        this.enabled = enabled;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Enabled.
     * @return Returns the boolean
     */
    @JsonGetter("enabled")
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * @param enabled Value for boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Converts this ProtectedBranchAdminEnforced into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProtectedBranchAdminEnforced [" + "url=" + url + ", enabled=" + enabled + "]";
    }

    /**
     * Builds a new {@link ProtectedBranchAdminEnforced.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProtectedBranchAdminEnforced.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, enabled);
        return builder;
    }

    /**
     * Class to build instances of {@link ProtectedBranchAdminEnforced}.
     */
    public static class Builder {
        private String url;
        private boolean enabled;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  enabled  boolean value for enabled.
         */
        public Builder(String url, boolean enabled) {
            this.url = url;
            this.enabled = enabled;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
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
         * Builds a new {@link ProtectedBranchAdminEnforced} object using the set fields.
         * @return {@link ProtectedBranchAdminEnforced}
         */
        public ProtectedBranchAdminEnforced build() {
            return new ProtectedBranchAdminEnforced(url, enabled);
        }
    }
}
