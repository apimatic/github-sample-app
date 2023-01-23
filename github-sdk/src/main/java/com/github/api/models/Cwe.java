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
 * This is a model class for Cwe type.
 */
public class Cwe {
    private String cweId;
    private String name;

    /**
     * Default constructor.
     */
    public Cwe() {
    }

    /**
     * Initialization constructor.
     * @param  cweId  String value for cweId.
     * @param  name  String value for name.
     */
    public Cwe(
            String cweId,
            String name) {
        this.cweId = cweId;
        this.name = name;
    }

    /**
     * Getter for CweId.
     * The unique CWE ID.
     * @return Returns the String
     */
    @JsonGetter("cwe_id")
    public String getCweId() {
        return cweId;
    }

    /**
     * Setter for CweId.
     * The unique CWE ID.
     * @param cweId Value for String
     */
    @JsonSetter("cwe_id")
    public void setCweId(String cweId) {
        this.cweId = cweId;
    }

    /**
     * Getter for Name.
     * The short, plain text name of the CWE.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The short, plain text name of the CWE.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this Cwe into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Cwe [" + "cweId=" + cweId + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link Cwe.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Cwe.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cweId, name);
        return builder;
    }

    /**
     * Class to build instances of {@link Cwe}.
     */
    public static class Builder {
        private String cweId;
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cweId  String value for cweId.
         * @param  name  String value for name.
         */
        public Builder(String cweId, String name) {
            this.cweId = cweId;
            this.name = name;
        }

        /**
         * Setter for cweId.
         * @param  cweId  String value for cweId.
         * @return Builder
         */
        public Builder cweId(String cweId) {
            this.cweId = cweId;
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
         * Builds a new {@link Cwe} object using the set fields.
         * @return {@link Cwe}
         */
        public Cwe build() {
            return new Cwe(cweId, name);
        }
    }
}
