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
 * This is a model class for Sponsorshipeditedevent type.
 */
public class Sponsorshipeditedevent {
    private String action;
    private Changes33 changes;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;
    private Sponsorship sponsorship;

    /**
     * Default constructor.
     */
    public Sponsorshipeditedevent() {
        action = "edited";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  changes  Changes33 value for changes.
     * @param  sender  Sender value for sender.
     * @param  sponsorship  Sponsorship value for sponsorship.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     * @param  repository  Repository3 value for repository.
     */
    public Sponsorshipeditedevent(
            String action,
            Changes33 changes,
            Sender sender,
            Sponsorship sponsorship,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization,
            Repository3 repository) {
        this.action = action;
        this.changes = changes;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.sponsorship = sponsorship;
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
     * @return Returns the Changes33
     */
    @JsonGetter("changes")
    public Changes33 getChanges() {
        return changes;
    }

    /**
     * Setter for Changes.
     * @param changes Value for Changes33
     */
    @JsonSetter("changes")
    public void setChanges(Changes33 changes) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Sponsorship.
     * @return Returns the Sponsorship
     */
    @JsonGetter("sponsorship")
    public Sponsorship getSponsorship() {
        return sponsorship;
    }

    /**
     * Setter for Sponsorship.
     * @param sponsorship Value for Sponsorship
     */
    @JsonSetter("sponsorship")
    public void setSponsorship(Sponsorship sponsorship) {
        this.sponsorship = sponsorship;
    }

    /**
     * Converts this Sponsorshipeditedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Sponsorshipeditedevent [" + "action=" + action + ", changes=" + changes
                + ", sender=" + sender + ", sponsorship=" + sponsorship + ", enterprise="
                + enterprise + ", installation=" + installation + ", organization=" + organization
                + ", repository=" + repository + "]";
    }

    /**
     * Builds a new {@link Sponsorshipeditedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Sponsorshipeditedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, changes, sender, sponsorship)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization())
                .repository(getRepository());
        return builder;
    }

    /**
     * Class to build instances of {@link Sponsorshipeditedevent}.
     */
    public static class Builder {
        private String action = "edited";
        private Changes33 changes;
        private Sender sender;
        private Sponsorship sponsorship;
        private Enterprise1 enterprise;
        private Installation1 installation;
        private Organization2 organization;
        private Repository3 repository;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  changes  Changes33 value for changes.
         * @param  sender  Sender value for sender.
         * @param  sponsorship  Sponsorship value for sponsorship.
         */
        public Builder(String action, Changes33 changes, Sender sender, Sponsorship sponsorship) {
            this.action = action;
            this.changes = changes;
            this.sender = sender;
            this.sponsorship = sponsorship;
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
         * @param  changes  Changes33 value for changes.
         * @return Builder
         */
        public Builder changes(Changes33 changes) {
            this.changes = changes;
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
         * Setter for sponsorship.
         * @param  sponsorship  Sponsorship value for sponsorship.
         * @return Builder
         */
        public Builder sponsorship(Sponsorship sponsorship) {
            this.sponsorship = sponsorship;
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
         * Setter for repository.
         * @param  repository  Repository3 value for repository.
         * @return Builder
         */
        public Builder repository(Repository3 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Builds a new {@link Sponsorshipeditedevent} object using the set fields.
         * @return {@link Sponsorshipeditedevent}
         */
        public Sponsorshipeditedevent build() {
            return new Sponsorshipeditedevent(action, changes, sender, sponsorship, enterprise,
                    installation, organization, repository);
        }
    }
}
