
# Required Pull Request Reviews

## Structure

`RequiredPullRequestReviews`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `DismissStaleReviews` | `Boolean` | Optional | - | Boolean getDismissStaleReviews() | setDismissStaleReviews(Boolean dismissStaleReviews) |
| `RequireCodeOwnerReviews` | `Boolean` | Optional | - | Boolean getRequireCodeOwnerReviews() | setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) |
| `RequiredApprovingReviewCount` | `Integer` | Optional | - | Integer getRequiredApprovingReviewCount() | setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) |
| `RequireLastPushApproval` | `Boolean` | Optional | Whether the most recent push must be approved by someone other than the person who pushed it.<br>**Default**: `false` | Boolean getRequireLastPushApproval() | setRequireLastPushApproval(Boolean requireLastPushApproval) |
| `DismissalRestrictions` | [`DismissalRestrictions1`](../../doc/models/dismissal-restrictions-1.md) | Optional | - | DismissalRestrictions1 getDismissalRestrictions() | setDismissalRestrictions(DismissalRestrictions1 dismissalRestrictions) |
| `BypassPullRequestAllowances` | [`BypassPullRequestAllowances1`](../../doc/models/bypass-pull-request-allowances-1.md) | Optional | - | BypassPullRequestAllowances1 getBypassPullRequestAllowances() | setBypassPullRequestAllowances(BypassPullRequestAllowances1 bypassPullRequestAllowances) |

## Example (as JSON)

```json
{
  "url": "url4",
  "dismiss_stale_reviews": null,
  "require_code_owner_reviews": null,
  "required_approving_review_count": null,
  "require_last_push_approval": null,
  "dismissal_restrictions": null,
  "bypass_pull_request_allowances": null
}
```

