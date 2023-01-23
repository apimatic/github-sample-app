/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.containers.ReviewerReviewer;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Reviewer type.
 */
public class Reviewer {
    private DeploymentReviewerTypeEnum type;
    private Reviewer1 reviewer;

    /**
     * Default constructor.
     */
    public Reviewer() {
    }

    /**
     * Initialization constructor.
     * @param  type  DeploymentReviewerTypeEnum value for type.
     * @param  reviewer  Reviewer1 value for reviewer.
     */
    public Reviewer(
            DeploymentReviewerTypeEnum type,
            Reviewer1 reviewer) {
        this.type = type;
        this.reviewer = reviewer;
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
     * Getter for Reviewer.
     * @return Returns the Reviewer1
     */
    @JsonGetter("reviewer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Reviewer1 getReviewer() {
        return reviewer;
    }

    /**
     * Setter for Reviewer.
     * @param reviewer Value for Reviewer1
     */
    @JsonSetter("reviewer")
    public void setReviewer(Reviewer1 reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * Converts this Reviewer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Reviewer [" + "type=" + type + ", reviewer=" + reviewer + "]";
    }

    /**
     * Builds a new {@link Reviewer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Reviewer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .reviewer(getReviewer());
        return builder;
    }

    /**
     * Class to build instances of {@link Reviewer}.
     */
    public static class Builder {
        private DeploymentReviewerTypeEnum type;
        private Reviewer1 reviewer;



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
         * Setter for reviewer.
         * @param  reviewer  Reviewer1 value for reviewer.
         * @return Builder
         */
        public Builder reviewer(Reviewer1 reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        /**
         * Builds a new {@link Reviewer} object using the set fields.
         * @return {@link Reviewer}
         */
        public Reviewer build() {
            return new Reviewer(type, reviewer);
        }
    }
}