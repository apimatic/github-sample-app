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
 * This is a model class for ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2 type.
 */
public class ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2 {
    private Integer id;
    private String nodeId;
    private String name;

    /**
     * Default constructor.
     */
    public ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  nodeId  String value for nodeId.
     * @param  name  String value for name.
     */
    public ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2(
            Integer id,
            String nodeId,
            String name) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
    }

    /**
     * Getter for Id.
     * The unique identifier of the branch policy.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The unique identifier of the branch policy.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * The name pattern that branches must match in order to deploy to the environment.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name pattern that branches must match in order to deploy to the environment.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2 [" + "id=" + id
                + ", nodeId=" + nodeId + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .nodeId(getNodeId())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2}.
     */
    public static class Builder {
        private Integer id;
        private String nodeId;
        private String name;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
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
         * Builds a new {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2}
         * object using the set fields.
         * @return {@link ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2}
         */
        public ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2 build() {
            return new ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse2(id, nodeId,
                    name);
        }
    }
}
