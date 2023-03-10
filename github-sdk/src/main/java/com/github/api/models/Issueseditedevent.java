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
 * This is a model class for Issueseditedevent type.
 */
public class Issueseditedevent {
    private String action;
    private Changes72 changes;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Issue8 issue;
    private Label10 label;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public Issueseditedevent() {
        action = "edited";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  changes  Changes72 value for changes.
     * @param  issue  Issue8 value for issue.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  label  Label10 value for label.
     * @param  organization  Organization2 value for organization.
     */
    public Issueseditedevent(
            String action,
            Changes72 changes,
            Issue8 issue,
            Repository3 repository,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Label10 label,
            Organization2 organization) {
        this.action = action;
        this.changes = changes;
        this.enterprise = enterprise;
        this.installation = installation;
        this.issue = issue;
        this.label = label;
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
     * Getter for Changes.
     * @return Returns the Changes72
     */
    @JsonGetter("changes")
    public Changes72 getChanges() {
        return changes;
    }

    /**
     * Setter for Changes.
     * @param changes Value for Changes72
     */
    @JsonSetter("changes")
    public void setChanges(Changes72 changes) {
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
     * Getter for Label.
     * @return Returns the Label10
     */
    @JsonGetter("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Label10 getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for Label10
     */
    @JsonSetter("label")
    public void setLabel(Label10 label) {
        this.label = label;
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
     * Converts this Issueseditedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Issueseditedevent [" + "action=" + action + ", changes=" + changes + ", issue="
                + issue + ", repository=" + repository + ", sender=" + sender + ", enterprise="
                + enterprise + ", installation=" + installation + ", label=" + label
                + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link Issueseditedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Issueseditedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, changes, issue, repository, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .label(getLabel())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link Issueseditedevent}.
     */
    public static class Builder {
        private String action = "edited";
        private Changes72 changes;
        private Issue8 issue;
        private Repository3 repository;
        private Sender sender;
        private Enterprise1 enterprise;
        private Installation1 installation;
        private Label10 label;
        private Organization2 organization;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  changes  Changes72 value for changes.
         * @param  issue  Issue8 value for issue.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Changes72 changes, Issue8 issue, Repository3 repository,
                Sender sender) {
            this.action = action;
            this.changes = changes;
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
         * Setter for changes.
         * @param  changes  Changes72 value for changes.
         * @return Builder
         */
        public Builder changes(Changes72 changes) {
            this.changes = changes;
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
         * Setter for label.
         * @param  label  Label10 value for label.
         * @return Builder
         */
        public Builder label(Label10 label) {
            this.label = label;
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
         * Builds a new {@link Issueseditedevent} object using the set fields.
         * @return {@link Issueseditedevent}
         */
        public Issueseditedevent build() {
            return new Issueseditedevent(action, changes, issue, repository, sender, enterprise,
                    installation, label, organization);
        }
    }
}
