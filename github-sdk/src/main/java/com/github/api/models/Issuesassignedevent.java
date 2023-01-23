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
 * This is a model class for Issuesassignedevent type.
 */
public class Issuesassignedevent {
    private String action;
    private Object assignee;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Issue8 issue;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public Issuesassignedevent() {
        action = "assigned";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  issue  Issue8 value for issue.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  assignee  Object value for assignee.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public Issuesassignedevent(
            String action,
            Issue8 issue,
            Repository3 repository,
            Sender sender,
            Object assignee,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.assignee = assignee;
        this.enterprise = enterprise;
        this.installation = installation;
        this.issue = issue;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
    }

    /**
     * Getter for Action.
     * The action that was performed.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * The action that was performed.
     * @param action Value for String
     */
    @JsonSetter("action")
    private void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for Assignee.
     * @return Returns the Object
     */
    @JsonGetter("assignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAssignee() {
        return assignee;
    }

    /**
     * Setter for Assignee.
     * @param assignee Value for Object
     */
    @JsonSetter("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
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
     * Getter for Issue.
     * @return Returns the Issue8
     */
    @JsonGetter("issue")
    public Issue8 getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for Issue8
     */
    @JsonSetter("issue")
    public void setIssue(Issue8 issue) {
        this.issue = issue;
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
     * Converts this Issuesassignedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Issuesassignedevent [" + "action=" + action + ", issue=" + issue + ", repository="
                + repository + ", sender=" + sender + ", assignee=" + assignee + ", enterprise="
                + enterprise + ", installation=" + installation + ", organization=" + organization
                + "]";
    }

    /**
     * Builds a new {@link Issuesassignedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Issuesassignedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, issue, repository, sender)
                .assignee(getAssignee())
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link Issuesassignedevent}.
     */
    public static class Builder {
        private String action = "assigned";
        private Issue8 issue;
        private Repository3 repository;
        private Sender sender;
        private Object assignee;
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
         * @param  issue  Issue8 value for issue.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Issue8 issue, Repository3 repository, Sender sender) {
            this.action = action;
            this.issue = issue;
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
         * Setter for issue.
         * @param  issue  Issue8 value for issue.
         * @return Builder
         */
        public Builder issue(Issue8 issue) {
            this.issue = issue;
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
         * Setter for assignee.
         * @param  assignee  Object value for assignee.
         * @return Builder
         */
        public Builder assignee(Object assignee) {
            this.assignee = assignee;
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
         * Builds a new {@link Issuesassignedevent} object using the set fields.
         * @return {@link Issuesassignedevent}
         */
        public Issuesassignedevent build() {
            return new Issuesassignedevent(action, issue, repository, sender, assignee, enterprise,
                    installation, organization);
        }
    }
}
