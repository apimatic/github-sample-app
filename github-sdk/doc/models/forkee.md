
# Forkee

The created [`repository`](https://docs.github.com/rest/reference/repos#get-a-repository) resource.

## Structure

`Forkee`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowAutoMerge` | `Boolean` | Optional | Whether to allow auto-merge for pull requests.<br>**Default**: `false` | Boolean getAllowAutoMerge() | setAllowAutoMerge(Boolean allowAutoMerge) |
| `AllowForking` | `Boolean` | Optional | Whether to allow private forks | Boolean getAllowForking() | setAllowForking(Boolean allowForking) |
| `AllowMergeCommit` | `Boolean` | Optional | Whether to allow merge commits for pull requests.<br>**Default**: `true` | Boolean getAllowMergeCommit() | setAllowMergeCommit(Boolean allowMergeCommit) |
| `AllowRebaseMerge` | `Boolean` | Optional | Whether to allow rebase merges for pull requests.<br>**Default**: `true` | Boolean getAllowRebaseMerge() | setAllowRebaseMerge(Boolean allowRebaseMerge) |
| `AllowSquashMerge` | `Boolean` | Optional | Whether to allow squash merges for pull requests.<br>**Default**: `true` | Boolean getAllowSquashMerge() | setAllowSquashMerge(Boolean allowSquashMerge) |
| `AllowUpdateBranch` | `Boolean` | Optional | - | Boolean getAllowUpdateBranch() | setAllowUpdateBranch(Boolean allowUpdateBranch) |
| `ArchiveUrl` | `String` | Required | - | String getArchiveUrl() | setArchiveUrl(String archiveUrl) |
| `Archived` | `boolean` | Required | Whether the repository is archived. | boolean getArchived() | setArchived(boolean archived) |
| `AssigneesUrl` | `String` | Required | - | String getAssigneesUrl() | setAssigneesUrl(String assigneesUrl) |
| `BlobsUrl` | `String` | Required | - | String getBlobsUrl() | setBlobsUrl(String blobsUrl) |
| `BranchesUrl` | `String` | Required | - | String getBranchesUrl() | setBranchesUrl(String branchesUrl) |
| `CloneUrl` | `String` | Required | - | String getCloneUrl() | setCloneUrl(String cloneUrl) |
| `CollaboratorsUrl` | `String` | Required | - | String getCollaboratorsUrl() | setCollaboratorsUrl(String collaboratorsUrl) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `CommitsUrl` | `String` | Required | - | String getCommitsUrl() | setCommitsUrl(String commitsUrl) |
| `CompareUrl` | `String` | Required | - | String getCompareUrl() | setCompareUrl(String compareUrl) |
| `ContentsUrl` | `String` | Required | - | String getContentsUrl() | setContentsUrl(String contentsUrl) |
| `ContributorsUrl` | `String` | Required | - | String getContributorsUrl() | setContributorsUrl(String contributorsUrl) |
| `CreatedAt` | [`ForkeeCreatedAt`]($m/ForkeeCreatedAt) | Required | - | ForkeeCreatedAt getCreatedAt() | setCreatedAt(ForkeeCreatedAt createdAt) |
| `DefaultBranch` | `String` | Required | The default branch of the repository. | String getDefaultBranch() | setDefaultBranch(String defaultBranch) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | Whether to delete head branches when pull requests are merged<br>**Default**: `false` | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `DeploymentsUrl` | `String` | Required | - | String getDeploymentsUrl() | setDeploymentsUrl(String deploymentsUrl) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Disabled` | `Boolean` | Optional | Returns whether or not this repository is disabled. | Boolean getDisabled() | setDisabled(Boolean disabled) |
| `DownloadsUrl` | `String` | Required | - | String getDownloadsUrl() | setDownloadsUrl(String downloadsUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `Fork` | `String` | Required, Constant | **Default**: `"True"` | String getFork() | setFork(String fork) |
| `Forks` | `int` | Required | - | int getForks() | setForks(int forks) |
| `ForksCount` | `int` | Required | - | int getForksCount() | setForksCount(int forksCount) |
| `ForksUrl` | `String` | Required | - | String getForksUrl() | setForksUrl(String forksUrl) |
| `FullName` | `String` | Required | - | String getFullName() | setFullName(String fullName) |
| `GitCommitsUrl` | `String` | Required | - | String getGitCommitsUrl() | setGitCommitsUrl(String gitCommitsUrl) |
| `GitRefsUrl` | `String` | Required | - | String getGitRefsUrl() | setGitRefsUrl(String gitRefsUrl) |
| `GitTagsUrl` | `String` | Required | - | String getGitTagsUrl() | setGitTagsUrl(String gitTagsUrl) |
| `GitUrl` | `String` | Required | - | String getGitUrl() | setGitUrl(String gitUrl) |
| `HasDownloads` | `boolean` | Required | Whether downloads are enabled. | boolean getHasDownloads() | setHasDownloads(boolean hasDownloads) |
| `HasIssues` | `boolean` | Required | Whether issues are enabled. | boolean getHasIssues() | setHasIssues(boolean hasIssues) |
| `HasPages` | `boolean` | Required | - | boolean getHasPages() | setHasPages(boolean hasPages) |
| `HasProjects` | `boolean` | Required | Whether projects are enabled. | boolean getHasProjects() | setHasProjects(boolean hasProjects) |
| `HasWiki` | `boolean` | Required | Whether the wiki is enabled. | boolean getHasWiki() | setHasWiki(boolean hasWiki) |
| `Homepage` | `String` | Required | - | String getHomepage() | setHomepage(String homepage) |
| `HooksUrl` | `String` | Required | - | String getHooksUrl() | setHooksUrl(String hooksUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | Unique identifier of the repository | int getId() | setId(int id) |
| `IsTemplate` | `Boolean` | Optional | - | Boolean getIsTemplate() | setIsTemplate(Boolean isTemplate) |
| `IssueCommentUrl` | `String` | Required | - | String getIssueCommentUrl() | setIssueCommentUrl(String issueCommentUrl) |
| `IssueEventsUrl` | `String` | Required | - | String getIssueEventsUrl() | setIssueEventsUrl(String issueEventsUrl) |
| `IssuesUrl` | `String` | Required | - | String getIssuesUrl() | setIssuesUrl(String issuesUrl) |
| `KeysUrl` | `String` | Required | - | String getKeysUrl() | setKeysUrl(String keysUrl) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `Language` | `String` | Required | - | String getLanguage() | setLanguage(String language) |
| `LanguagesUrl` | `String` | Required | - | String getLanguagesUrl() | setLanguagesUrl(String languagesUrl) |
| `License` | `Object` | Required | - | Object getLicense() | setLicense(Object license) |
| `MasterBranch` | `String` | Optional | - | String getMasterBranch() | setMasterBranch(String masterBranch) |
| `MergesUrl` | `String` | Required | - | String getMergesUrl() | setMergesUrl(String mergesUrl) |
| `MilestonesUrl` | `String` | Required | - | String getMilestonesUrl() | setMilestonesUrl(String milestonesUrl) |
| `MirrorUrl` | `String` | Required | - | String getMirrorUrl() | setMirrorUrl(String mirrorUrl) |
| `Name` | `String` | Required | The name of the repository. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `NotificationsUrl` | `String` | Required | - | String getNotificationsUrl() | setNotificationsUrl(String notificationsUrl) |
| `OpenIssues` | `int` | Required | - | int getOpenIssues() | setOpenIssues(int openIssues) |
| `OpenIssuesCount` | `int` | Required | - | int getOpenIssuesCount() | setOpenIssuesCount(int openIssuesCount) |
| `Organization` | `String` | Optional | - | String getOrganization() | setOrganization(String organization) |
| `Owner` | `Object` | Required | - | Object getOwner() | setOwner(Object owner) |
| `Permissions` | [`Permissions1`](../../doc/models/permissions-1.md) | Optional | - | Permissions1 getPermissions() | setPermissions(Permissions1 permissions) |
| `Private` | `boolean` | Required | Whether the repository is private or public. | boolean getPrivate() | setPrivate(boolean mPrivate) |
| `Public` | `Boolean` | Optional | - | Boolean getPublic() | setPublic(Boolean mPublic) |
| `PullsUrl` | `String` | Required | - | String getPullsUrl() | setPullsUrl(String pullsUrl) |
| `PushedAt` | [`ForkeePushedAt`]($m/ForkeePushedAt) | Required | - | ForkeePushedAt getPushedAt() | setPushedAt(ForkeePushedAt pushedAt) |
| `ReleasesUrl` | `String` | Required | - | String getReleasesUrl() | setReleasesUrl(String releasesUrl) |
| `RoleName` | `String` | Optional | - | String getRoleName() | setRoleName(String roleName) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `SshUrl` | `String` | Required | - | String getSshUrl() | setSshUrl(String sshUrl) |
| `Stargazers` | `Integer` | Optional | - | Integer getStargazers() | setStargazers(Integer stargazers) |
| `StargazersCount` | `int` | Required | - | int getStargazersCount() | setStargazersCount(int stargazersCount) |
| `StargazersUrl` | `String` | Required | - | String getStargazersUrl() | setStargazersUrl(String stargazersUrl) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `SubscribersUrl` | `String` | Required | - | String getSubscribersUrl() | setSubscribersUrl(String subscribersUrl) |
| `SubscriptionUrl` | `String` | Required | - | String getSubscriptionUrl() | setSubscriptionUrl(String subscriptionUrl) |
| `SvnUrl` | `String` | Required | - | String getSvnUrl() | setSvnUrl(String svnUrl) |
| `TagsUrl` | `String` | Required | - | String getTagsUrl() | setTagsUrl(String tagsUrl) |
| `TeamsUrl` | `String` | Required | - | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |
| `Topics` | `List<String>` | Required | - | List<String> getTopics() | setTopics(List<String> topics) |
| `TreesUrl` | `String` | Required | - | String getTreesUrl() | setTreesUrl(String treesUrl) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Visibility` | [`Visibility6Enum`](../../doc/models/visibility-6-enum.md) | Required | - | Visibility6Enum getVisibility() | setVisibility(Visibility6Enum visibility) |
| `Watchers` | `int` | Required | - | int getWatchers() | setWatchers(int watchers) |
| `WatchersCount` | `int` | Required | - | int getWatchersCount() | setWatchersCount(int watchersCount) |
| `WebCommitSignoffRequired` | `Boolean` | Optional | Whether to require contributors to sign off on web-based commits | Boolean getWebCommitSignoffRequired() | setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) |

## Example (as JSON)

```json
{
  "archive_url": null,
  "archived": null,
  "assignees_url": null,
  "blobs_url": null,
  "branches_url": null,
  "clone_url": null,
  "collaborators_url": null,
  "comments_url": null,
  "commits_url": null,
  "compare_url": null,
  "contents_url": null,
  "contributors_url": null,
  "created_at": null,
  "default_branch": null,
  "deployments_url": null,
  "description": null,
  "downloads_url": null,
  "events_url": null,
  "fork": "True",
  "forks": null,
  "forks_count": null,
  "forks_url": null,
  "full_name": null,
  "git_commits_url": null,
  "git_refs_url": null,
  "git_tags_url": null,
  "git_url": null,
  "has_downloads": null,
  "has_issues": null,
  "has_pages": null,
  "has_projects": null,
  "has_wiki": null,
  "homepage": null,
  "hooks_url": null,
  "html_url": null,
  "id": null,
  "issue_comment_url": null,
  "issue_events_url": null,
  "issues_url": null,
  "keys_url": null,
  "labels_url": null,
  "language": null,
  "languages_url": null,
  "license": null,
  "merges_url": null,
  "milestones_url": null,
  "mirror_url": null,
  "name": null,
  "node_id": null,
  "notifications_url": null,
  "open_issues": null,
  "open_issues_count": null,
  "owner": null,
  "private": null,
  "pulls_url": null,
  "pushed_at": null,
  "releases_url": null,
  "size": null,
  "ssh_url": null,
  "stargazers_count": null,
  "stargazers_url": null,
  "statuses_url": null,
  "subscribers_url": null,
  "subscription_url": null,
  "svn_url": null,
  "tags_url": null,
  "teams_url": null,
  "topics": null,
  "trees_url": null,
  "updated_at": null,
  "url": null,
  "visibility": null,
  "watchers": null,
  "watchers_count": null
}
```

