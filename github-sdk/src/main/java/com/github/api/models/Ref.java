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
 * This is a model class for Ref type.
 */
public class Ref {
    private String from;

    /**
     * Default constructor.
     */
    public Ref() {
    }

    /**
     * Initialization constructor.
     * @param  from  String value for from.
     */
    public Ref(
            String from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the String
     */
    @JsonGetter("from")
    public String getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for String
     */
    @JsonSetter("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Converts this Ref into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Ref [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link Ref.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Ref.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link Ref}.
     */
    public static class Builder {
        private String from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  from  String value for from.
         */
        public Builder(String from) {
            this.from = from;
        }

        /**
         * Setter for from.
         * @param  from  String value for from.
         * @return Builder
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link Ref} object using the set fields.
         * @return {@link Ref}
         */
        public Ref build() {
            return new Ref(from);
        }
    }
}
