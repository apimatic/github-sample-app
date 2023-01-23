
# Protected Branch

Branch protections protect branches

## Structure

`ProtectedBranch`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `RequiredStatusChecks` | [`RequiredStatusChecks12`](../../doc/models/required-status-checks-12.md) | Optional | - | RequiredStatusChecks12 getRequiredStatusChecks() | setRequiredStatusChecks(RequiredStatusChecks12 requiredStatusChecks) |
| `RequiredPullRequestReviews` | [`RequiredPullRequestReviews`](../../doc/models/required-pull-request-reviews.md) | Optional | - | RequiredPullRequestReviews getRequiredPullRequestReviews() | setRequiredPullRequestReviews(RequiredPullRequestReviews requiredPullRequestReviews) |
| `RequiredSignatures` | [`EnforceAdmins`](../../doc/models/enforce-admins.md) | Optional | - | EnforceAdmins getRequiredSignatures() | setRequiredSignatures(EnforceAdmins requiredSignatures) |
| `EnforceAdmins` | [`EnforceAdmins`](../../doc/models/enforce-admins.md) | Optional | - | EnforceAdmins getEnforceAdmins() | setEnforceAdmins(EnforceAdmins enforceAdmins) |
| `RequiredLinearHistory` | [`AllowDeletions1`](../../doc/models/allow-deletions-1.md) | Optional | - | AllowDeletions1 getRequiredLinearHistory() | setRequiredLinearHistory(AllowDeletions1 requiredLinearHistory) |
| `AllowForcePushes` | [`AllowDeletions1`](../../doc/models/allow-deletions-1.md) | Optional | - | AllowDeletions1 getAllowForcePushes() | setAllowForcePushes(AllowDeletions1 allowForcePushes) |
| `AllowDeletions` | [`AllowDeletions1`](../../doc/models/allow-deletions-1.md) | Optional | - | AllowDeletions1 getAllowDeletions() | setAllowDeletions(AllowDeletions1 allowDeletions) |
| `Restrictions` | [`Restrictions1`](../../doc/models/restrictions-1.md) | Optional | - | Restrictions1 getRestrictions() | setRestrictions(Restrictions1 restrictions) |
| `RequiredConversationResolution` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getRequiredConversationResolution() | setRequiredConversationResolution(AllowDeletions requiredConversationResolution) |
| `BlockCreations` | [`AllowDeletions1`](../../doc/models/allow-deletions-1.md) | Optional | - | AllowDeletions1 getBlockCreations() | setBlockCreations(AllowDeletions1 blockCreations) |
| `LockBranch` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getLockBranch() | setLockBranch(AllowDeletions lockBranch) |
| `AllowForkSyncing` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getAllowForkSyncing() | setAllowForkSyncing(AllowDeletions allowForkSyncing) |

## Example (as JSON)

```json
{
  "url": "url4",
  "required_status_checks": null,
  "required_pull_request_reviews": null,
  "required_signatures": null,
  "enforce_admins": null,
  "required_linear_history": null,
  "allow_force_pushes": null,
  "allow_deletions": null,
  "restrictions": null,
  "required_conversation_resolution": null,
  "block_creations": null,
  "lock_branch": null,
  "allow_fork_syncing": null
}
```

