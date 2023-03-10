/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for UserCodespacesSecretsRepositoriesRequest type.
 */
public class UserCodespacesSecretsRepositoriesRequest {
    private List<Integer> selectedRepositoryIds;

    /**
     * Default constructor.
     */
    public UserCodespacesSecretsRepositoriesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
     */
    public UserCodespacesSecretsRepositoriesRequest(
            List<Integer> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Getter for SelectedRepositoryIds.
     * An array of repository ids for which a codespace can access the secret. You can manage the
     * list of selected repositories using the [List selected repositories for a user
     * secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret),
     * [Add a selected repository to a user
     * secret](https://docs.github.com/rest/reference/codespaces#add-a-selected-repository-to-a-user-secret),
     * and [Remove a selected repository from a user
     * secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret)
     * endpoints.
     * @return Returns the List of Integer
     */
    @JsonGetter("selected_repository_ids")
    public List<Integer> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    /**
     * Setter for SelectedRepositoryIds.
     * An array of repository ids for which a codespace can access the secret. You can manage the
     * list of selected repositories using the [List selected repositories for a user
     * secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret),
     * [Add a selected repository to a user
     * secret](https://docs.github.com/rest/reference/codespaces#add-a-selected-repository-to-a-user-secret),
     * and [Remove a selected repository from a user
     * secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret)
     * endpoints.
     * @param selectedRepositoryIds Value for List of Integer
     */
    @JsonSetter("selected_repository_ids")
    public void setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Converts this UserCodespacesSecretsRepositoriesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UserCodespacesSecretsRepositoriesRequest [" + "selectedRepositoryIds="
                + selectedRepositoryIds + "]";
    }

    /**
     * Builds a new {@link UserCodespacesSecretsRepositoriesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UserCodespacesSecretsRepositoriesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(selectedRepositoryIds);
        return builder;
    }

    /**
     * Class to build instances of {@link UserCodespacesSecretsRepositoriesRequest}.
     */
    public static class Builder {
        private List<Integer> selectedRepositoryIds;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
         */
        public Builder(List<Integer> selectedRepositoryIds) {
            this.selectedRepositoryIds = selectedRepositoryIds;
        }

        /**
         * Setter for selectedRepositoryIds.
         * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
         * @return Builder
         */
        public Builder selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
            this.selectedRepositoryIds = selectedRepositoryIds;
            return this;
        }

        /**
         * Builds a new {@link UserCodespacesSecretsRepositoriesRequest} object using the set
         * fields.
         * @return {@link UserCodespacesSecretsRepositoriesRequest}
         */
        public UserCodespacesSecretsRepositoriesRequest build() {
            return new UserCodespacesSecretsRepositoriesRequest(selectedRepositoryIds);
        }
    }
}
