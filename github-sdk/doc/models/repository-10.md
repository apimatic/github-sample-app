
# Repository 10

A git repository

## Structure

`Repository10`

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
| `CreatedAt` | [`Repository10CreatedAt`]($m/Repository10CreatedAt) | Required | - | Repository10CreatedAt getCreatedAt() | setCreatedAt(Repository10CreatedAt createdAt) |
| `DefaultBranch` | `String` | Required | The default branch of the repository. | String getDefaultBranch() | setDefaultBranch(String defaultBranch) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | Whether to delete head branches when pull requests are merged<br>**Default**: `false` | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `DeploymentsUrl` | `String` | Required | - | String getDeploymentsUrl() | setDeploymentsUrl(String deploymentsUrl) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Disabled` | `Boolean` | Optional | Returns whether or not this repository is disabled. | Boolean getDisabled() | setDisabled(Boolean disabled) |
| `DownloadsUrl` | `String` | Required | - | String getDownloadsUrl() | setDownloadsUrl(String downloadsUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `Fork` | `boolean` | Required | - | boolean getFork() | setFork(boolean fork) |
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
| `PushedAt` | [`Repository10PushedAt`]($m/Repository10PushedAt) | Required | - | Repository10PushedAt getPushedAt() | setPushedAt(Repository10PushedAt pushedAt) |
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

## Example (as JSON)

```json
{
  "allow_auto_merge": null,
  "allow_forking": null,
  "allow_merge_commit": null,
  "allow_rebase_merge": null,
  "allow_squash_merge": null,
  "allow_update_branch": null,
  "archive_url": "archive_url0",
  "archived": false,
  "assignees_url": "assignees_url2",
  "blobs_url": "blobs_url6",
  "branches_url": "branches_url4",
  "clone_url": "clone_url0",
  "collaborators_url": "collaborators_url0",
  "comments_url": "comments_url4",
  "commits_url": "commits_url4",
  "compare_url": "compare_url8",
  "contents_url": "contents_url8",
  "contributors_url": "contributors_url8",
  "created_at": 184,
  "default_branch": "default_branch8",
  "delete_branch_on_merge": null,
  "deployments_url": "deployments_url6",
  "description": "description0",
  "disabled": null,
  "downloads_url": "downloads_url8",
  "events_url": "events_url8",
  "fork": false,
  "forks": 120,
  "forks_count": 250,
  "forks_url": "forks_url4",
  "full_name": "full_name6",
  "git_commits_url": "git_commits_url6",
  "git_refs_url": "git_refs_url0",
  "git_tags_url": "git_tags_url6",
  "git_url": "git_url0",
  "has_downloads": false,
  "has_issues": false,
  "has_pages": false,
  "has_projects": false,
  "has_wiki": false,
  "homepage": "homepage6",
  "hooks_url": "hooks_url4",
  "html_url": "html_url0",
  "id": 112,
  "is_template": null,
  "issue_comment_url": "issue_comment_url4",
  "issue_events_url": "issue_events_url6",
  "issues_url": "issues_url4",
  "keys_url": "keys_url2",
  "labels_url": "labels_url6",
  "language": "language2",
  "languages_url": "languages_url4",
  "license": {
    "key1": "val1",
    "key2": "val2"
  },
  "master_branch": null,
  "merges_url": "merges_url8",
  "milestones_url": "milestones_url2",
  "mirror_url": "mirror_url4",
  "name": "name0",
  "node_id": "node_id2",
  "notifications_url": "notifications_url6",
  "open_issues": 56,
  "open_issues_count": 236,
  "organization": null,
  "owner": {
    "key1": "val1",
    "key2": "val2"
  },
  "permissions": null,
  "private": false,
  "public": null,
  "pulls_url": "pulls_url6",
  "pushed_at": 36,
  "releases_url": "releases_url6",
  "role_name": null,
  "size": 18,
  "ssh_url": "ssh_url4",
  "stargazers": null,
  "stargazers_count": 164,
  "stargazers_url": "stargazers_url0",
  "statuses_url": "statuses_url2",
  "subscribers_url": "subscribers_url2",
  "subscription_url": "subscription_url4",
  "svn_url": "svn_url0",
  "tags_url": "tags_url8",
  "teams_url": "teams_url2",
  "topics": [
    "topics9",
    "topics0",
    "topics1"
  ],
  "trees_url": "trees_url0",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "visibility": "internal",
  "watchers": 76,
  "watchers_count": 116
}
```

