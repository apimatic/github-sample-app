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
 * This is a model class for Owner11 type.
 */
public class Owner11 {
    private From3 from;

    /**
     * Default constructor.
     */
    public Owner11() {
    }

    /**
     * Initialization constructor.
     * @param  from  From3 value for from.
     */
    public Owner11(
            From3 from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the From3
     */
    @JsonGetter("from")
    public From3 getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for From3
     */
    @JsonSetter("from")
    public void setFrom(From3 from) {
        this.from = from;
    }

    /**
     * Converts this Owner11 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Owner11 [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link Owner11.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Owner11.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link Owner11}.
     */
    public static class Builder {
        private From3 from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  from  From3 value for from.
         */
        public Builder(From3 from) {
            this.from = from;
        }

        /**
         * Setter for from.
         * @param  from  From3 value for from.
         * @return Builder
         */
        public Builder from(From3 from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link Owner11} object using the set fields.
         * @return {@link Owner11}
         */
        public Owner11 build() {
            return new Owner11(from);
        }
    }
}
