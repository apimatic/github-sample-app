
# Repos Request

## Structure

`ReposRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the repository. | String getName() | setName(String name) |
| `Description` | `String` | Optional | A short description of the repository. | String getDescription() | setDescription(String description) |
| `Homepage` | `String` | Optional | A URL with more information about the repository. | String getHomepage() | setHomepage(String homepage) |
| `Private` | `Boolean` | Optional | Either `true` to make the repository private or `false` to make it public. Default: `false`.  <br>**Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.<br>**Default**: `false` | Boolean getPrivate() | setPrivate(Boolean mPrivate) |
| `Visibility` | [`Visibility88Enum`](../../doc/models/visibility-88-enum.md) | Optional | - | Visibility88Enum getVisibility() | setVisibility(Visibility88Enum visibility) |
| `SecurityAndAnalysis` | `Object` | Optional | - | Object getSecurityAndAnalysis() | setSecurityAndAnalysis(Object securityAndAnalysis) |
| `HasIssues` | `Boolean` | Optional | Either `true` to enable issues for this repository or `false` to disable them.<br>**Default**: `true` | Boolean getHasIssues() | setHasIssues(Boolean hasIssues) |
| `HasProjects` | `Boolean` | Optional | Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.<br>**Default**: `true` | Boolean getHasProjects() | setHasProjects(Boolean hasProjects) |
| `HasWiki` | `Boolean` | Optional | Either `true` to enable the wiki for this repository or `false` to disable it.<br>**Default**: `true` | Boolean getHasWiki() | setHasWiki(Boolean hasWiki) |
| `IsTemplate` | `Boolean` | Optional | Either `true` to make this repo available as a template repository or `false` to prevent it.<br>**Default**: `false` | Boolean getIsTemplate() | setIsTemplate(Boolean isTemplate) |
| `DefaultBranch` | `String` | Optional | Updates the default branch for this repository. | String getDefaultBranch() | setDefaultBranch(String defaultBranch) |
| `AllowSquashMerge` | `Boolean` | Optional | Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.<br>**Default**: `true` | Boolean getAllowSquashMerge() | setAllowSquashMerge(Boolean allowSquashMerge) |
| `AllowMergeCommit` | `Boolean` | Optional | Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.<br>**Default**: `true` | Boolean getAllowMergeCommit() | setAllowMergeCommit(Boolean allowMergeCommit) |
| `AllowRebaseMerge` | `Boolean` | Optional | Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.<br>**Default**: `true` | Boolean getAllowRebaseMerge() | setAllowRebaseMerge(Boolean allowRebaseMerge) |
| `AllowAutoMerge` | `Boolean` | Optional | Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.<br>**Default**: `false` | Boolean getAllowAutoMerge() | setAllowAutoMerge(Boolean allowAutoMerge) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.<br>**Default**: `false` | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `AllowUpdateBranch` | `Boolean` | Optional | Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise.<br>**Default**: `false` | Boolean getAllowUpdateBranch() | setAllowUpdateBranch(Boolean allowUpdateBranch) |
| `UseSquashPrTitleAsDefault` | `Boolean` | Optional | Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead.<br>**Default**: `false` | Boolean getUseSquashPrTitleAsDefault() | setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) |
| `SquashMergeCommitTitle` | [`SquashMergeCommitTitleEnum`](../../doc/models/squash-merge-commit-title-enum.md) | Optional | - | SquashMergeCommitTitleEnum getSquashMergeCommitTitle() | setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) |
| `SquashMergeCommitMessage` | [`SquashMergeCommitMessageEnum`](../../doc/models/squash-merge-commit-message-enum.md) | Optional | - | SquashMergeCommitMessageEnum getSquashMergeCommitMessage() | setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) |
| `MergeCommitTitle` | [`MergeCommitTitleEnum`](../../doc/models/merge-commit-title-enum.md) | Optional | - | MergeCommitTitleEnum getMergeCommitTitle() | setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) |
| `MergeCommitMessage` | [`MergeCommitMessageEnum`](../../doc/models/merge-commit-message-enum.md) | Optional | - | MergeCommitMessageEnum getMergeCommitMessage() | setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) |
| `Archived` | `Boolean` | Optional | Whether to archive this repository. `false` will unarchive a previously archived repository.<br>**Default**: `false` | Boolean getArchived() | setArchived(Boolean archived) |
| `AllowForking` | `Boolean` | Optional | Either `true` to allow private forks, or `false` to prevent private forks.<br>**Default**: `false` | Boolean getAllowForking() | setAllowForking(Boolean allowForking) |
| `WebCommitSignoffRequired` | `Boolean` | Optional | Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to sign off on web-based commits.<br>**Default**: `false` | Boolean getWebCommitSignoffRequired() | setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) |

## Example (as JSON)

```json
{
  "name": null,
  "description": null,
  "homepage": null,
  "private": null,
  "visibility": null,
  "security_and_analysis": null,
  "has_issues": null,
  "has_projects": null,
  "has_wiki": null,
  "is_template": null,
  "default_branch": null,
  "allow_squash_merge": null,
  "allow_merge_commit": null,
  "allow_rebase_merge": null,
  "allow_auto_merge": null,
  "delete_branch_on_merge": null,
  "allow_update_branch": null,
  "use_squash_pr_title_as_default": null,
  "squash_merge_commit_title": null,
  "squash_merge_commit_message": null,
  "merge_commit_title": null,
  "merge_commit_message": null,
  "archived": null,
  "allow_forking": null,
  "web_commit_signoff_required": null
}
```

