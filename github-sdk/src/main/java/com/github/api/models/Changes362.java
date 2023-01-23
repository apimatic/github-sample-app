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
 * This is a model class for Changes362 type.
 */
public class Changes362 {
    private Description description;
    private Name name;
    private Privacy141 privacy;
    private Repository79 repository;

    /**
     * Default constructor.
     */
    public Changes362() {
    }

    /**
     * Initialization constructor.
     * @param  description  Description value for description.
     * @param  name  Name value for name.
     * @param  privacy  Privacy141 value for privacy.
     * @param  repository  Repository79 value for repository.
     */
    public Changes362(
            Description description,
            Name name,
            Privacy141 privacy,
            Repository79 repository) {
        this.description = description;
        this.name = name;
        this.privacy = privacy;
        this.repository = repository;
    }

    /**
     * Getter for Description.
     * @return Returns the Description
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Description getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for Description
     */
    @JsonSetter("description")
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * Getter for Name.
     * @return Returns the Name
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Name getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for Name
     */
    @JsonSetter("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Getter for Privacy.
     * @return Returns the Privacy141
     */
    @JsonGetter("privacy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Privacy141 getPrivacy() {
        return privacy;
    }

    /**
     * Setter for Privacy.
     * @param privacy Value for Privacy141
     */
    @JsonSetter("privacy")
    public void setPrivacy(Privacy141 privacy) {
        this.privacy = privacy;
    }

    /**
     * Getter for Repository.
     * @return Returns the Repository79
     */
    @JsonGetter("repository")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Repository79 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository79
     */
    @JsonSetter("repository")
    public void setRepository(Repository79 repository) {
        this.repository = repository;
    }

    /**
     * Converts this Changes362 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes362 [" + "description=" + description + ", name=" + name + ", privacy="
                + privacy + ", repository=" + repository + "]";
    }

    /**
     * Builds a new {@link Changes362.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes362.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .name(getName())
                .privacy(getPrivacy())
                .repository(getRepository());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes362}.
     */
    public static class Builder {
        private Description description;
        private Name name;
        private Privacy141 privacy;
        private Repository79 repository;



        /**
         * Setter for description.
         * @param  description  Description value for description.
         * @return Builder
         */
        public Builder description(Description description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  Name value for name.
         * @return Builder
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for privacy.
         * @param  privacy  Privacy141 value for privacy.
         * @return Builder
         */
        public Builder privacy(Privacy141 privacy) {
            this.privacy = privacy;
            return this;
        }

        /**
         * Setter for repository.
         * @param  repository  Repository79 value for repository.
         * @return Builder
         */
        public Builder repository(Repository79 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Builds a new {@link Changes362} object using the set fields.
         * @return {@link Changes362}
         */
        public Changes362 build() {
            return new Changes362(description, name, privacy, repository);
        }
    }
}
