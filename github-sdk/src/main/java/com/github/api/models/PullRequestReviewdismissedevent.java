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
 * This is a model class for PullRequestReviewdismissedevent type.
 */
public class PullRequestReviewdismissedevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private SimplePullRequest pullRequest;
    private Repository3 repository;
    private Review4 review;
    private Sender sender;

    /**
     * Default constructor.
     */
    public PullRequestReviewdismissedevent() {
        action = "dismissed";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  pullRequest  SimplePullRequest value for pullRequest.
     * @param  repository  Repository3 value for repository.
     * @param  review  Review4 value for review.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public PullRequestReviewdismissedevent(
            String action,
            SimplePullRequest pullRequest,
            Repository3 repository,
            Review4 review,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.review = review;
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
     * @return Returns the SimplePullRequest
     */
    @JsonGetter("pull_request")
    public SimplePullRequest getPullRequest() {
        return pullRequest;
    }

    /**
     * Setter for PullRequest.
     * @param pullRequest Value for SimplePullRequest
     */
    @JsonSetter("pull_request")
    public void setPullRequest(SimplePullRequest pullRequest) {
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
     * Getter for Review.
     * @return Returns the Review4
     */
    @JsonGetter("review")
    public Review4 getReview() {
        return review;
    }

    /**
     * Setter for Review.
     * @param review Value for Review4
     */
    @JsonSetter("review")
    public void setReview(Review4 review) {
        this.review = review;
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
     * Converts this PullRequestReviewdismissedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequestReviewdismissedevent [" + "action=" + action + ", pullRequest="
                + pullRequest + ", repository=" + repository + ", review=" + review + ", sender="
                + sender + ", enterprise=" + enterprise + ", installation=" + installation
                + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link PullRequestReviewdismissedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequestReviewdismissedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, pullRequest, repository, review, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequestReviewdismissedevent}.
     */
    public static class Builder {
        private String action = "dismissed";
        private SimplePullRequest pullRequest;
        private Repository3 repository;
        private Review4 review;
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
         * @param  pullRequest  SimplePullRequest value for pullRequest.
         * @param  repository  Repository3 value for repository.
         * @param  review  Review4 value for review.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, SimplePullRequest pullRequest, Repository3 repository,
                Review4 review, Sender sender) {
            this.action = action;
            this.pullRequest = pullRequest;
            this.repository = repository;
            this.review = review;
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
         * Setter for pullRequest.
         * @param  pullRequest  SimplePullRequest value for pullRequest.
         * @return Builder
         */
        public Builder pullRequest(SimplePullRequest pullRequest) {
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
         * Setter for review.
         * @param  review  Review4 value for review.
         * @return Builder
         */
        public Builder review(Review4 review) {
            this.review = review;
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
         * Builds a new {@link PullRequestReviewdismissedevent} object using the set fields.
         * @return {@link PullRequestReviewdismissedevent}
         */
        public PullRequestReviewdismissedevent build() {
            return new PullRequestReviewdismissedevent(action, pullRequest, repository, review,
                    sender, enterprise, installation, organization);
        }
    }
}
