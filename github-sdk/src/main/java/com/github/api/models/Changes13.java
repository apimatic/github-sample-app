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
 * This is a model class for Changes13 type.
 */
public class Changes13 {
    private Description description;
    private DueOn dueOn;
    private Title2 title;

    /**
     * Default constructor.
     */
    public Changes13() {
    }

    /**
     * Initialization constructor.
     * @param  description  Description value for description.
     * @param  dueOn  DueOn value for dueOn.
     * @param  title  Title2 value for title.
     */
    public Changes13(
            Description description,
            DueOn dueOn,
            Title2 title) {
        this.description = description;
        this.dueOn = dueOn;
        this.title = title;
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
     * Getter for DueOn.
     * @return Returns the DueOn
     */
    @JsonGetter("due_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DueOn getDueOn() {
        return dueOn;
    }

    /**
     * Setter for DueOn.
     * @param dueOn Value for DueOn
     */
    @JsonSetter("due_on")
    public void setDueOn(DueOn dueOn) {
        this.dueOn = dueOn;
    }

    /**
     * Getter for Title.
     * @return Returns the Title2
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Title2 getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for Title2
     */
    @JsonSetter("title")
    public void setTitle(Title2 title) {
        this.title = title;
    }

    /**
     * Converts this Changes13 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes13 [" + "description=" + description + ", dueOn=" + dueOn + ", title="
                + title + "]";
    }

    /**
     * Builds a new {@link Changes13.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes13.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .dueOn(getDueOn())
                .title(getTitle());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes13}.
     */
    public static class Builder {
        private Description description;
        private DueOn dueOn;
        private Title2 title;



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
         * Setter for dueOn.
         * @param  dueOn  DueOn value for dueOn.
         * @return Builder
         */
        public Builder dueOn(DueOn dueOn) {
            this.dueOn = dueOn;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  Title2 value for title.
         * @return Builder
         */
        public Builder title(Title2 title) {
            this.title = title;
            return this;
        }

        /**
         * Builds a new {@link Changes13} object using the set fields.
         * @return {@link Changes13}
         */
        public Changes13 build() {
            return new Changes13(description, dueOn, title);
        }
    }
}
