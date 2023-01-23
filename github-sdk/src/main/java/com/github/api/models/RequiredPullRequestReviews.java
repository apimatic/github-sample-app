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
 * This is a model class for RequiredPullRequestReviews type.
 */
public class RequiredPullRequestReviews {
    private String url;
    private Boolean dismissStaleReviews;
    private Boolean requireCodeOwnerReviews;
    private Integer requiredApprovingReviewCount;
    private Boolean requireLastPushApproval;
    private DismissalRestrictions1 dismissalRestrictions;
    private BypassPullRequestAllowances1 bypassPullRequestAllowances;

    /**
     * Default constructor.
     */
    public RequiredPullRequestReviews() {
        requireLastPushApproval = false;
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  dismissStaleReviews  Boolean value for dismissStaleReviews.
     * @param  requireCodeOwnerReviews  Boolean value for requireCodeOwnerReviews.
     * @param  requiredApprovingReviewCount  Integer value for requiredApprovingReviewCount.
     * @param  requireLastPushApproval  Boolean value for requireLastPushApproval.
     * @param  dismissalRestrictions  DismissalRestrictions1 value for dismissalRestrictions.
     * @param  bypassPullRequestAllowances  BypassPullRequestAllowances1 value for
     *         bypassPullRequestAllowances.
     */
    public RequiredPullRequestReviews(
            String url,
            Boolean dismissStaleReviews,
            Boolean requireCodeOwnerReviews,
            Integer requiredApprovingReviewCount,
            Boolean requireLastPushApproval,
            DismissalRestrictions1 dismissalRestrictions,
            BypassPullRequestAllowances1 bypassPullRequestAllowances) {
        this.url = url;
        this.dismissStaleReviews = dismissStaleReviews;
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requireLastPushApproval = requireLastPushApproval;
        this.dismissalRestrictions = dismissalRestrictions;
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
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
     * Getter for DismissStaleReviews.
     * @return Returns the Boolean
     */
    @JsonGetter("dismiss_stale_reviews")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    /**
     * Setter for DismissStaleReviews.
     * @param dismissStaleReviews Value for Boolean
     */
    @JsonSetter("dismiss_stale_reviews")
    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    /**
     * Getter for RequireCodeOwnerReviews.
     * @return Returns the Boolean
     */
    @JsonGetter("require_code_owner_reviews")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    /**
     * Setter for RequireCodeOwnerReviews.
     * @param requireCodeOwnerReviews Value for Boolean
     */
    @JsonSetter("require_code_owner_reviews")
    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
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
     * Getter for RequireLastPushApproval.
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     * @return Returns the Boolean
     */
    @JsonGetter("require_last_push_approval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireLastPushApproval() {
        return requireLastPushApproval;
    }

    /**
     * Setter for RequireLastPushApproval.
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     * @param requireLastPushApproval Value for Boolean
     */
    @JsonSetter("require_last_push_approval")
    public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    /**
     * Getter for DismissalRestrictions.
     * @return Returns the DismissalRestrictions1
     */
    @JsonGetter("dismissal_restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DismissalRestrictions1 getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    /**
     * Setter for DismissalRestrictions.
     * @param dismissalRestrictions Value for DismissalRestrictions1
     */
    @JsonSetter("dismissal_restrictions")
    public void setDismissalRestrictions(DismissalRestrictions1 dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    /**
     * Getter for BypassPullRequestAllowances.
     * @return Returns the BypassPullRequestAllowances1
     */
    @JsonGetter("bypass_pull_request_allowances")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BypassPullRequestAllowances1 getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    /**
     * Setter for BypassPullRequestAllowances.
     * @param bypassPullRequestAllowances Value for BypassPullRequestAllowances1
     */
    @JsonSetter("bypass_pull_request_allowances")
    public void setBypassPullRequestAllowances(BypassPullRequestAllowances1 bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    /**
     * Converts this RequiredPullRequestReviews into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RequiredPullRequestReviews [" + "url=" + url + ", dismissStaleReviews="
                + dismissStaleReviews + ", requireCodeOwnerReviews=" + requireCodeOwnerReviews
                + ", requiredApprovingReviewCount=" + requiredApprovingReviewCount
                + ", requireLastPushApproval=" + requireLastPushApproval
                + ", dismissalRestrictions=" + dismissalRestrictions
                + ", bypassPullRequestAllowances=" + bypassPullRequestAllowances + "]";
    }

    /**
     * Builds a new {@link RequiredPullRequestReviews.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RequiredPullRequestReviews.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url)
                .dismissStaleReviews(getDismissStaleReviews())
                .requireCodeOwnerReviews(getRequireCodeOwnerReviews())
                .requiredApprovingReviewCount(getRequiredApprovingReviewCount())
                .requireLastPushApproval(getRequireLastPushApproval())
                .dismissalRestrictions(getDismissalRestrictions())
                .bypassPullRequestAllowances(getBypassPullRequestAllowances());
        return builder;
    }

    /**
     * Class to build instances of {@link RequiredPullRequestReviews}.
     */
    public static class Builder {
        private String url;
        private Boolean dismissStaleReviews;
        private Boolean requireCodeOwnerReviews;
        private Integer requiredApprovingReviewCount;
        private Boolean requireLastPushApproval = false;
        private DismissalRestrictions1 dismissalRestrictions;
        private BypassPullRequestAllowances1 bypassPullRequestAllowances;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         */
        public Builder(String url) {
            this.url = url;
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
         * Setter for dismissStaleReviews.
         * @param  dismissStaleReviews  Boolean value for dismissStaleReviews.
         * @return Builder
         */
        public Builder dismissStaleReviews(Boolean dismissStaleReviews) {
            this.dismissStaleReviews = dismissStaleReviews;
            return this;
        }

        /**
         * Setter for requireCodeOwnerReviews.
         * @param  requireCodeOwnerReviews  Boolean value for requireCodeOwnerReviews.
         * @return Builder
         */
        public Builder requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
            this.requireCodeOwnerReviews = requireCodeOwnerReviews;
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
         * Setter for requireLastPushApproval.
         * @param  requireLastPushApproval  Boolean value for requireLastPushApproval.
         * @return Builder
         */
        public Builder requireLastPushApproval(Boolean requireLastPushApproval) {
            this.requireLastPushApproval = requireLastPushApproval;
            return this;
        }

        /**
         * Setter for dismissalRestrictions.
         * @param  dismissalRestrictions  DismissalRestrictions1 value for dismissalRestrictions.
         * @return Builder
         */
        public Builder dismissalRestrictions(DismissalRestrictions1 dismissalRestrictions) {
            this.dismissalRestrictions = dismissalRestrictions;
            return this;
        }

        /**
         * Setter for bypassPullRequestAllowances.
         * @param  bypassPullRequestAllowances  BypassPullRequestAllowances1 value for
         *         bypassPullRequestAllowances.
         * @return Builder
         */
        public Builder bypassPullRequestAllowances(
                BypassPullRequestAllowances1 bypassPullRequestAllowances) {
            this.bypassPullRequestAllowances = bypassPullRequestAllowances;
            return this;
        }

        /**
         * Builds a new {@link RequiredPullRequestReviews} object using the set fields.
         * @return {@link RequiredPullRequestReviews}
         */
        public RequiredPullRequestReviews build() {
            return new RequiredPullRequestReviews(url, dismissStaleReviews, requireCodeOwnerReviews,
                    requiredApprovingReviewCount, requireLastPushApproval, dismissalRestrictions,
                    bypassPullRequestAllowances);
        }
    }
}