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
 * This is a model class for Topic type.
 */
public class Topic {
    private List<String> names;

    /**
     * Default constructor.
     */
    public Topic() {
    }

    /**
     * Initialization constructor.
     * @param  names  List of String value for names.
     */
    public Topic(
            List<String> names) {
        this.names = names;
    }

    /**
     * Getter for Names.
     * @return Returns the List of String
     */
    @JsonGetter("names")
    public List<String> getNames() {
        return names;
    }

    /**
     * Setter for Names.
     * @param names Value for List of String
     */
    @JsonSetter("names")
    public void setNames(List<String> names) {
        this.names = names;
    }

    /**
     * Converts this Topic into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Topic [" + "names=" + names + "]";
    }

    /**
     * Builds a new {@link Topic.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Topic.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(names);
        return builder;
    }

    /**
     * Class to build instances of {@link Topic}.
     */
    public static class Builder {
        private List<String> names;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  names  List of String value for names.
         */
        public Builder(List<String> names) {
            this.names = names;
        }

        /**
         * Setter for names.
         * @param  names  List of String value for names.
         * @return Builder
         */
        public Builder names(List<String> names) {
            this.names = names;
            return this;
        }

        /**
         * Builds a new {@link Topic} object using the set fields.
         * @return {@link Topic}
         */
        public Topic build() {
            return new Topic(names);
        }
    }
}
