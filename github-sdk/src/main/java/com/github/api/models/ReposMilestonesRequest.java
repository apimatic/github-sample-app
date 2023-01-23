/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for ReposMilestonesRequest type.
 */
public class ReposMilestonesRequest {
    private String title;
    private State177Enum state;
    private String description;
    private LocalDateTime dueOn;

    /**
     * Default constructor.
     */
    public ReposMilestonesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  state  State177Enum value for state.
     * @param  description  String value for description.
     * @param  dueOn  LocalDateTime value for dueOn.
     */
    public ReposMilestonesRequest(
            String title,
            State177Enum state,
            String description,
            LocalDateTime dueOn) {
        this.title = title;
        this.state = state;
        this.description = description;
        this.dueOn = dueOn;
    }

    /**
     * Getter for Title.
     * The title of the milestone.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * The title of the milestone.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for State.
     * @return Returns the State177Enum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public State177Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State177Enum
     */
    @JsonSetter("state")
    public void setState(State177Enum state) {
        this.state = state;
    }

    /**
     * Getter for Description.
     * A description of the milestone.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A description of the milestone.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for DueOn.
     * The milestone due date. This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("due_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDueOn() {
        return dueOn;
    }

    /**
     * Setter for DueOn.
     * The milestone due date. This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @param dueOn Value for LocalDateTime
     */
    @JsonSetter("due_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueOn(LocalDateTime dueOn) {
        this.dueOn = dueOn;
    }

    /**
     * Converts this ReposMilestonesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposMilestonesRequest [" + "title=" + title + ", state=" + state + ", description="
                + description + ", dueOn=" + dueOn + "]";
    }

    /**
     * Builds a new {@link ReposMilestonesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposMilestonesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title)
                .state(getState())
                .description(getDescription())
                .dueOn(getDueOn());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposMilestonesRequest}.
     */
    public static class Builder {
        private String title;
        private State177Enum state;
        private String description;
        private LocalDateTime dueOn;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         */
        public Builder(String title) {
            this.title = title;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State177Enum value for state.
         * @return Builder
         */
        public Builder state(State177Enum state) {
            this.state = state;
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
         * Setter for dueOn.
         * @param  dueOn  LocalDateTime value for dueOn.
         * @return Builder
         */
        public Builder dueOn(LocalDateTime dueOn) {
            this.dueOn = dueOn;
            return this;
        }

        /**
         * Builds a new {@link ReposMilestonesRequest} object using the set fields.
         * @return {@link ReposMilestonesRequest}
         */
        public ReposMilestonesRequest build() {
            return new ReposMilestonesRequest(title, state, description, dueOn);
        }
    }
}
