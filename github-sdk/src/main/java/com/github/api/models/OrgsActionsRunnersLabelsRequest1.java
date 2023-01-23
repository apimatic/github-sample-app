/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for OrgsActionsRunnersLabelsRequest1 type.
 */
public class OrgsActionsRunnersLabelsRequest1 {
    private List<String> labels;

    /**
     * Default constructor.
     */
    public OrgsActionsRunnersLabelsRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  labels  List of String value for labels.
     */
    public OrgsActionsRunnersLabelsRequest1(
            List<String> labels) {
        this.labels = labels;
    }

    /**
     * Getter for Labels.
     * The names of the custom labels to set for the runner. You can pass an empty array to remove
     * all custom labels.
     * @return Returns the List of String
     */
    @JsonGetter("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * The names of the custom labels to set for the runner. You can pass an empty array to remove
     * all custom labels.
     * @param labels Value for List of String
     */
    @JsonSetter("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * Converts this OrgsActionsRunnersLabelsRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsRunnersLabelsRequest1 [" + "labels=" + labels + "]";
    }

    /**
     * Builds a new {@link OrgsActionsRunnersLabelsRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsRunnersLabelsRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(labels);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsRunnersLabelsRequest1}.
     */
    public static class Builder {
        private List<String> labels;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  labels  List of String value for labels.
         */
        public Builder(List<String> labels) {
            this.labels = labels;
        }

        /**
         * Setter for labels.
         * @param  labels  List of String value for labels.
         * @return Builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsRunnersLabelsRequest1} object using the set fields.
         * @return {@link OrgsActionsRunnersLabelsRequest1}
         */
        public OrgsActionsRunnersLabelsRequest1 build() {
            return new OrgsActionsRunnersLabelsRequest1(labels);
        }
    }
}
