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
 * This is a model class for FirstPatchedVersion1 type.
 */
public class FirstPatchedVersion1 {
    private String identifier;

    /**
     * Default constructor.
     */
    public FirstPatchedVersion1() {
    }

    /**
     * Initialization constructor.
     * @param  identifier  String value for identifier.
     */
    public FirstPatchedVersion1(
            String identifier) {
        this.identifier = identifier;
    }

    /**
     * Getter for Identifier.
     * @return Returns the String
     */
    @JsonGetter("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter for Identifier.
     * @param identifier Value for String
     */
    @JsonSetter("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Converts this FirstPatchedVersion1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FirstPatchedVersion1 [" + "identifier=" + identifier + "]";
    }

    /**
     * Builds a new {@link FirstPatchedVersion1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FirstPatchedVersion1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(identifier);
        return builder;
    }

    /**
     * Class to build instances of {@link FirstPatchedVersion1}.
     */
    public static class Builder {
        private String identifier;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  identifier  String value for identifier.
         */
        public Builder(String identifier) {
            this.identifier = identifier;
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
         * Builds a new {@link FirstPatchedVersion1} object using the set fields.
         * @return {@link FirstPatchedVersion1}
         */
        public FirstPatchedVersion1 build() {
            return new FirstPatchedVersion1(identifier);
        }
    }
}