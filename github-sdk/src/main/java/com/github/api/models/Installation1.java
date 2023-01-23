/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Installation1 type.
 */
public class Installation1 {
    private int id;
    private String nodeId;

    /**
     * Default constructor.
     */
    public Installation1() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     */
    public Installation1(
            int id,
            String nodeId) {
        this.id = id;
        this.nodeId = nodeId;
    }

    /**
     * Getter for Id.
     * The ID of the installation.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the installation.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * The global node ID of the installation.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * The global node ID of the installation.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Converts this Installation1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Installation1 [" + "id=" + id + ", nodeId=" + nodeId + "]";
    }

    /**
     * Builds a new {@link Installation1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Installation1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId);
        return builder;
    }

    /**
     * Class to build instances of {@link Installation1}.
     */
    public static class Builder {
        private int id;
        private String nodeId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         */
        public Builder(int id, String nodeId) {
            this.id = id;
            this.nodeId = nodeId;
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
         * Builds a new {@link Installation1} object using the set fields.
         * @return {@link Installation1}
         */
        public Installation1 build() {
            return new Installation1(id, nodeId);
        }
    }
}
