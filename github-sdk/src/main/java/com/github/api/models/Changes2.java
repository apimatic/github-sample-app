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
 * This is a model class for Changes2 type.
 */
public class Changes2 {
    private Body body;

    /**
     * Default constructor.
     */
    public Changes2() {
    }

    /**
     * Initialization constructor.
     * @param  body  Body value for body.
     */
    public Changes2(
            Body body) {
        this.body = body;
    }

    /**
     * Getter for Body.
     * @return Returns the Body
     */
    @JsonGetter("body")
    public Body getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for Body
     */
    @JsonSetter("body")
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * Converts this Changes2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes2 [" + "body=" + body + "]";
    }

    /**
     * Builds a new {@link Changes2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body);
        return builder;
    }

    /**
     * Class to build instances of {@link Changes2}.
     */
    public static class Builder {
        private Body body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  body  Body value for body.
         */
        public Builder(Body body) {
            this.body = body;
        }

        /**
         * Setter for body.
         * @param  body  Body value for body.
         * @return Builder
         */
        public Builder body(Body body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link Changes2} object using the set fields.
         * @return {@link Changes2}
         */
        public Changes2 build() {
            return new Changes2(body);
        }
    }
}
