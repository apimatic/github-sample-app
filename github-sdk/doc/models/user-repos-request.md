
# User Repos Request

## Structure

`UserReposRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the repository. | String getName() | setName(String name) |
| `Description` | `String` | Optional | A short description of the repository. | String getDescription() | setDescription(String description) |
| `Homepage` | `String` | Optional | A URL with more information about the repository. | String getHomepage() | setHomepage(String homepage) |
| `Private` | `Boolean` | Optional | Whether the repository is private.<br>**Default**: `false` | Boolean getPrivate() | setPrivate(Boolean mPrivate) |
| `HasIssues` | `Boolean` | Optional | Whether issues are enabled.<br>**Default**: `true` | Boolean getHasIssues() | setHasIssues(Boolean hasIssues) |
| `HasProjects` | `Boolean` | Optional | Whether projects are enabled.<br>**Default**: `true` | Boolean getHasProjects() | setHasProjects(Boolean hasProjects) |
| `HasWiki` | `Boolean` | Optional | Whether the wiki is enabled.<br>**Default**: `true` | Boolean getHasWiki() | setHasWiki(Boolean hasWiki) |
| `HasDiscussions` | `Boolean` | Optional | Whether discussions are enabled.<br>**Default**: `false` | Boolean getHasDiscussions() | setHasDiscussions(Boolean hasDiscussions) |
| `TeamId` | `Integer` | Optional | The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization. | Integer getTeamId() | setTeamId(Integer teamId) |
| `AutoInit` | `Boolean` | Optional | Whether the repository is initialized with a minimal README.<br>**Default**: `false` | Boolean getAutoInit() | setAutoInit(Boolean autoInit) |
| `GitignoreTemplate` | `String` | Optional | The desired language or platform to apply to the .gitignore. | String getGitignoreTemplate() | setGitignoreTemplate(String gitignoreTemplate) |
| `LicenseTemplate` | `String` | Optional | The license keyword of the open source license for this repository. | String getLicenseTemplate() | setLicenseTemplate(String licenseTemplate) |
| `AllowSquashMerge` | `Boolean` | Optional | Whether to allow squash merges for pull requests.<br>**Default**: `true` | Boolean getAllowSquashMerge() | setAllowSquashMerge(Boolean allowSquashMerge) |
| `AllowMergeCommit` | `Boolean` | Optional | Whether to allow merge commits for pull requests.<br>**Default**: `true` | Boolean getAllowMergeCommit() | setAllowMergeCommit(Boolean allowMergeCommit) |
| `AllowRebaseMerge` | `Boolean` | Optional | Whether to allow rebase merges for pull requests.<br>**Default**: `true` | Boolean getAllowRebaseMerge() | setAllowRebaseMerge(Boolean allowRebaseMerge) |
| `AllowAutoMerge` | `Boolean` | Optional | Whether to allow Auto-merge to be used on pull requests.<br>**Default**: `false` | Boolean getAllowAutoMerge() | setAllowAutoMerge(Boolean allowAutoMerge) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | Whether to delete head branches when pull requests are merged<br>**Default**: `false` | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `SquashMergeCommitTitle` | [`SquashMergeCommitTitleEnum`](../../doc/models/squash-merge-commit-title-enum.md) | Optional | - | SquashMergeCommitTitleEnum getSquashMergeCommitTitle() | setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) |
| `SquashMergeCommitMessage` | [`SquashMergeCommitMessageEnum`](../../doc/models/squash-merge-commit-message-enum.md) | Optional | - | SquashMergeCommitMessageEnum getSquashMergeCommitMessage() | setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) |
| `MergeCommitTitle` | [`MergeCommitTitleEnum`](../../doc/models/merge-commit-title-enum.md) | Optional | - | MergeCommitTitleEnum getMergeCommitTitle() | setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) |
| `MergeCommitMessage` | [`MergeCommitMessageEnum`](../../doc/models/merge-commit-message-enum.md) | Optional | - | MergeCommitMessageEnum getMergeCommitMessage() | setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) |
| `HasDownloads` | `Boolean` | Optional | Whether downloads are enabled.<br>**Default**: `true` | Boolean getHasDownloads() | setHasDownloads(Boolean hasDownloads) |
| `IsTemplate` | `Boolean` | Optional | Whether this repository acts as a template that can be used to generate new repositories.<br>**Default**: `false` | Boolean getIsTemplate() | setIsTemplate(Boolean isTemplate) |

## Example (as JSON)

```json
{
  "name": "Team Environment"
}
```

