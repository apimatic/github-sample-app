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
 * This is a model class for ReposGitRefsRefRequest type.
 */
public class ReposGitRefsRefRequest {
    private String sha;
    private Boolean force;

    /**
     * Default constructor.
     */
    public ReposGitRefsRefRequest() {
        force = false;
    }

    /**
     * Initialization constructor.
     * @param  sha  String value for sha.
     * @param  force  Boolean value for force.
     */
    public ReposGitRefsRefRequest(
            String sha,
            Boolean force) {
        this.sha = sha;
        this.force = force;
    }

    /**
     * Getter for Sha.
     * The SHA1 value to set this reference to
     * @return Returns the String
     */
    @JsonGetter("sha")
    public String getSha() {
        return sha;
    }

    /**
     * Setter for Sha.
     * The SHA1 value to set this reference to
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * Getter for Force.
     * Indicates whether to force the update or to make sure the update is a fast-forward update.
     * Leaving this out or setting it to `false` will make sure you're not overwriting work.
     * @return Returns the Boolean
     */
    @JsonGetter("force")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getForce() {
        return force;
    }

    /**
     * Setter for Force.
     * Indicates whether to force the update or to make sure the update is a fast-forward update.
     * Leaving this out or setting it to `false` will make sure you're not overwriting work.
     * @param force Value for Boolean
     */
    @JsonSetter("force")
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * Converts this ReposGitRefsRefRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposGitRefsRefRequest [" + "sha=" + sha + ", force=" + force + "]";
    }

    /**
     * Builds a new {@link ReposGitRefsRefRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposGitRefsRefRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(sha)
                .force(getForce());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposGitRefsRefRequest}.
     */
    public static class Builder {
        private String sha;
        private Boolean force = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  sha  String value for sha.
         */
        public Builder(String sha) {
            this.sha = sha;
        }

        /**
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
            return this;
        }

        /**
         * Setter for force.
         * @param  force  Boolean value for force.
         * @return Builder
         */
        public Builder force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Builds a new {@link ReposGitRefsRefRequest} object using the set fields.
         * @return {@link ReposGitRefsRefRequest}
         */
        public ReposGitRefsRefRequest build() {
            return new ReposGitRefsRefRequest(sha, force);
        }
    }
}
