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
 * This is a model class for Permissions6 type.
 */
public class Permissions6 {
    private boolean canCreateRepository;

    /**
     * Default constructor.
     */
    public Permissions6() {
    }

    /**
     * Initialization constructor.
     * @param  canCreateRepository  boolean value for canCreateRepository.
     */
    public Permissions6(
            boolean canCreateRepository) {
        this.canCreateRepository = canCreateRepository;
    }

    /**
     * Getter for CanCreateRepository.
     * @return Returns the boolean
     */
    @JsonGetter("can_create_repository")
    public boolean getCanCreateRepository() {
        return canCreateRepository;
    }

    /**
     * Setter for CanCreateRepository.
     * @param canCreateRepository Value for boolean
     */
    @JsonSetter("can_create_repository")
    public void setCanCreateRepository(boolean canCreateRepository) {
        this.canCreateRepository = canCreateRepository;
    }

    /**
     * Converts this Permissions6 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Permissions6 [" + "canCreateRepository=" + canCreateRepository + "]";
    }

    /**
     * Builds a new {@link Permissions6.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Permissions6.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(canCreateRepository);
        return builder;
    }

    /**
     * Class to build instances of {@link Permissions6}.
     */
    public static class Builder {
        private boolean canCreateRepository;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  canCreateRepository  boolean value for canCreateRepository.
         */
        public Builder(boolean canCreateRepository) {
            this.canCreateRepository = canCreateRepository;
        }

        /**
         * Setter for canCreateRepository.
         * @param  canCreateRepository  boolean value for canCreateRepository.
         * @return Builder
         */
        public Builder canCreateRepository(boolean canCreateRepository) {
            this.canCreateRepository = canCreateRepository;
            return this;
        }

        /**
         * Builds a new {@link Permissions6} object using the set fields.
         * @return {@link Permissions6}
         */
        public Permissions6 build() {
            return new Permissions6(canCreateRepository);
        }
    }
}