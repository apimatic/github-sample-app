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
 * This is a model class for BranchWithProtection type.
 */
public class BranchWithProtection {
    private String name;
    private Commit32 commit;
    private Links1 links;
    private boolean mProtected;
    private Protection protection;
    private String protectionUrl;
    private String pattern;
    private Integer requiredApprovingReviewCount;

    /**
     * Default constructor.
     */
    public BranchWithProtection() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  commit  Commit32 value for commit.
     * @param  links  Links1 value for links.
     * @param  mProtected  boolean value for mProtected.
     * @param  protection  Protection value for protection.
     * @param  protectionUrl  String value for protectionUrl.
     * @param  pattern  String value for pattern.
     * @param  requiredApprovingReviewCount  Integer value for requiredApprovingReviewCount.
     */
    public BranchWithProtection(
            String name,
            Commit32 commit,
            Links1 links,
            boolean mProtected,
            Protection protection,
            String protectionUrl,
            String pattern,
            Integer requiredApprovingReviewCount) {
        this.name = name;
        this.commit = commit;
        this.links = links;
        this.mProtected = mProtected;
        this.protection = protection;
        this.protectionUrl = protectionUrl;
        this.pattern = pattern;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
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
     * Getter for Commit.
     * @return Returns the Commit32
     */
    @JsonGetter("commit")
    public Commit32 getCommit() {
        return commit;
    }

    /**
     * Setter for Commit.
     * @param commit Value for Commit32
     */
    @JsonSetter("commit")
    public void setCommit(Commit32 commit) {
        this.commit = commit;
    }

    /**
     * Getter for Links.
     * @return Returns the Links1
     */
    @JsonGetter("_links")
    public Links1 getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for Links1
     */
    @JsonSetter("_links")
    public void setLinks(Links1 links) {
        this.links = links;
    }

    /**
     * Getter for Protected.
     * @return Returns the boolean
     */
    @JsonGetter("protected")
    public boolean getProtected() {
        return mProtected;
    }

    /**
     * Setter for Protected.
     * @param mProtected Value for boolean
     */
    @JsonSetter("protected")
    public void setProtected(boolean mProtected) {
        this.mProtected = mProtected;
    }

    /**
     * Getter for Protection.
     * @return Returns the Protection
     */
    @JsonGetter("protection")
    public Protection getProtection() {
        return protection;
    }

    /**
     * Setter for Protection.
     * @param protection Value for Protection
     */
    @JsonSetter("protection")
    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    /**
     * Getter for ProtectionUrl.
     * @return Returns the String
     */
    @JsonGetter("protection_url")
    public String getProtectionUrl() {
        return protectionUrl;
    }

    /**
     * Setter for ProtectionUrl.
     * @param protectionUrl Value for String
     */
    @JsonSetter("protection_url")
    public void setProtectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    /**
     * Getter for Pattern.
     * @return Returns the String
     */
    @JsonGetter("pattern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPattern() {
        return pattern;
    }

    /**
     * Setter for Pattern.
     * @param pattern Value for String
     */
    @JsonSetter("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * Getter for RequiredApprovingReviewCount.
     * @return Returns the Integer
     */
    @JsonGetter("required_approving_review_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    /**
     * Setter for RequiredApprovingReviewCount.
     * @param requiredApprovingReviewCount Value for Integer
     */
    @JsonSetter("required_approving_review_count")
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    /**
     * Converts this BranchWithProtection into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BranchWithProtection [" + "name=" + name + ", commit=" + commit + ", links=" + links
                + ", mProtected=" + mProtected + ", protection=" + protection + ", protectionUrl="
                + protectionUrl + ", pattern=" + pattern + ", requiredApprovingReviewCount="
                + requiredApprovingReviewCount + "]";
    }

    /**
     * Builds a new {@link BranchWithProtection.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BranchWithProtection.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, commit, links, mProtected, protection, protectionUrl)
                .pattern(getPattern())
                .requiredApprovingReviewCount(getRequiredApprovingReviewCount());
        return builder;
    }

    /**
     * Class to build instances of {@link BranchWithProtection}.
     */
    public static class Builder {
        private String name;
        private Commit32 commit;
        private Links1 links;
        private boolean mProtected;
        private Protection protection;
        private String protectionUrl;
        private String pattern;
        private Integer requiredApprovingReviewCount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  commit  Commit32 value for commit.
         * @param  links  Links1 value for links.
         * @param  mProtected  boolean value for mProtected.
         * @param  protection  Protection value for protection.
         * @param  protectionUrl  String value for protectionUrl.
         */
        public Builder(String name, Commit32 commit, Links1 links, boolean mProtected,
                Protection protection, String protectionUrl) {
            this.name = name;
            this.commit = commit;
            this.links = links;
            this.mProtected = mProtected;
            this.protection = protection;
            this.protectionUrl = protectionUrl;
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
         * Setter for commit.
         * @param  commit  Commit32 value for commit.
         * @return Builder
         */
        public Builder commit(Commit32 commit) {
            this.commit = commit;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  Links1 value for links.
         * @return Builder
         */
        public Builder links(Links1 links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for mProtected.
         * @param  mProtected  boolean value for mProtected.
         * @return Builder
         */
        public Builder mProtected(boolean mProtected) {
            this.mProtected = mProtected;
            return this;
        }

        /**
         * Setter for protection.
         * @param  protection  Protection value for protection.
         * @return Builder
         */
        public Builder protection(Protection protection) {
            this.protection = protection;
            return this;
        }

        /**
         * Setter for protectionUrl.
         * @param  protectionUrl  String value for protectionUrl.
         * @return Builder
         */
        public Builder protectionUrl(String protectionUrl) {
            this.protectionUrl = protectionUrl;
            return this;
        }

        /**
         * Setter for pattern.
         * @param  pattern  String value for pattern.
         * @return Builder
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Setter for requiredApprovingReviewCount.
         * @param  requiredApprovingReviewCount  Integer value for requiredApprovingReviewCount.
         * @return Builder
         */
        public Builder requiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
            this.requiredApprovingReviewCount = requiredApprovingReviewCount;
            return this;
        }

        /**
         * Builds a new {@link BranchWithProtection} object using the set fields.
         * @return {@link BranchWithProtection}
         */
        public BranchWithProtection build() {
            return new BranchWithProtection(name, commit, links, mProtected, protection,
                    protectionUrl, pattern, requiredApprovingReviewCount);
        }
    }
}
