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
 * This is a model class for RepositoriesEnvironmentsVariablesNameRequest type.
 */
public class RepositoriesEnvironmentsVariablesNameRequest {
    private String name;
    private String value;

    /**
     * Default constructor.
     */
    public RepositoriesEnvironmentsVariablesNameRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  value  String value for value.
     */
    public RepositoriesEnvironmentsVariablesNameRequest(
            String name,
            String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Getter for Name.
     * The name of the variable.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the variable.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Value.
     * The value of the variable.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value of the variable.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this RepositoriesEnvironmentsVariablesNameRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RepositoriesEnvironmentsVariablesNameRequest [" + "name=" + name + ", value="
                + value + "]";
    }

    /**
     * Builds a new {@link RepositoriesEnvironmentsVariablesNameRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RepositoriesEnvironmentsVariablesNameRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link RepositoriesEnvironmentsVariablesNameRequest}.
     */
    public static class Builder {
        private String name;
        private String value;



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
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link RepositoriesEnvironmentsVariablesNameRequest} object using the set
         * fields.
         * @return {@link RepositoriesEnvironmentsVariablesNameRequest}
         */
        public RepositoriesEnvironmentsVariablesNameRequest build() {
            return new RepositoriesEnvironmentsVariablesNameRequest(name, value);
        }
    }
}
