
# Repos Branches Branch Protection Response

## Structure

`ReposBranchesBranchProtectionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `Enabled` | `Boolean` | Optional | - | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `RequiredStatusChecks` | [`RequiredStatusChecks4`](../../doc/models/required-status-checks-4.md) | Optional | - | RequiredStatusChecks4 getRequiredStatusChecks() | setRequiredStatusChecks(RequiredStatusChecks4 requiredStatusChecks) |
| `EnforceAdmins` | [`EnforceAdmins`](../../doc/models/enforce-admins.md) | Optional | - | EnforceAdmins getEnforceAdmins() | setEnforceAdmins(EnforceAdmins enforceAdmins) |
| `RequiredPullRequestReviews` | [`RequiredPullRequestReviews3`](../../doc/models/required-pull-request-reviews-3.md) | Optional | - | RequiredPullRequestReviews3 getRequiredPullRequestReviews() | setRequiredPullRequestReviews(RequiredPullRequestReviews3 requiredPullRequestReviews) |
| `Restrictions` | [`Restrictions1`](../../doc/models/restrictions-1.md) | Optional | - | Restrictions1 getRestrictions() | setRestrictions(Restrictions1 restrictions) |
| `RequiredLinearHistory` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getRequiredLinearHistory() | setRequiredLinearHistory(AllowDeletions requiredLinearHistory) |
| `AllowForcePushes` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getAllowForcePushes() | setAllowForcePushes(AllowDeletions allowForcePushes) |
| `AllowDeletions` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getAllowDeletions() | setAllowDeletions(AllowDeletions allowDeletions) |
| `BlockCreations` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getBlockCreations() | setBlockCreations(AllowDeletions blockCreations) |
| `RequiredConversationResolution` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getRequiredConversationResolution() | setRequiredConversationResolution(AllowDeletions requiredConversationResolution) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `ProtectionUrl` | `String` | Optional | - | String getProtectionUrl() | setProtectionUrl(String protectionUrl) |
| `RequiredSignatures` | [`EnforceAdmins`](../../doc/models/enforce-admins.md) | Optional | - | EnforceAdmins getRequiredSignatures() | setRequiredSignatures(EnforceAdmins requiredSignatures) |
| `LockBranch` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getLockBranch() | setLockBranch(AllowDeletions lockBranch) |
| `AllowForkSyncing` | [`AllowDeletions`](../../doc/models/allow-deletions.md) | Optional | - | AllowDeletions getAllowForkSyncing() | setAllowForkSyncing(AllowDeletions allowForkSyncing) |

## Example (as JSON)

```json
{
  "url": null,
  "enabled": null,
  "required_status_checks": null,
  "enforce_admins": null,
  "required_pull_request_reviews": null,
  "restrictions": null,
  "required_linear_history": null,
  "allow_force_pushes": null,
  "allow_deletions": null,
  "block_creations": null,
  "required_conversation_resolution": null,
  "name": null,
  "protection_url": null,
  "required_signatures": null,
  "lock_branch": null,
  "allow_fork_syncing": null
}
```

