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
import java.util.List;

/**
 * This is a model class for BypassPullRequestAllowances2 type.
 */
public class BypassPullRequestAllowances2 {
    private List<String> users;
    private List<String> teams;
    private List<String> apps;

    /**
     * Default constructor.
     */
    public BypassPullRequestAllowances2() {
    }

    /**
     * Initialization constructor.
     * @param  users  List of String value for users.
     * @param  teams  List of String value for teams.
     * @param  apps  List of String value for apps.
     */
    public BypassPullRequestAllowances2(
            List<String> users,
            List<String> teams,
            List<String> apps) {
        this.users = users;
        this.teams = teams;
        this.apps = apps;
    }

    /**
     * Getter for Users.
     * The list of user `login`s allowed to bypass pull request requirements.
     * @return Returns the List of String
     */
    @JsonGetter("users")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getUsers() {
        return users;
    }

    /**
     * Setter for Users.
     * The list of user `login`s allowed to bypass pull request requirements.
     * @param users Value for List of String
     */
    @JsonSetter("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    /**
     * Getter for Teams.
     * The list of team `slug`s allowed to bypass pull request requirements.
     * @return Returns the List of String
     */
    @JsonGetter("teams")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getTeams() {
        return teams;
    }

    /**
     * Setter for Teams.
     * The list of team `slug`s allowed to bypass pull request requirements.
     * @param teams Value for List of String
     */
    @JsonSetter("teams")
    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    /**
     * Getter for Apps.
     * The list of app `slug`s allowed to bypass pull request requirements.
     * @return Returns the List of String
     */
    @JsonGetter("apps")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getApps() {
        return apps;
    }

    /**
     * Setter for Apps.
     * The list of app `slug`s allowed to bypass pull request requirements.
     * @param apps Value for List of String
     */
    @JsonSetter("apps")
    public void setApps(List<String> apps) {
        this.apps = apps;
    }

    /**
     * Converts this BypassPullRequestAllowances2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BypassPullRequestAllowances2 [" + "users=" + users + ", teams=" + teams + ", apps="
                + apps + "]";
    }

    /**
     * Builds a new {@link BypassPullRequestAllowances2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BypassPullRequestAllowances2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .users(getUsers())
                .teams(getTeams())
                .apps(getApps());
        return builder;
    }

    /**
     * Class to build instances of {@link BypassPullRequestAllowances2}.
     */
    public static class Builder {
        private List<String> users;
        private List<String> teams;
        private List<String> apps;



        /**
         * Setter for users.
         * @param  users  List of String value for users.
         * @return Builder
         */
        public Builder users(List<String> users) {
            this.users = users;
            return this;
        }

        /**
         * Setter for teams.
         * @param  teams  List of String value for teams.
         * @return Builder
         */
        public Builder teams(List<String> teams) {
            this.teams = teams;
            return this;
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
         * Builds a new {@link BypassPullRequestAllowances2} object using the set fields.
         * @return {@link BypassPullRequestAllowances2}
         */
        public BypassPullRequestAllowances2 build() {
            return new BypassPullRequestAllowances2(users, teams, apps);
        }
    }
}
