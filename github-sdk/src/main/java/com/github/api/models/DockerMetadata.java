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
 * This is a model class for DockerMetadata type.
 */
public class DockerMetadata {
    private List<String> tag;

    /**
     * Default constructor.
     */
    public DockerMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  tag  List of String value for tag.
     */
    public DockerMetadata(
            List<String> tag) {
        this.tag = tag;
    }

    /**
     * Getter for Tag.
     * @return Returns the List of String
     */
    @JsonGetter("tag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * @param tag Value for List of String
     */
    @JsonSetter("tag")
    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    /**
     * Converts this DockerMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DockerMetadata [" + "tag=" + tag + "]";
    }

    /**
     * Builds a new {@link DockerMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DockerMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tag(getTag());
        return builder;
    }

    /**
     * Class to build instances of {@link DockerMetadata}.
     */
    public static class Builder {
        private List<String> tag;



        /**
         * Setter for tag.
         * @param  tag  List of String value for tag.
         * @return Builder
         */
        public Builder tag(List<String> tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link DockerMetadata} object using the set fields.
         * @return {@link DockerMetadata}
         */
        public DockerMetadata build() {
            return new DockerMetadata(tag);
        }
    }
}
