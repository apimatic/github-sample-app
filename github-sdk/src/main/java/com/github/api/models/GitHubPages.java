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
 * This is a model class for GitHubPages type.
 */
public class GitHubPages {
    private String url;
    private Object status;
    private String cname;
    private Object protectedDomainState;
    private OptionalNullable<LocalDateTime> pendingDomainUnverifiedAt;
    private boolean custom404;
    private String htmlUrl;
    private Object buildType;
    private PagesSourceHash source;
    private boolean mPublic;
    private PagesHttpsCertificate httpsCertificate;
    private Boolean httpsEnforced;

    /**
     * Default constructor.
     */
    public GitHubPages() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  status  Object value for status.
     * @param  cname  String value for cname.
     * @param  custom404  boolean value for custom404.
     * @param  mPublic  boolean value for mPublic.
     * @param  protectedDomainState  Object value for protectedDomainState.
     * @param  pendingDomainUnverifiedAt  LocalDateTime value for pendingDomainUnverifiedAt.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  buildType  Object value for buildType.
     * @param  source  PagesSourceHash value for source.
     * @param  httpsCertificate  PagesHttpsCertificate value for httpsCertificate.
     * @param  httpsEnforced  Boolean value for httpsEnforced.
     */
    public GitHubPages(
            String url,
            Object status,
            String cname,
            boolean custom404,
            boolean mPublic,
            Object protectedDomainState,
            LocalDateTime pendingDomainUnverifiedAt,
            String htmlUrl,
            Object buildType,
            PagesSourceHash source,
            PagesHttpsCertificate httpsCertificate,
            Boolean httpsEnforced) {
        this.url = url;
        this.status = status;
        this.cname = cname;
        this.protectedDomainState = protectedDomainState;
        this.pendingDomainUnverifiedAt = OptionalNullable.of(pendingDomainUnverifiedAt);
        this.custom404 = custom404;
        this.htmlUrl = htmlUrl;
        this.buildType = buildType;
        this.source = source;
        this.mPublic = mPublic;
        this.httpsCertificate = httpsCertificate;
        this.httpsEnforced = httpsEnforced;
    }

    /**
     * Internal initialization constructor.
     */
    protected GitHubPages(String url, Object status, String cname, boolean custom404,
            boolean mPublic, Object protectedDomainState,
            OptionalNullable<LocalDateTime> pendingDomainUnverifiedAt, String htmlUrl,
            Object buildType, PagesSourceHash source, PagesHttpsCertificate httpsCertificate,
            Boolean httpsEnforced) {
        this.url = url;
        this.status = status;
        this.cname = cname;
        this.protectedDomainState = protectedDomainState;
        this.pendingDomainUnverifiedAt = pendingDomainUnverifiedAt;
        this.custom404 = custom404;
        this.htmlUrl = htmlUrl;
        this.buildType = buildType;
        this.source = source;
        this.mPublic = mPublic;
        this.httpsCertificate = httpsCertificate;
        this.httpsEnforced = httpsEnforced;
    }

