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
 * This is a model class for GitReference type.
 */
public class GitReference {
    private String ref;
    private String nodeId;
    private String url;
    private ObjectType object;

    /**
     * Default constructor.
     */
    public GitReference() {
    }

    /**
     * Initialization constructor.
     * @param  ref  String value for ref.
     * @param  nodeId  String value for nodeId.
     * @param  url  String value for url.
     * @param  object  ObjectType value for object.
     */
    public GitReference(
            String ref,
            String nodeId,
            String url,
            ObjectType object) {
        this.ref = ref;
        this.nodeId = nodeId;
        this.url = url;
        this.object = object;
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
     * Getter for Object.
     * @return Returns the ObjectType
     */
    @JsonGetter("object")
    public ObjectType getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * @param object Value for ObjectType
     */
    @JsonSetter("object")
    public void setObject(ObjectType object) {
        this.object = object;
    }

    /**
     * Converts this GitReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GitReference [" + "ref=" + ref + ", nodeId=" + nodeId + ", url=" + url + ", object="
                + object + "]";
    }

    /**
     * Builds a new {@link GitReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GitReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ref, nodeId, url, object);
        return builder;
    }

    /**
     * Class to build instances of {@link GitReference}.
     */
    public static class Builder {
        private String ref;
        private String nodeId;
        private String url;
        private ObjectType object;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ref  String value for ref.
         * @param  nodeId  String value for nodeId.
         * @param  url  String value for url.
         * @param  object  ObjectType value for object.
         */
        public Builder(String ref, String nodeId, String url, ObjectType object) {
            this.ref = ref;
            this.nodeId = nodeId;
            this.url = url;
            this.object = object;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
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
         * Setter for object.
         * @param  object  ObjectType value for object.
         * @return Builder
         */
        public Builder object(ObjectType object) {
            this.object = object;
            return this;
        }

        /**
         * Builds a new {@link GitReference} object using the set fields.
         * @return {@link GitReference}
         */
        public GitReference build() {
            return new GitReference(ref, nodeId, url, object);
        }
    }
}
