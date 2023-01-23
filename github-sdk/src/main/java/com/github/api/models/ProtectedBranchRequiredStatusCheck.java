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
 * This is a model class for ProtectedBranchRequiredStatusCheck type.
 */
public class ProtectedBranchRequiredStatusCheck {
    private String url;
    private String enforcementLevel;
    private List<String> contexts;
    private List<Checks1> checks;
    private String contextsUrl;
    private Boolean strict;

    /**
     * Default constructor.
     */
    public ProtectedBranchRequiredStatusCheck() {
    }

    /**
     * Initialization constructor.
     * @param  contexts  List of String value for contexts.
     * @param  checks  List of Checks1 value for checks.
     * @param  url  String value for url.
     * @param  enforcementLevel  String value for enforcementLevel.
     * @param  contextsUrl  String value for contextsUrl.
     * @param  strict  Boolean value for strict.
     */
    public ProtectedBranchRequiredStatusCheck(
            List<String> contexts,
            List<Checks1> checks,
            String url,
            String enforcementLevel,
            String contextsUrl,
            Boolean strict) {
        this.url = url;
        this.enforcementLevel = enforcementLevel;
        this.contexts = contexts;
        this.checks = checks;
        this.contextsUrl = contextsUrl;
        this.strict = strict;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for EnforcementLevel.
     * @return Returns the String
     */
    @JsonGetter("enforcement_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnforcementLevel() {
        return enforcementLevel;
    }

    /**
     * Setter for EnforcementLevel.
     * @param enforcementLevel Value for String
     */
    @JsonSetter("enforcement_level")
    public void setEnforcementLevel(String enforcementLevel) {
        this.enforcementLevel = enforcementLevel;
    }

    /**
     * Getter for Contexts.
     * @return Returns the List of String
     */
    @JsonGetter("contexts")
    public List<String> getContexts() {
        return contexts;
    }

    /**
     * Setter for Contexts.
     * @param contexts Value for List of String
     */
    @JsonSetter("contexts")
    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
    }

    /**
     * Getter for Checks.
     * @return Returns the List of Checks1
     */
    @JsonGetter("checks")
    public List<Checks1> getChecks() {
        return checks;
    }

    /**
     * Setter for Checks.
     * @param checks Value for List of Checks1
     */
    @JsonSetter("checks")
    public void setChecks(List<Checks1> checks) {
        this.checks = checks;
    }

    /**
     * Getter for ContextsUrl.
     * @return Returns the String
     */
    @JsonGetter("contexts_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContextsUrl() {
        return contextsUrl;
    }

    /**
     * Setter for ContextsUrl.
     * @param contextsUrl Value for String
     */
    @JsonSetter("contexts_url")
    public void setContextsUrl(String contextsUrl) {
        this.contextsUrl = contextsUrl;
    }

    /**
     * Getter for Strict.
     * @return Returns the Boolean
     */
    @JsonGetter("strict")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getStrict() {
        return strict;
    }

    /**
     * Setter for Strict.
     * @param strict Value for Boolean
     */
    @JsonSetter("strict")
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    /**
     * Converts this ProtectedBranchRequiredStatusCheck into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProtectedBranchRequiredStatusCheck [" + "contexts=" + contexts + ", checks="
                + checks + ", url=" + url + ", enforcementLevel=" + enforcementLevel
                + ", contextsUrl=" + contextsUrl + ", strict=" + strict + "]";
    }

    /**
     * Builds a new {@link ProtectedBranchRequiredStatusCheck.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProtectedBranchRequiredStatusCheck.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contexts, checks)
                .url(getUrl())
                .enforcementLevel(getEnforcementLevel())
                .contextsUrl(getContextsUrl())
                .strict(getStrict());
        return builder;
    }

    /**
     * Class to build instances of {@link ProtectedBranchRequiredStatusCheck}.
     */
    public static class Builder {
        private List<String> contexts;
        private List<Checks1> checks;
        private String url;
        private String enforcementLevel;
        private String contextsUrl;
        private Boolean strict;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contexts  List of String value for contexts.
         * @param  checks  List of Checks1 value for checks.
         */
        public Builder(List<String> contexts, List<Checks1> checks) {
            this.contexts = contexts;
            this.checks = checks;
        }

        /**
         * Setter for contexts.
         * @param  contexts  List of String value for contexts.
         * @return Builder
         */
        public Builder contexts(List<String> contexts) {
            this.contexts = contexts;
            return this;
        }

        /**
         * Setter for checks.
         * @param  checks  List of Checks1 value for checks.
         * @return Builder
         */
        public Builder checks(List<Checks1> checks) {
            this.checks = checks;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for enforcementLevel.
         * @param  enforcementLevel  String value for enforcementLevel.
         * @return Builder
         */
        public Builder enforcementLevel(String enforcementLevel) {
            this.enforcementLevel = enforcementLevel;
            return this;
        }

        /**
         * Setter for contextsUrl.
         * @param  contextsUrl  String value for contextsUrl.
         * @return Builder
         */
        public Builder contextsUrl(String contextsUrl) {
            this.contextsUrl = contextsUrl;
            return this;
        }

        /**
         * Setter for strict.
         * @param  strict  Boolean value for strict.
         * @return Builder
         */
        public Builder strict(Boolean strict) {
            this.strict = strict;
            return this;
        }

        /**
         * Builds a new {@link ProtectedBranchRequiredStatusCheck} object using the set fields.
         * @return {@link ProtectedBranchRequiredStatusCheck}
         */
        public ProtectedBranchRequiredStatusCheck build() {
            return new ProtectedBranchRequiredStatusCheck(contexts, checks, url, enforcementLevel,
                    contextsUrl, strict);
        }
    }
}
