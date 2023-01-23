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
 * This is a model class for RequiredStatusChecks type.
 */
public class RequiredStatusChecks {
    private List<String> from;

    /**
     * Default constructor.
     */
    public RequiredStatusChecks() {
    }

    /**
     * Initialization constructor.
     * @param  from  List of String value for from.
     */
    public RequiredStatusChecks(
            List<String> from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the List of String
     */
    @JsonGetter("from")
    public List<String> getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for List of String
     */
    @JsonSetter("from")
    public void setFrom(List<String> from) {
        this.from = from;
    }

    /**
     * Converts this RequiredStatusChecks into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RequiredStatusChecks [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link RequiredStatusChecks.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RequiredStatusChecks.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link RequiredStatusChecks}.
     */
    public static class Builder {
        private List<String> from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  from  List of String value for from.
         */
        public Builder(List<String> from) {
            this.from = from;
        }

        /**
         * Setter for from.
         * @param  from  List of String value for from.
         * @return Builder
         */
        public Builder from(List<String> from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link RequiredStatusChecks} object using the set fields.
         * @return {@link RequiredStatusChecks}
         */
        public RequiredStatusChecks build() {
            return new RequiredStatusChecks(from);
        }
    }
}