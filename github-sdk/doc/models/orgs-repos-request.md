
# Orgs Repos Request

## Structure

`OrgsReposRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the repository. | String getName() | setName(String name) |
| `Description` | `String` | Optional | A short description of the repository. | String getDescription() | setDescription(String description) |
| `Homepage` | `String` | Optional | A URL with more information about the repository. | String getHomepage() | setHomepage(String homepage) |
| `Private` | `Boolean` | Optional | Whether the repository is private.<br>**Default**: `false` | Boolean getPrivate() | setPrivate(Boolean mPrivate) |
| `Visibility` | [`Visibility88Enum`](../../doc/models/visibility-88-enum.md) | Optional | - | Visibility88Enum getVisibility() | setVisibility(Visibility88Enum visibility) |
| `HasIssues` | `Boolean` | Optional | Either `true` to enable issues for this repository or `false` to disable them.<br>**Default**: `true` | Boolean getHasIssues() | setHasIssues(Boolean hasIssues) |
| `HasProjects` | `Boolean` | Optional | Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.<br>**Default**: `true` | Boolean getHasProjects() | setHasProjects(Boolean hasProjects) |
| `HasWiki` | `Boolean` | Optional | Either `true` to enable the wiki for this repository or `false` to disable it.<br>**Default**: `true` | Boolean getHasWiki() | setHasWiki(Boolean hasWiki) |
| `HasDownloads` | `Boolean` | Optional | Whether downloads are enabled.<br>**Default**: `true` | Boolean getHasDownloads() | setHasDownloads(Boolean hasDownloads) |
| `IsTemplate` | `Boolean` | Optional | Either `true` to make this repo available as a template repository or `false` to prevent it.<br>**Default**: `false` | Boolean getIsTemplate() | setIsTemplate(Boolean isTemplate) |
| `TeamId` | `Integer` | Optional | The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization. | Integer getTeamId() | setTeamId(Integer teamId) |
| `AutoInit` | `Boolean` | Optional | Pass `true` to create an initial commit with empty README.<br>**Default**: `false` | Boolean getAutoInit() | setAutoInit(Boolean autoInit) |
| `GitignoreTemplate` | `String` | Optional | Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, "Haskell". | String getGitignoreTemplate() | setGitignoreTemplate(String gitignoreTemplate) |
| `LicenseTemplate` | `String` | Optional | Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the `license_template` string. For example, "mit" or "mpl-2.0". | String getLicenseTemplate() | setLicenseTemplate(String licenseTemplate) |
| `AllowSquashMerge` | `Boolean` | Optional | Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.<br>**Default**: `true` | Boolean getAllowSquashMerge() | setAllowSquashMerge(Boolean allowSquashMerge) |
| `AllowMergeCommit` | `Boolean` | Optional | Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.<br>**Default**: `true` | Boolean getAllowMergeCommit() | setAllowMergeCommit(Boolean allowMergeCommit) |
| `AllowRebaseMerge` | `Boolean` | Optional | Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.<br>**Default**: `true` | Boolean getAllowRebaseMerge() | setAllowRebaseMerge(Boolean allowRebaseMerge) |
| `AllowAutoMerge` | `Boolean` | Optional | Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.<br>**Default**: `false` | Boolean getAllowAutoMerge() | setAllowAutoMerge(Boolean allowAutoMerge) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.<br>**Default**: `false` | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `UseSquashPrTitleAsDefault` | `Boolean` | Optional | Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead.<br>**Default**: `false` | Boolean getUseSquashPrTitleAsDefault() | setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) |
| `SquashMergeCommitTitle` | [`SquashMergeCommitTitleEnum`](../../doc/models/squash-merge-commit-title-enum.md) | Optional | - | SquashMergeCommitTitleEnum getSquashMergeCommitTitle() | setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) |
| `SquashMergeCommitMessage` | [`SquashMergeCommitMessageEnum`](../../doc/models/squash-merge-commit-message-enum.md) | Optional | - | SquashMergeCommitMessageEnum getSquashMergeCommitMessage() | setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) |
| `MergeCommitTitle` | [`MergeCommitTitleEnum`](../../doc/models/merge-commit-title-enum.md) | Optional | - | MergeCommitTitleEnum getMergeCommitTitle() | setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) |
| `MergeCommitMessage` | [`MergeCommitMessageEnum`](../../doc/models/merge-commit-message-enum.md) | Optional | - | MergeCommitMessageEnum getMergeCommitMessage() | setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) |

## Example (as JSON)

```json
{
  "name": "name0",
  "description": null,
  "homepage": null,
  "private": null,
  "visibility": null,
  "has_issues": null,
  "has_projects": null,
  "has_wiki": null,
  "has_downloads": null,
  "is_template": null,
  "team_id": null,
  "auto_init": null,
  "gitignore_template": null,
  "license_template": null,
  "allow_squash_merge": null,
  "allow_merge_commit": null,
  "allow_rebase_merge": null,
  "allow_auto_merge": null,
  "delete_branch_on_merge": null,
  "use_squash_pr_title_as_default": null,
  "squash_merge_commit_title": null,
  "squash_merge_commit_message": null,
  "merge_commit_title": null,
  "merge_commit_message": null
}
```

