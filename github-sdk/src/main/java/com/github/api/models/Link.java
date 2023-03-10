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
 * This is a model class for Link type.
 */
public class Link {
    private String href;

    /**
     * Default constructor.
     */
    public Link() {
    }

    /**
     * Initialization constructor.
     * @param  href  String value for href.
     */
    public Link(
            String href) {
        this.href = href;
    }

    /**
     * Getter for Href.
     * @return Returns the String
     */
    @JsonGetter("href")
    public String getHref() {
        return href;
    }

    /**
     * Setter for Href.
     * @param href Value for String
     */
    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Converts this Link into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Link [" + "href=" + href + "]";
    }

    /**
     * Builds a new {@link Link.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Link.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(href);
        return builder;
    }

    /**
     * Class to build instances of {@link Link}.
     */
    public static class Builder {
        private String href;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  href  String value for href.
         */
        public Builder(String href) {
            this.href = href;
        }

        /**
         * Setter for href.
         * @param  href  String value for href.
         * @return Builder
         */
        public Builder href(String href) {
            this.href = href;
            return this;
        }

        /**
         * Builds a new {@link Link} object using the set fields.
         * @return {@link Link}
         */
        public Link build() {
            return new Link(href);
        }
    }
}
