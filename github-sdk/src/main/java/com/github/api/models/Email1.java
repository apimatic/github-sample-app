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
 * This is a model class for Email1 type.
 */
public class Email1 {
    private String email;
    private Boolean verified;

    /**
     * Default constructor.
     */
    public Email1() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  verified  Boolean value for verified.
     */
    public Email1(
            String email,
            Boolean verified) {
        this.email = email;
        this.verified = verified;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Verified.
     * @return Returns the Boolean
     */
    @JsonGetter("verified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Setter for Verified.
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * Converts this Email1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Email1 [" + "email=" + email + ", verified=" + verified + "]";
    }

    /**
     * Builds a new {@link Email1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Email1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .email(getEmail())
                .verified(getVerified());
        return builder;
    }

    /**
     * Class to build instances of {@link Email1}.
     */
    public static class Builder {
        private String email;
        private Boolean verified;



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
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        /**
         * Builds a new {@link Email1} object using the set fields.
         * @return {@link Email1}
         */
        public Email1 build() {
            return new Email1(email, verified);
        }
    }
}
