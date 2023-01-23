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
 * This is a model class for DeploymentStatus1 type.
 */
public class DeploymentStatus1 {
    private String createdAt;
    private Object creator;
    private String deploymentUrl;
    private String description;
    private String environment;
    private String environmentUrl;
    private int id;
    private String logUrl;
    private String nodeId;
    private Object performedViaGithubApp;
    private String repositoryUrl;
    private String state;
    private String targetUrl;
    private String updatedAt;
    private String url;

    /**
     * Default constructor.
     */
    public DeploymentStatus1() {
    }

    /**
     * Initialization constructor.
     * @param  createdAt  String value for createdAt.
     * @param  creator  Object value for creator.
     * @param  deploymentUrl  String value for deploymentUrl.
     * @param  description  String value for description.
     * @param  environment  String value for environment.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  repositoryUrl  String value for repositoryUrl.
     * @param  state  String value for state.
     * @param  targetUrl  String value for targetUrl.
     * @param  updatedAt  String value for updatedAt.
     * @param  url  String value for url.
     * @param  environmentUrl  String value for environmentUrl.
     * @param  logUrl  String value for logUrl.
     * @param  performedViaGithubApp  Object value for performedViaGithubApp.
     */
    public DeploymentStatus1(
            String createdAt,
            Object creator,
            String deploymentUrl,
            String description,
            String environment,
            int id,
            String nodeId,
            String repositoryUrl,
            String state,
            String targetUrl,
            String updatedAt,
            String url,
            String environmentUrl,
            String logUrl,
            Object performedViaGithubApp) {
        this.createdAt = createdAt;
        this.creator = creator;
        this.deploymentUrl = deploymentUrl;
        this.description = description;
        this.environment = environment;
        this.environmentUrl = environmentUrl;
        this.id = id;
        this.logUrl = logUrl;
        this.nodeId = nodeId;
        this.performedViaGithubApp = performedViaGithubApp;
        this.repositoryUrl = repositoryUrl;
        this.state = state;
        this.targetUrl = targetUrl;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Creator.
     * @return Returns the Object
     */
    @JsonGetter("creator")
    public Object getCreator() {
        return creator;
    }

    /**
     * Setter for Creator.
     * @param creator Value for Object
     */
    @JsonSetter("creator")
    public void setCreator(Object creator) {
        this.creator = creator;
    }

    /**
     * Getter for DeploymentUrl.
     * @return Returns the String
     */
    @JsonGetter("deployment_url")
    public String getDeploymentUrl() {
        return deploymentUrl;
    }

    /**
     * Setter for DeploymentUrl.
     * @param deploymentUrl Value for String
     */
    @JsonSetter("deployment_url")
    public void setDeploymentUrl(String deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
    }

    /**
     * Getter for Description.
     * The optional human-readable description added to the status.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The optional human-readable description added to the status.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Environment.
     * @return Returns the String
     */
    @JsonGetter("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * Setter for Environment.
     * @param environment Value for String
     */
    @JsonSetter("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Getter for EnvironmentUrl.
     * @return Returns the String
     */
    @JsonGetter("environment_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnvironmentUrl() {
        return environmentUrl;
    }

    /**
     * Setter for EnvironmentUrl.
     * @param environmentUrl Value for String
     */
    @JsonSetter("environment_url")
    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for LogUrl.
     * @return Returns the String
     */
    @JsonGetter("log_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLogUrl() {
        return logUrl;
    }

    /**
     * Setter for LogUrl.
     * @param logUrl Value for String
     */
    @JsonSetter("log_url")
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for PerformedViaGithubApp.
     * @return Returns the Object
     */
    @JsonGetter("performed_via_github_app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    /**
     * Setter for PerformedViaGithubApp.
     * @param performedViaGithubApp Value for Object
     */
    @JsonSetter("performed_via_github_app")
    public void setPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    /**
     * Getter for RepositoryUrl.
     * @return Returns the String
     */
    @JsonGetter("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * Setter for RepositoryUrl.
     * @param repositoryUrl Value for String
     */
    @JsonSetter("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    /**
     * Getter for State.
     * The new state. Can be `pending`, `success`, `failure`, or `error`.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * The new state. Can be `pending`, `success`, `failure`, or `error`.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for TargetUrl.
     * The optional link added to the status.
     * @return Returns the String
     */
    @JsonGetter("target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * Setter for TargetUrl.
     * The optional link added to the status.
     * @param targetUrl Value for String
     */
    @JsonSetter("target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this DeploymentStatus1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeploymentStatus1 [" + "createdAt=" + createdAt + ", creator=" + creator
                + ", deploymentUrl=" + deploymentUrl + ", description=" + description
                + ", environment=" + environment + ", id=" + id + ", nodeId=" + nodeId
                + ", repositoryUrl=" + repositoryUrl + ", state=" + state + ", targetUrl="
                + targetUrl + ", updatedAt=" + updatedAt + ", url=" + url + ", environmentUrl="
                + environmentUrl + ", logUrl=" + logUrl + ", performedViaGithubApp="
                + performedViaGithubApp + "]";
    }

    /**
     * Builds a new {@link DeploymentStatus1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeploymentStatus1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdAt, creator, deploymentUrl, description, environment,
                id, nodeId, repositoryUrl, state, targetUrl, updatedAt, url)
                .environmentUrl(getEnvironmentUrl())
                .logUrl(getLogUrl())
                .performedViaGithubApp(getPerformedViaGithubApp());
        return builder;
    }

    /**
     * Class to build instances of {@link DeploymentStatus1}.
     */
    public static class Builder {
        private String createdAt;
        private Object creator;
        private String deploymentUrl;
        private String description;
        private String environment;
        private int id;
        private String nodeId;
        private String repositoryUrl;
        private String state;
        private String targetUrl;
        private String updatedAt;
        private String url;
        private String environmentUrl;
        private String logUrl;
        private Object performedViaGithubApp;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdAt  String value for createdAt.
         * @param  creator  Object value for creator.
         * @param  deploymentUrl  String value for deploymentUrl.
         * @param  description  String value for description.
         * @param  environment  String value for environment.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @param  state  String value for state.
         * @param  targetUrl  String value for targetUrl.
         * @param  updatedAt  String value for updatedAt.
         * @param  url  String value for url.
         */
        public Builder(String createdAt, Object creator, String deploymentUrl, String description,
                String environment, int id, String nodeId, String repositoryUrl, String state,
                String targetUrl, String updatedAt, String url) {
            this.createdAt = createdAt;
            this.creator = creator;
            this.deploymentUrl = deploymentUrl;
            this.description = description;
            this.environment = environment;
            this.id = id;
            this.nodeId = nodeId;
            this.repositoryUrl = repositoryUrl;
            this.state = state;
            this.targetUrl = targetUrl;
            this.updatedAt = updatedAt;
            this.url = url;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for creator.
         * @param  creator  Object value for creator.
         * @return Builder
         */
        public Builder creator(Object creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Setter for deploymentUrl.
         * @param  deploymentUrl  String value for deploymentUrl.
         * @return Builder
         */
        public Builder deploymentUrl(String deploymentUrl) {
            this.deploymentUrl = deploymentUrl;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for repositoryUrl.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @return Builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for targetUrl.
         * @param  targetUrl  String value for targetUrl.
         * @return Builder
         */
        public Builder targetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for environmentUrl.
         * @param  environmentUrl  String value for environmentUrl.
         * @return Builder
         */
        public Builder environmentUrl(String environmentUrl) {
            this.environmentUrl = environmentUrl;
            return this;
        }

        /**
         * Setter for logUrl.
         * @param  logUrl  String value for logUrl.
         * @return Builder
         */
        public Builder logUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }

        /**
         * Setter for performedViaGithubApp.
         * @param  performedViaGithubApp  Object value for performedViaGithubApp.
         * @return Builder
         */
        public Builder performedViaGithubApp(Object performedViaGithubApp) {
            this.performedViaGithubApp = performedViaGithubApp;
            return this;
        }

        /**
         * Builds a new {@link DeploymentStatus1} object using the set fields.
         * @return {@link DeploymentStatus1}
         */
        public DeploymentStatus1 build() {
            return new DeploymentStatus1(createdAt, creator, deploymentUrl, description,
                    environment, id, nodeId, repositoryUrl, state, targetUrl, updatedAt, url,
                    environmentUrl, logUrl, performedViaGithubApp);
        }
    }
}
