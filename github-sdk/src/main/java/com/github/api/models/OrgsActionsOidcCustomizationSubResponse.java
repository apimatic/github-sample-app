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
 * This is a model class for OrgsActionsOidcCustomizationSubResponse type.
 */
public class OrgsActionsOidcCustomizationSubResponse {
    private List<String> includeClaimKeys;

    /**
     * Default constructor.
     */
    public OrgsActionsOidcCustomizationSubResponse() {
    }

    /**
     * Initialization constructor.
     * @param  includeClaimKeys  List of String value for includeClaimKeys.
     */
    public OrgsActionsOidcCustomizationSubResponse(
            List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
    }

    /**
     * Getter for IncludeClaimKeys.
     * Array of unique strings. Each claim key can only contain alphanumeric characters and
     * underscores.
     * @return Returns the List of String
     */
    @JsonGetter("include_claim_keys")
    public List<String> getIncludeClaimKeys() {
        return includeClaimKeys;
    }

    /**
     * Setter for IncludeClaimKeys.
     * Array of unique strings. Each claim key can only contain alphanumeric characters and
     * underscores.
     * @param includeClaimKeys Value for List of String
     */
    @JsonSetter("include_claim_keys")
    public void setIncludeClaimKeys(List<String> includeClaimKeys) {
        this.includeClaimKeys = includeClaimKeys;
    }

    /**
     * Converts this OrgsActionsOidcCustomizationSubResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsOidcCustomizationSubResponse [" + "includeClaimKeys=" + includeClaimKeys
                + "]";
    }

    /**
     * Builds a new {@link OrgsActionsOidcCustomizationSubResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsOidcCustomizationSubResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(includeClaimKeys);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsOidcCustomizationSubResponse}.
     */
    public static class Builder {
        private List<String> includeClaimKeys;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  includeClaimKeys  List of String value for includeClaimKeys.
         */
        public Builder(List<String> includeClaimKeys) {
            this.includeClaimKeys = includeClaimKeys;
        }

        /**
         * Setter for includeClaimKeys.
         * @param  includeClaimKeys  List of String value for includeClaimKeys.
         * @return Builder
         */
        public Builder includeClaimKeys(List<String> includeClaimKeys) {
            this.includeClaimKeys = includeClaimKeys;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsOidcCustomizationSubResponse} object using the set fields.
         * @return {@link OrgsActionsOidcCustomizationSubResponse}
         */
        public OrgsActionsOidcCustomizationSubResponse build() {
            return new OrgsActionsOidcCustomizationSubResponse(includeClaimKeys);
        }
    }
}
