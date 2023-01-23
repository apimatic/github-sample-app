
# Repos Branches Branch Protection Required Pull Request Reviews Request

## Structure

`ReposBranchesBranchProtectionRequiredPullRequestReviewsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DismissalRestrictions` | [`DismissalRestrictions3`](../../doc/models/dismissal-restrictions-3.md) | Optional | - | DismissalRestrictions3 getDismissalRestrictions() | setDismissalRestrictions(DismissalRestrictions3 dismissalRestrictions) |
| `DismissStaleReviews` | `Boolean` | Optional | Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit. | Boolean getDismissStaleReviews() | setDismissStaleReviews(Boolean dismissStaleReviews) |
| `RequireCodeOwnerReviews` | `Boolean` | Optional | Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) have reviewed. | Boolean getRequireCodeOwnerReviews() | setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) |
| `RequiredApprovingReviewCount` | `Integer` | Optional | Specifies the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers. | Integer getRequiredApprovingReviewCount() | setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) |
| `RequireLastPushApproval` | `Boolean` | Optional | Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`<br>**Default**: `false` | Boolean getRequireLastPushApproval() | setRequireLastPushApproval(Boolean requireLastPushApproval) |
| `BypassPullRequestAllowances` | [`BypassPullRequestAllowances3`](../../doc/models/bypass-pull-request-allowances-3.md) | Optional | - | BypassPullRequestAllowances3 getBypassPullRequestAllowances() | setBypassPullRequestAllowances(BypassPullRequestAllowances3 bypassPullRequestAllowances) |

## Example (as JSON)

```json
{
  "dismissal_restrictions": null,
  "dismiss_stale_reviews": null,
  "require_code_owner_reviews": null,
  "required_approving_review_count": null,
  "require_last_push_approval": null,
  "bypass_pull_request_allowances": null
}
```

