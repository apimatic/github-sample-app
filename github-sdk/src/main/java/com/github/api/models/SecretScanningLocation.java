/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.containers.SecretScanningLocationDetails;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SecretScanningLocation type.
 */
public class SecretScanningLocation {
    private Type3Enum type;
    private SecretScanningLocationDetails details;

    /**
     * Default constructor.
     */
    public SecretScanningLocation() {
    }

    /**
     * Initialization constructor.
     * @param  type  Type3Enum value for type.
     * @param  details  SecretScanningLocationDetails value for details.
     */
    public SecretScanningLocation(
            Type3Enum type,
            SecretScanningLocationDetails details) {
        this.type = type;
        this.details = details;
    }

    /**
     * Getter for Type.
     * @return Returns the Type3Enum
     */
    @JsonGetter("type")
    public Type3Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for Type3Enum
     */
    @JsonSetter("type")
    public void setType(Type3Enum type) {
        this.type = type;
    }

    /**
     * Getter for Details.
     * @return Returns the SecretScanningLocationDetails
     */
    @JsonGetter("details")
    public SecretScanningLocationDetails getDetails() {
        return details;
    }

    /**
     * Setter for Details.
     * @param details Value for SecretScanningLocationDetails
     */
    @JsonSetter("details")
    public void setDetails(SecretScanningLocationDetails details) {
        this.details = details;
    }

    /**
     * Converts this SecretScanningLocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecretScanningLocation [" + "type=" + type + ", details=" + details + "]";
    }

    /**
     * Builds a new {@link SecretScanningLocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecretScanningLocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, details);
        return builder;
    }

    /**
     * Class to build instances of {@link SecretScanningLocation}.
     */
    public static class Builder {
        private Type3Enum type;
        private SecretScanningLocationDetails details;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  Type3Enum value for type.
         * @param  details  SecretScanningLocationDetails value for details.
         */
        public Builder(Type3Enum type, SecretScanningLocationDetails details) {
            this.type = type;
            this.details = details;
        }

        /**
         * Setter for type.
         * @param  type  Type3Enum value for type.
         * @return Builder
         */
        public Builder type(Type3Enum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for details.
         * @param  details  SecretScanningLocationDetails value for details.
         * @return Builder
         */
        public Builder details(SecretScanningLocationDetails details) {
            this.details = details;
            return this;
        }

        /**
         * Builds a new {@link SecretScanningLocation} object using the set fields.
         * @return {@link SecretScanningLocation}
         */
        public SecretScanningLocation build() {
            return new SecretScanningLocation(type, details);
        }
    }
}
