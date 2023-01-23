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
import java.util.List;

/**
 * This is a model class for ReposBranchesBranchProtectionRestrictionsAppsRequest type.
 */
public class ReposBranchesBranchProtectionRestrictionsAppsRequest {
    private List<String> apps;

    /**
     * Default constructor.
     */
    public ReposBranchesBranchProtectionRestrictionsAppsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  apps  List of String value for apps.
     */
    @JsonCreator
    public ReposBranchesBranchProtectionRestrictionsAppsRequest(
            @JsonProperty("apps") List<String> apps) {
        this.apps = apps;
    }

    /**
     * Getter for Apps.
     * The GitHub Apps that have push access to this branch. Use the slugified version of the app
     * name. **Note**: The list of users, apps, and teams in total is limited to 100 items.
     * @return Returns the List of String
     */
    @JsonGetter("apps")
    public List<String> getApps() {
        return apps;
    }

    /**
     * Setter for Apps.
     * The GitHub Apps that have push access to this branch. Use the slugified version of the app
     * name. **Note**: The list of users, apps, and teams in total is limited to 100 items.
     * @param apps Value for List of String
     */
    @JsonSetter("apps")
    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    /**
     * Converts this ReposBranchesBranchProtectionRestrictionsAppsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposBranchesBranchProtectionRestrictionsAppsRequest [" + "apps=" + apps + "]";
    }

    /**
     * Builds a new {@link ReposBranchesBranchProtectionRestrictionsAppsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposBranchesBranchProtectionRestrictionsAppsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(apps);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposBranchesBranchProtectionRestrictionsAppsRequest}.
     */
    public static class Builder {
        private List<String> apps;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  apps  List of String value for apps.
         */
        public Builder(List<String> apps) {
            this.apps = apps;
        }

        /**
         * Setter for apps.
         * @param  apps  List of String value for apps.
         * @return Builder
         */
        public Builder apps(List<String> apps) {
            this.apps = apps;
            return this;
        }

        /**
         * Builds a new {@link ReposBranchesBranchProtectionRestrictionsAppsRequest} object using
         * the set fields.
         * @return {@link ReposBranchesBranchProtectionRestrictionsAppsRequest}
         */
        public ReposBranchesBranchProtectionRestrictionsAppsRequest build() {
            return new ReposBranchesBranchProtectionRestrictionsAppsRequest(apps);
        }
    }
}
