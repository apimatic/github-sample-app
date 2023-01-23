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
 * This is a model class for ActionsRunnerLabelsReadonly type.
 */
public class ActionsRunnerLabelsReadonly {
    private int totalCount;
    private List<Selfhostedrunnerlabel> labels;

    /**
     * Default constructor.
     */
    public ActionsRunnerLabelsReadonly() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  labels  List of Selfhostedrunnerlabel value for labels.
     */
    public ActionsRunnerLabelsReadonly(
            int totalCount,
            List<Selfhostedrunnerlabel> labels) {
        this.totalCount = totalCount;
        this.labels = labels;
    }

    /**
     * Getter for TotalCount.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for Labels.
     * @return Returns the List of Selfhostedrunnerlabel
     */
    @JsonGetter("labels")
    public List<Selfhostedrunnerlabel> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * @param labels Value for List of Selfhostedrunnerlabel
     */
    @JsonSetter("labels")
    public void setLabels(List<Selfhostedrunnerlabel> labels) {
        this.labels = labels;
    }

    /**
     * Converts this ActionsRunnerLabelsReadonly into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActionsRunnerLabelsReadonly [" + "totalCount=" + totalCount + ", labels=" + labels
                + "]";
    }

    /**
     * Builds a new {@link ActionsRunnerLabelsReadonly.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActionsRunnerLabelsReadonly.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, labels);
        return builder;
    }

    /**
     * Class to build instances of {@link ActionsRunnerLabelsReadonly}.
     */
    public static class Builder {
        private int totalCount;
        private List<Selfhostedrunnerlabel> labels;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  labels  List of Selfhostedrunnerlabel value for labels.
         */
        public Builder(int totalCount, List<Selfhostedrunnerlabel> labels) {
            this.totalCount = totalCount;
            this.labels = labels;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  int value for totalCount.
         * @return Builder
         */
        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for labels.
         * @param  labels  List of Selfhostedrunnerlabel value for labels.
         * @return Builder
         */
        public Builder labels(List<Selfhostedrunnerlabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Builds a new {@link ActionsRunnerLabelsReadonly} object using the set fields.
         * @return {@link ActionsRunnerLabelsReadonly}
         */
        public ActionsRunnerLabelsReadonly build() {
            return new ActionsRunnerLabelsReadonly(totalCount, labels);
        }
    }
}