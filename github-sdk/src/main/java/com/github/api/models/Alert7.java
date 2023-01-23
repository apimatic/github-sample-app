/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;

/**
 * This is a model class for Alert7 type.
 */
public class Alert7 {
    private String affectedPackageName;
    private String affectedRange;
    private String createdAt;
    private OptionalNullable<String> dismissComment;
    private String dismissReason;
    private String dismissedAt;
    private Object dismisser;
    private String externalIdentifier;
    private String externalReference;
    private String fixReason;
    private LocalDateTime fixedAt;
    private String fixedIn;
    private String ghsaId;
    private int id;
    private String nodeId;
    private int number;
    private String severity;
    private State161Enum state;

    /**
     * Default constructor.
     */
    public Alert7() {
    }

    /**
     * Initialization constructor.
     * @param  affectedPackageName  String value for affectedPackageName.
     * @param  affectedRange  String value for affectedRange.
     * @param  createdAt  String value for createdAt.
     * @param  dismissReason  String value for dismissReason.
     * @param  dismissedAt  String value for dismissedAt.
     * @param  dismisser  Object value for dismisser.
     * @param  externalIdentifier  String value for externalIdentifier.
     * @param  externalReference  String value for externalReference.
     * @param  ghsaId  String value for ghsaId.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  number  int value for number.
     * @param  severity  String value for severity.
     * @param  state  State161Enum value for state.
     * @param  dismissComment  String value for dismissComment.
     * @param  fixReason  String value for fixReason.
     * @param  fixedAt  LocalDateTime value for fixedAt.
     * @param  fixedIn  String value for fixedIn.
     */
    public Alert7(
            String affectedPackageName,
            String affectedRange,
            String createdAt,
            String dismissReason,
            String dismissedAt,
            Object dismisser,
            String externalIdentifier,
            String externalReference,
            String ghsaId,
            int id,
            String nodeId,
            int number,
            String severity,
            State161Enum state,
            String dismissComment,
            String fixReason,
            LocalDateTime fixedAt,
            String fixedIn) {
        this.affectedPackageName = affectedPackageName;
        this.affectedRange = affectedRange;
        this.createdAt = createdAt;
        this.dismissComment = OptionalNullable.of(dismissComment);
        this.dismissReason = dismissReason;
        this.dismissedAt = dismissedAt;
        this.dismisser = dismisser;
        this.externalIdentifier = externalIdentifier;
        this.externalReference = externalReference;
        this.fixReason = fixReason;
        this.fixedAt = fixedAt;
        this.fixedIn = fixedIn;
        this.ghsaId = ghsaId;
        this.id = id;
        this.nodeId = nodeId;
        this.number = number;
        this.severity = severity;
        this.state = state;
    }

    /**
     * Internal initialization constructor.
     */
    protected Alert7(String affectedPackageName, String affectedRange, String createdAt,
            String dismissReason, String dismissedAt, Object dismisser, String externalIdentifier,
            String externalReference, String ghsaId, int id, String nodeId, int number,
            String severity, State161Enum state, OptionalNullable<String> dismissComment,
            String fixReason, LocalDateTime fixedAt, String fixedIn) {
        this.affectedPackageName = affectedPackageName;
        this.affectedRange = affectedRange;
        this.createdAt = createdAt;
        this.dismissComment = dismissComment;
        this.dismissReason = dismissReason;
        this.dismissedAt = dismissedAt;
        this.dismisser = dismisser;
        this.externalIdentifier = externalIdentifier;
        this.externalReference = externalReference;
        this.fixReason = fixReason;
        this.fixedAt = fixedAt;
        this.fixedIn = fixedIn;
        this.ghsaId = ghsaId;
        this.id = id;
        this.nodeId = nodeId;
        this.number = number;
        this.severity = severity;
        this.state = state;
    }

