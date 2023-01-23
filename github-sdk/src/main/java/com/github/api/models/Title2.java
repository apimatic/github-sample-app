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
 * This is a model class for Title2 type.
 */
public class Title2 {
    private String from;

    /**
     * Default constructor.
     */
    public Title2() {
    }

    /**
     * Initialization constructor.
     * @param  from  String value for from.
     */
    public Title2(
            String from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * The previous version of the title if the action was `edited`.
     * @return Returns the String
     */
    @JsonGetter("from")
    public String getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * The previous version of the title if the action was `edited`.
     * @param from Value for String
     */
    @JsonSetter("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Converts this Title2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Title2 [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link Title2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Title2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link Title2}.
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
         * Builds a new {@link Title2} object using the set fields.
         * @return {@link Title2}
         */
        public Title2 build() {
            return new Title2(from);
        }
    }
}