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
import java.util.List;

/**
 * This is a model class for Output5 type.
 */
public class Output5 {
    private String title;
    private String summary;
    private String text;
    private List<Annotation> annotations;
    private List<Image> images;

    /**
     * Default constructor.
     */
    public Output5() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  summary  String value for summary.
     * @param  text  String value for text.
     * @param  annotations  List of Annotation value for annotations.
     * @param  images  List of Image value for images.
     */
    public Output5(
            String title,
            String summary,
            String text,
            List<Annotation> annotations,
            List<Image> images) {
        this.title = title;
        this.summary = summary;
        this.text = text;
        this.annotations = annotations;
        this.images = images;
    }

    /**
     * Getter for Title.
     * The title of the check run.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * The title of the check run.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Summary.
     * The summary of the check run. This parameter supports Markdown. **Maximum length**: 65535
     * characters.
     * @return Returns the String
     */
    @JsonGetter("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Setter for Summary.
     * The summary of the check run. This parameter supports Markdown. **Maximum length**: 65535
     * characters.
     * @param summary Value for String
     */
    @JsonSetter("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Getter for Text.
     * The details of the check run. This parameter supports Markdown. **Maximum length**: 65535
     * characters.
     * @return Returns the String
     */
    @JsonGetter("text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * The details of the check run. This parameter supports Markdown. **Maximum length**: 65535
     * characters.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Annotations.
     * Adds information from your analysis to specific lines of code. Annotations are visible on
     * GitHub in the **Checks** and **Files changed** tab of the pull request. The Checks API limits
     * the number of annotations to a maximum of 50 per API request. To create more than 50
     * annotations, you have to make multiple requests to the [Update a check
     * run](https://docs.github.com/rest/reference/checks#update-a-check-run) endpoint. Each time
     * you update the check run, annotations are appended to the list of annotations that already
     * exist for the check run. For details about how you can view annotations on GitHub, see
     * "[About status checks](https://docs.github.com/articles/about-status-checks#checks)".
     * @return Returns the List of Annotation
     */
    @JsonGetter("annotations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Annotation> getAnnotations() {
        return annotations;
    }

    /**
     * Setter for Annotations.
     * Adds information from your analysis to specific lines of code. Annotations are visible on
     * GitHub in the **Checks** and **Files changed** tab of the pull request. The Checks API limits
     * the number of annotations to a maximum of 50 per API request. To create more than 50
     * annotations, you have to make multiple requests to the [Update a check
     * run](https://docs.github.com/rest/reference/checks#update-a-check-run) endpoint. Each time
     * you update the check run, annotations are appended to the list of annotations that already
     * exist for the check run. For details about how you can view annotations on GitHub, see
     * "[About status checks](https://docs.github.com/articles/about-status-checks#checks)".
     * @param annotations Value for List of Annotation
     */
    @JsonSetter("annotations")
    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    /**
     * Getter for Images.
     * Adds images to the output displayed in the GitHub pull request UI.
     * @return Returns the List of Image
     */
    @JsonGetter("images")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Image> getImages() {
        return images;
    }

    /**
     * Setter for Images.
     * Adds images to the output displayed in the GitHub pull request UI.
     * @param images Value for List of Image
     */
    @JsonSetter("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * Converts this Output5 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Output5 [" + "title=" + title + ", summary=" + summary + ", text=" + text
                + ", annotations=" + annotations + ", images=" + images + "]";
    }

    /**
     * Builds a new {@link Output5.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Output5.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, summary)
                .text(getText())
                .annotations(getAnnotations())
                .images(getImages());
        return builder;
    }

    /**
     * Class to build instances of {@link Output5}.
     */
    public static class Builder {
        private String title;
        private String summary;
        private String text;
        private List<Annotation> annotations;
        private List<Image> images;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  summary  String value for summary.
         */
        public Builder(String title, String summary) {
            this.title = title;
            this.summary = summary;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for summary.
         * @param  summary  String value for summary.
         * @return Builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * Setter for text.
         * @param  text  String value for text.
         * @return Builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Setter for annotations.
         * @param  annotations  List of Annotation value for annotations.
         * @return Builder
         */
        public Builder annotations(List<Annotation> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Setter for images.
         * @param  images  List of Image value for images.
         * @return Builder
         */
        public Builder images(List<Image> images) {
            this.images = images;
            return this;
        }

        /**
         * Builds a new {@link Output5} object using the set fields.
         * @return {@link Output5}
         */
        public Output5 build() {
            return new Output5(title, summary, text, annotations, images);
        }
    }
}
