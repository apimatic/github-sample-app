/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Rule1 type.
 */
public class Rule1 {
    private String description;
    private String fullDescription;
    private OptionalNullable<String> help;
    private OptionalNullable<String> helpUri;
    private String id;
    private String name;
    private Object severity;
    private OptionalNullable<List<String>> tags;

    /**
     * Default constructor.
     */
    public Rule1() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  id  String value for id.
     * @param  severity  Object value for severity.
     * @param  fullDescription  String value for fullDescription.
     * @param  help  String value for help.
     * @param  helpUri  String value for helpUri.
     * @param  name  String value for name.
     * @param  tags  List of String value for tags.
     */
    public Rule1(
            String description,
            String id,
            Object severity,
            String fullDescription,
            String help,
            String helpUri,
            String name,
            List<String> tags) {
        this.description = description;
        this.fullDescription = fullDescription;
        this.help = OptionalNullable.of(help);
        this.helpUri = OptionalNullable.of(helpUri);
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.tags = OptionalNullable.of(tags);
    }

    /**
     * Internal initialization constructor.
     */
    protected Rule1(String description, String id, Object severity, String fullDescription,
            OptionalNullable<String> help, OptionalNullable<String> helpUri, String name,
            OptionalNullable<List<String>> tags) {
        this.description = description;
        this.fullDescription = fullDescription;
        this.help = help;
        this.helpUri = helpUri;
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.tags = tags;
    }

    /**
     * Getter for Description.
     * A short description of the rule used to detect the alert.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A short description of the rule used to detect the alert.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for FullDescription.
     * @return Returns the String
     */
    @JsonGetter("full_description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullDescription() {
        return fullDescription;
    }

    /**
     * Setter for FullDescription.
     * @param fullDescription Value for String
     */
    @JsonSetter("full_description")
    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    /**
     * Internal Getter for Help.
     * @return Returns the Internal String
     */
    @JsonGetter("help")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHelp() {
        return this.help;
    }

    /**
     * Getter for Help.
     * @return Returns the String
     */
    public String getHelp() {
        return OptionalNullable.getFrom(help);
    }

    /**
     * Setter for Help.
     * @param help Value for String
     */
    @JsonSetter("help")
    public void setHelp(String help) {
        this.help = OptionalNullable.of(help);
    }

    /**
     * UnSetter for Help.
     */
    public void unsetHelp() {
        help = null;
    }

    /**
     * Internal Getter for HelpUri.
     * A link to the documentation for the rule used to detect the alert.
     * @return Returns the Internal String
     */
    @JsonGetter("help_uri")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHelpUri() {
        return this.helpUri;
    }

    /**
     * Getter for HelpUri.
     * A link to the documentation for the rule used to detect the alert.
     * @return Returns the String
     */
    public String getHelpUri() {
        return OptionalNullable.getFrom(helpUri);
    }

    /**
     * Setter for HelpUri.
     * A link to the documentation for the rule used to detect the alert.
     * @param helpUri Value for String
     */
    @JsonSetter("help_uri")
    public void setHelpUri(String helpUri) {
        this.helpUri = OptionalNullable.of(helpUri);
    }

    /**
     * UnSetter for HelpUri.
     * A link to the documentation for the rule used to detect the alert.
     */
    public void unsetHelpUri() {
        helpUri = null;
    }

    /**
     * Getter for Id.
     * A unique identifier for the rule used to detect the alert.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * A unique identifier for the rule used to detect the alert.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
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
     * Getter for Severity.
     * @return Returns the Object
     */
    @JsonGetter("severity")
    public Object getSeverity() {
        return severity;
    }

    /**
     * Setter for Severity.
     * @param severity Value for Object
     */
    @JsonSetter("severity")
    public void setSeverity(Object severity) {
        this.severity = severity;
    }

    /**
     * Internal Getter for Tags.
     * @return Returns the Internal List of String
     */
    @JsonGetter("tags")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetTags() {
        return this.tags;
    }

    /**
     * Getter for Tags.
     * @return Returns the List of String
     */
    public List<String> getTags() {
        return OptionalNullable.getFrom(tags);
    }

    /**
     * Setter for Tags.
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = OptionalNullable.of(tags);
    }

    /**
     * UnSetter for Tags.
     */
    public void unsetTags() {
        tags = null;
    }

    /**
     * Converts this Rule1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Rule1 [" + "description=" + description + ", id=" + id + ", severity=" + severity
                + ", fullDescription=" + fullDescription + ", help=" + help + ", helpUri=" + helpUri
                + ", name=" + name + ", tags=" + tags + "]";
    }

    /**
     * Builds a new {@link Rule1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Rule1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(description, id, severity)
                .fullDescription(getFullDescription())
                .name(getName());
        builder.help = internalGetHelp();
        builder.helpUri = internalGetHelpUri();
        builder.tags = internalGetTags();
        return builder;
    }

    /**
     * Class to build instances of {@link Rule1}.
     */
    public static class Builder {
        private String description;
        private String id;
        private Object severity;
        private String fullDescription;
        private OptionalNullable<String> help;
        private OptionalNullable<String> helpUri;
        private String name;
        private OptionalNullable<List<String>> tags;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  description  String value for description.
         * @param  id  String value for id.
         * @param  severity  Object value for severity.
         */
        public Builder(String description, String id, Object severity) {
            this.description = description;
            this.id = id;
            this.severity = severity;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for severity.
         * @param  severity  Object value for severity.
         * @return Builder
         */
        public Builder severity(Object severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Setter for fullDescription.
         * @param  fullDescription  String value for fullDescription.
         * @return Builder
         */
        public Builder fullDescription(String fullDescription) {
            this.fullDescription = fullDescription;
            return this;
        }

        /**
         * Setter for help.
         * @param  help  String value for help.
         * @return Builder
         */
        public Builder help(String help) {
            this.help = OptionalNullable.of(help);
            return this;
        }

        /**
         * UnSetter for help.
         * @return Builder
         */
        public Builder unsetHelp() {
            help = null;
            return this;
        }

        /**
         * Setter for helpUri.
         * @param  helpUri  String value for helpUri.
         * @return Builder
         */
        public Builder helpUri(String helpUri) {
            this.helpUri = OptionalNullable.of(helpUri);
            return this;
        }

        /**
         * UnSetter for helpUri.
         * @return Builder
         */
        public Builder unsetHelpUri() {
            helpUri = null;
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
         * Setter for tags.
         * @param  tags  List of String value for tags.
         * @return Builder
         */
        public Builder tags(List<String> tags) {
            this.tags = OptionalNullable.of(tags);
            return this;
        }

        /**
         * UnSetter for tags.
         * @return Builder
         */
        public Builder unsetTags() {
            tags = null;
            return this;
        }

        /**
         * Builds a new {@link Rule1} object using the set fields.
         * @return {@link Rule1}
         */
        public Rule1 build() {
            return new Rule1(description, id, severity, fullDescription, help, helpUri, name, tags);
        }
    }
}
