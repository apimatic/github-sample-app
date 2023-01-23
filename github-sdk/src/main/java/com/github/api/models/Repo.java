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
 * This is a model class for Repo type.
 */
public class Repo {
    private int id;
    private String name;
    private String url;

    /**
     * Default constructor.
     */
    public Repo() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  url  String value for url.
     */
    public Repo(
            int id,
            String name,
            String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Converts this Repo into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Repo [" + "id=" + id + ", name=" + name + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Repo.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Repo.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, url);
        return builder;
    }

    /**
     * Class to build instances of {@link Repo}.
     */
    public static class Builder {
        private int id;
        private String name;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  url  String value for url.
         */
        public Builder(int id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url = url;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Repo} object using the set fields.
         * @return {@link Repo}
         */
        public Repo build() {
            return new Repo(id, name, url);
        }
    }
}
