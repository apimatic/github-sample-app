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
 * This is a model class for Label8 type.
 */
public class Label8 {
    private long id;
    private String nodeId;
    private String url;
    private String name;
    private String description;
    private String color;
    private boolean mDefault;

    /**
     * Default constructor.
     */
    public Label8() {
    }

    /**
     * Initialization constructor.
     * @param  id  long value for id.
     * @param  nodeId  String value for nodeId.
     * @param  url  String value for url.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  color  String value for color.
     * @param  mDefault  boolean value for mDefault.
     */
    public Label8(
            long id,
            String nodeId,
            String url,
            String name,
            String description,
            String color,
            boolean mDefault) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.name = name;
        this.description = description;
        this.color = color;
        this.mDefault = mDefault;
    }

    /**
     * Getter for Id.
     * @return Returns the long
     */
    @JsonGetter("id")
    public long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for long
     */
    @JsonSetter("id")
    public void setId(long id) {
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
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Color.
     * @return Returns the String
     */
    @JsonGetter("color")
    public String getColor() {
        return color;
    }

    /**
     * Setter for Color.
     * @param color Value for String
     */
    @JsonSetter("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for Default.
     * @return Returns the boolean
     */
    @JsonGetter("default")
    public boolean getDefault() {
        return mDefault;
    }

    /**
     * Setter for Default.
     * @param mDefault Value for boolean
     */
    @JsonSetter("default")
    public void setDefault(boolean mDefault) {
        this.mDefault = mDefault;
    }

    /**
     * Converts this Label8 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Label8 [" + "id=" + id + ", nodeId=" + nodeId + ", url=" + url + ", name=" + name
                + ", description=" + description + ", color=" + color + ", mDefault=" + mDefault
                + "]";
    }

    /**
     * Builds a new {@link Label8.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Label8.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, url, name, description, color, mDefault);
        return builder;
    }

    /**
     * Class to build instances of {@link Label8}.
     */
    public static class Builder {
        private long id;
        private String nodeId;
        private String url;
        private String name;
        private String description;
        private String color;
        private boolean mDefault;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  long value for id.
         * @param  nodeId  String value for nodeId.
         * @param  url  String value for url.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  color  String value for color.
         * @param  mDefault  boolean value for mDefault.
         */
        public Builder(long id, String nodeId, String url, String name, String description,
                String color, boolean mDefault) {
            this.id = id;
            this.nodeId = nodeId;
            this.url = url;
            this.name = name;
            this.description = description;
            this.color = color;
            this.mDefault = mDefault;
        }

        /**
         * Setter for id.
         * @param  id  long value for id.
         * @return Builder
         */
        public Builder id(long id) {
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for color.
         * @param  color  String value for color.
         * @return Builder
         */
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        /**
         * Setter for mDefault.
         * @param  mDefault  boolean value for mDefault.
         * @return Builder
         */
        public Builder mDefault(boolean mDefault) {
            this.mDefault = mDefault;
            return this;
        }

        /**
         * Builds a new {@link Label8} object using the set fields.
         * @return {@link Label8}
         */
        public Label8 build() {
            return new Label8(id, nodeId, url, name, description, color, mDefault);
        }
    }
}
