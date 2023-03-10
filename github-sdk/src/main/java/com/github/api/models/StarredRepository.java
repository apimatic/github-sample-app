/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for StarredRepository type.
 */
public class StarredRepository {
    private LocalDateTime starredAt;
    private Repo6 repo;

    /**
     * Default constructor.
     */
    public StarredRepository() {
    }

    /**
     * Initialization constructor.
     * @param  starredAt  LocalDateTime value for starredAt.
     * @param  repo  Repo6 value for repo.
     */
    @JsonCreator
    public StarredRepository(
            @JsonProperty("starred_at") LocalDateTime starredAt,
            @JsonProperty("repo") Repo6 repo) {
        this.starredAt = starredAt;
        this.repo = repo;
    }

    /**
     * Getter for StarredAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("starred_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStarredAt() {
        return starredAt;
    }

    /**
     * Setter for StarredAt.
     * @param starredAt Value for LocalDateTime
     */
    @JsonSetter("starred_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStarredAt(LocalDateTime starredAt) {
        this.starredAt = starredAt;
    }

    /**
     * Getter for Repo.
     * @return Returns the Repo6
     */
    @JsonGetter("repo")
    public Repo6 getRepo() {
        return repo;
    }

    /**
     * Setter for Repo.
     * @param repo Value for Repo6
     */
    @JsonSetter("repo")
    public void setRepo(Repo6 repo) {
        this.repo = repo;
    }

    /**
     * Converts this StarredRepository into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StarredRepository [" + "starredAt=" + starredAt + ", repo=" + repo + "]";
    }

    /**
     * Builds a new {@link StarredRepository.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StarredRepository.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(starredAt, repo);
        return builder;
    }

    /**
     * Class to build instances of {@link StarredRepository}.
     */
    public static class Builder {
        private LocalDateTime starredAt;
        private Repo6 repo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  starredAt  LocalDateTime value for starredAt.
         * @param  repo  Repo6 value for repo.
         */
        public Builder(LocalDateTime starredAt, Repo6 repo) {
            this.starredAt = starredAt;
            this.repo = repo;
        }

        /**
         * Setter for starredAt.
         * @param  starredAt  LocalDateTime value for starredAt.
         * @return Builder
         */
        public Builder starredAt(LocalDateTime starredAt) {
            this.starredAt = starredAt;
            return this;
        }

        /**
         * Setter for repo.
         * @param  repo  Repo6 value for repo.
         * @return Builder
         */
        public Builder repo(Repo6 repo) {
            this.repo = repo;
            return this;
        }

        /**
         * Builds a new {@link StarredRepository} object using the set fields.
         * @return {@link StarredRepository}
         */
        public StarredRepository build() {
            return new StarredRepository(starredAt, repo);
        }
    }
}
