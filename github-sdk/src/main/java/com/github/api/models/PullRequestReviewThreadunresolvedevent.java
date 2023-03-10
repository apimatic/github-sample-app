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
 * This is a model class for PullRequestReviewThreadunresolvedevent type.
 */
public class PullRequestReviewThreadunresolvedevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private SimplePullRequest4 pullRequest;
    private Repository3 repository;
    private Sender sender;
    private Thread2 thread;

    /**
     * Default constructor.
     */
    public PullRequestReviewThreadunresolvedevent() {
        action = "unresolved";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  pullRequest  SimplePullRequest4 value for pullRequest.
     * @param  repository  Repository3 value for repository.
     * @param  thread  Thread2 value for thread.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     * @param  sender  Sender value for sender.
     */
    public PullRequestReviewThreadunresolvedevent(
            String action,
            SimplePullRequest4 pullRequest,
            Repository3 repository,
            Thread2 thread,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization,
            Sender sender) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.sender = sender;
        this.thread = thread;
    }

    /**
     * Getter for Action.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * @param action Value for String
     */
    @JsonSetter("action")
    private void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for Enterprise.
     * @return Returns the Enterprise1
     */
    @JsonGetter("enterprise")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Enterprise1 getEnterprise() {
        return enterprise;
    }

    /**
     * Setter for Enterprise.
     * @param enterprise Value for Enterprise1
     */
    @JsonSetter("enterprise")
    public void setEnterprise(Enterprise1 enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Getter for Installation.
     * @return Returns the Installation1
     */
    @JsonGetter("installation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Installation1 getInstallation() {
        return installation;
    }

    /**
     * Setter for Installation.
     * @param installation Value for Installation1
     */
    @JsonSetter("installation")
    public void setInstallation(Installation1 installation) {
        this.installation = installation;
    }

    /**
     * Getter for Organization.
     * @return Returns the Organization2
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Organization2 getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * @param organization Value for Organization2
     */
    @JsonSetter("organization")
    public void setOrganization(Organization2 organization) {
        this.organization = organization;
    }

    /**
     * Getter for PullRequest.
     * @return Returns the SimplePullRequest4
     */
    @JsonGetter("pull_request")
    public SimplePullRequest4 getPullRequest() {
        return pullRequest;
    }

    /**
     * Setter for PullRequest.
     * @param pullRequest Value for SimplePullRequest4
     */
    @JsonSetter("pull_request")
    public void setPullRequest(SimplePullRequest4 pullRequest) {
        this.pullRequest = pullRequest;
    }

    /**
     * Getter for Repository.
     * @return Returns the Repository3
     */
    @JsonGetter("repository")
    public Repository3 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository3
     */
    @JsonSetter("repository")
    public void setRepository(Repository3 repository) {
        this.repository = repository;
    }

    /**
     * Getter for Sender.
     * @return Returns the Sender
     */
    @JsonGetter("sender")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Sender getSender() {
        return sender;
    }

    /**
     * Setter for Sender.
     * @param sender Value for Sender
     */
    @JsonSetter("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    /**
     * Getter for Thread.
     * @return Returns the Thread2
     */
    @JsonGetter("thread")
    public Thread2 getThread() {
        return thread;
    }

    /**
     * Setter for Thread.
     * @param thread Value for Thread2
     */
    @JsonSetter("thread")
    public void setThread(Thread2 thread) {
        this.thread = thread;
    }

    /**
     * Converts this PullRequestReviewThreadunresolvedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequestReviewThreadunresolvedevent [" + "action=" + action + ", pullRequest="
                + pullRequest + ", repository=" + repository + ", thread=" + thread
                + ", enterprise=" + enterprise + ", installation=" + installation
                + ", organization=" + organization + ", sender=" + sender + "]";
    }

    /**
     * Builds a new {@link PullRequestReviewThreadunresolvedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequestReviewThreadunresolvedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, pullRequest, repository, thread)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization())
                .sender(getSender());
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequestReviewThreadunresolvedevent}.
     */
    public static class Builder {
        private String action = "unresolved";
        private SimplePullRequest4 pullRequest;
        private Repository3 repository;
        private Thread2 thread;
        private Enterprise1 enterprise;
        private Installation1 installation;
        private Organization2 organization;
        private Sender sender;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  pullRequest  SimplePullRequest4 value for pullRequest.
         * @param  repository  Repository3 value for repository.
         * @param  thread  Thread2 value for thread.
         */
        public Builder(String action, SimplePullRequest4 pullRequest, Repository3 repository,
                Thread2 thread) {
            this.action = action;
            this.pullRequest = pullRequest;
            this.repository = repository;
            this.thread = thread;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Setter for pullRequest.
         * @param  pullRequest  SimplePullRequest4 value for pullRequest.
         * @return Builder
         */
        public Builder pullRequest(SimplePullRequest4 pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        /**
         * Setter for repository.
         * @param  repository  Repository3 value for repository.
         * @return Builder
         */
        public Builder repository(Repository3 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Setter for thread.
         * @param  thread  Thread2 value for thread.
         * @return Builder
         */
        public Builder thread(Thread2 thread) {
            this.thread = thread;
            return this;
        }

        /**
         * Setter for enterprise.
         * @param  enterprise  Enterprise1 value for enterprise.
         * @return Builder
         */
        public Builder enterprise(Enterprise1 enterprise) {
            this.enterprise = enterprise;
            return this;
        }

        /**
         * Setter for installation.
         * @param  installation  Installation1 value for installation.
         * @return Builder
         */
        public Builder installation(Installation1 installation) {
            this.installation = installation;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  Organization2 value for organization.
         * @return Builder
         */
        public Builder organization(Organization2 organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for sender.
         * @param  sender  Sender value for sender.
         * @return Builder
         */
        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Builds a new {@link PullRequestReviewThreadunresolvedevent} object using the set fields.
         * @return {@link PullRequestReviewThreadunresolvedevent}
         */
        public PullRequestReviewThreadunresolvedevent build() {
            return new PullRequestReviewThreadunresolvedevent(action, pullRequest, repository,
                    thread, enterprise, installation, organization, sender);
        }
    }
}
