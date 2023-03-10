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
 * This is a model class for OrgsProjectsRequest type.
 */
public class OrgsProjectsRequest {
    private String name;
    private String body;

    /**
     * Default constructor.
     */
    public OrgsProjectsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  body  String value for body.
     */
    public OrgsProjectsRequest(
            String name,
            String body) {
        this.name = name;
        this.body = body;
    }

    /**
     * Getter for Name.
     * The name of the project.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the project.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Body.
     * The description of the project.
     * @return Returns the String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The description of the project.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Converts this OrgsProjectsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsProjectsRequest [" + "name=" + name + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link OrgsProjectsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsProjectsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .body(getBody());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsProjectsRequest}.
     */
    public static class Builder {
        private String name;
        private String body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link OrgsProjectsRequest} object using the set fields.
         * @return {@link OrgsProjectsRequest}
         */
        public OrgsProjectsRequest build() {
            return new OrgsProjectsRequest(name, body);
        }
    }
}
