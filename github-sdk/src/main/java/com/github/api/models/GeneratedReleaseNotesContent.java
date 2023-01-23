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
 * This is a model class for GeneratedReleaseNotesContent type.
 */
public class GeneratedReleaseNotesContent {
    private String name;
    private String body;

    /**
     * Default constructor.
     */
    public GeneratedReleaseNotesContent() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  body  String value for body.
     */
    public GeneratedReleaseNotesContent(
            String name,
            String body) {
        this.name = name;
        this.body = body;
    }

    /**
     * Getter for Name.
     * The generated name of the release
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The generated name of the release
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Body.
     * The generated body describing the contents of the release supporting markdown formatting
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The generated body describing the contents of the release supporting markdown formatting
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Converts this GeneratedReleaseNotesContent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneratedReleaseNotesContent [" + "name=" + name + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link GeneratedReleaseNotesContent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneratedReleaseNotesContent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, body);
        return builder;
    }

    /**
     * Class to build instances of {@link GeneratedReleaseNotesContent}.
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
         * @param  body  String value for body.
         */
        public Builder(String name, String body) {
            this.name = name;
            this.body = body;
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
         * Builds a new {@link GeneratedReleaseNotesContent} object using the set fields.
         * @return {@link GeneratedReleaseNotesContent}
         */
        public GeneratedReleaseNotesContent build() {
            return new GeneratedReleaseNotesContent(name, body);
        }
    }
}