    /**
     * Getter for AffectedPackageName.
     * @return Returns the String
     */
    @JsonGetter("affected_package_name")
    public String getAffectedPackageName() {
        return affectedPackageName;
    }

    /**
     * Setter for AffectedPackageName.
     * @param affectedPackageName Value for String
     */
    @JsonSetter("affected_package_name")
    public void setAffectedPackageName(String affectedPackageName) {
        this.affectedPackageName = affectedPackageName;
    }

    /**
     * Getter for AffectedRange.
     * @return Returns the String
     */
    @JsonGetter("affected_range")
    public String getAffectedRange() {
        return affectedRange;
    }

    /**
     * Setter for AffectedRange.
     * @param affectedRange Value for String
     */
    @JsonSetter("affected_range")
    public void setAffectedRange(String affectedRange) {
        this.affectedRange = affectedRange;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Internal Getter for DismissComment.
     * @return Returns the Internal String
     */
    @JsonGetter("dismiss_comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDismissComment() {
        return this.dismissComment;
    }

    /**
     * Getter for DismissComment.
     * @return Returns the String
     */
    public String getDismissComment() {
        return OptionalNullable.getFrom(dismissComment);
    }

    /**
     * Setter for DismissComment.
     * @param dismissComment Value for String
     */
    @JsonSetter("dismiss_comment")
    public void setDismissComment(String dismissComment) {
        this.dismissComment = OptionalNullable.of(dismissComment);
    }

    /**
     * UnSetter for DismissComment.
     */
    public void unsetDismissComment() {
        dismissComment = null;
    }

    /**
     * Getter for DismissReason.
     * @return Returns the String
     */
    @JsonGetter("dismiss_reason")
    public String getDismissReason() {
        return dismissReason;
    }

    /**
     * Setter for DismissReason.
     * @param dismissReason Value for String
     */
    @JsonSetter("dismiss_reason")
    public void setDismissReason(String dismissReason) {
        this.dismissReason = dismissReason;
    }

    /**
     * Getter for DismissedAt.
     * @return Returns the String
     */
    @JsonGetter("dismissed_at")
    public String getDismissedAt() {
        return dismissedAt;
    }

    /**
     * Setter for DismissedAt.
     * @param dismissedAt Value for String
     */
    @JsonSetter("dismissed_at")
    public void setDismissedAt(String dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

    /**
     * Getter for Dismisser.
     * @return Returns the Object
     */
    @JsonGetter("dismisser")
    public Object getDismisser() {
        return dismisser;
    }

    /**
     * Setter for Dismisser.
     * @param dismisser Value for Object
     */
    @JsonSetter("dismisser")
    public void setDismisser(Object dismisser) {
        this.dismisser = dismisser;
    }

    /**
     * Getter for ExternalIdentifier.
     * @return Returns the String
     */
    @JsonGetter("external_identifier")
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Setter for ExternalIdentifier.
     * @param externalIdentifier Value for String
     */
    @JsonSetter("external_identifier")
    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    /**
     * Getter for ExternalReference.
     * @return Returns the String
     */
    @JsonGetter("external_reference")
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Setter for ExternalReference.
     * @param externalReference Value for String
     */
    @JsonSetter("external_reference")
    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    /**
     * Getter for FixReason.
     * @return Returns the String
     */
    @JsonGetter("fix_reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFixReason() {
        return fixReason;
    }

    /**
     * Setter for FixReason.
     * @param fixReason Value for String
     */
    @JsonSetter("fix_reason")
    public void setFixReason(String fixReason) {
        this.fixReason = fixReason;
    }

    /**
     * Getter for FixedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("fixed_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getFixedAt() {
        return fixedAt;
    }

    /**
     * Setter for FixedAt.
     * @param fixedAt Value for LocalDateTime
     */
    @JsonSetter("fixed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFixedAt(LocalDateTime fixedAt) {
        this.fixedAt = fixedAt;
    }

    /**
     * Getter for FixedIn.
     * @return Returns the String
     */
    @JsonGetter("fixed_in")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFixedIn() {
        return fixedIn;
    }

    /**
     * Setter for FixedIn.
     * @param fixedIn Value for String
     */
    @JsonSetter("fixed_in")
    public void setFixedIn(String fixedIn) {
        this.fixedIn = fixedIn;
    }

    /**
     * Getter for GhsaId.
     * @return Returns the String
     */
    @JsonGetter("ghsa_id")
    public String getGhsaId() {
        return ghsaId;
    }

    /**
     * Setter for GhsaId.
     * @param ghsaId Value for String
     */
    @JsonSetter("ghsa_id")
    public void setGhsaId(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for Number.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for Severity.
     * @return Returns the String
     */
    @JsonGetter("severity")
    public String getSeverity() {
        return severity;
    }

    /**
     * Setter for Severity.
     * @param severity Value for String
     */
    @JsonSetter("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * Getter for State.
     * @return Returns the State161Enum
     */
    @JsonGetter("state")
    public State161Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State161Enum
     */
    @JsonSetter("state")
    public void setState(State161Enum state) {
        this.state = state;
    }

    /**
     * Converts this Alert7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Alert7 [" + "affectedPackageName=" + affectedPackageName + ", affectedRange="
                + affectedRange + ", createdAt=" + createdAt + ", dismissReason=" + dismissReason
                + ", dismissedAt=" + dismissedAt + ", dismisser=" + dismisser
                + ", externalIdentifier=" + externalIdentifier + ", externalReference="
                + externalReference + ", ghsaId=" + ghsaId + ", id=" + id + ", nodeId=" + nodeId
                + ", number=" + number + ", severity=" + severity + ", state=" + state
                + ", dismissComment=" + dismissComment + ", fixReason=" + fixReason + ", fixedAt="
                + fixedAt + ", fixedIn=" + fixedIn + "]";
    }

    /**
     * Builds a new {@link Alert7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Alert7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(affectedPackageName, affectedRange, createdAt, dismissReason,
                dismissedAt, dismisser, externalIdentifier, externalReference, ghsaId, id, nodeId,
                number, severity, state)
                .fixReason(getFixReason())
                .fixedAt(getFixedAt())
                .fixedIn(getFixedIn());
        builder.dismissComment = internalGetDismissComment();
        return builder;
    }

    /**
     * Class to build instances of {@link Alert7}.
     */
    public static class Builder {
        private String affectedPackageName;
        private String affectedRange;
        private String createdAt;
        private String dismissReason;
        private String dismissedAt;
        private Object dismisser;
        private String externalIdentifier;
        private String externalReference;
        private String ghsaId;
        private int id;
        private String nodeId;
        private int number;
        private String severity;
        private State161Enum state;
        private OptionalNullable<String> dismissComment;
        private String fixReason;
        private LocalDateTime fixedAt;
        private String fixedIn;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  affectedPackageName  String value for affectedPackageName.
         * @param  affectedRange  String value for affectedRange.
         * @param  createdAt  String value for createdAt.
         * @param  dismissReason  String value for dismissReason.
         * @param  dismissedAt  String value for dismissedAt.
         * @param  dismisser  Object value for dismisser.
         * @param  externalIdentifier  String value for externalIdentifier.
         * @param  externalReference  String value for externalReference.
         * @param  ghsaId  String value for ghsaId.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  number  int value for number.
         * @param  severity  String value for severity.
         * @param  state  State161Enum value for state.
         */
        public Builder(String affectedPackageName, String affectedRange, String createdAt,
                String dismissReason, String dismissedAt, Object dismisser,
                String externalIdentifier, String externalReference, String ghsaId, int id,
                String nodeId, int number, String severity, State161Enum state) {
            this.affectedPackageName = affectedPackageName;
            this.affectedRange = affectedRange;
            this.createdAt = createdAt;
            this.dismissReason = dismissReason;
            this.dismissedAt = dismissedAt;
            this.dismisser = dismisser;
            this.externalIdentifier = externalIdentifier;
            this.externalReference = externalReference;
            this.ghsaId = ghsaId;
            this.id = id;
            this.nodeId = nodeId;
            this.number = number;
            this.severity = severity;
            this.state = state;
        }

        /**
         * Setter for affectedPackageName.
         * @param  affectedPackageName  String value for affectedPackageName.
         * @return Builder
         */
        public Builder affectedPackageName(String affectedPackageName) {
            this.affectedPackageName = affectedPackageName;
            return this;
        }

        /**
         * Setter for affectedRange.
         * @param  affectedRange  String value for affectedRange.
         * @return Builder
         */
        public Builder affectedRange(String affectedRange) {
            this.affectedRange = affectedRange;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for dismissReason.
         * @param  dismissReason  String value for dismissReason.
         * @return Builder
         */
        public Builder dismissReason(String dismissReason) {
            this.dismissReason = dismissReason;
            return this;
        }

        /**
         * Setter for dismissedAt.
         * @param  dismissedAt  String value for dismissedAt.
         * @return Builder
         */
        public Builder dismissedAt(String dismissedAt) {
            this.dismissedAt = dismissedAt;
            return this;
        }

        /**
         * Setter for dismisser.
         * @param  dismisser  Object value for dismisser.
         * @return Builder
         */
        public Builder dismisser(Object dismisser) {
            this.dismisser = dismisser;
            return this;
        }

        /**
         * Setter for externalIdentifier.
         * @param  externalIdentifier  String value for externalIdentifier.
         * @return Builder
         */
        public Builder externalIdentifier(String externalIdentifier) {
            this.externalIdentifier = externalIdentifier;
            return this;
        }

        /**
         * Setter for externalReference.
         * @param  externalReference  String value for externalReference.
         * @return Builder
         */
        public Builder externalReference(String externalReference) {
            this.externalReference = externalReference;
            return this;
        }

        /**
         * Setter for ghsaId.
         * @param  ghsaId  String value for ghsaId.
         * @return Builder
         */
        public Builder ghsaId(String ghsaId) {
            this.ghsaId = ghsaId;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for severity.
         * @param  severity  String value for severity.
         * @return Builder
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State161Enum value for state.
         * @return Builder
         */
        public Builder state(State161Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for dismissComment.
         * @param  dismissComment  String value for dismissComment.
         * @return Builder
         */
        public Builder dismissComment(String dismissComment) {
            this.dismissComment = OptionalNullable.of(dismissComment);
            return this;
        }

        /**
         * UnSetter for dismissComment.
         * @return Builder
         */
        public Builder unsetDismissComment() {
            dismissComment = null;
            return this;
        }

        /**
         * Setter for fixReason.
         * @param  fixReason  String value for fixReason.
         * @return Builder
         */
        public Builder fixReason(String fixReason) {
            this.fixReason = fixReason;
            return this;
        }

        /**
         * Setter for fixedAt.
         * @param  fixedAt  LocalDateTime value for fixedAt.
         * @return Builder
         */
        public Builder fixedAt(LocalDateTime fixedAt) {
            this.fixedAt = fixedAt;
            return this;
        }

        /**
         * Setter for fixedIn.
         * @param  fixedIn  String value for fixedIn.
         * @return Builder
         */
        public Builder fixedIn(String fixedIn) {
            this.fixedIn = fixedIn;
            return this;
        }

        /**
         * Builds a new {@link Alert7} object using the set fields.
         * @return {@link Alert7}
         */
        public Alert7 build() {
            return new Alert7(affectedPackageName, affectedRange, createdAt, dismissReason,
                    dismissedAt, dismisser, externalIdentifier, externalReference, ghsaId, id,
                    nodeId, number, severity, state, dismissComment, fixReason, fixedAt, fixedIn);
        }
    }
}
