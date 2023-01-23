
# Repos Branches Branch Protection Request

## Structure

`ReposBranchesBranchProtectionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequiredStatusChecks` | `Object` | Required | - | Object getRequiredStatusChecks() | setRequiredStatusChecks(Object requiredStatusChecks) |
| `EnforceAdmins` | `Boolean` | Required | Enforce all configured restrictions for administrators. Set to `true` to enforce required status checks for repository administrators. Set to `null` to disable. | Boolean getEnforceAdmins() | setEnforceAdmins(Boolean enforceAdmins) |
| `RequiredPullRequestReviews` | `Object` | Required | - | Object getRequiredPullRequestReviews() | setRequiredPullRequestReviews(Object requiredPullRequestReviews) |
| `Restrictions` | `Object` | Required | - | Object getRestrictions() | setRestrictions(Object restrictions) |
| `RequiredLinearHistory` | `Boolean` | Optional | Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear commit Git history. Your repository must allow squash merging or rebase merging before you can enable a linear commit history. Default: `false`. For more information, see "[Requiring a linear commit history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)" in the GitHub Help documentation. | Boolean getRequiredLinearHistory() | setRequiredLinearHistory(Boolean requiredLinearHistory) |
| `AllowForcePushes` | `Boolean` | Optional | Permits force pushes to the protected branch by anyone with write access to the repository. Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation." | Boolean getAllowForcePushes() | setAllowForcePushes(Boolean allowForcePushes) |
| `AllowDeletions` | `Boolean` | Optional | Allows deletion of the protected branch by anyone with write access to the repository. Set to `false` to prevent deletion of the protected branch. Default: `false`. For more information, see "[Enabling force pushes to a protected branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)" in the GitHub Help documentation. | Boolean getAllowDeletions() | setAllowDeletions(Boolean allowDeletions) |
| `BlockCreations` | `Boolean` | Optional | If set to `true`, the `restrictions` branch protection settings which limits who can push will also block pushes which create new branches, unless the push is initiated by a user, team, or app which has the ability to push. Set to `true` to restrict new branch creation. Default: `false`. | Boolean getBlockCreations() | setBlockCreations(Boolean blockCreations) |
| `RequiredConversationResolution` | `Boolean` | Optional | Requires all conversations on code to be resolved before a pull request can be merged into a branch that matches this rule. Set to `false` to disable. Default: `false`. | Boolean getRequiredConversationResolution() | setRequiredConversationResolution(Boolean requiredConversationResolution) |
| `LockBranch` | `Boolean` | Optional | Whether to set the branch as read-only. If this is true, users will not be able to push to the branch. Default: `false`.<br>**Default**: `false` | Boolean getLockBranch() | setLockBranch(Boolean lockBranch) |
| `AllowForkSyncing` | `Boolean` | Optional | Whether users can pull changes from upstream when the branch is locked. Set to `true` to allow fork syncing. Set to `false` to prevent fork syncing. Default: `false`.<br>**Default**: `false` | Boolean getAllowForkSyncing() | setAllowForkSyncing(Boolean allowForkSyncing) |

## Example (as JSON)

```json
{
  "required_status_checks": {
    "key1": "val1",
    "key2": "val2"
  },
  "enforce_admins": false,
  "required_pull_request_reviews": {
    "key1": "val1",
    "key2": "val2"
  },
  "restrictions": {
    "key1": "val1",
    "key2": "val2"
  },
  "required_linear_history": null,
  "allow_force_pushes": null,
  "allow_deletions": null,
  "block_creations": null,
  "required_conversation_resolution": null,
  "lock_branch": null,
  "allow_fork_syncing": null
}
```

