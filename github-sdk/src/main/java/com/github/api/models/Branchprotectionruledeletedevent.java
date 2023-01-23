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
 * This is a model class for Branchprotectionruledeletedevent type.
 */
public class Branchprotectionruledeletedevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Rule3 rule;
    private Sender sender;

    /**
     * Default constructor.
     */
    public Branchprotectionruledeletedevent() {
        action = "deleted";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  repository  Repository3 value for repository.
     * @param  rule  Rule3 value for rule.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public Branchprotectionruledeletedevent(
            String action,
            Repository3 repository,
            Rule3 rule,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.rule = rule;
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
     * Getter for Rule.
     * @return Returns the Rule3
     */
    @JsonGetter("rule")
    public Rule3 getRule() {
        return rule;
    }

    /**
     * Setter for Rule.
     * @param rule Value for Rule3
     */
    @JsonSetter("rule")
    public void setRule(Rule3 rule) {
        this.rule = rule;
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
     * Converts this Branchprotectionruledeletedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Branchprotectionruledeletedevent [" + "action=" + action + ", repository="
                + repository + ", rule=" + rule + ", sender=" + sender + ", enterprise="
                + enterprise + ", installation=" + installation + ", organization=" + organization
                + "]";
    }

    /**
     * Builds a new {@link Branchprotectionruledeletedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Branchprotectionruledeletedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, repository, rule, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link Branchprotectionruledeletedevent}.
     */
    public static class Builder {
        private String action = "deleted";
        private Repository3 repository;
        private Rule3 rule;
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
         * @param  repository  Repository3 value for repository.
         * @param  rule  Rule3 value for rule.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Repository3 repository, Rule3 rule, Sender sender) {
            this.action = action;
            this.repository = repository;
            this.rule = rule;
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
         * Setter for repository.
         * @param  repository  Repository3 value for repository.
         * @return Builder
         */
        public Builder repository(Repository3 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Setter for rule.
         * @param  rule  Rule3 value for rule.
         * @return Builder
         */
        public Builder rule(Rule3 rule) {
            this.rule = rule;
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
         * Builds a new {@link Branchprotectionruledeletedevent} object using the set fields.
         * @return {@link Branchprotectionruledeletedevent}
         */
        public Branchprotectionruledeletedevent build() {
            return new Branchprotectionruledeletedevent(action, repository, rule, sender,
                    enterprise, installation, organization);
        }
    }
}
