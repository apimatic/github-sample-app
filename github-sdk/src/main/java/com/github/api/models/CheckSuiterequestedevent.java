/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CheckSuiterequestedevent type.
 */
public class CheckSuiterequestedevent {
    private String action;
    private OptionalNullable<Object> actionsMeta;
    private CheckSuite32 checkSuite;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public CheckSuiterequestedevent() {
        action = "requested";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  checkSuite  CheckSuite32 value for checkSuite.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  actionsMeta  Object value for actionsMeta.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public CheckSuiterequestedevent(
            String action,
            CheckSuite32 checkSuite,
            Repository3 repository,
            Sender sender,
            Object actionsMeta,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.actionsMeta = OptionalNullable.of(actionsMeta);
        this.checkSuite = checkSuite;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
    }

    /**
     * Internal initialization constructor.
     */
    protected CheckSuiterequestedevent(String action, CheckSuite32 checkSuite,
            Repository3 repository, Sender sender, OptionalNullable<Object> actionsMeta,
            Enterprise1 enterprise, Installation1 installation, Organization2 organization) {
        this.action = action;
        this.actionsMeta = actionsMeta;
        this.checkSuite = checkSuite;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
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
     * Internal Getter for ActionsMeta.
     * @return Returns the Internal Object
     */
    @JsonGetter("actions_meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Object> internalGetActionsMeta() {
        return this.actionsMeta;
    }

    /**
     * Getter for ActionsMeta.
     * @return Returns the Object
     */
    public Object getActionsMeta() {
        return OptionalNullable.getFrom(actionsMeta);
    }

    /**
     * Setter for ActionsMeta.
     * @param actionsMeta Value for Object
     */
    @JsonSetter("actions_meta")
    public void setActionsMeta(Object actionsMeta) {
        this.actionsMeta = OptionalNullable.of(actionsMeta);
    }

    /**
     * UnSetter for ActionsMeta.
     */
    public void unsetActionsMeta() {
        actionsMeta = null;
    }

    /**
     * Getter for CheckSuite.
     * @return Returns the CheckSuite32
     */
    @JsonGetter("check_suite")
    public CheckSuite32 getCheckSuite() {
        return checkSuite;
    }

    /**
     * Setter for CheckSuite.
     * @param checkSuite Value for CheckSuite32
     */
    @JsonSetter("check_suite")
    public void setCheckSuite(CheckSuite32 checkSuite) {
        this.checkSuite = checkSuite;
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
     * Converts this CheckSuiterequestedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckSuiterequestedevent [" + "action=" + action + ", checkSuite=" + checkSuite
                + ", repository=" + repository + ", sender=" + sender + ", actionsMeta="
                + actionsMeta + ", enterprise=" + enterprise + ", installation=" + installation
                + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link CheckSuiterequestedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckSuiterequestedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, checkSuite, repository, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        builder.actionsMeta = internalGetActionsMeta();
        return builder;
    }

    /**
     * Class to build instances of {@link CheckSuiterequestedevent}.
     */
    public static class Builder {
        private String action = "requested";
        private CheckSuite32 checkSuite;
        private Repository3 repository;
        private Sender sender;
        private OptionalNullable<Object> actionsMeta;
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
         * @param  checkSuite  CheckSuite32 value for checkSuite.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, CheckSuite32 checkSuite, Repository3 repository,
                Sender sender) {
            this.action = action;
            this.checkSuite = checkSuite;
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
         * Setter for checkSuite.
         * @param  checkSuite  CheckSuite32 value for checkSuite.
         * @return Builder
         */
        public Builder checkSuite(CheckSuite32 checkSuite) {
            this.checkSuite = checkSuite;
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
         * Setter for actionsMeta.
         * @param  actionsMeta  Object value for actionsMeta.
         * @return Builder
         */
        public Builder actionsMeta(Object actionsMeta) {
            this.actionsMeta = OptionalNullable.of(actionsMeta);
            return this;
        }

        /**
         * UnSetter for actionsMeta.
         * @return Builder
         */
        public Builder unsetActionsMeta() {
            actionsMeta = null;
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
         * Builds a new {@link CheckSuiterequestedevent} object using the set fields.
         * @return {@link CheckSuiterequestedevent}
         */
        public CheckSuiterequestedevent build() {
            return new CheckSuiterequestedevent(action, checkSuite, repository, sender, actionsMeta,
                    enterprise, installation, organization);
        }
    }
}
