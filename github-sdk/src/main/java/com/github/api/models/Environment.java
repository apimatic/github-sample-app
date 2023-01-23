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
import com.github.api.models.containers.EnvironmentProtectionRules;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for Environment type.
 */
public class Environment {
    private int id;
    private String nodeId;
    private String name;
    private String url;
    private String htmlUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<ProtectionRule3> protectionRules;
    private Object deploymentBranchPolicy;

    /**
     * Default constructor.
     */
    public Environment() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  name  String value for name.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  protectionRules  List of ProtectionRule3 value for protectionRules.
     * @param  deploymentBranchPolicy  Object value for deploymentBranchPolicy.
     */
    public Environment(
            int id,
            String nodeId,
            String name,
            String url,
            String htmlUrl,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            List<ProtectionRule3> protectionRules,
            Object deploymentBranchPolicy) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.protectionRules = protectionRules;
        this.deploymentBranchPolicy = deploymentBranchPolicy;
    }

    /**
     * Getter for Id.
     * The id of the environment.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the environment.
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
     * Getter for Name.
     * The name of the environment.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the environment.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for CreatedAt.
     * The time that the environment was created, in ISO 8601 format.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * The time that the environment was created, in ISO 8601 format.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The time that the environment was last updated, in ISO 8601 format.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * The time that the environment was last updated, in ISO 8601 format.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for ProtectionRules.
     * @return Returns the List of ProtectionRule3
     */
    @JsonGetter("protection_rules")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProtectionRule3> getProtectionRules() {
        return protectionRules;
    }

    /**
     * Setter for ProtectionRules.
     * @param protectionRules Value for List of ProtectionRule3
     */
    @JsonSetter("protection_rules")
    public void setProtectionRules(List<ProtectionRule3> protectionRules) {
        this.protectionRules = protectionRules;
    }

    /**
     * Getter for DeploymentBranchPolicy.
     * @return Returns the Object
     */
    @JsonGetter("deployment_branch_policy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getDeploymentBranchPolicy() {
        return deploymentBranchPolicy;
    }

    /**
     * Setter for DeploymentBranchPolicy.
     * @param deploymentBranchPolicy Value for Object
     */
    @JsonSetter("deployment_branch_policy")
    public void setDeploymentBranchPolicy(Object deploymentBranchPolicy) {
        this.deploymentBranchPolicy = deploymentBranchPolicy;
    }

    /**
     * Converts this Environment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Environment [" + "id=" + id + ", nodeId=" + nodeId + ", name=" + name + ", url="
                + url + ", htmlUrl=" + htmlUrl + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", protectionRules=" + protectionRules + ", deploymentBranchPolicy="
                + deploymentBranchPolicy + "]";
    }

    /**
     * Builds a new {@link Environment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Environment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, name, url, htmlUrl, createdAt, updatedAt)
                .protectionRules(getProtectionRules())
                .deploymentBranchPolicy(getDeploymentBranchPolicy());
        return builder;
    }

    /**
     * Class to build instances of {@link Environment}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private String name;
        private String url;
        private String htmlUrl;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private List<ProtectionRule3> protectionRules;
        private Object deploymentBranchPolicy;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  name  String value for name.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         */
        public Builder(int id, String nodeId, String name, String url, String htmlUrl,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
            this.id = id;
            this.nodeId = nodeId;
            this.name = name;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for protectionRules.
         * @param  protectionRules  List of ProtectionRule3 value for protectionRules.
         * @return Builder
         */
        public Builder protectionRules(List<ProtectionRule3> protectionRules) {
            this.protectionRules = protectionRules;
            return this;
        }

        /**
         * Setter for deploymentBranchPolicy.
         * @param  deploymentBranchPolicy  Object value for deploymentBranchPolicy.
         * @return Builder
         */
        public Builder deploymentBranchPolicy(Object deploymentBranchPolicy) {
            this.deploymentBranchPolicy = deploymentBranchPolicy;
            return this;
        }

        /**
         * Builds a new {@link Environment} object using the set fields.
         * @return {@link Environment}
         */
        public Environment build() {
            return new Environment(id, nodeId, name, url, htmlUrl, createdAt, updatedAt,
                    protectionRules, deploymentBranchPolicy);
        }
    }
}