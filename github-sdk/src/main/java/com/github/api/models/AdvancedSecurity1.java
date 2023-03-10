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
 * This is a model class for AdvancedSecurity1 type.
 */
public class AdvancedSecurity1 {
    private String status;

    /**
     * Default constructor.
     */
    public AdvancedSecurity1() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     */
    public AdvancedSecurity1(
            String status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * Can be `enabled` or `disabled`.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Can be `enabled` or `disabled`.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this AdvancedSecurity1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AdvancedSecurity1 [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link AdvancedSecurity1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AdvancedSecurity1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link AdvancedSecurity1}.
     */
    public static class Builder {
        private String status;



        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link AdvancedSecurity1} object using the set fields.
         * @return {@link AdvancedSecurity1}
         */
        public AdvancedSecurity1 build() {
            return new AdvancedSecurity1(status);
        }
    }
}
