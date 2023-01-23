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
 * This is a model class for ReposCodeScanningAnalysesAnalysisIdResponse1 type.
 */
public class ReposCodeScanningAnalysesAnalysisIdResponse1 {
    private String nextAnalysisUrl;
    private String confirmDeleteUrl;

    /**
     * Default constructor.
     */
    public ReposCodeScanningAnalysesAnalysisIdResponse1() {
    }

    /**
     * Initialization constructor.
     * @param  nextAnalysisUrl  String value for nextAnalysisUrl.
     * @param  confirmDeleteUrl  String value for confirmDeleteUrl.
     */
    public ReposCodeScanningAnalysesAnalysisIdResponse1(
            String nextAnalysisUrl,
            String confirmDeleteUrl) {
        this.nextAnalysisUrl = nextAnalysisUrl;
        this.confirmDeleteUrl = confirmDeleteUrl;
    }

    /**
     * Getter for NextAnalysisUrl.
     * Next deletable analysis in chain, without last analysis deletion confirmation
     * @return Returns the String
     */
    @JsonGetter("next_analysis_url")
    public String getNextAnalysisUrl() {
        return nextAnalysisUrl;
    }

    /**
     * Setter for NextAnalysisUrl.
     * Next deletable analysis in chain, without last analysis deletion confirmation
     * @param nextAnalysisUrl Value for String
     */
    @JsonSetter("next_analysis_url")
    public void setNextAnalysisUrl(String nextAnalysisUrl) {
        this.nextAnalysisUrl = nextAnalysisUrl;
    }

    /**
     * Getter for ConfirmDeleteUrl.
     * Next deletable analysis in chain, with last analysis deletion confirmation
     * @return Returns the String
     */
    @JsonGetter("confirm_delete_url")
    public String getConfirmDeleteUrl() {
        return confirmDeleteUrl;
    }

    /**
     * Setter for ConfirmDeleteUrl.
     * Next deletable analysis in chain, with last analysis deletion confirmation
     * @param confirmDeleteUrl Value for String
     */
    @JsonSetter("confirm_delete_url")
    public void setConfirmDeleteUrl(String confirmDeleteUrl) {
        this.confirmDeleteUrl = confirmDeleteUrl;
    }

    /**
     * Converts this ReposCodeScanningAnalysesAnalysisIdResponse1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCodeScanningAnalysesAnalysisIdResponse1 [" + "nextAnalysisUrl="
                + nextAnalysisUrl + ", confirmDeleteUrl=" + confirmDeleteUrl + "]";
    }

    /**
     * Builds a new {@link ReposCodeScanningAnalysesAnalysisIdResponse1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCodeScanningAnalysesAnalysisIdResponse1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(nextAnalysisUrl, confirmDeleteUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCodeScanningAnalysesAnalysisIdResponse1}.
     */
    public static class Builder {
        private String nextAnalysisUrl;
        private String confirmDeleteUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  nextAnalysisUrl  String value for nextAnalysisUrl.
         * @param  confirmDeleteUrl  String value for confirmDeleteUrl.
         */
        public Builder(String nextAnalysisUrl, String confirmDeleteUrl) {
            this.nextAnalysisUrl = nextAnalysisUrl;
            this.confirmDeleteUrl = confirmDeleteUrl;
        }

        /**
         * Setter for nextAnalysisUrl.
         * @param  nextAnalysisUrl  String value for nextAnalysisUrl.
         * @return Builder
         */
        public Builder nextAnalysisUrl(String nextAnalysisUrl) {
            this.nextAnalysisUrl = nextAnalysisUrl;
            return this;
        }

        /**
         * Setter for confirmDeleteUrl.
         * @param  confirmDeleteUrl  String value for confirmDeleteUrl.
         * @return Builder
         */
        public Builder confirmDeleteUrl(String confirmDeleteUrl) {
            this.confirmDeleteUrl = confirmDeleteUrl;
            return this;
        }

        /**
         * Builds a new {@link ReposCodeScanningAnalysesAnalysisIdResponse1} object using the set
         * fields.
         * @return {@link ReposCodeScanningAnalysesAnalysisIdResponse1}
         */
        public ReposCodeScanningAnalysesAnalysisIdResponse1 build() {
            return new ReposCodeScanningAnalysesAnalysisIdResponse1(nextAnalysisUrl,
                    confirmDeleteUrl);
        }
    }
}