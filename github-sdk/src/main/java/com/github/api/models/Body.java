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
 * This is a model class for Body type.
 */
public class Body {
    private String from;

    /**
     * Default constructor.
     */
    public Body() {
    }

    /**
     * Initialization constructor.
     * @param  from  String value for from.
     */
    public Body(
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
     * Converts this Body into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Body [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link Body.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Body.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link Body}.
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
         * Builds a new {@link Body} object using the set fields.
         * @return {@link Body}
         */
        public Body build() {
            return new Body(from);
        }
    }
}
