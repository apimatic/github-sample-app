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
 * This is a model class for Tool type.
 */
public class Tool {
    private String name;
    private String version;

    /**
     * Default constructor.
     */
    public Tool() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  version  String value for version.
     */
    public Tool(
            String name,
            String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * Getter for Name.
     * The name of the tool used to generate the code scanning analysis alert.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the tool used to generate the code scanning analysis alert.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Version.
     * The version of the tool used to detect the alert.
     * @return Returns the String
     */
    @JsonGetter("version")
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * The version of the tool used to detect the alert.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Converts this Tool into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Tool [" + "name=" + name + ", version=" + version + "]";
    }

    /**
     * Builds a new {@link Tool.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Tool.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, version);
        return builder;
    }

    /**
     * Class to build instances of {@link Tool}.
     */
    public static class Builder {
        private String name;
        private String version;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  version  String value for version.
         */
        public Builder(String name, String version) {
            this.name = name;
            this.version = version;
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
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds a new {@link Tool} object using the set fields.
         * @return {@link Tool}
         */
        public Tool build() {
            return new Tool(name, version);
        }
    }
}