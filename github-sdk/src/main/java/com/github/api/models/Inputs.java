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
 * This is a model class for Inputs type.
 */
public class Inputs {
    private String name;
    private String number;

    /**
     * Default constructor.
     */
    public Inputs() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  number  String value for number.
     */
    public Inputs(
            String name,
            String number) {
        this.name = name;
        this.number = number;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Converts this Inputs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Inputs [" + "name=" + name + ", number=" + number + "]";
    }

    /**
     * Builds a new {@link Inputs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Inputs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .number(getNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link Inputs}.
     */
    public static class Builder {
        private String name;
        private String number;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Builds a new {@link Inputs} object using the set fields.
         * @return {@link Inputs}
         */
        public Inputs build() {
            return new Inputs(name, number);
        }
    }
}