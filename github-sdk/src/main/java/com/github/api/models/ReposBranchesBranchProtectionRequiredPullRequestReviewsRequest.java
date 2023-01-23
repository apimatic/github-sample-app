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
 * This is a model class for ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest type.
 */
public class ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest {
    private DismissalRestrictions3 dismissalRestrictions;
    private Boolean dismissStaleReviews;
    private Boolean requireCodeOwnerReviews;
    private Integer requiredApprovingReviewCount;
    private Boolean requireLastPushApproval;
    private BypassPullRequestAllowances3 bypassPullRequestAllowances;

    /**
     * Default constructor.
     */
    public ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest() {
        requireLastPushApproval = false;
    }

    /**
     * Initialization constructor.
     * @param  dismissalRestrictions  DismissalRestrictions3 value for dismissalRestrictions.
     * @param  dismissStaleReviews  Boolean value for dismissStaleReviews.
     * @param  requireCodeOwnerReviews  Boolean value for requireCodeOwnerReviews.
     * @param  requiredApprovingReviewCount  Integer value for requiredApprovingReviewCount.
     * @param  requireLastPushApproval  Boolean value for requireLastPushApproval.
     * @param  bypassPullRequestAllowances  BypassPullRequestAllowances3 value for
     *         bypassPullRequestAllowances.
     */
    public ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest(
            DismissalRestrictions3 dismissalRestrictions,
            Boolean dismissStaleReviews,
            Boolean requireCodeOwnerReviews,
            Integer requiredApprovingReviewCount,
            Boolean requireLastPushApproval,
            BypassPullRequestAllowances3 bypassPullRequestAllowances) {
        this.dismissalRestrictions = dismissalRestrictions;
        this.dismissStaleReviews = dismissStaleReviews;
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requireLastPushApproval = requireLastPushApproval;
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    /**
     * Getter for DismissalRestrictions.
     * @return Returns the DismissalRestrictions3
     */
    @JsonGetter("dismissal_restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DismissalRestrictions3 getDismissalRestrictions() {
        return dismissalRestrictions;
    }

    /**
     * Setter for DismissalRestrictions.
     * @param dismissalRestrictions Value for DismissalRestrictions3
     */
    @JsonSetter("dismissal_restrictions")
    public void setDismissalRestrictions(DismissalRestrictions3 dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    /**
     * Getter for DismissStaleReviews.
     * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a
     * new commit.
     * @return Returns the Boolean
     */
    @JsonGetter("dismiss_stale_reviews")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDismissStaleReviews() {
        return dismissStaleReviews;
    }

    /**
     * Setter for DismissStaleReviews.
     * Set to `true` if you want to automatically dismiss approving reviews when someone pushes a
     * new commit.
     * @param dismissStaleReviews Value for Boolean
     */
    @JsonSetter("dismiss_stale_reviews")
    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    /**
     * Getter for RequireCodeOwnerReviews.
     * Blocks merging pull requests until [code
     * owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
     * @return Returns the Boolean
     */
    @JsonGetter("require_code_owner_reviews")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireCodeOwnerReviews() {
        return requireCodeOwnerReviews;
    }

    /**
     * Setter for RequireCodeOwnerReviews.
     * Blocks merging pull requests until [code
     * owners](https://docs.github.com/articles/about-code-owners/) have reviewed.
     * @param requireCodeOwnerReviews Value for Boolean
     */
    @JsonSetter("require_code_owner_reviews")
    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    /**
     * Getter for RequiredApprovingReviewCount.
     * Specifies the number of reviewers required to approve pull requests. Use a number between 1
     * and 6 or 0 to not require reviewers.
     * @return Returns the Integer
     */
    @JsonGetter("required_approving_review_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    /**
     * Setter for RequiredApprovingReviewCount.
     * Specifies the number of reviewers required to approve pull requests. Use a number between 1
     * and 6 or 0 to not require reviewers.
     * @param requiredApprovingReviewCount Value for Integer
     */
    @JsonSetter("required_approving_review_count")
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    /**
     * Getter for RequireLastPushApproval.
     * Whether the most recent push must be approved by someone other than the person who pushed it.
     * Default: `false`
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
     * Default: `false`
     * @param requireLastPushApproval Value for Boolean
     */
    @JsonSetter("require_last_push_approval")
    public void setRequireLastPushApproval(Boolean requireLastPushApproval) {
        this.requireLastPushApproval = requireLastPushApproval;
    }

    /**
     * Getter for BypassPullRequestAllowances.
     * @return Returns the BypassPullRequestAllowances3
     */
    @JsonGetter("bypass_pull_request_allowances")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BypassPullRequestAllowances3 getBypassPullRequestAllowances() {
        return bypassPullRequestAllowances;
    }

    /**
     * Setter for BypassPullRequestAllowances.
     * @param bypassPullRequestAllowances Value for BypassPullRequestAllowances3
     */
    @JsonSetter("bypass_pull_request_allowances")
    public void setBypassPullRequestAllowances(BypassPullRequestAllowances3 bypassPullRequestAllowances) {
        this.bypassPullRequestAllowances = bypassPullRequestAllowances;
    }

    /**
     * Converts this ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest ["
                + "dismissalRestrictions=" + dismissalRestrictions + ", dismissStaleReviews="
                + dismissStaleReviews + ", requireCodeOwnerReviews=" + requireCodeOwnerReviews
                + ", requiredApprovingReviewCount=" + requiredApprovingReviewCount
                + ", requireLastPushApproval=" + requireLastPushApproval
                + ", bypassPullRequestAllowances=" + bypassPullRequestAllowances + "]";
    }

    /**
     * Builds a new {@link ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dismissalRestrictions(getDismissalRestrictions())
                .dismissStaleReviews(getDismissStaleReviews())
                .requireCodeOwnerReviews(getRequireCodeOwnerReviews())
                .requiredApprovingReviewCount(getRequiredApprovingReviewCount())
                .requireLastPushApproval(getRequireLastPushApproval())
                .bypassPullRequestAllowances(getBypassPullRequestAllowances());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest}.
     */
    public static class Builder {
        private DismissalRestrictions3 dismissalRestrictions;
        private Boolean dismissStaleReviews;
        private Boolean requireCodeOwnerReviews;
        private Integer requiredApprovingReviewCount;
        private Boolean requireLastPushApproval = false;
        private BypassPullRequestAllowances3 bypassPullRequestAllowances;



        /**
         * Setter for dismissalRestrictions.
         * @param  dismissalRestrictions  DismissalRestrictions3 value for dismissalRestrictions.
         * @return Builder
         */
        public Builder dismissalRestrictions(DismissalRestrictions3 dismissalRestrictions) {
            this.dismissalRestrictions = dismissalRestrictions;
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
         * Setter for bypassPullRequestAllowances.
         * @param  bypassPullRequestAllowances  BypassPullRequestAllowances3 value for
         *         bypassPullRequestAllowances.
         * @return Builder
         */
        public Builder bypassPullRequestAllowances(
                BypassPullRequestAllowances3 bypassPullRequestAllowances) {
            this.bypassPullRequestAllowances = bypassPullRequestAllowances;
            return this;
        }

        /**
         * Builds a new {@link ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest}
         * object using the set fields.
         * @return {@link ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest}
         */
        public ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest build() {
            return new ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest(
                    dismissalRestrictions, dismissStaleReviews, requireCodeOwnerReviews,
                    requiredApprovingReviewCount, requireLastPushApproval,
                    bypassPullRequestAllowances);
        }
    }
}