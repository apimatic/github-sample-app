/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Base12 type.
 */
public class Base12 {
    private String label;
    private String ref;
    private Repo12 repo;
    private String sha;
    private Object user;

    /**
     * Default constructor.
     */
    public Base12() {
    }

    /**
     * Initialization constructor.
     * @param  label  String value for label.
     * @param  ref  String value for ref.
     * @param  repo  Repo12 value for repo.
     * @param  sha  String value for sha.
     * @param  user  Object value for user.
     */
    public Base12(
            String label,
            String ref,
            Repo12 repo,
            String sha,
            Object user) {
        this.label = label;
        this.ref = ref;
        this.repo = repo;
        this.sha = sha;
        this.user = user;
    }

    /**
     * Getter for Label.
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for Ref.
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for Repo.
     * @return Returns the Repo12
     */
    @JsonGetter("repo")
    public Repo12 getRepo() {
        return repo;
    }

    /**
     * Setter for Repo.
     * @param repo Value for Repo12
     */
    @JsonSetter("repo")
    public void setRepo(Repo12 repo) {
        this.repo = repo;
    }

    /**
     * Getter for Sha.
     * @return Returns the String
     */
    @JsonGetter("sha")
    public String getSha() {
        return sha;
    }

    /**
     * Setter for Sha.
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * Getter for User.
     * @return Returns the Object
     */
    @JsonGetter("user")
    public Object getUser() {
        return user;
    }

    /**
     * Setter for User.
     * @param user Value for Object
     */
    @JsonSetter("user")
    public void setUser(Object user) {
        this.user = user;
    }

    /**
     * Converts this Base12 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Base12 [" + "label=" + label + ", ref=" + ref + ", repo=" + repo + ", sha=" + sha
                + ", user=" + user + "]";
    }

    /**
     * Builds a new {@link Base12.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Base12.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(label, ref, repo, sha, user);
        return builder;
    }

    /**
     * Class to build instances of {@link Base12}.
     */
    public static class Builder {
        private String label;
        private String ref;
        private Repo12 repo;
        private String sha;
        private Object user;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  label  String value for label.
         * @param  ref  String value for ref.
         * @param  repo  Repo12 value for repo.
         * @param  sha  String value for sha.
         * @param  user  Object value for user.
         */
        public Builder(String label, String ref, Repo12 repo, String sha, Object user) {
            this.label = label;
            this.ref = ref;
            this.repo = repo;
            this.sha = sha;
            this.user = user;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
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
         * Setter for repo.
         * @param  repo  Repo12 value for repo.
         * @return Builder
         */
        public Builder repo(Repo12 repo) {
            this.repo = repo;
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
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Builds a new {@link Base12} object using the set fields.
         * @return {@link Base12}
         */
        public Base12 build() {
            return new Base12(label, ref, repo, sha, user);
        }
    }
}
