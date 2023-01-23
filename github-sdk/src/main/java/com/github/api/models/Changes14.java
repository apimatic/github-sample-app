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
 * This is a model class for Changes14 type.
 */
public class Changes14 {
    private Login1 login;

    /**
     * Default constructor.
     */
    public Changes14() {
    }

    /**
     * Initialization constructor.
     * @param  login  Login1 value for login.
     */
    public Changes14(
            Login1 login) {
        this.login = login;
    }

    /**
     * Getter for Login.
     * @return Returns the Login1
     */
    @JsonGetter("login")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Login1 getLogin() {
        return login;
    }

    /**
     * Setter for Login.
     * @param login Value for Login1
     */
    @JsonSetter("login")
    public void setLogin(Login1 login) {
        this.login = login;
    }

    /**
     * Converts this Changes14 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes14 [" + "login=" + login + "]";
    }

    /**
     * Builds a new {@link Changes14.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes14.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .login(getLogin());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes14}.
     */
    public static class Builder {
        private Login1 login;



        /**
         * Setter for login.
         * @param  login  Login1 value for login.
         * @return Builder
         */
        public Builder login(Login1 login) {
            this.login = login;
            return this;
        }

        /**
         * Builds a new {@link Changes14} object using the set fields.
         * @return {@link Changes14}
         */
        public Changes14 build() {
            return new Changes14(login);
        }
    }
}