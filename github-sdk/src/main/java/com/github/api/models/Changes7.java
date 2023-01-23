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
 * This is a model class for Changes7 type.
 */
public class Changes7 {
    private Body2 body;
    private Title1 title;

    /**
     * Default constructor.
     */
    public Changes7() {
    }

    /**
     * Initialization constructor.
     * @param  body  Body2 value for body.
     * @param  title  Title1 value for title.
     */
    public Changes7(
            Body2 body,
            Title1 title) {
        this.body = body;
        this.title = title;
    }

    /**
     * Getter for Body.
     * @return Returns the Body2
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Body2 getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for Body2
     */
    @JsonSetter("body")
    public void setBody(Body2 body) {
        this.body = body;
    }

    /**
     * Getter for Title.
     * @return Returns the Title1
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Title1 getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for Title1
     */
    @JsonSetter("title")
    public void setTitle(Title1 title) {
        this.title = title;
    }

    /**
     * Converts this Changes7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Changes7 [" + "body=" + body + ", title=" + title + "]";
    }

    /**
     * Builds a new {@link Changes7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Changes7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .body(getBody())
                .title(getTitle());
        return builder;
    }

    /**
     * Class to build instances of {@link Changes7}.
     */
    public static class Builder {
        private Body2 body;
        private Title1 title;



        /**
         * Setter for body.
         * @param  body  Body2 value for body.
         * @return Builder
         */
        public Builder body(Body2 body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  Title1 value for title.
         * @return Builder
         */
        public Builder title(Title1 title) {
            this.title = title;
            return this;
        }

        /**
         * Builds a new {@link Changes7} object using the set fields.
         * @return {@link Changes7}
         */
        public Changes7 build() {
            return new Changes7(body, title);
        }
    }
}
