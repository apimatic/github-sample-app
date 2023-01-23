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

/**
 * This is a model class for Changes192 type.
 */
public class Changes192 {
    private Body4 body;
    private Name2 name;

    /**
     * Default constructor.
     */
    public Changes192() {
    }

    /**
     * Initialization constructor.
     * @param  body  Body4 value for body.
     * @param  name  Name2 value for name.
     */
    public Changes192(
            Body4 body,
            Name2 name) {
        this.body = body;
        this.name = name;
    }

    /**
     * Getter for Body.
     * @return Returns the Body4
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Body4 getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for Body4
     */
    @JsonSetter("body")
    public void setBody(Body4 body) {
        this.body = body;
    }

    /**
     * Getter for Name.
     * @return Returns the Name2
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Name2 getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for Name2
     */
    @JsonSetter("name")
    public void setName(Name2 name) {
        this.name = name;
    }

    /**
     * Converts this Changes192 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes192 [" + "body=" + body + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link Changes192.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes192.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .body(getBody())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes192}.
     */
    public static class Builder {
        private Body4 body;
        private Name2 name;



        /**
         * Setter for body.
         * @param  body  Body4 value for body.
         * @return Builder
         */
        public Builder body(Body4 body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  Name2 value for name.
         * @return Builder
         */
        public Builder name(Name2 name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link Changes192} object using the set fields.
         * @return {@link Changes192}
         */
        public Changes192 build() {
            return new Changes192(body, name);
        }
    }
}