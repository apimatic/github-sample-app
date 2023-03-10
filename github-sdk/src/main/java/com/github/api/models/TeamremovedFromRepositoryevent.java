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
 * This is a model class for TeamremovedFromRepositoryevent type.
 */
public class TeamremovedFromRepositoryevent {
    private String action;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private Repository206 repository;
    private Sender sender;
    private Team2 team;

    /**
     * Default constructor.
     */
    public TeamremovedFromRepositoryevent() {
        action = "removed_from_repository";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  organization  Organization2 value for organization.
     * @param  sender  Sender value for sender.
     * @param  team  Team2 value for team.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  repository  Repository206 value for repository.
     */
    public TeamremovedFromRepositoryevent(
            String action,
            Organization2 organization,
            Sender sender,
            Team2 team,
            Enterprise1 enterprise,
            Installation1 installation,
            Repository206 repository) {
        this.action = action;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.team = team;
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
     * @return Returns the Repository206
     */
    @JsonGetter("repository")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Repository206 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository206
     */
    @JsonSetter("repository")
    public void setRepository(Repository206 repository) {
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
     * Getter for Team.
     * @return Returns the Team2
     */
    @JsonGetter("team")
    public Team2 getTeam() {
        return team;
    }

    /**
     * Setter for Team.
     * @param team Value for Team2
     */
    @JsonSetter("team")
    public void setTeam(Team2 team) {
        this.team = team;
    }

    /**
     * Converts this TeamremovedFromRepositoryevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TeamremovedFromRepositoryevent [" + "action=" + action + ", organization="
                + organization + ", sender=" + sender + ", team=" + team + ", enterprise="
                + enterprise + ", installation=" + installation + ", repository=" + repository
                + "]";
    }

    /**
     * Builds a new {@link TeamremovedFromRepositoryevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TeamremovedFromRepositoryevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, organization, sender, team)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .repository(getRepository());
        return builder;
    }

    /**
     * Class to build instances of {@link TeamremovedFromRepositoryevent}.
     */
    public static class Builder {
        private String action = "removed_from_repository";
        private Organization2 organization;
        private Sender sender;
        private Team2 team;
        private Enterprise1 enterprise;
        private Installation1 installation;
        private Repository206 repository;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  organization  Organization2 value for organization.
         * @param  sender  Sender value for sender.
         * @param  team  Team2 value for team.
         */
        public Builder(String action, Organization2 organization, Sender sender, Team2 team) {
            this.action = action;
            this.organization = organization;
            this.sender = sender;
            this.team = team;
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
         * Setter for organization.
         * @param  organization  Organization2 value for organization.
         * @return Builder
         */
        public Builder organization(Organization2 organization) {
            this.organization = organization;
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
         * Setter for team.
         * @param  team  Team2 value for team.
         * @return Builder
         */
        public Builder team(Team2 team) {
            this.team = team;
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
         * Setter for repository.
         * @param  repository  Repository206 value for repository.
         * @return Builder
         */
        public Builder repository(Repository206 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Builds a new {@link TeamremovedFromRepositoryevent} object using the set fields.
         * @return {@link TeamremovedFromRepositoryevent}
         */
        public TeamremovedFromRepositoryevent build() {
            return new TeamremovedFromRepositoryevent(action, organization, sender, team,
                    enterprise, installation, repository);
        }
    }
}
