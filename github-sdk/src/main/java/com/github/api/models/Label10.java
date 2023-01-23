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
 * This is a model class for Label10 type.
 */
public class Label10 {
    private String color;
    private boolean mDefault;
    private String description;
    private int id;
    private String name;
    private String nodeId;
    private String url;

    /**
     * Default constructor.
     */
    public Label10() {
    }

    /**
     * Initialization constructor.
     * @param  color  String value for color.
     * @param  mDefault  boolean value for mDefault.
     * @param  description  String value for description.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  nodeId  String value for nodeId.
     * @param  url  String value for url.
     */
    public Label10(
            String color,
            boolean mDefault,
            String description,
            int id,
            String name,
            String nodeId,
            String url) {
        this.color = color;
        this.mDefault = mDefault;
        this.description = description;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.url = url;
    }

    /**
     * Getter for Color.
     * 6-character hex code, without the leading #, identifying the color
     * @return Returns the String
     */
    @JsonGetter("color")
    public String getColor() {
        return color;
    }

    /**
     * Setter for Color.
     * 6-character hex code, without the leading #, identifying the color
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
     * Getter for Name.
     * The name of the label.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the label.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * URL for the label
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * URL for the label
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this Label10 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Label10 [" + "color=" + color + ", mDefault=" + mDefault + ", description="
                + description + ", id=" + id + ", name=" + name + ", nodeId=" + nodeId + ", url="
                + url + "]";
    }

    /**
     * Builds a new {@link Label10.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Label10.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(color, mDefault, description, id, name, nodeId, url);
        return builder;
    }

    /**
     * Class to build instances of {@link Label10}.
     */
    public static class Builder {
        private String color;
        private boolean mDefault;
        private String description;
        private int id;
        private String name;
        private String nodeId;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  color  String value for color.
         * @param  mDefault  boolean value for mDefault.
         * @param  description  String value for description.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  nodeId  String value for nodeId.
         * @param  url  String value for url.
         */
        public Builder(String color, boolean mDefault, String description, int id, String name,
                String nodeId, String url) {
            this.color = color;
            this.mDefault = mDefault;
            this.description = description;
            this.id = id;
            this.name = name;
            this.nodeId = nodeId;
            this.url = url;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Builds a new {@link Label10} object using the set fields.
         * @return {@link Label10}
         */
        public Label10 build() {
            return new Label10(color, mDefault, description, id, name, nodeId, url);
        }
    }
}