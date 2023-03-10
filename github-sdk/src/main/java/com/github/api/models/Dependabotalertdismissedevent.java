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
 * This is a model class for Dependabotalertdismissedevent type.
 */
public class Dependabotalertdismissedevent {
    private String action;
    private Alert8 alert;
    private Installation1 installation;
    private Organization2 organization;
    private Enterprise1 enterprise;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public Dependabotalertdismissedevent() {
        action = "dismissed";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  alert  Alert8 value for alert.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     * @param  enterprise  Enterprise1 value for enterprise.
     */
    public Dependabotalertdismissedevent(
            String action,
            Alert8 alert,
            Repository3 repository,
            Sender sender,
            Installation1 installation,
            Organization2 organization,
            Enterprise1 enterprise) {
        this.action = action;
        this.alert = alert;
        this.installation = installation;
        this.organization = organization;
        this.enterprise = enterprise;
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
     * Getter for Alert.
     * @return Returns the Alert8
     */
    @JsonGetter("alert")
    public Alert8 getAlert() {
        return alert;
    }

    /**
     * Setter for Alert.
     * @param alert Value for Alert8
     */
    @JsonSetter("alert")
    public void setAlert(Alert8 alert) {
        this.alert = alert;
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
     * Converts this Dependabotalertdismissedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Dependabotalertdismissedevent [" + "action=" + action + ", alert=" + alert
                + ", repository=" + repository + ", sender=" + sender + ", installation="
                + installation + ", organization=" + organization + ", enterprise=" + enterprise
                + "]";
    }

    /**
     * Builds a new {@link Dependabotalertdismissedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Dependabotalertdismissedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, alert, repository, sender)
                .installation(getInstallation())
                .organization(getOrganization())
                .enterprise(getEnterprise());
        return builder;
    }

    /**
     * Class to build instances of {@link Dependabotalertdismissedevent}.
     */
    public static class Builder {
        private String action = "dismissed";
        private Alert8 alert;
        private Repository3 repository;
        private Sender sender;
        private Installation1 installation;
        private Organization2 organization;
        private Enterprise1 enterprise;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  alert  Alert8 value for alert.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Alert8 alert, Repository3 repository, Sender sender) {
            this.action = action;
            this.alert = alert;
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
         * Setter for alert.
         * @param  alert  Alert8 value for alert.
         * @return Builder
         */
        public Builder alert(Alert8 alert) {
            this.alert = alert;
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
         * Setter for enterprise.
         * @param  enterprise  Enterprise1 value for enterprise.
         * @return Builder
         */
        public Builder enterprise(Enterprise1 enterprise) {
            this.enterprise = enterprise;
            return this;
        }

        /**
         * Builds a new {@link Dependabotalertdismissedevent} object using the set fields.
         * @return {@link Dependabotalertdismissedevent}
         */
        public Dependabotalertdismissedevent build() {
            return new Dependabotalertdismissedevent(action, alert, repository, sender,
                    installation, organization, enterprise);
        }
    }
}
