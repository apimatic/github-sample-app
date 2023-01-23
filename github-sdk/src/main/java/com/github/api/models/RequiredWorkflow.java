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
 * This is a model class for RequiredWorkflow type.
 */
public class RequiredWorkflow {
    private double id;
    private String name;
    private String path;
    private Scope1Enum scope;
    private String ref;
    private State2Enum state;
    private String selectedRepositoriesUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Repository7 repository;

    /**
     * Default constructor.
     */
    public RequiredWorkflow() {
    }

    /**
     * Initialization constructor.
     * @param  id  double value for id.
     * @param  name  String value for name.
     * @param  path  String value for path.
     * @param  scope  Scope1Enum value for scope.
     * @param  ref  String value for ref.
     * @param  state  State2Enum value for state.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  repository  Repository7 value for repository.
     * @param  selectedRepositoriesUrl  String value for selectedRepositoriesUrl.
     */
    public RequiredWorkflow(
            double id,
            String name,
            String path,
            Scope1Enum scope,
            String ref,
            State2Enum state,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Repository7 repository,
            String selectedRepositoriesUrl) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.scope = scope;
        this.ref = ref;
        this.state = state;
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.repository = repository;
    }

    /**
     * Getter for Id.
     * Unique identifier for a required workflow
     * @return Returns the double
     */
    @JsonGetter("id")
    public double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier for a required workflow
     * @param id Value for double
     */
    @JsonSetter("id")
    public void setId(double id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * Name present in the workflow file
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name present in the workflow file
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Path.
     * Path of the workflow file
     * @return Returns the String
     */
    @JsonGetter("path")
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * Path of the workflow file
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Scope.
     * @return Returns the Scope1Enum
     */
    @JsonGetter("scope")
    public Scope1Enum getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * @param scope Value for Scope1Enum
     */
    @JsonSetter("scope")
    public void setScope(Scope1Enum scope) {
        this.scope = scope;
    }

    /**
     * Getter for Ref.
     * Ref at which the workflow file will be selected
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * Ref at which the workflow file will be selected
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for State.
     * @return Returns the State2Enum
     */
    @JsonGetter("state")
    public State2Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State2Enum
     */
    @JsonSetter("state")
    public void setState(State2Enum state) {
        this.state = state;
    }

    /**
     * Getter for SelectedRepositoriesUrl.
     * @return Returns the String
     */
    @JsonGetter("selected_repositories_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSelectedRepositoriesUrl() {
        return selectedRepositoriesUrl;
    }

    /**
     * Setter for SelectedRepositoriesUrl.
     * @param selectedRepositoriesUrl Value for String
     */
    @JsonSetter("selected_repositories_url")
    public void setSelectedRepositoriesUrl(String selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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
     * Converts this RequiredWorkflow into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RequiredWorkflow [" + "id=" + id + ", name=" + name + ", path=" + path + ", scope="
                + scope + ", ref=" + ref + ", state=" + state + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", repository=" + repository
                + ", selectedRepositoriesUrl=" + selectedRepositoriesUrl + "]";
    }

    /**
     * Builds a new {@link RequiredWorkflow.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RequiredWorkflow.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, path, scope, ref, state, createdAt, updatedAt,
                repository)
                .selectedRepositoriesUrl(getSelectedRepositoriesUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link RequiredWorkflow}.
     */
    public static class Builder {
        private double id;
        private String name;
        private String path;
        private Scope1Enum scope;
        private String ref;
        private State2Enum state;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Repository7 repository;
        private String selectedRepositoriesUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  double value for id.
         * @param  name  String value for name.
         * @param  path  String value for path.
         * @param  scope  Scope1Enum value for scope.
         * @param  ref  String value for ref.
         * @param  state  State2Enum value for state.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  repository  Repository7 value for repository.
         */
        public Builder(double id, String name, String path, Scope1Enum scope, String ref,
                State2Enum state, LocalDateTime createdAt, LocalDateTime updatedAt,
                Repository7 repository) {
            this.id = id;
            this.name = name;
            this.path = path;
            this.scope = scope;
            this.ref = ref;
            this.state = state;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.repository = repository;
        }

        /**
         * Setter for id.
         * @param  id  double value for id.
         * @return Builder
         */
        public Builder id(double id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  Scope1Enum value for scope.
         * @return Builder
         */
        public Builder scope(Scope1Enum scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State2Enum value for state.
         * @return Builder
         */
        public Builder state(State2Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
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
         * Setter for selectedRepositoriesUrl.
         * @param  selectedRepositoriesUrl  String value for selectedRepositoriesUrl.
         * @return Builder
         */
        public Builder selectedRepositoriesUrl(String selectedRepositoriesUrl) {
            this.selectedRepositoriesUrl = selectedRepositoriesUrl;
            return this;
        }

        /**
         * Builds a new {@link RequiredWorkflow} object using the set fields.
         * @return {@link RequiredWorkflow}
         */
        public RequiredWorkflow build() {
            return new RequiredWorkflow(id, name, path, scope, ref, state, createdAt, updatedAt,
                    repository, selectedRepositoriesUrl);
        }
    }
}