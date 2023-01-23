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
 * This is a model class for PullRequests28 type.
 */
public class PullRequests28 {
    private Base base;
    private Head head;
    private double id;
    private double number;
    private String url;

    /**
     * Default constructor.
     */
    public PullRequests28() {
    }

    /**
     * Initialization constructor.
     * @param  base  Base value for base.
     * @param  head  Head value for head.
     * @param  id  double value for id.
     * @param  number  double value for number.
     * @param  url  String value for url.
     */
    public PullRequests28(
            Base base,
            Head head,
            double id,
            double number,
            String url) {
        this.base = base;
        this.head = head;
        this.id = id;
        this.number = number;
        this.url = url;
    }

    /**
     * Getter for Base.
     * @return Returns the Base
     */
    @JsonGetter("base")
    public Base getBase() {
        return base;
    }

    /**
     * Setter for Base.
     * @param base Value for Base
     */
    @JsonSetter("base")
    public void setBase(Base base) {
        this.base = base;
    }

    /**
     * Getter for Head.
     * @return Returns the Head
     */
    @JsonGetter("head")
    public Head getHead() {
        return head;
    }

    /**
     * Setter for Head.
     * @param head Value for Head
     */
    @JsonSetter("head")
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * Getter for Id.
     * @return Returns the double
     */
    @JsonGetter("id")
    public double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for double
     */
    @JsonSetter("id")
    public void setId(double id) {
        this.id = id;
    }

    /**
     * Getter for Number.
     * @return Returns the double
     */
    @JsonGetter("number")
    public double getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for double
     */
    @JsonSetter("number")
    public void setNumber(double number) {
        this.number = number;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this PullRequests28 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PullRequests28 [" + "base=" + base + ", head=" + head + ", id=" + id + ", number="
                + number + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link PullRequests28.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PullRequests28.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(base, head, id, number, url);
        return builder;
    }

    /**
     * Class to build instances of {@link PullRequests28}.
     */
    public static class Builder {
        private Base base;
        private Head head;
        private double id;
        private double number;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  base  Base value for base.
         * @param  head  Head value for head.
         * @param  id  double value for id.
         * @param  number  double value for number.
         * @param  url  String value for url.
         */
        public Builder(Base base, Head head, double id, double number, String url) {
            this.base = base;
            this.head = head;
            this.id = id;
            this.number = number;
            this.url = url;
        }

        /**
         * Setter for base.
         * @param  base  Base value for base.
         * @return Builder
         */
        public Builder base(Base base) {
            this.base = base;
            return this;
        }

        /**
         * Setter for head.
         * @param  head  Head value for head.
         * @return Builder
         */
        public Builder head(Head head) {
            this.head = head;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  double value for id.
         * @return Builder
         */
        public Builder id(double id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  double value for number.
         * @return Builder
         */
        public Builder number(double number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link PullRequests28} object using the set fields.
         * @return {@link PullRequests28}
         */
        public PullRequests28 build() {
            return new PullRequests28(base, head, id, number, url);
        }
    }
}
