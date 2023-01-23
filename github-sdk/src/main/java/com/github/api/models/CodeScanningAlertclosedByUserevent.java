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
 * This is a model class for CodeScanningAlertclosedByUserevent type.
 */
public class CodeScanningAlertclosedByUserevent {
    private String action;
    private Alert19 alert;
    private String commitOid;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private Organization2 organization;
    private String ref;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public CodeScanningAlertclosedByUserevent() {
        action = "closed_by_user";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  alert  Alert19 value for alert.
     * @param  commitOid  String value for commitOid.
     * @param  ref  String value for ref.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public CodeScanningAlertclosedByUserevent(
            String action,
            Alert19 alert,
            String commitOid,
            String ref,
            Repository3 repository,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.action = action;
        this.alert = alert;
        this.commitOid = commitOid;
        this.enterprise = enterprise;
        this.installation = installation;
        this.organization = organization;
        this.ref = ref;
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
     * @return Returns the Alert19
     */
    @JsonGetter("alert")
    public Alert19 getAlert() {
        return alert;
    }

    /**
     * Setter for Alert.
     * @param alert Value for Alert19
     */
    @JsonSetter("alert")
    public void setAlert(Alert19 alert) {
        this.alert = alert;
    }

    /**
     * Getter for CommitOid.
     * The commit SHA of the code scanning alert. When the action is `reopened_by_user` or
     * `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
     * @return Returns the String
     */
    @JsonGetter("commit_oid")
    public String getCommitOid() {
        return commitOid;
    }

    /**
     * Setter for CommitOid.
     * The commit SHA of the code scanning alert. When the action is `reopened_by_user` or
     * `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
     * @param commitOid Value for String
     */
    @JsonSetter("commit_oid")
    public void setCommitOid(String commitOid) {
        this.commitOid = commitOid;
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
     * Getter for Ref.
     * The Git reference of the code scanning alert. When the action is `reopened_by_user` or
     * `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * The Git reference of the code scanning alert. When the action is `reopened_by_user` or
     * `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
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
     * Converts this CodeScanningAlertclosedByUserevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CodeScanningAlertclosedByUserevent [" + "action=" + action + ", alert=" + alert
                + ", commitOid=" + commitOid + ", ref=" + ref + ", repository=" + repository
                + ", sender=" + sender + ", enterprise=" + enterprise + ", installation="
                + installation + ", organization=" + organization + "]";
    }

    /**
     * Builds a new {@link CodeScanningAlertclosedByUserevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CodeScanningAlertclosedByUserevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, alert, commitOid, ref, repository, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link CodeScanningAlertclosedByUserevent}.
     */
    public static class Builder {
        private String action = "closed_by_user";
        private Alert19 alert;
        private String commitOid;
        private String ref;
        private Repository3 repository;
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
         * @param  alert  Alert19 value for alert.
         * @param  commitOid  String value for commitOid.
         * @param  ref  String value for ref.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, Alert19 alert, String commitOid, String ref,
                Repository3 repository, Sender sender) {
            this.action = action;
            this.alert = alert;
            this.commitOid = commitOid;
            this.ref = ref;
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
         * @param  alert  Alert19 value for alert.
         * @return Builder
         */
        public Builder alert(Alert19 alert) {
            this.alert = alert;
            return this;
        }

        /**
         * Setter for commitOid.
         * @param  commitOid  String value for commitOid.
         * @return Builder
         */
        public Builder commitOid(String commitOid) {
            this.commitOid = commitOid;
            return this;
        }

        /**
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
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
         * Setter for organization.
         * @param  organization  Organization2 value for organization.
         * @return Builder
         */
        public Builder organization(Organization2 organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Builds a new {@link CodeScanningAlertclosedByUserevent} object using the set fields.
         * @return {@link CodeScanningAlertclosedByUserevent}
         */
        public CodeScanningAlertclosedByUserevent build() {
            return new CodeScanningAlertclosedByUserevent(action, alert, commitOid, ref, repository,
                    sender, enterprise, installation, organization);
        }
    }
}
