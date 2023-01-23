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
 * This is a model class for ReposGitRefsRequest type.
 */
public class ReposGitRefsRequest {
    private String ref;
    private String sha;
    private String key;

    /**
     * Default constructor.
     */
    public ReposGitRefsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ref  String value for ref.
     * @param  sha  String value for sha.
     * @param  key  String value for key.
     */
    public ReposGitRefsRequest(
            String ref,
            String sha,
            String key) {
        this.ref = ref;
        this.sha = sha;
        this.key = key;
    }

    /**
     * Getter for Ref.
     * The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with
     * 'refs' and have at least two slashes, it will be rejected.
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with
     * 'refs' and have at least two slashes, it will be rejected.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for Sha.
     * The SHA1 value for this reference.
     * @return Returns the String
     */
    @JsonGetter("sha")
    public String getSha() {
        return sha;
    }

    /**
     * Setter for Sha.
     * The SHA1 value for this reference.
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Converts this ReposGitRefsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposGitRefsRequest [" + "ref=" + ref + ", sha=" + sha + ", key=" + key + "]";
    }

    /**
     * Builds a new {@link ReposGitRefsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposGitRefsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(ref, sha)
                .key(getKey());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposGitRefsRequest}.
     */
    public static class Builder {
        private String ref;
        private String sha;
        private String key;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  ref  String value for ref.
         * @param  sha  String value for sha.
         */
        public Builder(String ref, String sha) {
            this.ref = ref;
            this.sha = sha;
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
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
            return this;
        }

        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds a new {@link ReposGitRefsRequest} object using the set fields.
         * @return {@link ReposGitRefsRequest}
         */
        public ReposGitRefsRequest build() {
            return new ReposGitRefsRequest(ref, sha, key);
        }
    }
}
