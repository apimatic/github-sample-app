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
 * This is a model class for OrgsActionsPermissionsRepositoriesRequest type.
 */
public class OrgsActionsPermissionsRepositoriesRequest {
    private List<Integer> selectedRepositoryIds;

    /**
     * Default constructor.
     */
    public OrgsActionsPermissionsRepositoriesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
     */
    public OrgsActionsPermissionsRepositoriesRequest(
            List<Integer> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Getter for SelectedRepositoryIds.
     * List of repository IDs to enable for GitHub Actions.
     * @return Returns the List of Integer
     */
    @JsonGetter("selected_repository_ids")
    public List<Integer> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    /**
     * Setter for SelectedRepositoryIds.
     * List of repository IDs to enable for GitHub Actions.
     * @param selectedRepositoryIds Value for List of Integer
     */
    @JsonSetter("selected_repository_ids")
    public void setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Converts this OrgsActionsPermissionsRepositoriesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsPermissionsRepositoriesRequest [" + "selectedRepositoryIds="
                + selectedRepositoryIds + "]";
    }

    /**
     * Builds a new {@link OrgsActionsPermissionsRepositoriesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsPermissionsRepositoriesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(selectedRepositoryIds);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsPermissionsRepositoriesRequest}.
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
         * Builds a new {@link OrgsActionsPermissionsRepositoriesRequest} object using the set
         * fields.
         * @return {@link OrgsActionsPermissionsRepositoriesRequest}
         */
        public OrgsActionsPermissionsRepositoriesRequest build() {
            return new OrgsActionsPermissionsRepositoriesRequest(selectedRepositoryIds);
        }
    }
}