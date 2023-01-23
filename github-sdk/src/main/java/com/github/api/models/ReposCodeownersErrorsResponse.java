/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ReposCodeownersErrorsResponse type.
 */
public class ReposCodeownersErrorsResponse {
    private List<Error1> errors;

    /**
     * Default constructor.
     */
    public ReposCodeownersErrorsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  errors  List of Error1 value for errors.
     */
    public ReposCodeownersErrorsResponse(
            List<Error1> errors) {
        this.errors = errors;
    }

    /**
     * Getter for Errors.
     * @return Returns the List of Error1
     */
    @JsonGetter("errors")
    public List<Error1> getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Error1
     */
    @JsonSetter("errors")
    public void setErrors(List<Error1> errors) {
        this.errors = errors;
    }

    /**
     * Converts this ReposCodeownersErrorsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCodeownersErrorsResponse [" + "errors=" + errors + "]";
    }

    /**
     * Builds a new {@link ReposCodeownersErrorsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCodeownersErrorsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(errors);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCodeownersErrorsResponse}.
     */
    public static class Builder {
        private List<Error1> errors;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  errors  List of Error1 value for errors.
         */
        public Builder(List<Error1> errors) {
            this.errors = errors;
        }

        /**
         * Setter for errors.
         * @param  errors  List of Error1 value for errors.
         * @return Builder
         */
        public Builder errors(List<Error1> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link ReposCodeownersErrorsResponse} object using the set fields.
         * @return {@link ReposCodeownersErrorsResponse}
         */
        public ReposCodeownersErrorsResponse build() {
            return new ReposCodeownersErrorsResponse(errors);
        }
    }
}