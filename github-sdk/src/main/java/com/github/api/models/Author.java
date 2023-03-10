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
 * This is a model class for Author type.
 */
public class Author {
    private String name;
    private String email;

    /**
     * Default constructor.
     */
    public Author() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  email  String value for email.
     */
    public Author(
            String name,
            String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
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
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Converts this Author into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Author [" + "name=" + name + ", email=" + email + "]";
    }

    /**
     * Builds a new {@link Author.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Author.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, email);
        return builder;
    }

    /**
     * Class to build instances of {@link Author}.
     */
    public static class Builder {
        private String name;
        private String email;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  email  String value for email.
         */
        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

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
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Builds a new {@link Author} object using the set fields.
         * @return {@link Author}
         */
        public Author build() {
            return new Author(name, email);
        }
    }
}
