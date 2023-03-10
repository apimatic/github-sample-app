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
 * This is a model class for Tier type.
 */
public class Tier {
    private From52 from;

    /**
     * Default constructor.
     */
    public Tier() {
    }

    /**
     * Initialization constructor.
     * @param  from  From52 value for from.
     */
    public Tier(
            From52 from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the From52
     */
    @JsonGetter("from")
    public From52 getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for From52
     */
    @JsonSetter("from")
    public void setFrom(From52 from) {
        this.from = from;
    }

    /**
     * Converts this Tier into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Tier [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link Tier.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Tier.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link Tier}.
     */
    public static class Builder {
        private From52 from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  from  From52 value for from.
         */
        public Builder(From52 from) {
            this.from = from;
        }

        /**
         * Setter for from.
         * @param  from  From52 value for from.
         * @return Builder
         */
        public Builder from(From52 from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link Tier} object using the set fields.
         * @return {@link Tier}
         */
        public Tier build() {
            return new Tier(from);
        }
    }
}
