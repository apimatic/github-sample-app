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
 * This is a model class for MarkdownRequest type.
 */
public class MarkdownRequest {
    private String text;
    private ModeEnum mode;
    private String context;

    /**
     * Default constructor.
     */
    public MarkdownRequest() {
    }

    /**
     * Initialization constructor.
     * @param  text  String value for text.
     * @param  mode  ModeEnum value for mode.
     * @param  context  String value for context.
     */
    public MarkdownRequest(
            String text,
            ModeEnum mode,
            String context) {
        this.text = text;
        this.mode = mode;
        this.context = context;
    }

    /**
     * Getter for Text.
     * The Markdown text to render in HTML.
     * @return Returns the String
     */
    @JsonGetter("text")
    public String getText() {
        return text;
    }

    /**
     * Setter for Text.
     * The Markdown text to render in HTML.
     * @param text Value for String
     */
    @JsonSetter("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter for Mode.
     * @return Returns the ModeEnum
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ModeEnum getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * @param mode Value for ModeEnum
     */
    @JsonSetter("mode")
    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    /**
     * Getter for Context.
     * The repository context to use when creating references in `gfm` mode. For example, setting
     * `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in
     * the `octo-org/octo-repo` repository.
     * @return Returns the String
     */
    @JsonGetter("context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContext() {
        return context;
    }

    /**
     * Setter for Context.
     * The repository context to use when creating references in `gfm` mode. For example, setting
     * `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in
     * the `octo-org/octo-repo` repository.
     * @param context Value for String
     */
    @JsonSetter("context")
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Converts this MarkdownRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MarkdownRequest [" + "text=" + text + ", mode=" + mode + ", context=" + context
                + "]";
    }

    /**
     * Builds a new {@link MarkdownRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MarkdownRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(text)
                .mode(getMode())
                .context(getContext());
        return builder;
    }

    /**
     * Class to build instances of {@link MarkdownRequest}.
     */
    public static class Builder {
        private String text;
        private ModeEnum mode;
        private String context;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  text  String value for text.
         */
        public Builder(String text) {
            this.text = text;
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
         * Setter for mode.
         * @param  mode  ModeEnum value for mode.
         * @return Builder
         */
        public Builder mode(ModeEnum mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for context.
         * @param  context  String value for context.
         * @return Builder
         */
        public Builder context(String context) {
            this.context = context;
            return this;
        }

        /**
         * Builds a new {@link MarkdownRequest} object using the set fields.
         * @return {@link MarkdownRequest}
         */
        public MarkdownRequest build() {
            return new MarkdownRequest(text, mode, context);
        }
    }
}
