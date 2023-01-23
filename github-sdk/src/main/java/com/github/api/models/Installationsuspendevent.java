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
import java.util.List;

/**
 * This is a model class for Installationsuspendevent type.
 */
public class Installationsuspendevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation48 installation;
    private Organization2 organization;
    private List<Repository5> repositories;
    private Repository3 repository;
    private OptionalNullable<Object> requester;
    private Sender sender;

    /**
     * Default constructor.
     */
    public Installationsuspendevent() {
        action = "suspend";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  installation  Installation48 value for installation.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  organization  Organization2 value for organization.
     * @param  repositories  List of Repository5 value for repositories.
     * @param  repository  Repository3 value for repository.
     * @param  requester  Object value for requester.
     */
    public Installationsuspendevent(
            String action,
            Installation48 installation,
            Sender sender,
            Enterprise1 enterprise,
            Organization2 organization,
            List<Repository5> repositories,
            Repository3 repository,
            Object requester) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repositories = repositories;
        this.repository = repository;
        this.requester = OptionalNullable.of(requester);
        this.sender = sender;
    }

    /**
     * Internal initialization constructor.
     */
    protected Installationsuspendevent(String action, Installation48 installation, Sender sender,
            Enterprise1 enterprise, Organization2 organization, List<Repository5> repositories,
            Repository3 repository, OptionalNullable<Object> requester) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repositories = repositories;
        this.repository = repository;
        this.requester = requester;
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
     * @return Returns the Installation48
     */
    @JsonGetter("installation")
    public Installation48 getInstallation() {
        return installation;
    }

    /**
     * Setter for Installation.
     * @param installation Value for Installation48
     */
    @JsonSetter("installation")
    public void setInstallation(Installation48 installation) {
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
     * Getter for Repositories.
     * An array of repository objects that the installation can access.
     * @return Returns the List of Repository5
     */
    @JsonGetter("repositories")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Repository5> getRepositories() {
        return repositories;
    }

    /**
     * Setter for Repositories.
     * An array of repository objects that the installation can access.
     * @param repositories Value for List of Repository5
     */
    @JsonSetter("repositories")
    public void setRepositories(List<Repository5> repositories) {
        this.repositories = repositories;
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
     * Internal Getter for Requester.
     * @return Returns the Internal Object
     */
    @JsonGetter("requester")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Object> internalGetRequester() {
        return this.requester;
    }

    /**
     * Getter for Requester.
     * @return Returns the Object
     */
    public Object getRequester() {
        return OptionalNullable.getFrom(requester);
    }

    /**
     * Setter for Requester.
     * @param requester Value for Object
     */
    @JsonSetter("requester")
    public void setRequester(Object requester) {
        this.requester = OptionalNullable.of(requester);
    }

    /**
     * UnSetter for Requester.
     */
    public void unsetRequester() {
        requester = null;
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
     * Converts this Installationsuspendevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Installationsuspendevent [" + "action=" + action + ", installation=" + installation
                + ", sender=" + sender + ", enterprise=" + enterprise + ", organization="
                + organization + ", repositories=" + repositories + ", repository=" + repository
                + ", requester=" + requester + "]";
    }

    /**
     * Builds a new {@link Installationsuspendevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Installationsuspendevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, installation, sender)
                .enterprise(getEnterprise())
                .organization(getOrganization())
                .repositories(getRepositories())
                .repository(getRepository());
        builder.requester = internalGetRequester();
        return builder;
    }

    /**
     * Class to build instances of {@link Installationsuspendevent}.
     */
    public static class Builder {
        private String action = "suspend";
        private Installation48 installation;
        private Sender sender;
        private Enterprise1 enterprise;
        private Organization2 organization;
        private List<Repository5> repositories;
        private Repository3 repository;
        private OptionalNullable<Object> requester;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  installation  Installation48 value for installation.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Installation48 installation, Sender sender) {
            this.action = action;
            this.installation = installation;
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
         * Setter for installation.
         * @param  installation  Installation48 value for installation.
         * @return Builder
         */
        public Builder installation(Installation48 installation) {
            this.installation = installation;
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
         * Setter for organization.
         * @param  organization  Organization2 value for organization.
         * @return Builder
         */
        public Builder organization(Organization2 organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for repositories.
         * @param  repositories  List of Repository5 value for repositories.
         * @return Builder
         */
        public Builder repositories(List<Repository5> repositories) {
            this.repositories = repositories;
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
         * Setter for requester.
         * @param  requester  Object value for requester.
         * @return Builder
         */
        public Builder requester(Object requester) {
            this.requester = OptionalNullable.of(requester);
            return this;
        }

        /**
         * UnSetter for requester.
         * @return Builder
         */
        public Builder unsetRequester() {
            requester = null;
            return this;
        }

        /**
         * Builds a new {@link Installationsuspendevent} object using the set fields.
         * @return {@link Installationsuspendevent}
         */
        public Installationsuspendevent build() {
            return new Installationsuspendevent(action, installation, sender, enterprise,
                    organization, repositories, repository, requester);
        }
    }
}
