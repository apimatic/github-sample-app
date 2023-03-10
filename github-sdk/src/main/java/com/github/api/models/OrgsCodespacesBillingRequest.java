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
import java.util.List;

/**
 * This is a model class for OrgsCodespacesBillingRequest type.
 */
public class OrgsCodespacesBillingRequest {
    private Visibility84Enum visibility;
    private List<String> selectedUsernames;

    /**
     * Default constructor.
     */
    public OrgsCodespacesBillingRequest() {
    }

    /**
     * Initialization constructor.
     * @param  visibility  Visibility84Enum value for visibility.
     * @param  selectedUsernames  List of String value for selectedUsernames.
     */
    public OrgsCodespacesBillingRequest(
            Visibility84Enum visibility,
            List<String> selectedUsernames) {
        this.visibility = visibility;
        this.selectedUsernames = selectedUsernames;
    }

    /**
     * Getter for Visibility.
     * @return Returns the Visibility84Enum
     */
    @JsonGetter("visibility")
    public Visibility84Enum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * @param visibility Value for Visibility84Enum
     */
    @JsonSetter("visibility")
    public void setVisibility(Visibility84Enum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for SelectedUsernames.
     * The usernames of the organization members who should have access to codespaces in the
     * organization. Required when `visibility` is `selected_members`. The provided list of
     * usernames will replace any existing value.
     * @return Returns the List of String
     */
    @JsonGetter("selected_usernames")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSelectedUsernames() {
        return selectedUsernames;
    }

    /**
     * Setter for SelectedUsernames.
     * The usernames of the organization members who should have access to codespaces in the
     * organization. Required when `visibility` is `selected_members`. The provided list of
     * usernames will replace any existing value.
     * @param selectedUsernames Value for List of String
     */
    @JsonSetter("selected_usernames")
    public void setSelectedUsernames(List<String> selectedUsernames) {
        this.selectedUsernames = selectedUsernames;
    }

    /**
     * Converts this OrgsCodespacesBillingRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsCodespacesBillingRequest [" + "visibility=" + visibility
                + ", selectedUsernames=" + selectedUsernames + "]";
    }

    /**
     * Builds a new {@link OrgsCodespacesBillingRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsCodespacesBillingRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(visibility)
                .selectedUsernames(getSelectedUsernames());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsCodespacesBillingRequest}.
     */
    public static class Builder {
        private Visibility84Enum visibility;
        private List<String> selectedUsernames;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  visibility  Visibility84Enum value for visibility.
         */
        public Builder(Visibility84Enum visibility) {
            this.visibility = visibility;
        }

        /**
         * Setter for visibility.
         * @param  visibility  Visibility84Enum value for visibility.
         * @return Builder
         */
        public Builder visibility(Visibility84Enum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for selectedUsernames.
         * @param  selectedUsernames  List of String value for selectedUsernames.
         * @return Builder
         */
        public Builder selectedUsernames(List<String> selectedUsernames) {
            this.selectedUsernames = selectedUsernames;
            return this;
        }

        /**
         * Builds a new {@link OrgsCodespacesBillingRequest} object using the set fields.
         * @return {@link OrgsCodespacesBillingRequest}
         */
        public OrgsCodespacesBillingRequest build() {
            return new OrgsCodespacesBillingRequest(visibility, selectedUsernames);
        }
    }
}
