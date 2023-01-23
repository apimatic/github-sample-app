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
 * This is a model class for Links1 type.
 */
public class Links1 {
    private String html;
    private String self;

    /**
     * Default constructor.
     */
    public Links1() {
    }

    /**
     * Initialization constructor.
     * @param  html  String value for html.
     * @param  self  String value for self.
     */
    public Links1(
            String html,
            String self) {
        this.html = html;
        this.self = self;
    }

    /**
     * Getter for Html.
     * @return Returns the String
     */
    @JsonGetter("html")
    public String getHtml() {
        return html;
    }

    /**
     * Setter for Html.
     * @param html Value for String
     */
    @JsonSetter("html")
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * Getter for Self.
     * @return Returns the String
     */
    @JsonGetter("self")
    public String getSelf() {
        return self;
    }

    /**
     * Setter for Self.
     * @param self Value for String
     */
    @JsonSetter("self")
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * Converts this Links1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Links1 [" + "html=" + html + ", self=" + self + "]";
    }

    /**
     * Builds a new {@link Links1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Links1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(html, self);
        return builder;
    }

    /**
     * Class to build instances of {@link Links1}.
     */
    public static class Builder {
        private String html;
        private String self;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  html  String value for html.
         * @param  self  String value for self.
         */
        public Builder(String html, String self) {
            this.html = html;
            this.self = self;
        }

        /**
         * Setter for html.
         * @param  html  String value for html.
         * @return Builder
         */
        public Builder html(String html) {
            this.html = html;
            return this;
        }

        /**
         * Setter for self.
         * @param  self  String value for self.
         * @return Builder
         */
        public Builder self(String self) {
            this.self = self;
            return this;
        }

        /**
         * Builds a new {@link Links1} object using the set fields.
         * @return {@link Links1}
         */
        public Links1 build() {
            return new Links1(html, self);
        }
    }
}