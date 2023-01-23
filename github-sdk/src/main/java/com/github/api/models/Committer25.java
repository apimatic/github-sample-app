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
 * This is a model class for Committer25 type.
 */
public class Committer25 {
    private String name;
    private String email;
    private String date;

    /**
     * Default constructor.
     */
    public Committer25() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  date  String value for date.
     */
    public Committer25(
            String name,
            String email,
            String date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    /**
     * Getter for Name.
     * The name of the author or committer of the commit. You'll receive a `422` status code if
     * `name` is omitted.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the author or committer of the commit. You'll receive a `422` status code if
     * `name` is omitted.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Email.
     * The email of the author or committer of the commit. You'll receive a `422` status code if
     * `email` is omitted.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The email of the author or committer of the commit. You'll receive a `422` status code if
     * `email` is omitted.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Date.
     * @return Returns the String
     */
    @JsonGetter("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * @param date Value for String
     */
    @JsonSetter("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Converts this Committer25 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Committer25 [" + "name=" + name + ", email=" + email + ", date=" + date + "]";
    }

    /**
     * Builds a new {@link Committer25.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Committer25.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, email)
                .date(getDate());
        return builder;
    }

    /**
     * Class to build instances of {@link Committer25}.
     */
    public static class Builder {
        private String name;
        private String email;
        private String date;

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
         * Setter for date.
         * @param  date  String value for date.
         * @return Builder
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * Builds a new {@link Committer25} object using the set fields.
         * @return {@link Committer25}
         */
        public Committer25 build() {
            return new Committer25(name, email, date);
        }
    }
}
