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
 * This is a model class for PullRequesteditedevent type.
 */
public class PullRequesteditedevent {
    private String action;
    private Changes252 changes;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private int number;
    private Organization2 organization;
    private PullRequest28 pullRequest;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public PullRequesteditedevent() {
        action = "edited";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  changes  Changes252 value for changes.
     * @param  number  int value for number.
     * @param  pullRequest  PullRequest28 value for pullRequest.
     * @param  repository  Repository3 value for repository.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     * @param  sender  Sender value for sender.
     */
    public PullRequesteditedevent(
            String action,
            Changes252 changes,
            int number,
            PullRequest28 pullRequest,
            Repository3 repository,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization,
            Sender sender) {
        this.action = action;
        this.changes = changes;
        this.enterprise = enterprise;
        this.installation = installation;
        this.number = number;
        this.organization = organization;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.sender = sender;
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
     * Getter for Changes.
     * @return Returns the Changes252
     */
    @JsonGetter("changes")
    public Changes252 getChanges() {
        return changes;
    }

    /**
     * Setter for Changes.
     * @param changes Value for Changes252
     */
    @JsonSetter("changes")
    public void setChanges(Changes252 changes) {
        this.changes = changes;
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
     * Getter for Number.
     * The pull request number.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The pull request number.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
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
     * @return Returns the PullRequest28
     */
    @JsonGetter("pull_request")
    public PullRequest28 getPullRequest() {
        return pullRequest;
    }

    /**
     * Setter for PullRequest.
     * @param pullRequest Value for PullRequest28
     */
    @JsonSetter("pull_request")
    public void setPullRequest(PullRequest28 pullRequest) {
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
     * Converts this PullRequesteditedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequesteditedevent [" + "action=" + action + ", changes=" + changes
                + ", number=" + number + ", pullRequest=" + pullRequest + ", repository="
                + repository + ", enterprise=" + enterprise + ", installation=" + installation
                + ", organization=" + organization + ", sender=" + sender + "]";
    }

    /**
     * Builds a new {@link PullRequesteditedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequesteditedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, changes, number, pullRequest, repository)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization())
                .sender(getSender());
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequesteditedevent}.
     */
    public static class Builder {
        private String action = "edited";
        private Changes252 changes;
        private int number;
        private PullRequest28 pullRequest;
        private Repository3 repository;
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
         * @param  changes  Changes252 value for changes.
         * @param  number  int value for number.
         * @param  pullRequest  PullRequest28 value for pullRequest.
         * @param  repository  Repository3 value for repository.
         */
        public Builder(String action, Changes252 changes, int number, PullRequest28 pullRequest,
                Repository3 repository) {
            this.action = action;
            this.changes = changes;
            this.number = number;
            this.pullRequest = pullRequest;
            this.repository = repository;
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
         * Setter for changes.
         * @param  changes  Changes252 value for changes.
         * @return Builder
         */
        public Builder changes(Changes252 changes) {
            this.changes = changes;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for pullRequest.
         * @param  pullRequest  PullRequest28 value for pullRequest.
         * @return Builder
         */
        public Builder pullRequest(PullRequest28 pullRequest) {
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
         * Builds a new {@link PullRequesteditedevent} object using the set fields.
         * @return {@link PullRequesteditedevent}
         */
        public PullRequesteditedevent build() {
            return new PullRequesteditedevent(action, changes, number, pullRequest, repository,
                    enterprise, installation, organization, sender);
        }
    }
}
