
# Repos Branches Branch Protection Required Pull Request Reviews Response

## Structure

`ReposBranchesBranchProtectionRequiredPullRequestReviewsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `DismissalRestrictions` | [`DismissalRestrictions`](../../doc/models/dismissal-restrictions.md) | Optional | - | DismissalRestrictions getDismissalRestrictions() | setDismissalRestrictions(DismissalRestrictions dismissalRestrictions) |
| `BypassPullRequestAllowances` | [`BypassPullRequestAllowances5`](../../doc/models/bypass-pull-request-allowances-5.md) | Optional | - | BypassPullRequestAllowances5 getBypassPullRequestAllowances() | setBypassPullRequestAllowances(BypassPullRequestAllowances5 bypassPullRequestAllowances) |
| `DismissStaleReviews` | `boolean` | Required | - | boolean getDismissStaleReviews() | setDismissStaleReviews(boolean dismissStaleReviews) |
| `RequireCodeOwnerReviews` | `boolean` | Required | - | boolean getRequireCodeOwnerReviews() | setRequireCodeOwnerReviews(boolean requireCodeOwnerReviews) |
| `RequiredApprovingReviewCount` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 6` | Integer getRequiredApprovingReviewCount() | setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) |
| `RequireLastPushApproval` | `Boolean` | Optional | Whether the most recent push must be approved by someone other than the person who pushed it.<br>**Default**: `false` | Boolean getRequireLastPushApproval() | setRequireLastPushApproval(Boolean requireLastPushApproval) |

## Example (as JSON)

```json
{
  "dismiss_stale_reviews": true,
  "require_code_owner_reviews": true
}
```

