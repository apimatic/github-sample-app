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
 * This is a model class for Permissions121 type.
 */
public class Permissions121 {
    private From5 from;

    /**
     * Default constructor.
     */
    public Permissions121() {
    }

    /**
     * Initialization constructor.
     * @param  from  From5 value for from.
     */
    public Permissions121(
            From5 from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the From5
     */
    @JsonGetter("from")
    public From5 getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for From5
     */
    @JsonSetter("from")
    public void setFrom(From5 from) {
        this.from = from;
    }

    /**
     * Converts this Permissions121 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Permissions121 [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link Permissions121.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Permissions121.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link Permissions121}.
     */
    public static class Builder {
        private From5 from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  from  From5 value for from.
         */
        public Builder(From5 from) {
            this.from = from;
        }

        /**
         * Setter for from.
         * @param  from  From5 value for from.
         * @return Builder
         */
        public Builder from(From5 from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link Permissions121} object using the set fields.
         * @return {@link Permissions121}
         */
        public Permissions121 build() {
            return new Permissions121(from);
        }
    }
}
