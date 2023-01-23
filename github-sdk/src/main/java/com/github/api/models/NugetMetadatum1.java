/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.containers.NugetMetadatum1Id;
import com.github.api.models.containers.NugetMetadatum1Value;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for NugetMetadatum1 type.
 */
public class NugetMetadatum1 {
    private NugetMetadatum1Id id;
    private String name;
    private NugetMetadatum1Value value;

    /**
     * Default constructor.
     */
    public NugetMetadatum1() {
    }

    /**
     * Initialization constructor.
     * @param  id  NugetMetadatum1Id value for id.
     * @param  name  String value for name.
     * @param  value  NugetMetadatum1Value value for value.
     */
    public NugetMetadatum1(
            NugetMetadatum1Id id,
            String name,
            NugetMetadatum1Value value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    /**
     * Getter for Id.
     * @return Returns the NugetMetadatum1Id
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NugetMetadatum1Id getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for NugetMetadatum1Id
     */
    @JsonSetter("id")
    public void setId(NugetMetadatum1Id id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Value.
     * @return Returns the NugetMetadatum1Value
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NugetMetadatum1Value getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for NugetMetadatum1Value
     */
    @JsonSetter("value")
    public void setValue(NugetMetadatum1Value value) {
        this.value = value;
    }

    /**
     * Converts this NugetMetadatum1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NugetMetadatum1 [" + "id=" + id + ", name=" + name + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link NugetMetadatum1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NugetMetadatum1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link NugetMetadatum1}.
     */
    public static class Builder {
        private NugetMetadatum1Id id;
        private String name;
        private NugetMetadatum1Value value;



        /**
         * Setter for id.
         * @param  id  NugetMetadatum1Id value for id.
         * @return Builder
         */
        public Builder id(NugetMetadatum1Id id) {
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
         * Setter for value.
         * @param  value  NugetMetadatum1Value value for value.
         * @return Builder
         */
        public Builder value(NugetMetadatum1Value value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link NugetMetadatum1} object using the set fields.
         * @return {@link NugetMetadatum1}
         */
        public NugetMetadatum1 build() {
            return new NugetMetadatum1(id, name, value);
        }
    }
}
