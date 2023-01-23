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
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest type.
 */
public class ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest {
    private List<String> contexts;

    /**
     * Default constructor.
     */
    public ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  contexts  List of String value for contexts.
     */
    @JsonCreator
    public ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest(
            @JsonProperty("contexts") List<String> contexts) {
        this.contexts = contexts;
    }

    /**
     * Getter for Contexts.
     * The name of the status checks
     * @return Returns the List of String
     */
    @JsonGetter("contexts")
    public List<String> getContexts() {
        return contexts;
    }

    /**
     * Setter for Contexts.
     * The name of the status checks
     * @param contexts Value for List of String
     */
    @JsonSetter("contexts")
    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    /**
     * Converts this ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest [" + "contexts="
                + contexts + "]";
    }

    /**
     * Builds a new {@link ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contexts);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest}.
     */
    public static class Builder {
        private List<String> contexts;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contexts  List of String value for contexts.
         */
        public Builder(List<String> contexts) {
            this.contexts = contexts;
        }

        /**
         * Setter for contexts.
         * @param  contexts  List of String value for contexts.
         * @return Builder
         */
        public Builder contexts(List<String> contexts) {
            this.contexts = contexts;
            return this;
        }

        /**
         * Builds a new {@link ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest}
         * object using the set fields.
         * @return {@link ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest}
         */
        public ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest build() {
            return new ReposBranchesBranchProtectionRequiredStatusChecksContextsRequest(contexts);
        }
    }
}
