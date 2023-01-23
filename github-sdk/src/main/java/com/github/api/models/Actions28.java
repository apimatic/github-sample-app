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
 * This is a model class for Actions28 type.
 */
public class Actions28 {
    private String label;
    private String description;
    private String identifier;

    /**
     * Default constructor.
     */
    public Actions28() {
    }

    /**
     * Initialization constructor.
     * @param  label  String value for label.
     * @param  description  String value for description.
     * @param  identifier  String value for identifier.
     */
    public Actions28(
            String label,
            String description,
            String identifier) {
        this.label = label;
        this.description = description;
        this.identifier = identifier;
    }

    /**
     * Getter for Label.
     * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for Description.
     * A short explanation of what this action would do. The maximum size is 40 characters.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A short explanation of what this action would do. The maximum size is 40 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Identifier.
     * A reference for the action on the integrator's system. The maximum size is 20 characters.
     * @return Returns the String
     */
    @JsonGetter("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter for Identifier.
     * A reference for the action on the integrator's system. The maximum size is 20 characters.
     * @param identifier Value for String
     */
    @JsonSetter("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Converts this Actions28 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Actions28 [" + "label=" + label + ", description=" + description + ", identifier="
                + identifier + "]";
    }

    /**
     * Builds a new {@link Actions28.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Actions28.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(label, description, identifier);
        return builder;
    }

    /**
     * Class to build instances of {@link Actions28}.
     */
    public static class Builder {
        private String label;
        private String description;
        private String identifier;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  label  String value for label.
         * @param  description  String value for description.
         * @param  identifier  String value for identifier.
         */
        public Builder(String label, String description, String identifier) {
            this.label = label;
            this.description = description;
            this.identifier = identifier;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
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
         * Setter for identifier.
         * @param  identifier  String value for identifier.
         * @return Builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Builds a new {@link Actions28} object using the set fields.
         * @return {@link Actions28}
         */
        public Actions28 build() {
            return new Actions28(label, description, identifier);
        }
    }
}