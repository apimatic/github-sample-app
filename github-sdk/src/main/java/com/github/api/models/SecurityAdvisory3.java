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
 * This is a model class for SecurityAdvisory3 type.
 */
public class SecurityAdvisory3 {
    private Cvss1 cvss;
    private List<Cwe1> cwes;
    private String description;
    private String ghsaId;
    private List<Identifier1> identifiers;
    private String publishedAt;
    private List<Reference1> references;
    private String severity;
    private String summary;
    private String updatedAt;
    private List<Vulnerability1> vulnerabilities;
    private String withdrawnAt;

    /**
     * Default constructor.
     */
    public SecurityAdvisory3() {
    }

    /**
     * Initialization constructor.
     * @param  cvss  Cvss1 value for cvss.
     * @param  cwes  List of Cwe1 value for cwes.
     * @param  description  String value for description.
     * @param  ghsaId  String value for ghsaId.
     * @param  identifiers  List of Identifier1 value for identifiers.
     * @param  publishedAt  String value for publishedAt.
     * @param  references  List of Reference1 value for references.
     * @param  severity  String value for severity.
     * @param  summary  String value for summary.
     * @param  updatedAt  String value for updatedAt.
     * @param  vulnerabilities  List of Vulnerability1 value for vulnerabilities.
     * @param  withdrawnAt  String value for withdrawnAt.
     */
    public SecurityAdvisory3(
            Cvss1 cvss,
            List<Cwe1> cwes,
            String description,
            String ghsaId,
            List<Identifier1> identifiers,
            String publishedAt,
            List<Reference1> references,
            String severity,
            String summary,
            String updatedAt,
            List<Vulnerability1> vulnerabilities,
            String withdrawnAt) {
        this.cvss = cvss;
        this.cwes = cwes;
        this.description = description;
        this.ghsaId = ghsaId;
        this.identifiers = identifiers;
        this.publishedAt = publishedAt;
        this.references = references;
        this.severity = severity;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.vulnerabilities = vulnerabilities;
        this.withdrawnAt = withdrawnAt;
    }

    /**
     * Getter for Cvss.
     * @return Returns the Cvss1
     */
    @JsonGetter("cvss")
    public Cvss1 getCvss() {
        return cvss;
    }

    /**
     * Setter for Cvss.
     * @param cvss Value for Cvss1
     */
    @JsonSetter("cvss")
    public void setCvss(Cvss1 cvss) {
        this.cvss = cvss;
    }

    /**
     * Getter for Cwes.
     * @return Returns the List of Cwe1
     */
    @JsonGetter("cwes")
    public List<Cwe1> getCwes() {
        return cwes;
    }

