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

/**
 * This is a model class for MilestonedIssueEvent type.
 */
public class MilestonedIssueEvent {
    private int id;
    private String nodeId;
    private String url;
    private Actor2 actor;
    private String event;
    private String commitId;
    private String commitUrl;
    private String createdAt;
    private Object performedViaGithubApp;
    private Milestone1 milestone;

    /**
     * Default constructor.
     */
    public MilestonedIssueEvent() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  url  String value for url.
     * @param  actor  Actor2 value for actor.
     * @param  event  String value for event.
     * @param  commitId  String value for commitId.
     * @param  commitUrl  String value for commitUrl.
     * @param  createdAt  String value for createdAt.
     * @param  performedViaGithubApp  Object value for performedViaGithubApp.
     * @param  milestone  Milestone1 value for milestone.
     */
    @JsonCreator
    public MilestonedIssueEvent(
            @JsonProperty("id") int id,
            @JsonProperty("node_id") String nodeId,
            @JsonProperty("url") String url,
            @JsonProperty("actor") Actor2 actor,
            @JsonProperty("event") String event,
            @JsonProperty("commit_id") String commitId,
            @JsonProperty("commit_url") String commitUrl,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("performed_via_github_app") Object performedViaGithubApp,
            @JsonProperty("milestone") Milestone1 milestone) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = commitId;
        this.commitUrl = commitUrl;
        this.createdAt = createdAt;
        this.performedViaGithubApp = performedViaGithubApp;
        this.milestone = milestone;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
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
     * Getter for Actor.
     * @return Returns the Actor2
     */
    @JsonGetter("actor")
    public Actor2 getActor() {
        return actor;
    }

    /**
     * Setter for Actor.
     * @param actor Value for Actor2
     */
    @JsonSetter("actor")
    public void setActor(Actor2 actor) {
        this.actor = actor;
    }

    /**
     * Getter for Event.
     * @return Returns the String
     */
    @JsonGetter("event")
    public String getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * @param event Value for String
     */
    @JsonSetter("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Getter for CommitId.
     * @return Returns the String
     */
    @JsonGetter("commit_id")
    public String getCommitId() {
        return commitId;
    }

    /**
     * Setter for CommitId.
     * @param commitId Value for String
     */
    @JsonSetter("commit_id")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * Getter for CommitUrl.
     * @return Returns the String
     */
    @JsonGetter("commit_url")
    public String getCommitUrl() {
        return commitUrl;
    }

    /**
     * Setter for CommitUrl.
     * @param commitUrl Value for String
     */
    @JsonSetter("commit_url")
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for PerformedViaGithubApp.
     * @return Returns the Object
     */
    @JsonGetter("performed_via_github_app")
    public Object getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    /**
     * Setter for PerformedViaGithubApp.
     * @param performedViaGithubApp Value for Object
     */
    @JsonSetter("performed_via_github_app")
    public void setPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    /**
     * Getter for Milestone.
     * @return Returns the Milestone1
     */
    @JsonGetter("milestone")
    public Milestone1 getMilestone() {
        return milestone;
    }

    /**
     * Setter for Milestone.
     * @param milestone Value for Milestone1
     */
    @JsonSetter("milestone")
    public void setMilestone(Milestone1 milestone) {
        this.milestone = milestone;
    }

    /**
     * Converts this MilestonedIssueEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MilestonedIssueEvent [" + "id=" + id + ", nodeId=" + nodeId + ", url=" + url
                + ", actor=" + actor + ", event=" + event + ", commitId=" + commitId
                + ", commitUrl=" + commitUrl + ", createdAt=" + createdAt
                + ", performedViaGithubApp=" + performedViaGithubApp + ", milestone=" + milestone
                + "]";
    }

    /**
     * Builds a new {@link MilestonedIssueEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MilestonedIssueEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, url, actor, event, commitId, commitUrl, createdAt,
                performedViaGithubApp, milestone);
        return builder;
    }

    /**
     * Class to build instances of {@link MilestonedIssueEvent}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private String url;
        private Actor2 actor;
        private String event;
        private String commitId;
        private String commitUrl;
        private String createdAt;
        private Object performedViaGithubApp;
        private Milestone1 milestone;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  url  String value for url.
         * @param  actor  Actor2 value for actor.
         * @param  event  String value for event.
         * @param  commitId  String value for commitId.
         * @param  commitUrl  String value for commitUrl.
         * @param  createdAt  String value for createdAt.
         * @param  performedViaGithubApp  Object value for performedViaGithubApp.
         * @param  milestone  Milestone1 value for milestone.
         */
        public Builder(int id, String nodeId, String url, Actor2 actor, String event,
                String commitId, String commitUrl, String createdAt, Object performedViaGithubApp,
                Milestone1 milestone) {
            this.id = id;
            this.nodeId = nodeId;
            this.url = url;
            this.actor = actor;
            this.event = event;
            this.commitId = commitId;
            this.commitUrl = commitUrl;
            this.createdAt = createdAt;
            this.performedViaGithubApp = performedViaGithubApp;
            this.milestone = milestone;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
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
         * Setter for actor.
         * @param  actor  Actor2 value for actor.
         * @return Builder
         */
        public Builder actor(Actor2 actor) {
            this.actor = actor;
            return this;
        }

        /**
         * Setter for event.
         * @param  event  String value for event.
         * @return Builder
         */
        public Builder event(String event) {
            this.event = event;
            return this;
        }

        /**
         * Setter for commitId.
         * @param  commitId  String value for commitId.
         * @return Builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            return this;
        }

        /**
         * Setter for commitUrl.
         * @param  commitUrl  String value for commitUrl.
         * @return Builder
         */
        public Builder commitUrl(String commitUrl) {
            this.commitUrl = commitUrl;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for performedViaGithubApp.
         * @param  performedViaGithubApp  Object value for performedViaGithubApp.
         * @return Builder
         */
        public Builder performedViaGithubApp(Object performedViaGithubApp) {
            this.performedViaGithubApp = performedViaGithubApp;
            return this;
        }

        /**
         * Setter for milestone.
         * @param  milestone  Milestone1 value for milestone.
         * @return Builder
         */
        public Builder milestone(Milestone1 milestone) {
            this.milestone = milestone;
            return this;
        }

        /**
         * Builds a new {@link MilestonedIssueEvent} object using the set fields.
         * @return {@link MilestonedIssueEvent}
         */
        public MilestonedIssueEvent build() {
            return new MilestonedIssueEvent(id, nodeId, url, actor, event, commitId, commitUrl,
                    createdAt, performedViaGithubApp, milestone);
        }
    }
}
