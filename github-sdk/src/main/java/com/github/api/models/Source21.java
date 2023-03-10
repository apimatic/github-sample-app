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

/**
 * This is a model class for Source21 type.
 */
public class Source21 {
    private String branch;
    private Path1Enum path;

    /**
     * Default constructor.
     */
    public Source21() {
    }

    /**
     * Initialization constructor.
     * @param  branch  String value for branch.
     * @param  path  Path1Enum value for path.
     */
    @JsonCreator
    public Source21(
            @JsonProperty("branch") String branch,
            @JsonProperty("path") Path1Enum path) {
        this.branch = branch;
        this.path = path;
    }

    /**
     * Getter for Branch.
     * The repository branch used to publish your site's source files.
     * @return Returns the String
     */
    @JsonGetter("branch")
    public String getBranch() {
        return branch;
    }

    /**
     * Setter for Branch.
     * The repository branch used to publish your site's source files.
     * @param branch Value for String
     */
    @JsonSetter("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * Getter for Path.
     * @return Returns the Path1Enum
     */
    @JsonGetter("path")
    public Path1Enum getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * @param path Value for Path1Enum
     */
    @JsonSetter("path")
    public void setPath(Path1Enum path) {
        this.path = path;
    }

    /**
     * Converts this Source21 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Source21 [" + "branch=" + branch + ", path=" + path + "]";
    }

    /**
     * Builds a new {@link Source21.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Source21.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(branch, path);
        return builder;
    }

    /**
     * Class to build instances of {@link Source21}.
     */
    public static class Builder {
        private String branch;
        private Path1Enum path;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  branch  String value for branch.
         * @param  path  Path1Enum value for path.
         */
        public Builder(String branch, Path1Enum path) {
            this.branch = branch;
            this.path = path;
        }

        /**
         * Setter for branch.
         * @param  branch  String value for branch.
         * @return Builder
         */
        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  Path1Enum value for path.
         * @return Builder
         */
        public Builder path(Path1Enum path) {
            this.path = path;
            return this;
        }

        /**
         * Builds a new {@link Source21} object using the set fields.
         * @return {@link Source21}
         */
        public Source21 build() {
            return new Source21(branch, path);
        }
    }
}