    /**
     * Setter for Cwes.
     * @param cwes Value for List of Cwe1
     */
    @JsonSetter("cwes")
    public void setCwes(List<Cwe1> cwes) {
        this.cwes = cwes;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
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
     * Getter for Identifiers.
     * @return Returns the List of Identifier1
     */
    @JsonGetter("identifiers")
    public List<Identifier1> getIdentifiers() {
        return identifiers;
    }

    /**
     * Setter for Identifiers.
     * @param identifiers Value for List of Identifier1
     */
    @JsonSetter("identifiers")
    public void setIdentifiers(List<Identifier1> identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * Getter for PublishedAt.
     * @return Returns the String
     */
    @JsonGetter("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     * Setter for PublishedAt.
     * @param publishedAt Value for String
     */
    @JsonSetter("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * Getter for References.
     * @return Returns the List of Reference1
     */
    @JsonGetter("references")
    public List<Reference1> getReferences() {
        return references;
    }

    /**
     * Setter for References.
     * @param references Value for List of Reference1
     */
    @JsonSetter("references")
    public void setReferences(List<Reference1> references) {
        this.references = references;
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
     * Getter for Summary.
     * @return Returns the String
     */
    @JsonGetter("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Setter for Summary.
     * @param summary Value for String
     */
    @JsonSetter("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Vulnerabilities.
     * @return Returns the List of Vulnerability1
     */
    @JsonGetter("vulnerabilities")
    public List<Vulnerability1> getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * Setter for Vulnerabilities.
     * @param vulnerabilities Value for List of Vulnerability1
     */
    @JsonSetter("vulnerabilities")
    public void setVulnerabilities(List<Vulnerability1> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    /**
     * Getter for WithdrawnAt.
     * @return Returns the String
     */
    @JsonGetter("withdrawn_at")
    public String getWithdrawnAt() {
        return withdrawnAt;
    }

    /**
     * Setter for WithdrawnAt.
     * @param withdrawnAt Value for String
     */
    @JsonSetter("withdrawn_at")
    public void setWithdrawnAt(String withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
    }

    /**
     * Converts this SecurityAdvisory3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecurityAdvisory3 [" + "cvss=" + cvss + ", cwes=" + cwes + ", description="
                + description + ", ghsaId=" + ghsaId + ", identifiers=" + identifiers
                + ", publishedAt=" + publishedAt + ", references=" + references + ", severity="
                + severity + ", summary=" + summary + ", updatedAt=" + updatedAt
                + ", vulnerabilities=" + vulnerabilities + ", withdrawnAt=" + withdrawnAt + "]";
    }

    /**
     * Builds a new {@link SecurityAdvisory3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecurityAdvisory3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cvss, cwes, description, ghsaId, identifiers, publishedAt,
                references, severity, summary, updatedAt, vulnerabilities, withdrawnAt);
        return builder;
    }

    /**
     * Class to build instances of {@link SecurityAdvisory3}.
     */
    public static class Builder {
        private Cvss1 cvss;
        private List<Cwe1> cwes;
        private String description;
        private String ghsaId;
        private List<Identifier1> identifiers;
        private String publishedAt;
        private List<Reference1> references;
        private String severity;
        private String summary;
        private String updatedAt;
        private List<Vulnerability1> vulnerabilities;
        private String withdrawnAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  cvss  Cvss1 value for cvss.
         * @param  cwes  List of Cwe1 value for cwes.
         * @param  description  String value for description.
         * @param  ghsaId  String value for ghsaId.
         * @param  identifiers  List of Identifier1 value for identifiers.
         * @param  publishedAt  String value for publishedAt.
         * @param  references  List of Reference1 value for references.
         * @param  severity  String value for severity.
         * @param  summary  String value for summary.
         * @param  updatedAt  String value for updatedAt.
         * @param  vulnerabilities  List of Vulnerability1 value for vulnerabilities.
         * @param  withdrawnAt  String value for withdrawnAt.
         */
        public Builder(Cvss1 cvss, List<Cwe1> cwes, String description, String ghsaId,
                List<Identifier1> identifiers, String publishedAt, List<Reference1> references,
                String severity, String summary, String updatedAt,
                List<Vulnerability1> vulnerabilities, String withdrawnAt) {
            this.cvss = cvss;
            this.cwes = cwes;
            this.description = description;
            this.ghsaId = ghsaId;
            this.identifiers = identifiers;
            this.publishedAt = publishedAt;
            this.references = references;
            this.severity = severity;
            this.summary = summary;
            this.updatedAt = updatedAt;
            this.vulnerabilities = vulnerabilities;
            this.withdrawnAt = withdrawnAt;
        }

        /**
         * Setter for cvss.
         * @param  cvss  Cvss1 value for cvss.
         * @return Builder
         */
        public Builder cvss(Cvss1 cvss) {
            this.cvss = cvss;
            return this;
        }

        /**
         * Setter for cwes.
         * @param  cwes  List of Cwe1 value for cwes.
         * @return Builder
         */
        public Builder cwes(List<Cwe1> cwes) {
            this.cwes = cwes;
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
         * Setter for ghsaId.
         * @param  ghsaId  String value for ghsaId.
         * @return Builder
         */
        public Builder ghsaId(String ghsaId) {
            this.ghsaId = ghsaId;
            return this;
        }

        /**
         * Setter for identifiers.
         * @param  identifiers  List of Identifier1 value for identifiers.
         * @return Builder
         */
        public Builder identifiers(List<Identifier1> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * Setter for publishedAt.
         * @param  publishedAt  String value for publishedAt.
         * @return Builder
         */
        public Builder publishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        /**
         * Setter for references.
         * @param  references  List of Reference1 value for references.
         * @return Builder
         */
        public Builder references(List<Reference1> references) {
            this.references = references;
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
         * Setter for summary.
         * @param  summary  String value for summary.
         * @return Builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for vulnerabilities.
         * @param  vulnerabilities  List of Vulnerability1 value for vulnerabilities.
         * @return Builder
         */
        public Builder vulnerabilities(List<Vulnerability1> vulnerabilities) {
            this.vulnerabilities = vulnerabilities;
            return this;
        }

        /**
         * Setter for withdrawnAt.
         * @param  withdrawnAt  String value for withdrawnAt.
         * @return Builder
         */
        public Builder withdrawnAt(String withdrawnAt) {
            this.withdrawnAt = withdrawnAt;
            return this;
        }

        /**
         * Builds a new {@link SecurityAdvisory3} object using the set fields.
         * @return {@link SecurityAdvisory3}
         */
        public SecurityAdvisory3 build() {
            return new SecurityAdvisory3(cvss, cwes, description, ghsaId, identifiers, publishedAt,
                    references, severity, summary, updatedAt, vulnerabilities, withdrawnAt);
        }
    }
}
