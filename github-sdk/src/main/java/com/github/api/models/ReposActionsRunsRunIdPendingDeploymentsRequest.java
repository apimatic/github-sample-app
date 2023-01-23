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
 * This is a model class for ReposActionsRunsRunIdPendingDeploymentsRequest type.
 */
public class ReposActionsRunsRunIdPendingDeploymentsRequest {
    private List<Integer> environmentIds;
    private State171Enum state;
    private String comment;

    /**
     * Default constructor.
     */
    public ReposActionsRunsRunIdPendingDeploymentsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  environmentIds  List of Integer value for environmentIds.
     * @param  state  State171Enum value for state.
     * @param  comment  String value for comment.
     */
    public ReposActionsRunsRunIdPendingDeploymentsRequest(
            List<Integer> environmentIds,
            State171Enum state,
            String comment) {
        this.environmentIds = environmentIds;
        this.state = state;
        this.comment = comment;
    }

    /**
     * Getter for EnvironmentIds.
     * The list of environment ids to approve or reject
     * @return Returns the List of Integer
     */
    @JsonGetter("environment_ids")
    public List<Integer> getEnvironmentIds() {
        return environmentIds;
    }

    /**
     * Setter for EnvironmentIds.
     * The list of environment ids to approve or reject
     * @param environmentIds Value for List of Integer
     */
    @JsonSetter("environment_ids")
    public void setEnvironmentIds(List<Integer> environmentIds) {
        this.environmentIds = environmentIds;
    }

    /**
     * Getter for State.
     * @return Returns the State171Enum
     */
    @JsonGetter("state")
    public State171Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State171Enum
     */
    @JsonSetter("state")
    public void setState(State171Enum state) {
        this.state = state;
    }

    /**
     * Getter for Comment.
     * A comment to accompany the deployment review
     * @return Returns the String
     */
    @JsonGetter("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Setter for Comment.
     * A comment to accompany the deployment review
     * @param comment Value for String
     */
    @JsonSetter("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Converts this ReposActionsRunsRunIdPendingDeploymentsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsRunsRunIdPendingDeploymentsRequest [" + "environmentIds="
                + environmentIds + ", state=" + state + ", comment=" + comment + "]";
    }

    /**
     * Builds a new {@link ReposActionsRunsRunIdPendingDeploymentsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsRunsRunIdPendingDeploymentsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(environmentIds, state, comment);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsRunsRunIdPendingDeploymentsRequest}.
     */
    public static class Builder {
        private List<Integer> environmentIds;
        private State171Enum state;
        private String comment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  environmentIds  List of Integer value for environmentIds.
         * @param  state  State171Enum value for state.
         * @param  comment  String value for comment.
         */
        public Builder(List<Integer> environmentIds, State171Enum state, String comment) {
            this.environmentIds = environmentIds;
            this.state = state;
            this.comment = comment;
        }

        /**
         * Setter for environmentIds.
         * @param  environmentIds  List of Integer value for environmentIds.
         * @return Builder
         */
        public Builder environmentIds(List<Integer> environmentIds) {
            this.environmentIds = environmentIds;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State171Enum value for state.
         * @return Builder
         */
        public Builder state(State171Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for comment.
         * @param  comment  String value for comment.
         * @return Builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Builds a new {@link ReposActionsRunsRunIdPendingDeploymentsRequest} object using the set
         * fields.
         * @return {@link ReposActionsRunsRunIdPendingDeploymentsRequest}
         */
        public ReposActionsRunsRunIdPendingDeploymentsRequest build() {
            return new ReposActionsRunsRunIdPendingDeploymentsRequest(environmentIds, state,
                    comment);
        }
    }
}