    /**
     * Getter for Url.
     * The API address for accessing this Page resource.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The API address for accessing this Page resource.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Status.
     * @return Returns the Object
     */
    @JsonGetter("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Object
     */
    @JsonSetter("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    /**
     * Getter for Cname.
     * The Pages site's custom domain
     * @return Returns the String
     */
    @JsonGetter("cname")
    public String getCname() {
        return cname;
    }

    /**
     * Setter for Cname.
     * The Pages site's custom domain
     * @param cname Value for String
     */
    @JsonSetter("cname")
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * Getter for ProtectedDomainState.
     * @return Returns the Object
     */
    @JsonGetter("protected_domain_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getProtectedDomainState() {
        return protectedDomainState;
    }

    /**
     * Setter for ProtectedDomainState.
     * @param protectedDomainState Value for Object
     */
    @JsonSetter("protected_domain_state")
    public void setProtectedDomainState(Object protectedDomainState) {
        this.protectedDomainState = protectedDomainState;
    }

    /**
     * Internal Getter for PendingDomainUnverifiedAt.
     * The timestamp when a pending domain becomes unverified.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("pending_domain_unverified_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetPendingDomainUnverifiedAt() {
        return this.pendingDomainUnverifiedAt;
    }

    /**
     * Getter for PendingDomainUnverifiedAt.
     * The timestamp when a pending domain becomes unverified.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getPendingDomainUnverifiedAt() {
        return OptionalNullable.getFrom(pendingDomainUnverifiedAt);
    }

    /**
     * Setter for PendingDomainUnverifiedAt.
     * The timestamp when a pending domain becomes unverified.
     * @param pendingDomainUnverifiedAt Value for LocalDateTime
     */
    @JsonSetter("pending_domain_unverified_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPendingDomainUnverifiedAt(LocalDateTime pendingDomainUnverifiedAt) {
        this.pendingDomainUnverifiedAt = OptionalNullable.of(pendingDomainUnverifiedAt);
    }

    /**
     * UnSetter for PendingDomainUnverifiedAt.
     * The timestamp when a pending domain becomes unverified.
     */
    public void unsetPendingDomainUnverifiedAt() {
        pendingDomainUnverifiedAt = null;
    }

    /**
     * Getter for Custom404.
     * Whether the Page has a custom 404 page.
     * @return Returns the boolean
     */
    @JsonGetter("custom_404")
    public boolean getCustom404() {
        return custom404;
    }

    /**
     * Setter for Custom404.
     * Whether the Page has a custom 404 page.
     * @param custom404 Value for boolean
     */
    @JsonSetter("custom_404")
    public void setCustom404(boolean custom404) {
        this.custom404 = custom404;
    }

    /**
     * Getter for HtmlUrl.
     * The web address the Page can be accessed from.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * The web address the Page can be accessed from.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for BuildType.
     * @return Returns the Object
     */
    @JsonGetter("build_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getBuildType() {
        return buildType;
    }

    /**
     * Setter for BuildType.
     * @param buildType Value for Object
     */
    @JsonSetter("build_type")
    public void setBuildType(Object buildType) {
        this.buildType = buildType;
    }

    /**
     * Getter for Source.
     * @return Returns the PagesSourceHash
     */
    @JsonGetter("source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagesSourceHash getSource() {
        return source;
    }

    /**
     * Setter for Source.
     * @param source Value for PagesSourceHash
     */
    @JsonSetter("source")
    public void setSource(PagesSourceHash source) {
        this.source = source;
    }

    /**
     * Getter for Public.
     * Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible
     * to anyone on the internet. If set to `false`, the site will only be accessible to users who
     * have at least `read` access to the repository that published the site.
     * @return Returns the boolean
     */
    @JsonGetter("public")
    public boolean getPublic() {
        return mPublic;
    }

    /**
     * Setter for Public.
     * Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible
     * to anyone on the internet. If set to `false`, the site will only be accessible to users who
     * have at least `read` access to the repository that published the site.
     * @param mPublic Value for boolean
     */
    @JsonSetter("public")
    public void setPublic(boolean mPublic) {
        this.mPublic = mPublic;
    }

    /**
     * Getter for HttpsCertificate.
     * @return Returns the PagesHttpsCertificate
     */
    @JsonGetter("https_certificate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PagesHttpsCertificate getHttpsCertificate() {
        return httpsCertificate;
    }

    /**
     * Setter for HttpsCertificate.
     * @param httpsCertificate Value for PagesHttpsCertificate
     */
    @JsonSetter("https_certificate")
    public void setHttpsCertificate(PagesHttpsCertificate httpsCertificate) {
        this.httpsCertificate = httpsCertificate;
    }

    /**
     * Getter for HttpsEnforced.
     * Whether https is enabled on the domain
     * @return Returns the Boolean
     */
    @JsonGetter("https_enforced")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHttpsEnforced() {
        return httpsEnforced;
    }

    /**
     * Setter for HttpsEnforced.
     * Whether https is enabled on the domain
     * @param httpsEnforced Value for Boolean
     */
    @JsonSetter("https_enforced")
    public void setHttpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
    }

    /**
     * Converts this GitHubPages into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GitHubPages [" + "url=" + url + ", status=" + status + ", cname=" + cname
                + ", custom404=" + custom404 + ", mPublic=" + mPublic + ", protectedDomainState="
                + protectedDomainState + ", pendingDomainUnverifiedAt=" + pendingDomainUnverifiedAt
                + ", htmlUrl=" + htmlUrl + ", buildType=" + buildType + ", source=" + source
                + ", httpsCertificate=" + httpsCertificate + ", httpsEnforced=" + httpsEnforced
                + "]";
    }

    /**
     * Builds a new {@link GitHubPages.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GitHubPages.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, status, cname, custom404, mPublic)
                .protectedDomainState(getProtectedDomainState())
                .htmlUrl(getHtmlUrl())
                .buildType(getBuildType())
                .source(getSource())
                .httpsCertificate(getHttpsCertificate())
                .httpsEnforced(getHttpsEnforced());
        builder.pendingDomainUnverifiedAt = internalGetPendingDomainUnverifiedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link GitHubPages}.
     */
    public static class Builder {
        private String url;
        private Object status;
        private String cname;
        private boolean custom404;
        private boolean mPublic;
        private Object protectedDomainState;
        private OptionalNullable<LocalDateTime> pendingDomainUnverifiedAt;
        private String htmlUrl;
        private Object buildType;
        private PagesSourceHash source;
        private PagesHttpsCertificate httpsCertificate;
        private Boolean httpsEnforced;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  status  Object value for status.
         * @param  cname  String value for cname.
         * @param  custom404  boolean value for custom404.
         * @param  mPublic  boolean value for mPublic.
         */
        public Builder(String url, Object status, String cname, boolean custom404,
                boolean mPublic) {
            this.url = url;
            this.status = status;
            this.cname = cname;
            this.custom404 = custom404;
            this.mPublic = mPublic;
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
         * Setter for status.
         * @param  status  Object value for status.
         * @return Builder
         */
        public Builder status(Object status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for cname.
         * @param  cname  String value for cname.
         * @return Builder
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * Setter for custom404.
         * @param  custom404  boolean value for custom404.
         * @return Builder
         */
        public Builder custom404(boolean custom404) {
            this.custom404 = custom404;
            return this;
        }

        /**
         * Setter for mPublic.
         * @param  mPublic  boolean value for mPublic.
         * @return Builder
         */
        public Builder mPublic(boolean mPublic) {
            this.mPublic = mPublic;
            return this;
        }

        /**
         * Setter for protectedDomainState.
         * @param  protectedDomainState  Object value for protectedDomainState.
         * @return Builder
         */
        public Builder protectedDomainState(Object protectedDomainState) {
            this.protectedDomainState = protectedDomainState;
            return this;
        }

        /**
         * Setter for pendingDomainUnverifiedAt.
         * @param  pendingDomainUnverifiedAt  LocalDateTime value for pendingDomainUnverifiedAt.
         * @return Builder
         */
        public Builder pendingDomainUnverifiedAt(LocalDateTime pendingDomainUnverifiedAt) {
            this.pendingDomainUnverifiedAt = OptionalNullable.of(pendingDomainUnverifiedAt);
            return this;
        }

        /**
         * UnSetter for pendingDomainUnverifiedAt.
         * @return Builder
         */
        public Builder unsetPendingDomainUnverifiedAt() {
            pendingDomainUnverifiedAt = null;
            return this;
        }

        /**
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * Setter for buildType.
         * @param  buildType  Object value for buildType.
         * @return Builder
         */
        public Builder buildType(Object buildType) {
            this.buildType = buildType;
            return this;
        }

        /**
         * Setter for source.
         * @param  source  PagesSourceHash value for source.
         * @return Builder
         */
        public Builder source(PagesSourceHash source) {
            this.source = source;
            return this;
        }

        /**
         * Setter for httpsCertificate.
         * @param  httpsCertificate  PagesHttpsCertificate value for httpsCertificate.
         * @return Builder
         */
        public Builder httpsCertificate(PagesHttpsCertificate httpsCertificate) {
            this.httpsCertificate = httpsCertificate;
            return this;
        }

        /**
         * Setter for httpsEnforced.
         * @param  httpsEnforced  Boolean value for httpsEnforced.
         * @return Builder
         */
        public Builder httpsEnforced(Boolean httpsEnforced) {
            this.httpsEnforced = httpsEnforced;
            return this;
        }

        /**
         * Builds a new {@link GitHubPages} object using the set fields.
         * @return {@link GitHubPages}
         */
        public GitHubPages build() {
            return new GitHubPages(url, status, cname, custom404, mPublic, protectedDomainState,
                    pendingDomainUnverifiedAt, htmlUrl, buildType, source, httpsCertificate,
                    httpsEnforced);
        }
    }
}
