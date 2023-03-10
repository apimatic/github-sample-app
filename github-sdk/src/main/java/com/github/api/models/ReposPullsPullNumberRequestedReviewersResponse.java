/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ReposPullsPullNumberRequestedReviewersResponse type.
 */
public class ReposPullsPullNumberRequestedReviewersResponse {
    private List<SimpleUser> users;
    private List<Team> teams;

    /**
     * Default constructor.
     */
    public ReposPullsPullNumberRequestedReviewersResponse() {
    }

    /**
     * Initialization constructor.
     * @param  users  List of SimpleUser value for users.
     * @param  teams  List of Team value for teams.
     */
    public ReposPullsPullNumberRequestedReviewersResponse(
            List<SimpleUser> users,
            List<Team> teams) {
        this.users = users;
        this.teams = teams;
    }

    /**
     * Getter for Users.
     * @return Returns the List of SimpleUser
     */
    @JsonGetter("users")
    public List<SimpleUser> getUsers() {
        return users;
    }

    /**
     * Setter for Users.
     * @param users Value for List of SimpleUser
     */
    @JsonSetter("users")
    public void setUsers(List<SimpleUser> users) {
        this.users = users;
    }

    /**
     * Getter for Teams.
     * @return Returns the List of Team
     */
    @JsonGetter("teams")
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Setter for Teams.
     * @param teams Value for List of Team
     */
    @JsonSetter("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    /**
     * Converts this ReposPullsPullNumberRequestedReviewersResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPullsPullNumberRequestedReviewersResponse [" + "users=" + users + ", teams="
                + teams + "]";
    }

    /**
     * Builds a new {@link ReposPullsPullNumberRequestedReviewersResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPullsPullNumberRequestedReviewersResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(users, teams);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPullsPullNumberRequestedReviewersResponse}.
     */
    public static class Builder {
        private List<SimpleUser> users;
        private List<Team> teams;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  users  List of SimpleUser value for users.
         * @param  teams  List of Team value for teams.
         */
        public Builder(List<SimpleUser> users, List<Team> teams) {
            this.users = users;
            this.teams = teams;
        }

        /**
         * Setter for users.
         * @param  users  List of SimpleUser value for users.
         * @return Builder
         */
        public Builder users(List<SimpleUser> users) {
            this.users = users;
            return this;
        }

        /**
         * Setter for teams.
         * @param  teams  List of Team value for teams.
         * @return Builder
         */
        public Builder teams(List<Team> teams) {
            this.teams = teams;
            return this;
        }

        /**
         * Builds a new {@link ReposPullsPullNumberRequestedReviewersResponse} object using the set
         * fields.
         * @return {@link ReposPullsPullNumberRequestedReviewersResponse}
         */
        public ReposPullsPullNumberRequestedReviewersResponse build() {
            return new ReposPullsPullNumberRequestedReviewersResponse(users, teams);
        }
    }
}
