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
 * This is a model class for Projectcreatedevent type.
 */
public class Projectcreatedevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Project1 project;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public Projectcreatedevent() {
        action = "created";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  project  Project1 value for project.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     * @param  repository  Repository3 value for repository.
     */
    public Projectcreatedevent(
            String action,
            Project1 project,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization,
            Repository3 repository) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.project = project;
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
     * Getter for Project.
     * @return Returns the Project1
     */
    @JsonGetter("project")
    public Project1 getProject() {
        return project;
    }

    /**
     * Setter for Project.
     * @param project Value for Project1
     */
    @JsonSetter("project")
    public void setProject(Project1 project) {
        this.project = project;
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
     * Converts this Projectcreatedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Projectcreatedevent [" + "action=" + action + ", project=" + project + ", sender="
                + sender + ", enterprise=" + enterprise + ", installation=" + installation
                + ", organization=" + organization + ", repository=" + repository + "]";
    }

    /**
     * Builds a new {@link Projectcreatedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Projectcreatedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, project, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization())
                .repository(getRepository());
        return builder;
    }

    /**
     * Class to build instances of {@link Projectcreatedevent}.
     */
    public static class Builder {
        private String action = "created";
        private Project1 project;
        private Sender sender;
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
         * @param  project  Project1 value for project.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Project1 project, Sender sender) {
            this.action = action;
            this.project = project;
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
         * Setter for project.
         * @param  project  Project1 value for project.
         * @return Builder
         */
        public Builder project(Project1 project) {
            this.project = project;
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
         * Setter for repository.
         * @param  repository  Repository3 value for repository.
         * @return Builder
         */
        public Builder repository(Repository3 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Builds a new {@link Projectcreatedevent} object using the set fields.
         * @return {@link Projectcreatedevent}
         */
        public Projectcreatedevent build() {
            return new Projectcreatedevent(action, project, sender, enterprise, installation,
                    organization, repository);
        }
    }
}
