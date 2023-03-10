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
 * This is a model class for ActionsOIDCsubjectcustomizationforarepository type.
 */
public class ActionsOIDCsubjectcustomizationforarepository {
    private boolean useDefault;
    private List<String> includeClaimKeys;

    /**
     * Default constructor.
     */
    public ActionsOIDCsubjectcustomizationforarepository() {
    }

    /**
     * Initialization constructor.
     * @param  useDefault  boolean value for useDefault.
     * @param  includeClaimKeys  List of String value for includeClaimKeys.
     */
    public ActionsOIDCsubjectcustomizationforarepository(
            boolean useDefault,
            List<String> includeClaimKeys) {
        this.useDefault = useDefault;
        this.includeClaimKeys = includeClaimKeys;
    }

    /**
     * Getter for UseDefault.
     * Whether to use the default template or not. If `true`, the `include_claim_keys` field is
     * ignored.
     * @return Returns the boolean
     */
    @JsonGetter("use_default")
    public boolean getUseDefault() {
        return useDefault;
    }

    /**
     * Setter for UseDefault.
     * Whether to use the default template or not. If `true`, the `include_claim_keys` field is
     * ignored.
     * @param useDefault Value for boolean
     */
    @JsonSetter("use_default")
    public void setUseDefault(boolean useDefault) {
        this.useDefault = useDefault;
    }

    /**
     * Getter for IncludeClaimKeys.
     * Array of unique strings. Each claim key can only contain alphanumeric characters and
     * underscores.
     * @return Returns the List of String
     */
    @JsonGetter("include_claim_keys")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ActionsOIDCsubjectcustomizationforarepository into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActionsOIDCsubjectcustomizationforarepository [" + "useDefault=" + useDefault
                + ", includeClaimKeys=" + includeClaimKeys + "]";
    }

    /**
     * Builds a new {@link ActionsOIDCsubjectcustomizationforarepository.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActionsOIDCsubjectcustomizationforarepository.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(useDefault)
                .includeClaimKeys(getIncludeClaimKeys());
        return builder;
    }

    /**
     * Class to build instances of {@link ActionsOIDCsubjectcustomizationforarepository}.
     */
    public static class Builder {
        private boolean useDefault;
        private List<String> includeClaimKeys;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  useDefault  boolean value for useDefault.
         */
        public Builder(boolean useDefault) {
            this.useDefault = useDefault;
        }

        /**
         * Setter for useDefault.
         * @param  useDefault  boolean value for useDefault.
         * @return Builder
         */
        public Builder useDefault(boolean useDefault) {
            this.useDefault = useDefault;
            return this;
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
         * Builds a new {@link ActionsOIDCsubjectcustomizationforarepository} object using the set
         * fields.
         * @return {@link ActionsOIDCsubjectcustomizationforarepository}
         */
        public ActionsOIDCsubjectcustomizationforarepository build() {
            return new ActionsOIDCsubjectcustomizationforarepository(useDefault, includeClaimKeys);
        }
    }
}
