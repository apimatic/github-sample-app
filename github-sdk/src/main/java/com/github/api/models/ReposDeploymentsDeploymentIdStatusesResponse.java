/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for ReposDeploymentsDeploymentIdStatusesResponse type.
 */
public class ReposDeploymentsDeploymentIdStatusesResponse {
    private String url;
    private int id;
    private String nodeId;
    private State10Enum state;
    private Object creator;
    private String description;
    private String environment;
    private String targetUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String deploymentUrl;
    private String repositoryUrl;
    private String environmentUrl;
    private String logUrl;
    private Object performedViaGithubApp;

    /**
     * Default constructor.
     */
    public ReposDeploymentsDeploymentIdStatusesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  state  State10Enum value for state.
     * @param  creator  Object value for creator.
     * @param  description  String value for description.
     * @param  targetUrl  String value for targetUrl.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  deploymentUrl  String value for deploymentUrl.
     * @param  repositoryUrl  String value for repositoryUrl.
     * @param  environment  String value for environment.
     * @param  environmentUrl  String value for environmentUrl.
     * @param  logUrl  String value for logUrl.
     * @param  performedViaGithubApp  Object value for performedViaGithubApp.
     */
    public ReposDeploymentsDeploymentIdStatusesResponse(
            String url,
            int id,
            String nodeId,
            State10Enum state,
            Object creator,
            String description,
            String targetUrl,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            String deploymentUrl,
            String repositoryUrl,
            String environment,
            String environmentUrl,
            String logUrl,
            Object performedViaGithubApp) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
        this.creator = creator;
        this.description = description;
        this.environment = environment;
        this.targetUrl = targetUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deploymentUrl = deploymentUrl;
        this.repositoryUrl = repositoryUrl;
        this.environmentUrl = environmentUrl;
        this.logUrl = logUrl;
        this.performedViaGithubApp = performedViaGithubApp;
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
     * Getter for State.
     * @return Returns the State10Enum
     */
    @JsonGetter("state")
    public State10Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State10Enum
     */
    @JsonSetter("state")
    public void setState(State10Enum state) {
        this.state = state;
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
     * Getter for Description.
     * A short description of the status.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A short description of the status.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Environment.
     * The environment of the deployment that the status is for.
     * @return Returns the String
     */
    @JsonGetter("environment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnvironment() {
        return environment;
    }

    /**
     * Setter for Environment.
     * The environment of the deployment that the status is for.
     * @param environment Value for String
     */
    @JsonSetter("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Getter for TargetUrl.
     * Deprecated: the URL to associate with this status.
     * @return Returns the String
     */
    @JsonGetter("target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * Setter for TargetUrl.
     * Deprecated: the URL to associate with this status.
     * @param targetUrl Value for String
     */
    @JsonSetter("target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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
     * Getter for EnvironmentUrl.
     * The URL for accessing your environment.
     * @return Returns the String
     */
    @JsonGetter("environment_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnvironmentUrl() {
        return environmentUrl;
    }

    /**
     * Setter for EnvironmentUrl.
     * The URL for accessing your environment.
     * @param environmentUrl Value for String
     */
    @JsonSetter("environment_url")
    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    /**
     * Getter for LogUrl.
     * The URL to associate with this status.
     * @return Returns the String
     */
    @JsonGetter("log_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLogUrl() {
        return logUrl;
    }

    /**
     * Setter for LogUrl.
     * The URL to associate with this status.
     * @param logUrl Value for String
     */
    @JsonSetter("log_url")
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
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
     * Converts this ReposDeploymentsDeploymentIdStatusesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposDeploymentsDeploymentIdStatusesResponse [" + "url=" + url + ", id=" + id
                + ", nodeId=" + nodeId + ", state=" + state + ", creator=" + creator
                + ", description=" + description + ", targetUrl=" + targetUrl + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", deploymentUrl=" + deploymentUrl
                + ", repositoryUrl=" + repositoryUrl + ", environment=" + environment
                + ", environmentUrl=" + environmentUrl + ", logUrl=" + logUrl
                + ", performedViaGithubApp=" + performedViaGithubApp + "]";
    }

    /**
     * Builds a new {@link ReposDeploymentsDeploymentIdStatusesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposDeploymentsDeploymentIdStatusesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, id, nodeId, state, creator, description, targetUrl,
                createdAt, updatedAt, deploymentUrl, repositoryUrl)
                .environment(getEnvironment())
                .environmentUrl(getEnvironmentUrl())
                .logUrl(getLogUrl())
                .performedViaGithubApp(getPerformedViaGithubApp());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposDeploymentsDeploymentIdStatusesResponse}.
     */
    public static class Builder {
        private String url;
        private int id;
        private String nodeId;
        private State10Enum state;
        private Object creator;
        private String description;
        private String targetUrl;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String deploymentUrl;
        private String repositoryUrl;
        private String environment;
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
         * @param  url  String value for url.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  state  State10Enum value for state.
         * @param  creator  Object value for creator.
         * @param  description  String value for description.
         * @param  targetUrl  String value for targetUrl.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  deploymentUrl  String value for deploymentUrl.
         * @param  repositoryUrl  String value for repositoryUrl.
         */
        public Builder(String url, int id, String nodeId, State10Enum state, Object creator,
                String description, String targetUrl, LocalDateTime createdAt,
                LocalDateTime updatedAt, String deploymentUrl, String repositoryUrl) {
            this.url = url;
            this.id = id;
            this.nodeId = nodeId;
            this.state = state;
            this.creator = creator;
            this.description = description;
            this.targetUrl = targetUrl;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.deploymentUrl = deploymentUrl;
            this.repositoryUrl = repositoryUrl;
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
         * Setter for state.
         * @param  state  State10Enum value for state.
         * @return Builder
         */
        public Builder state(State10Enum state) {
            this.state = state;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
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
         * Setter for repositoryUrl.
         * @param  repositoryUrl  String value for repositoryUrl.
         * @return Builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
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
         * Builds a new {@link ReposDeploymentsDeploymentIdStatusesResponse} object using the set
         * fields.
         * @return {@link ReposDeploymentsDeploymentIdStatusesResponse}
         */
        public ReposDeploymentsDeploymentIdStatusesResponse build() {
            return new ReposDeploymentsDeploymentIdStatusesResponse(url, id, nodeId, state, creator,
                    description, targetUrl, createdAt, updatedAt, deploymentUrl, repositoryUrl,
                    environment, environmentUrl, logUrl, performedViaGithubApp);
        }
    }
}
