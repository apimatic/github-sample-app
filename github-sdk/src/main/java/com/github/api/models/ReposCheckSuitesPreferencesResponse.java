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
 * This is a model class for ReposCheckSuitesPreferencesResponse type.
 */
public class ReposCheckSuitesPreferencesResponse {
    private Preferences preferences;
    private Repository7 repository;

    /**
     * Default constructor.
     */
    public ReposCheckSuitesPreferencesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  preferences  Preferences value for preferences.
     * @param  repository  Repository7 value for repository.
     */
    public ReposCheckSuitesPreferencesResponse(
            Preferences preferences,
            Repository7 repository) {
        this.preferences = preferences;
        this.repository = repository;
    }

    /**
     * Getter for Preferences.
     * @return Returns the Preferences
     */
    @JsonGetter("preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Setter for Preferences.
     * @param preferences Value for Preferences
     */
    @JsonSetter("preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    /**
     * Getter for Repository.
     * @return Returns the Repository7
     */
    @JsonGetter("repository")
    public Repository7 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository7
     */
    @JsonSetter("repository")
    public void setRepository(Repository7 repository) {
        this.repository = repository;
    }

    /**
     * Converts this ReposCheckSuitesPreferencesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCheckSuitesPreferencesResponse [" + "preferences=" + preferences
                + ", repository=" + repository + "]";
    }

    /**
     * Builds a new {@link ReposCheckSuitesPreferencesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCheckSuitesPreferencesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(preferences, repository);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCheckSuitesPreferencesResponse}.
     */
    public static class Builder {
        private Preferences preferences;
        private Repository7 repository;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  preferences  Preferences value for preferences.
         * @param  repository  Repository7 value for repository.
         */
        public Builder(Preferences preferences, Repository7 repository) {
            this.preferences = preferences;
            this.repository = repository;
        }

        /**
         * Setter for preferences.
         * @param  preferences  Preferences value for preferences.
         * @return Builder
         */
        public Builder preferences(Preferences preferences) {
            this.preferences = preferences;
            return this;
        }

        /**
         * Setter for repository.
         * @param  repository  Repository7 value for repository.
         * @return Builder
         */
        public Builder repository(Repository7 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Builds a new {@link ReposCheckSuitesPreferencesResponse} object using the set fields.
         * @return {@link ReposCheckSuitesPreferencesResponse}
         */
        public ReposCheckSuitesPreferencesResponse build() {
            return new ReposCheckSuitesPreferencesResponse(preferences, repository);
        }
    }
}
