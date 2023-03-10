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
 * This is a model class for Changes20 type.
 */
public class Changes20 {
    private ArchivedAt archivedAt;

    /**
     * Default constructor.
     */
    public Changes20() {
    }

    /**
     * Initialization constructor.
     * @param  archivedAt  ArchivedAt value for archivedAt.
     */
    public Changes20(
            ArchivedAt archivedAt) {
        this.archivedAt = archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * @return Returns the ArchivedAt
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ArchivedAt getArchivedAt() {
        return archivedAt;
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for ArchivedAt
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(ArchivedAt archivedAt) {
        this.archivedAt = archivedAt;
    }

    /**
     * Converts this Changes20 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes20 [" + "archivedAt=" + archivedAt + "]";
    }

    /**
     * Builds a new {@link Changes20.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes20.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .archivedAt(getArchivedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes20}.
     */
    public static class Builder {
        private ArchivedAt archivedAt;



        /**
         * Setter for archivedAt.
         * @param  archivedAt  ArchivedAt value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(ArchivedAt archivedAt) {
            this.archivedAt = archivedAt;
            return this;
        }

        /**
         * Builds a new {@link Changes20} object using the set fields.
         * @return {@link Changes20}
         */
        public Changes20 build() {
            return new Changes20(archivedAt);
        }
    }
}
