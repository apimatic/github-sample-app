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
import com.github.api.models.containers.ReposDeploymentsRequestPayload;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for ReposDeploymentsRequest type.
 */
public class ReposDeploymentsRequest {
    private String ref;
    private String task;
    private Boolean autoMerge;
    private List<String> requiredContexts;
    private ReposDeploymentsRequestPayload payload;
    private String environment;
    private OptionalNullable<String> description;
    private Boolean transientEnvironment;
    private Boolean productionEnvironment;

    /**
     * Default constructor.
     */
    public ReposDeploymentsRequest() {
        task = "deploy";
        autoMerge = true;
        environment = "production";
        transientEnvironment = false;
    }

    /**
     * Initialization constructor.
     * @param  ref  String value for ref.
     * @param  task  String value for task.
     * @param  autoMerge  Boolean value for autoMerge.
     * @param  requiredContexts  List of String value for requiredContexts.
     * @param  payload  ReposDeploymentsRequestPayload value for payload.
     * @param  environment  String value for environment.
     * @param  description  String value for description.
     * @param  transientEnvironment  Boolean value for transientEnvironment.
     * @param  productionEnvironment  Boolean value for productionEnvironment.
     */
    public ReposDeploymentsRequest(
            String ref,
            String task,
            Boolean autoMerge,
            List<String> requiredContexts,
            ReposDeploymentsRequestPayload payload,
            String environment,
            String description,
            Boolean transientEnvironment,
            Boolean productionEnvironment) {
        this.ref = ref;
        this.task = task;
        this.autoMerge = autoMerge;
        this.requiredContexts = requiredContexts;
        this.payload = payload;
        this.environment = environment;
        this.description = OptionalNullable.of(description);
        this.transientEnvironment = transientEnvironment;
        this.productionEnvironment = productionEnvironment;
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposDeploymentsRequest(String ref, String task, Boolean autoMerge,
            List<String> requiredContexts, ReposDeploymentsRequestPayload payload,
            String environment, OptionalNullable<String> description, Boolean transientEnvironment,
            Boolean productionEnvironment) {
        this.ref = ref;
        this.task = task;
        this.autoMerge = autoMerge;
        this.requiredContexts = requiredContexts;
        this.payload = payload;
        this.environment = environment;
        this.description = description;
        this.transientEnvironment = transientEnvironment;
        this.productionEnvironment = productionEnvironment;
    }

    /**
     * Getter for Ref.
     * The ref to deploy. This can be a branch, tag, or SHA.
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * The ref to deploy. This can be a branch, tag, or SHA.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for Task.
     * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
     * @return Returns the String
     */
    @JsonGetter("task")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTask() {
        return task;
    }

    /**
     * Setter for Task.
     * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
     * @param task Value for String
     */
    @JsonSetter("task")
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * Getter for AutoMerge.
     * Attempts to automatically merge the default branch into the requested ref, if it's behind the
     * default branch.
     * @return Returns the Boolean
     */
    @JsonGetter("auto_merge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoMerge() {
        return autoMerge;
    }

    /**
     * Setter for AutoMerge.
     * Attempts to automatically merge the default branch into the requested ref, if it's behind the
     * default branch.
     * @param autoMerge Value for Boolean
     */
    @JsonSetter("auto_merge")
    public void setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
    }

    /**
     * Getter for RequiredContexts.
     * The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit
     * status checks. If you omit this parameter, GitHub verifies all unique contexts before
     * creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all
     * unique contexts.
     * @return Returns the List of String
     */
    @JsonGetter("required_contexts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRequiredContexts() {
        return requiredContexts;
    }

    /**
     * Setter for RequiredContexts.
     * The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit
     * status checks. If you omit this parameter, GitHub verifies all unique contexts before
     * creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all
     * unique contexts.
     * @param requiredContexts Value for List of String
     */
    @JsonSetter("required_contexts")
    public void setRequiredContexts(List<String> requiredContexts) {
        this.requiredContexts = requiredContexts;
    }

    /**
     * Getter for Payload.
     * @return Returns the ReposDeploymentsRequestPayload
     */
    @JsonGetter("payload")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReposDeploymentsRequestPayload getPayload() {
        return payload;
    }

    /**
     * Setter for Payload.
     * @param payload Value for ReposDeploymentsRequestPayload
     */
    @JsonSetter("payload")
    public void setPayload(ReposDeploymentsRequestPayload payload) {
        this.payload = payload;
    }

    /**
     * Getter for Environment.
     * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
     * @return Returns the String
     */
    @JsonGetter("environment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnvironment() {
        return environment;
    }

