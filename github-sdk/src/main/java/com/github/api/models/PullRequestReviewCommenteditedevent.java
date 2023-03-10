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
 * This is a model class for PullRequestReviewCommenteditedevent type.
 */
public class PullRequestReviewCommenteditedevent {
    private String action;
    private Changes26 changes;
    private Comment9 comment;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private PullRequest44 pullRequest;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public PullRequestReviewCommenteditedevent() {
        action = "edited";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  changes  Changes26 value for changes.
     * @param  comment  Comment9 value for comment.
     * @param  pullRequest  PullRequest44 value for pullRequest.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public PullRequestReviewCommenteditedevent(
            String action,
            Changes26 changes,
            Comment9 comment,
            PullRequest44 pullRequest,
            Repository3 repository,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.changes = changes;
        this.comment = comment;
        this.enterprise = enterprise;
        this.installation = installation;
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
     * @return Returns the Changes26
     */
    @JsonGetter("changes")
    public Changes26 getChanges() {
        return changes;
    }

    /**
     * Setter for Changes.
     * @param changes Value for Changes26
     */
    @JsonSetter("changes")
    public void setChanges(Changes26 changes) {
        this.changes = changes;
    }

    /**
     * Getter for Comment.
     * @return Returns the Comment9
     */
    @JsonGetter("comment")
    public Comment9 getComment() {
        return comment;
    }

    /**
     * Setter for Comment.
     * @param comment Value for Comment9
     */
    @JsonSetter("comment")
    public void setComment(Comment9 comment) {
        this.comment = comment;
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
     * @return Returns the PullRequest44
     */
    @JsonGetter("pull_request")
    public PullRequest44 getPullRequest() {
        return pullRequest;
    }

    /**
     * Setter for PullRequest.
     * @param pullRequest Value for PullRequest44
     */
    @JsonSetter("pull_request")
    public void setPullRequest(PullRequest44 pullRequest) {
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
     * Converts this PullRequestReviewCommenteditedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequestReviewCommenteditedevent [" + "action=" + action + ", changes=" + changes
                + ", comment=" + comment + ", pullRequest=" + pullRequest + ", repository="
                + repository + ", sender=" + sender + ", enterprise=" + enterprise
                + ", installation=" + installation + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link PullRequestReviewCommenteditedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequestReviewCommenteditedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, changes, comment, pullRequest, repository, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequestReviewCommenteditedevent}.
     */
    public static class Builder {
        private String action = "edited";
        private Changes26 changes;
        private Comment9 comment;
        private PullRequest44 pullRequest;
        private Repository3 repository;
        private Sender sender;
        private Enterprise1 enterprise;
        private Installation1 installation;
        private Organization2 organization;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  changes  Changes26 value for changes.
         * @param  comment  Comment9 value for comment.
         * @param  pullRequest  PullRequest44 value for pullRequest.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Changes26 changes, Comment9 comment,
                PullRequest44 pullRequest, Repository3 repository, Sender sender) {
            this.action = action;
            this.changes = changes;
            this.comment = comment;
            this.pullRequest = pullRequest;
            this.repository = repository;
            this.sender = sender;
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
         * @param  changes  Changes26 value for changes.
         * @return Builder
         */
        public Builder changes(Changes26 changes) {
            this.changes = changes;
            return this;
        }

        /**
         * Setter for comment.
         * @param  comment  Comment9 value for comment.
         * @return Builder
         */
        public Builder comment(Comment9 comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Setter for pullRequest.
         * @param  pullRequest  PullRequest44 value for pullRequest.
         * @return Builder
         */
        public Builder pullRequest(PullRequest44 pullRequest) {
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
         * Setter for sender.
         * @param  sender  Sender value for sender.
         * @return Builder
         */
        public Builder sender(Sender sender) {
            this.sender = sender;
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
         * Builds a new {@link PullRequestReviewCommenteditedevent} object using the set fields.
         * @return {@link PullRequestReviewCommenteditedevent}
         */
        public PullRequestReviewCommenteditedevent build() {
            return new PullRequestReviewCommenteditedevent(action, changes, comment, pullRequest,
                    repository, sender, enterprise, installation, organization);
        }
    }
}
