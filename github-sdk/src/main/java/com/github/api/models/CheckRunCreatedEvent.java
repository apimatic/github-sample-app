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
 * This is a model class for CheckRunCreatedEvent type.
 */
public class CheckRunCreatedEvent {
    private Action1Enum action;
    private CheckRun3 checkRun;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public CheckRunCreatedEvent() {
    }

    /**
     * Initialization constructor.
     * @param  checkRun  CheckRun3 value for checkRun.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  action  Action1Enum value for action.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public CheckRunCreatedEvent(
            CheckRun3 checkRun,
            Repository3 repository,
            Sender sender,
            Action1Enum action,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.checkRun = checkRun;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
    }

    /**
     * Getter for Action.
     * @return Returns the Action1Enum
     */
    @JsonGetter("action")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Action1Enum getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * @param action Value for Action1Enum
     */
    @JsonSetter("action")
    public void setAction(Action1Enum action) {
        this.action = action;
    }

    /**
     * Getter for CheckRun.
     * @return Returns the CheckRun3
     */
    @JsonGetter("check_run")
    public CheckRun3 getCheckRun() {
        return checkRun;
    }

    /**
     * Setter for CheckRun.
     * @param checkRun Value for CheckRun3
     */
    @JsonSetter("check_run")
    public void setCheckRun(CheckRun3 checkRun) {
        this.checkRun = checkRun;
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
     * Converts this CheckRunCreatedEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckRunCreatedEvent [" + "checkRun=" + checkRun + ", repository=" + repository
                + ", sender=" + sender + ", action=" + action + ", installation=" + installation
                + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link CheckRunCreatedEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckRunCreatedEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(checkRun, repository, sender)
                .action(getAction())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link CheckRunCreatedEvent}.
     */
    public static class Builder {
        private CheckRun3 checkRun;
        private Repository3 repository;
        private Sender sender;
        private Action1Enum action;
        private Installation1 installation;
        private Organization2 organization;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  checkRun  CheckRun3 value for checkRun.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(CheckRun3 checkRun, Repository3 repository, Sender sender) {
            this.checkRun = checkRun;
            this.repository = repository;
            this.sender = sender;
        }

        /**
         * Setter for checkRun.
         * @param  checkRun  CheckRun3 value for checkRun.
         * @return Builder
         */
        public Builder checkRun(CheckRun3 checkRun) {
            this.checkRun = checkRun;
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
         * Setter for action.
         * @param  action  Action1Enum value for action.
         * @return Builder
         */
        public Builder action(Action1Enum action) {
            this.action = action;
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
         * Builds a new {@link CheckRunCreatedEvent} object using the set fields.
         * @return {@link CheckRunCreatedEvent}
         */
        public CheckRunCreatedEvent build() {
            return new CheckRunCreatedEvent(checkRun, repository, sender, action, installation,
                    organization);
        }
    }
}
