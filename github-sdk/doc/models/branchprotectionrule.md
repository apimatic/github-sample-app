
# Branchprotectionrule

The branch protection rule. Includes a `name` and all the [branch protection settings](https://docs.github.com/github/administering-a-repository/defining-the-mergeability-of-pull-requests/about-protected-branches#about-branch-protection-settings) applied to branches that match the name. Binary settings are boolean. Multi-level configurations are one of `off`, `non_admins`, or `everyone`. Actor and build lists are arrays of strings.

## Structure

`Branchprotectionrule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdminEnforced` | `boolean` | Required | - | boolean getAdminEnforced() | setAdminEnforced(boolean adminEnforced) |
| `AllowDeletionsEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getAllowDeletionsEnforcementLevel() | setAllowDeletionsEnforcementLevel(AllowDeletionsEnforcementLevelEnum allowDeletionsEnforcementLevel) |
| `AllowForcePushesEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getAllowForcePushesEnforcementLevel() | setAllowForcePushesEnforcementLevel(AllowDeletionsEnforcementLevelEnum allowForcePushesEnforcementLevel) |
| `AuthorizedActorNames` | `List<String>` | Required | - | List<String> getAuthorizedActorNames() | setAuthorizedActorNames(List<String> authorizedActorNames) |
| `AuthorizedActorsOnly` | `boolean` | Required | - | boolean getAuthorizedActorsOnly() | setAuthorizedActorsOnly(boolean authorizedActorsOnly) |
| `AuthorizedDismissalActorsOnly` | `boolean` | Required | - | boolean getAuthorizedDismissalActorsOnly() | setAuthorizedDismissalActorsOnly(boolean authorizedDismissalActorsOnly) |
| `CreateProtected` | `Boolean` | Optional | - | Boolean getCreateProtected() | setCreateProtected(Boolean createProtected) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DismissStaleReviewsOnPush` | `boolean` | Required | - | boolean getDismissStaleReviewsOnPush() | setDismissStaleReviewsOnPush(boolean dismissStaleReviewsOnPush) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `IgnoreApprovalsFromContributors` | `boolean` | Required | - | boolean getIgnoreApprovalsFromContributors() | setIgnoreApprovalsFromContributors(boolean ignoreApprovalsFromContributors) |
| `LinearHistoryRequirementEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getLinearHistoryRequirementEnforcementLevel() | setLinearHistoryRequirementEnforcementLevel(AllowDeletionsEnforcementLevelEnum linearHistoryRequirementEnforcementLevel) |
| `MergeQueueEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getMergeQueueEnforcementLevel() | setMergeQueueEnforcementLevel(AllowDeletionsEnforcementLevelEnum mergeQueueEnforcementLevel) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `PullRequestReviewsEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getPullRequestReviewsEnforcementLevel() | setPullRequestReviewsEnforcementLevel(AllowDeletionsEnforcementLevelEnum pullRequestReviewsEnforcementLevel) |
| `RepositoryId` | `int` | Required | - | int getRepositoryId() | setRepositoryId(int repositoryId) |
| `RequireCodeOwnerReview` | `boolean` | Required | - | boolean getRequireCodeOwnerReview() | setRequireCodeOwnerReview(boolean requireCodeOwnerReview) |
| `RequiredApprovingReviewCount` | `int` | Required | - | int getRequiredApprovingReviewCount() | setRequiredApprovingReviewCount(int requiredApprovingReviewCount) |
| `RequiredConversationResolutionLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getRequiredConversationResolutionLevel() | setRequiredConversationResolutionLevel(AllowDeletionsEnforcementLevelEnum requiredConversationResolutionLevel) |
| `RequiredDeploymentsEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getRequiredDeploymentsEnforcementLevel() | setRequiredDeploymentsEnforcementLevel(AllowDeletionsEnforcementLevelEnum requiredDeploymentsEnforcementLevel) |
| `RequiredStatusChecks` | `List<String>` | Required | - | List<String> getRequiredStatusChecks() | setRequiredStatusChecks(List<String> requiredStatusChecks) |
| `RequiredStatusChecksEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getRequiredStatusChecksEnforcementLevel() | setRequiredStatusChecksEnforcementLevel(AllowDeletionsEnforcementLevelEnum requiredStatusChecksEnforcementLevel) |
| `SignatureRequirementEnforcementLevel` | [`AllowDeletionsEnforcementLevelEnum`](../../doc/models/allow-deletions-enforcement-level-enum.md) | Required | - | AllowDeletionsEnforcementLevelEnum getSignatureRequirementEnforcementLevel() | setSignatureRequirementEnforcementLevel(AllowDeletionsEnforcementLevelEnum signatureRequirementEnforcementLevel) |
| `StrictRequiredStatusChecksPolicy` | `boolean` | Required | - | boolean getStrictRequiredStatusChecksPolicy() | setStrictRequiredStatusChecksPolicy(boolean strictRequiredStatusChecksPolicy) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "admin_enforced": false,
  "allow_deletions_enforcement_level": "off",
  "allow_force_pushes_enforcement_level": "off",
  "authorized_actor_names": [
    "authorized_actor_names5",
    "authorized_actor_names6",
    "authorized_actor_names7"
  ],
  "authorized_actors_only": false,
  "authorized_dismissal_actors_only": false,
  "create_protected": null,
  "created_at": "2016-03-13T12:52:32.123Z",
  "dismiss_stale_reviews_on_push": false,
  "id": 112,
  "ignore_approvals_from_contributors": false,
  "linear_history_requirement_enforcement_level": "non_admins",
  "merge_queue_enforcement_level": "off",
  "name": "name0",
  "pull_request_reviews_enforcement_level": "off",
  "repository_id": 254,
  "require_code_owner_review": false,
  "required_approving_review_count": 106,
  "required_conversation_resolution_level": "everyone",
  "required_deployments_enforcement_level": "off",
  "required_status_checks": [
    "required_status_checks9"
  ],
  "required_status_checks_enforcement_level": "off",
  "signature_requirement_enforcement_level": "non_admins",
  "strict_required_status_checks_policy": false,
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

