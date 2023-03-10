/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for Committer1 type.
 */
public class Committer1 {
    private LocalDateTime date;
    private String email;
    private String name;

    /**
     * Default constructor.
     */
    public Committer1() {
    }

    /**
     * Initialization constructor.
     * @param  date  LocalDateTime value for date.
     * @param  email  String value for email.
     * @param  name  String value for name.
     */
    public Committer1(
            LocalDateTime date,
            String email,
            String name) {
        this.date = date;
        this.email = email;
        this.name = name;
    }

    /**
     * Getter for Date.
     * Timestamp of the commit
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * Timestamp of the commit
     * @param date Value for LocalDateTime
     */
    @JsonSetter("date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * Getter for Email.
     * Git email address of the user
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Git email address of the user
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Name.
     * Name of the git user
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the git user
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this Committer1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Committer1 [" + "date=" + date + ", email=" + email + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link Committer1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Committer1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(date, email, name);
        return builder;
    }

    /**
     * Class to build instances of {@link Committer1}.
     */
    public static class Builder {
        private LocalDateTime date;
        private String email;
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  date  LocalDateTime value for date.
         * @param  email  String value for email.
         * @param  name  String value for name.
         */
        public Builder(LocalDateTime date, String email, String name) {
            this.date = date;
            this.email = email;
            this.name = name;
        }

        /**
         * Setter for date.
         * @param  date  LocalDateTime value for date.
         * @return Builder
         */
        public Builder date(LocalDateTime date) {
            this.date = date;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link Committer1} object using the set fields.
         * @return {@link Committer1}
         */
        public Committer1 build() {
            return new Committer1(date, email, name);
        }
    }
}