    /**
     * Setter for Environment.
     * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
     * @param environment Value for String
     */
    @JsonSetter("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Internal Getter for Description.
     * Short description of the deployment.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * Short description of the deployment.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * Short description of the deployment.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * Short description of the deployment.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for TransientEnvironment.
     * Specifies if the given environment is specific to the deployment and will no longer exist at
     * some point in the future. Default: `false`
     * @return Returns the Boolean
     */
    @JsonGetter("transient_environment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTransientEnvironment() {
        return transientEnvironment;
    }

    /**
     * Setter for TransientEnvironment.
     * Specifies if the given environment is specific to the deployment and will no longer exist at
     * some point in the future. Default: `false`
     * @param transientEnvironment Value for Boolean
     */
    @JsonSetter("transient_environment")
    public void setTransientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    /**
     * Getter for ProductionEnvironment.
     * Specifies if the given environment is one that end-users directly interact with. Default:
     * `true` when `environment` is `production` and `false` otherwise.
     * @return Returns the Boolean
     */
    @JsonGetter("production_environment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getProductionEnvironment() {
        return productionEnvironment;
    }

    /**
     * Setter for ProductionEnvironment.
     * Specifies if the given environment is one that end-users directly interact with. Default:
     * `true` when `environment` is `production` and `false` otherwise.
     * @param productionEnvironment Value for Boolean
     */
    @JsonSetter("production_environment")
    public void setProductionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    /**
     * Converts this ReposDeploymentsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposDeploymentsRequest [" + "ref=" + ref + ", task=" + task + ", autoMerge="
                + autoMerge + ", requiredContexts=" + requiredContexts + ", payload=" + payload
                + ", environment=" + environment + ", description=" + description
                + ", transientEnvironment=" + transientEnvironment + ", productionEnvironment="
                + productionEnvironment + "]";
    }

    /**
     * Builds a new {@link ReposDeploymentsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposDeploymentsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ref)
                .task(getTask())
                .autoMerge(getAutoMerge())
                .requiredContexts(getRequiredContexts())
                .payload(getPayload())
                .environment(getEnvironment())
                .transientEnvironment(getTransientEnvironment())
                .productionEnvironment(getProductionEnvironment());
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposDeploymentsRequest}.
     */
    public static class Builder {
        private String ref;
        private String task = "deploy";
        private Boolean autoMerge = true;
        private List<String> requiredContexts;
        private ReposDeploymentsRequestPayload payload;
        private String environment = "production";
        private OptionalNullable<String> description;
        private Boolean transientEnvironment = false;
        private Boolean productionEnvironment;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ref  String value for ref.
         */
        public Builder(String ref) {
            this.ref = ref;
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
         * Setter for task.
         * @param  task  String value for task.
         * @return Builder
         */
        public Builder task(String task) {
            this.task = task;
            return this;
        }

        /**
         * Setter for autoMerge.
         * @param  autoMerge  Boolean value for autoMerge.
         * @return Builder
         */
        public Builder autoMerge(Boolean autoMerge) {
            this.autoMerge = autoMerge;
            return this;
        }

        /**
         * Setter for requiredContexts.
         * @param  requiredContexts  List of String value for requiredContexts.
         * @return Builder
         */
        public Builder requiredContexts(List<String> requiredContexts) {
            this.requiredContexts = requiredContexts;
            return this;
        }

        /**
         * Setter for payload.
         * @param  payload  ReposDeploymentsRequestPayload value for payload.
         * @return Builder
         */
        public Builder payload(ReposDeploymentsRequestPayload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Setter for environment.
         * @param  environment  String value for environment.
         * @return Builder
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for transientEnvironment.
         * @param  transientEnvironment  Boolean value for transientEnvironment.
         * @return Builder
         */
        public Builder transientEnvironment(Boolean transientEnvironment) {
            this.transientEnvironment = transientEnvironment;
            return this;
        }

        /**
         * Setter for productionEnvironment.
         * @param  productionEnvironment  Boolean value for productionEnvironment.
         * @return Builder
         */
        public Builder productionEnvironment(Boolean productionEnvironment) {
            this.productionEnvironment = productionEnvironment;
            return this;
        }

        /**
         * Builds a new {@link ReposDeploymentsRequest} object using the set fields.
         * @return {@link ReposDeploymentsRequest}
         */
        public ReposDeploymentsRequest build() {
            return new ReposDeploymentsRequest(ref, task, autoMerge, requiredContexts, payload,
                    environment, description, transientEnvironment, productionEnvironment);
        }
    }
}