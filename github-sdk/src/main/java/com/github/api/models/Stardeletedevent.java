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
 * This is a model class for Stardeletedevent type.
 */
public class Stardeletedevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;
    private Object starredAt;

    /**
     * Default constructor.
     */
    public Stardeletedevent() {
        action = "deleted";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  starredAt  Object value for starredAt.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public Stardeletedevent(
            String action,
            Repository3 repository,
            Sender sender,
            Object starredAt,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.starredAt = starredAt;
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
     * Getter for StarredAt.
     * The time the star was created. This is a timestamp in ISO 8601 format:
     * `YYYY-MM-DDTHH:MM:SSZ`. Will be `null` for the `deleted` action.
     * @return Returns the Object
     */
    @JsonGetter("starred_at")
    public Object getStarredAt() {
        return starredAt;
    }

    /**
     * Setter for StarredAt.
     * The time the star was created. This is a timestamp in ISO 8601 format:
     * `YYYY-MM-DDTHH:MM:SSZ`. Will be `null` for the `deleted` action.
     * @param starredAt Value for Object
     */
    @JsonSetter("starred_at")
    public void setStarredAt(Object starredAt) {
        this.starredAt = starredAt;
    }

    /**
     * Converts this Stardeletedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Stardeletedevent [" + "action=" + action + ", repository=" + repository
                + ", sender=" + sender + ", starredAt=" + starredAt + ", enterprise=" + enterprise
                + ", installation=" + installation + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link Stardeletedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Stardeletedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, repository, sender, starredAt)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link Stardeletedevent}.
     */
    public static class Builder {
        private String action = "deleted";
        private Repository3 repository;
        private Sender sender;
        private Object starredAt;
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
         * @param  sender  Sender value for sender.
         * @param  starredAt  Object value for starredAt.
         */
        public Builder(String action, Repository3 repository, Sender sender, Object starredAt) {
            this.action = action;
            this.repository = repository;
            this.sender = sender;
            this.starredAt = starredAt;
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
         * Setter for sender.
         * @param  sender  Sender value for sender.
         * @return Builder
         */
        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Setter for starredAt.
         * @param  starredAt  Object value for starredAt.
         * @return Builder
         */
        public Builder starredAt(Object starredAt) {
            this.starredAt = starredAt;
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
         * Builds a new {@link Stardeletedevent} object using the set fields.
         * @return {@link Stardeletedevent}
         */
        public Stardeletedevent build() {
            return new Stardeletedevent(action, repository, sender, starredAt, enterprise,
                    installation, organization);
        }
    }
}
