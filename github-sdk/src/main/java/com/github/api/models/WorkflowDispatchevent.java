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
 * This is a model class for WorkflowDispatchevent type.
 */
public class WorkflowDispatchevent {
    private Enterprise1 enterprise;
    private Object inputs;
    private Installation1 installation;
    private Organization2 organization;
    private String ref;
    private Repository3 repository;
    private Sender sender;
    private String workflow;

    /**
     * Default constructor.
     */
    public WorkflowDispatchevent() {
    }

    /**
     * Initialization constructor.
     * @param  inputs  Object value for inputs.
     * @param  ref  String value for ref.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  workflow  String value for workflow.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     */
    public WorkflowDispatchevent(
            Object inputs,
            String ref,
            Repository3 repository,
            Sender sender,
            String workflow,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization) {
        this.enterprise = enterprise;
        this.inputs = inputs;
        this.installation = installation;
        this.organization = organization;
        this.ref = ref;
        this.repository = repository;
        this.sender = sender;
        this.workflow = workflow;
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
     * Getter for Inputs.
     * @return Returns the Object
     */
    @JsonGetter("inputs")
    public Object getInputs() {
        return inputs;
    }

    /**
     * Setter for Inputs.
     * @param inputs Value for Object
     */
    @JsonSetter("inputs")
    public void setInputs(Object inputs) {
        this.inputs = inputs;
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
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
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
     * Getter for Workflow.
     * @return Returns the String
     */
    @JsonGetter("workflow")
    public String getWorkflow() {
        return workflow;
    }

    /**
     * Setter for Workflow.
     * @param workflow Value for String
     */
    @JsonSetter("workflow")
    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }

    /**
     * Converts this WorkflowDispatchevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WorkflowDispatchevent [" + "inputs=" + inputs + ", ref=" + ref + ", repository="
                + repository + ", sender=" + sender + ", workflow=" + workflow + ", enterprise="
                + enterprise + ", installation=" + installation + ", organization=" + organization
                + "]";
    }

    /**
     * Builds a new {@link WorkflowDispatchevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WorkflowDispatchevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(inputs, ref, repository, sender, workflow)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization());
        return builder;
    }

    /**
     * Class to build instances of {@link WorkflowDispatchevent}.
     */
    public static class Builder {
        private Object inputs;
        private String ref;
        private Repository3 repository;
        private Sender sender;
        private String workflow;
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
         * @param  inputs  Object value for inputs.
         * @param  ref  String value for ref.
         * @param  repository  Repository3 value for repository.
         * @param  sender  Sender value for sender.
         * @param  workflow  String value for workflow.
         */
        public Builder(Object inputs, String ref, Repository3 repository, Sender sender,
                String workflow) {
            this.inputs = inputs;
            this.ref = ref;
            this.repository = repository;
            this.sender = sender;
            this.workflow = workflow;
        }

        /**
         * Setter for inputs.
         * @param  inputs  Object value for inputs.
         * @return Builder
         */
        public Builder inputs(Object inputs) {
            this.inputs = inputs;
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
         * Setter for workflow.
         * @param  workflow  String value for workflow.
         * @return Builder
         */
        public Builder workflow(String workflow) {
            this.workflow = workflow;
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
         * Builds a new {@link WorkflowDispatchevent} object using the set fields.
         * @return {@link WorkflowDispatchevent}
         */
        public WorkflowDispatchevent build() {
            return new WorkflowDispatchevent(inputs, ref, repository, sender, workflow, enterprise,
                    installation, organization);
        }
    }
}
