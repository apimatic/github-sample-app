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
 * This is a model class for ReposActionsRunnersRunnerIdLabelsRequest type.
 */
public class ReposActionsRunnersRunnerIdLabelsRequest {
    private List<String> labels;

    /**
     * Default constructor.
     */
    public ReposActionsRunnersRunnerIdLabelsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  labels  List of String value for labels.
     */
    public ReposActionsRunnersRunnerIdLabelsRequest(
            List<String> labels) {
        this.labels = labels;
    }

    /**
     * Getter for Labels.
     * The names of the custom labels to add to the runner.
     * @return Returns the List of String
     */
    @JsonGetter("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * The names of the custom labels to add to the runner.
     * @param labels Value for List of String
     */
    @JsonSetter("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * Converts this ReposActionsRunnersRunnerIdLabelsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposActionsRunnersRunnerIdLabelsRequest [" + "labels=" + labels + "]";
    }

    /**
     * Builds a new {@link ReposActionsRunnersRunnerIdLabelsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposActionsRunnersRunnerIdLabelsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(labels);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposActionsRunnersRunnerIdLabelsRequest}.
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
         * Builds a new {@link ReposActionsRunnersRunnerIdLabelsRequest} object using the set
         * fields.
         * @return {@link ReposActionsRunnersRunnerIdLabelsRequest}
         */
        public ReposActionsRunnersRunnerIdLabelsRequest build() {
            return new ReposActionsRunnersRunnerIdLabelsRequest(labels);
        }
    }
}
