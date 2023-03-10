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
 * This is a model class for Reviewer4 type.
 */
public class Reviewer4 {
    private DeploymentReviewerTypeEnum type;
    private Integer id;

    /**
     * Default constructor.
     */
    public Reviewer4() {
    }

    /**
     * Initialization constructor.
     * @param  type  DeploymentReviewerTypeEnum value for type.
     * @param  id  Integer value for id.
     */
    public Reviewer4(
            DeploymentReviewerTypeEnum type,
            Integer id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Getter for Type.
     * @return Returns the DeploymentReviewerTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeploymentReviewerTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for DeploymentReviewerTypeEnum
     */
    @JsonSetter("type")
    public void setType(DeploymentReviewerTypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * The id of the user or team who can review the deployment
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the user or team who can review the deployment
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Converts this Reviewer4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Reviewer4 [" + "type=" + type + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link Reviewer4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Reviewer4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link Reviewer4}.
     */
    public static class Builder {
        private DeploymentReviewerTypeEnum type;
        private Integer id;



        /**
         * Setter for type.
         * @param  type  DeploymentReviewerTypeEnum value for type.
         * @return Builder
         */
        public Builder type(DeploymentReviewerTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link Reviewer4} object using the set fields.
         * @return {@link Reviewer4}
         */
        public Reviewer4 build() {
            return new Reviewer4(type, id);
        }
    }
}
