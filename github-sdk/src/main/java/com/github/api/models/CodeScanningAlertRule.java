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
 * This is a model class for CodeScanningAlertRule type.
 */
public class CodeScanningAlertRule {
    private OptionalNullable<String> id;
    private String name;
    private Object severity;
    private Object securitySeverityLevel;
    private String description;
    private String fullDescription;
    private OptionalNullable<List<String>> tags;
    private OptionalNullable<String> help;
    private OptionalNullable<String> helpUri;

    /**
     * Default constructor.
     */
    public CodeScanningAlertRule() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  severity  Object value for severity.
     * @param  securitySeverityLevel  Object value for securitySeverityLevel.
     * @param  description  String value for description.
     * @param  fullDescription  String value for fullDescription.
     * @param  tags  List of String value for tags.
     * @param  help  String value for help.
     * @param  helpUri  String value for helpUri.
     */
    public CodeScanningAlertRule(
            String id,
            String name,
            Object severity,
            Object securitySeverityLevel,
            String description,
            String fullDescription,
            List<String> tags,
            String help,
            String helpUri) {
        this.id = OptionalNullable.of(id);
        this.name = name;
        this.severity = severity;
        this.securitySeverityLevel = securitySeverityLevel;
        this.description = description;
        this.fullDescription = fullDescription;
        this.tags = OptionalNullable.of(tags);
        this.help = OptionalNullable.of(help);
        this.helpUri = OptionalNullable.of(helpUri);
    }

    /**
     * Internal initialization constructor.
     */
    protected CodeScanningAlertRule(OptionalNullable<String> id, String name, Object severity,
            Object securitySeverityLevel, String description, String fullDescription,
            OptionalNullable<List<String>> tags, OptionalNullable<String> help,
            OptionalNullable<String> helpUri) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.securitySeverityLevel = securitySeverityLevel;
        this.description = description;
        this.fullDescription = fullDescription;
        this.tags = tags;
        this.help = help;
        this.helpUri = helpUri;
    }

    /**
     * Internal Getter for Id.
     * A unique identifier for the rule used to detect the alert.
     * @return Returns the Internal String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * A unique identifier for the rule used to detect the alert.
     * @return Returns the String
     */
    public String getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * A unique identifier for the rule used to detect the alert.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     * A unique identifier for the rule used to detect the alert.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Getter for Name.
     * The name of the rule used to detect the alert.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the rule used to detect the alert.
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for SecuritySeverityLevel.
     * @return Returns the Object
     */
    @JsonGetter("security_severity_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getSecuritySeverityLevel() {
        return securitySeverityLevel;
    }

    /**
     * Setter for SecuritySeverityLevel.
     * @param securitySeverityLevel Value for Object
     */
    @JsonSetter("security_severity_level")
    public void setSecuritySeverityLevel(Object securitySeverityLevel) {
        this.securitySeverityLevel = securitySeverityLevel;
    }

    /**
     * Getter for Description.
     * A short description of the rule used to detect the alert.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * description of the rule used to detect the alert.
     * @return Returns the String
     */
    @JsonGetter("full_description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullDescription() {
        return fullDescription;
    }

    /**
     * Setter for FullDescription.
     * description of the rule used to detect the alert.
     * @param fullDescription Value for String
     */
    @JsonSetter("full_description")
    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    /**
     * Internal Getter for Tags.
     * A set of tags applicable for the rule.
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
     * A set of tags applicable for the rule.
     * @return Returns the List of String
     */
    public List<String> getTags() {
        return OptionalNullable.getFrom(tags);
    }

    /**
     * Setter for Tags.
     * A set of tags applicable for the rule.
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = OptionalNullable.of(tags);
    }

    /**
     * UnSetter for Tags.
     * A set of tags applicable for the rule.
     */
    public void unsetTags() {
        tags = null;
    }

    /**
     * Internal Getter for Help.
     * Detailed documentation for the rule as GitHub Flavored Markdown.
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
     * Detailed documentation for the rule as GitHub Flavored Markdown.
     * @return Returns the String
     */
    public String getHelp() {
        return OptionalNullable.getFrom(help);
    }

    /**
     * Setter for Help.
     * Detailed documentation for the rule as GitHub Flavored Markdown.
     * @param help Value for String
     */
    @JsonSetter("help")
    public void setHelp(String help) {
        this.help = OptionalNullable.of(help);
    }

    /**
     * UnSetter for Help.
     * Detailed documentation for the rule as GitHub Flavored Markdown.
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
     * Converts this CodeScanningAlertRule into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CodeScanningAlertRule [" + "id=" + id + ", name=" + name + ", severity=" + severity
                + ", securitySeverityLevel=" + securitySeverityLevel + ", description="
                + description + ", fullDescription=" + fullDescription + ", tags=" + tags
                + ", help=" + help + ", helpUri=" + helpUri + "]";
    }

    /**
     * Builds a new {@link CodeScanningAlertRule.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CodeScanningAlertRule.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .severity(getSeverity())
                .securitySeverityLevel(getSecuritySeverityLevel())
                .description(getDescription())
                .fullDescription(getFullDescription());
        builder.id = internalGetId();
        builder.tags = internalGetTags();
        builder.help = internalGetHelp();
        builder.helpUri = internalGetHelpUri();
        return builder;
    }

    /**
     * Class to build instances of {@link CodeScanningAlertRule}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private String name;
        private Object severity;
        private Object securitySeverityLevel;
        private String description;
        private String fullDescription;
        private OptionalNullable<List<String>> tags;
        private OptionalNullable<String> help;
        private OptionalNullable<String> helpUri;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
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
         * Setter for severity.
         * @param  severity  Object value for severity.
         * @return Builder
         */
        public Builder severity(Object severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Setter for securitySeverityLevel.
         * @param  securitySeverityLevel  Object value for securitySeverityLevel.
         * @return Builder
         */
        public Builder securitySeverityLevel(Object securitySeverityLevel) {
            this.securitySeverityLevel = securitySeverityLevel;
            return this;
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
         * Setter for fullDescription.
         * @param  fullDescription  String value for fullDescription.
         * @return Builder
         */
        public Builder fullDescription(String fullDescription) {
            this.fullDescription = fullDescription;
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
         * Builds a new {@link CodeScanningAlertRule} object using the set fields.
         * @return {@link CodeScanningAlertRule}
         */
        public CodeScanningAlertRule build() {
            return new CodeScanningAlertRule(id, name, severity, securitySeverityLevel, description,
                    fullDescription, tags, help, helpUri);
        }
    }
}
