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
 * This is a model class for Permissions13 type.
 */
public class Permissions13 {
    private String metadata;
    private String contents;
    private String issues;
    private String singleFile;

    /**
     * Default constructor.
     */
    public Permissions13() {
    }

    /**
     * Initialization constructor.
     * @param  metadata  String value for metadata.
     * @param  contents  String value for contents.
     * @param  issues  String value for issues.
     * @param  singleFile  String value for singleFile.
     */
    public Permissions13(
            String metadata,
            String contents,
            String issues,
            String singleFile) {
        this.metadata = metadata;
        this.contents = contents;
        this.issues = issues;
        this.singleFile = singleFile;
    }

    /**
     * Getter for Metadata.
     * @return Returns the String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for String
     */
    @JsonSetter("metadata")
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Contents.
     * @return Returns the String
     */
    @JsonGetter("contents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContents() {
        return contents;
    }

    /**
     * Setter for Contents.
     * @param contents Value for String
     */
    @JsonSetter("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Getter for Issues.
     * @return Returns the String
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for String
     */
    @JsonSetter("issues")
    public void setIssues(String issues) {
        this.issues = issues;
    }

    /**
     * Getter for SingleFile.
     * @return Returns the String
     */
    @JsonGetter("single_file")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSingleFile() {
        return singleFile;
    }

    /**
     * Setter for SingleFile.
     * @param singleFile Value for String
     */
    @JsonSetter("single_file")
    public void setSingleFile(String singleFile) {
        this.singleFile = singleFile;
    }

    /**
     * Converts this Permissions13 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Permissions13 [" + "metadata=" + metadata + ", contents=" + contents + ", issues="
                + issues + ", singleFile=" + singleFile + "]";
    }

    /**
     * Builds a new {@link Permissions13.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Permissions13.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .metadata(getMetadata())
                .contents(getContents())
                .issues(getIssues())
                .singleFile(getSingleFile());
        return builder;
    }

    /**
     * Class to build instances of {@link Permissions13}.
     */
    public static class Builder {
        private String metadata;
        private String contents;
        private String issues;
        private String singleFile;



        /**
         * Setter for metadata.
         * @param  metadata  String value for metadata.
         * @return Builder
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for contents.
         * @param  contents  String value for contents.
         * @return Builder
         */
        public Builder contents(String contents) {
            this.contents = contents;
            return this;
        }

        /**
         * Setter for issues.
         * @param  issues  String value for issues.
         * @return Builder
         */
        public Builder issues(String issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Setter for singleFile.
         * @param  singleFile  String value for singleFile.
         * @return Builder
         */
        public Builder singleFile(String singleFile) {
            this.singleFile = singleFile;
            return this;
        }

        /**
         * Builds a new {@link Permissions13} object using the set fields.
         * @return {@link Permissions13}
         */
        public Permissions13 build() {
            return new Permissions13(metadata, contents, issues, singleFile);
        }
    }
}