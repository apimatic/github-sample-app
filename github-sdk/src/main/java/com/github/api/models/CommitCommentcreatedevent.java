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
 * This is a model class for CommitCommentcreatedevent type.
 */
public class CommitCommentcreatedevent {
    private String action;
    private Comment11 comment;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public CommitCommentcreatedevent() {
        action = "created";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  comment  Comment11 value for comment.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public CommitCommentcreatedevent(
            String action,
            Comment11 comment,
            Repository3 repository,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.comment = comment;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
    }

    /**
     * Getter for Action.
     * The action performed. Can be `created`.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * The action performed. Can be `created`.
     * @param action Value for String
     */
    @JsonSetter("action")
    private void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for Comment.
     * @return Returns the Comment11
     */
    @JsonGetter("comment")
    public Comment11 getComment() {
        return comment;
    }

    /**
     * Setter for Comment.
     * @param comment Value for Comment11
     */
    @JsonSetter("comment")
    public void setComment(Comment11 comment) {
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
     * Converts this CommitCommentcreatedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CommitCommentcreatedevent [" + "action=" + action + ", comment=" + comment
                + ", repository=" + repository + ", sender=" + sender + ", enterprise=" + enterprise
                + ", installation=" + installation + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link CommitCommentcreatedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CommitCommentcreatedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, comment, repository, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link CommitCommentcreatedevent}.
     */
    public static class Builder {
        private String action = "created";
        private Comment11 comment;
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
         * @param  comment  Comment11 value for comment.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Comment11 comment, Repository3 repository, Sender sender) {
            this.action = action;
            this.comment = comment;
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
         * Setter for comment.
         * @param  comment  Comment11 value for comment.
         * @return Builder
         */
        public Builder comment(Comment11 comment) {
            this.comment = comment;
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
         * Builds a new {@link CommitCommentcreatedevent} object using the set fields.
         * @return {@link CommitCommentcreatedevent}
         */
        public CommitCommentcreatedevent build() {
            return new CommitCommentcreatedevent(action, comment, repository, sender, enterprise,
                    installation, organization);
        }
    }
}
