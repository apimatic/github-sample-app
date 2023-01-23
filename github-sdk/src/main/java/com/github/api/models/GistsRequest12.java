/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.containers.GistsRequest12Files;
import io.apimatic.core.types.BaseModel;
import java.util.Map;

/**
 * This is a model class for GistsRequest12 type.
 */
public class GistsRequest12 {
    private String description;
    private Map<String, Files53> files;

    /**
     * Default constructor.
     */
    public GistsRequest12() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  files  Map of String, value for files.
     */
    public GistsRequest12(
            String description,
            Map<String, Files53> files) {
        this.description = description;
        this.files = files;
    }

    /**
     * Getter for Description.
     * The description of the gist.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description of the gist.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Files.
     * The gist files to be updated, renamed, or deleted. Each `key` must match the current filename
     * (including extension) of the targeted gist file. For example: `hello.py`. To delete a file,
     * set the whole file to null. For example: `hello.py : null`.
     * @return Returns the Map of String, Files53
     */
    @JsonGetter("files")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Files53> getFiles() {
        return files;
    }

    /**
     * Setter for Files.
     * The gist files to be updated, renamed, or deleted. Each `key` must match the current filename
     * (including extension) of the targeted gist file. For example: `hello.py`. To delete a file,
     * set the whole file to null. For example: `hello.py : null`.
     * @param files Value for Map of String, Files53
     */
    @JsonSetter("files")
    public void setFiles(Map<String, Files53> files) {
        this.files = files;
    }

    /**
     * Converts this GistsRequest12 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GistsRequest12 [" + "description=" + description + ", files=" + files + "]";
    }

    /**
     * Builds a new {@link GistsRequest12.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GistsRequest12.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .files(getFiles());
        return builder;
    }

    /**
     * Class to build instances of {@link GistsRequest12}.
     */
    public static class Builder {
        private String description;
        private Map<String, Files53> files;



        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for files.
         * @param  files  Map of String, value for files.
         * @return Builder
         */
        public Builder files(Map<String, Files53> files) {
            this.files = files;
            return this;
        }

        /**
         * Builds a new {@link GistsRequest12} object using the set fields.
         * @return {@link GistsRequest12}
         */
        public GistsRequest12 build() {
            return new GistsRequest12(description, files);
        }
    }
}
