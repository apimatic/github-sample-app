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
 * This is a model class for RepositoryImportevent type.
 */
public class RepositoryImportevent {
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;
    private Status20Enum status;

    /**
     * Default constructor.
     */
    public RepositoryImportevent() {
    }

    /**
     * Initialization constructor.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  status  Status20Enum value for status.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public RepositoryImportevent(
            Repository3 repository,
            Sender sender,
            Status20Enum status,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.status = status;
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
     * Getter for Status.
     * @return Returns the Status20Enum
     */
    @JsonGetter("status")
    public Status20Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status20Enum
     */
    @JsonSetter("status")
    public void setStatus(Status20Enum status) {
        this.status = status;
    }

    /**
     * Converts this RepositoryImportevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RepositoryImportevent [" + "repository=" + repository + ", sender=" + sender
                + ", status=" + status + ", enterprise=" + enterprise + ", installation="
                + installation + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link RepositoryImportevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RepositoryImportevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(repository, sender, status)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link RepositoryImportevent}.
     */
    public static class Builder {
        private Repository3 repository;
        private Sender sender;
        private Status20Enum status;
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
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         * @param  status  Status20Enum value for status.
         */
        public Builder(Repository3 repository, Sender sender, Status20Enum status) {
            this.repository = repository;
            this.sender = sender;
            this.status = status;
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
         * Setter for status.
         * @param  status  Status20Enum value for status.
         * @return Builder
         */
        public Builder status(Status20Enum status) {
            this.status = status;
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
         * Builds a new {@link RepositoryImportevent} object using the set fields.
         * @return {@link RepositoryImportevent}
         */
        public RepositoryImportevent build() {
            return new RepositoryImportevent(repository, sender, status, enterprise, installation,
                    organization);
        }
    }
}