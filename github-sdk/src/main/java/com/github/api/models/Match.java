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
import java.util.List;

/**
 * This is a model class for Match type.
 */
public class Match {
    private String text;
    private List<Integer> indices;

    /**
     * Default constructor.
     */
    public Match() {
    }

    /**
     * Initialization constructor.
     * @param  text  String value for text.
     * @param  indices  List of Integer value for indices.
     */
    public Match(
            String text,
            List<Integer> indices) {
        this.text = text;
        this.indices = indices;
    }

    /**
     * Getter for Text.
     * @return Returns the String
     */
    @JsonGetter("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Indices.
     * @return Returns the List of Integer
     */
    @JsonGetter("indices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getIndices() {
        return indices;
    }

    /**
     * Setter for Indices.
     * @param indices Value for List of Integer
     */
    @JsonSetter("indices")
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    /**
     * Converts this Match into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Match [" + "text=" + text + ", indices=" + indices + "]";
    }

    /**
     * Builds a new {@link Match.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Match.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .text(getText())
                .indices(getIndices());
        return builder;
    }

    /**
     * Class to build instances of {@link Match}.
     */
    public static class Builder {
        private String text;
        private List<Integer> indices;



        /**
         * Setter for text.
         * @param  text  String value for text.
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Setter for indices.
         * @param  indices  List of Integer value for indices.
         * @return Builder
         */
        public Builder indices(List<Integer> indices) {
            this.indices = indices;
            return this;
        }

        /**
         * Builds a new {@link Match} object using the set fields.
         * @return {@link Match}
         */
        public Match build() {
            return new Match(text, indices);
        }
    }
}