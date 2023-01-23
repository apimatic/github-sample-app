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
 * This is a model class for Defaults type.
 */
public class Defaults {
    private String location;
    private String devcontainerPath;

    /**
     * Default constructor.
     */
    public Defaults() {
    }

    /**
     * Initialization constructor.
     * @param  location  String value for location.
     * @param  devcontainerPath  String value for devcontainerPath.
     */
    public Defaults(
            String location,
            String devcontainerPath) {
        this.location = location;
        this.devcontainerPath = devcontainerPath;
    }

    /**
     * Getter for Location.
     * @return Returns the String
     */
    @JsonGetter("location")
    public String getLocation() {
        return location;
    }

    /**
     * Setter for Location.
     * @param location Value for String
     */
    @JsonSetter("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for DevcontainerPath.
     * @return Returns the String
     */
    @JsonGetter("devcontainer_path")
    public String getDevcontainerPath() {
        return devcontainerPath;
    }

    /**
     * Setter for DevcontainerPath.
     * @param devcontainerPath Value for String
     */
    @JsonSetter("devcontainer_path")
    public void setDevcontainerPath(String devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
    }

    /**
     * Converts this Defaults into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Defaults [" + "location=" + location + ", devcontainerPath=" + devcontainerPath
                + "]";
    }

    /**
     * Builds a new {@link Defaults.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Defaults.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(location, devcontainerPath);
        return builder;
    }

    /**
     * Class to build instances of {@link Defaults}.
     */
    public static class Builder {
        private String location;
        private String devcontainerPath;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  location  String value for location.
         * @param  devcontainerPath  String value for devcontainerPath.
         */
        public Builder(String location, String devcontainerPath) {
            this.location = location;
            this.devcontainerPath = devcontainerPath;
        }

        /**
         * Setter for location.
         * @param  location  String value for location.
         * @return Builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Setter for devcontainerPath.
         * @param  devcontainerPath  String value for devcontainerPath.
         * @return Builder
         */
        public Builder devcontainerPath(String devcontainerPath) {
            this.devcontainerPath = devcontainerPath;
            return this;
        }

        /**
         * Builds a new {@link Defaults} object using the set fields.
         * @return {@link Defaults}
         */
        public Defaults build() {
            return new Defaults(location, devcontainerPath);
        }
    }
}