
# Repository 7

## Structure

`Repository7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `FullName` | `String` | Required | - | String getFullName() | setFullName(String fullName) |
| `Owner` | [`Owner1`](../../doc/models/owner-1.md) | Required | - | Owner1 getOwner() | setOwner(Owner1 owner) |
| `Private` | `boolean` | Required | - | boolean getPrivate() | setPrivate(boolean mPrivate) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Fork` | `boolean` | Required | - | boolean getFork() | setFork(boolean fork) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ArchiveUrl` | `String` | Required | - | String getArchiveUrl() | setArchiveUrl(String archiveUrl) |
| `AssigneesUrl` | `String` | Required | - | String getAssigneesUrl() | setAssigneesUrl(String assigneesUrl) |
| `BlobsUrl` | `String` | Required | - | String getBlobsUrl() | setBlobsUrl(String blobsUrl) |
| `BranchesUrl` | `String` | Required | - | String getBranchesUrl() | setBranchesUrl(String branchesUrl) |
| `CollaboratorsUrl` | `String` | Required | - | String getCollaboratorsUrl() | setCollaboratorsUrl(String collaboratorsUrl) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `CommitsUrl` | `String` | Required | - | String getCommitsUrl() | setCommitsUrl(String commitsUrl) |
| `CompareUrl` | `String` | Required | - | String getCompareUrl() | setCompareUrl(String compareUrl) |
| `ContentsUrl` | `String` | Required | - | String getContentsUrl() | setContentsUrl(String contentsUrl) |
| `ContributorsUrl` | `String` | Required | - | String getContributorsUrl() | setContributorsUrl(String contributorsUrl) |
| `DeploymentsUrl` | `String` | Required | - | String getDeploymentsUrl() | setDeploymentsUrl(String deploymentsUrl) |
| `DownloadsUrl` | `String` | Required | - | String getDownloadsUrl() | setDownloadsUrl(String downloadsUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `ForksUrl` | `String` | Required | - | String getForksUrl() | setForksUrl(String forksUrl) |
| `GitCommitsUrl` | `String` | Required | - | String getGitCommitsUrl() | setGitCommitsUrl(String gitCommitsUrl) |
| `GitRefsUrl` | `String` | Required | - | String getGitRefsUrl() | setGitRefsUrl(String gitRefsUrl) |
| `GitTagsUrl` | `String` | Required | - | String getGitTagsUrl() | setGitTagsUrl(String gitTagsUrl) |
| `GitUrl` | `String` | Optional | - | String getGitUrl() | setGitUrl(String gitUrl) |
| `IssueCommentUrl` | `String` | Required | - | String getIssueCommentUrl() | setIssueCommentUrl(String issueCommentUrl) |
| `IssueEventsUrl` | `String` | Required | - | String getIssueEventsUrl() | setIssueEventsUrl(String issueEventsUrl) |
| `IssuesUrl` | `String` | Required | - | String getIssuesUrl() | setIssuesUrl(String issuesUrl) |
| `KeysUrl` | `String` | Required | - | String getKeysUrl() | setKeysUrl(String keysUrl) |
| `LabelsUrl` | `String` | Required | - | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `LanguagesUrl` | `String` | Required | - | String getLanguagesUrl() | setLanguagesUrl(String languagesUrl) |
| `MergesUrl` | `String` | Required | - | String getMergesUrl() | setMergesUrl(String mergesUrl) |
| `MilestonesUrl` | `String` | Required | - | String getMilestonesUrl() | setMilestonesUrl(String milestonesUrl) |
| `NotificationsUrl` | `String` | Required | - | String getNotificationsUrl() | setNotificationsUrl(String notificationsUrl) |
| `PullsUrl` | `String` | Required | - | String getPullsUrl() | setPullsUrl(String pullsUrl) |
| `ReleasesUrl` | `String` | Required | - | String getReleasesUrl() | setReleasesUrl(String releasesUrl) |
| `SshUrl` | `String` | Optional | - | String getSshUrl() | setSshUrl(String sshUrl) |
| `StargazersUrl` | `String` | Required | - | String getStargazersUrl() | setStargazersUrl(String stargazersUrl) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `SubscribersUrl` | `String` | Required | - | String getSubscribersUrl() | setSubscribersUrl(String subscribersUrl) |
| `SubscriptionUrl` | `String` | Required | - | String getSubscriptionUrl() | setSubscriptionUrl(String subscriptionUrl) |
| `TagsUrl` | `String` | Required | - | String getTagsUrl() | setTagsUrl(String tagsUrl) |
| `TeamsUrl` | `String` | Required | - | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |
| `TreesUrl` | `String` | Required | - | String getTreesUrl() | setTreesUrl(String treesUrl) |
| `CloneUrl` | `String` | Optional | - | String getCloneUrl() | setCloneUrl(String cloneUrl) |
| `MirrorUrl` | `String` | Optional | - | String getMirrorUrl() | setMirrorUrl(String mirrorUrl) |
| `HooksUrl` | `String` | Required | - | String getHooksUrl() | setHooksUrl(String hooksUrl) |
| `SvnUrl` | `String` | Optional | - | String getSvnUrl() | setSvnUrl(String svnUrl) |
| `Homepage` | `String` | Optional | - | String getHomepage() | setHomepage(String homepage) |
| `Language` | `String` | Optional | - | String getLanguage() | setLanguage(String language) |
| `ForksCount` | `Integer` | Optional | - | Integer getForksCount() | setForksCount(Integer forksCount) |
| `StargazersCount` | `Integer` | Optional | - | Integer getStargazersCount() | setStargazersCount(Integer stargazersCount) |
| `WatchersCount` | `Integer` | Optional | - | Integer getWatchersCount() | setWatchersCount(Integer watchersCount) |
| `Size` | `Integer` | Optional | The size of the repository. Size is calculated hourly. When a repository is initially created, the size is 0. | Integer getSize() | setSize(Integer size) |
| `DefaultBranch` | `String` | Optional | - | String getDefaultBranch() | setDefaultBranch(String defaultBranch) |
| `OpenIssuesCount` | `Integer` | Optional | - | Integer getOpenIssuesCount() | setOpenIssuesCount(Integer openIssuesCount) |
| `IsTemplate` | `Boolean` | Optional | - | Boolean getIsTemplate() | setIsTemplate(Boolean isTemplate) |
| `Topics` | `List<String>` | Optional | - | List<String> getTopics() | setTopics(List<String> topics) |
| `HasIssues` | `Boolean` | Optional | - | Boolean getHasIssues() | setHasIssues(Boolean hasIssues) |
| `HasProjects` | `Boolean` | Optional | - | Boolean getHasProjects() | setHasProjects(Boolean hasProjects) |
| `HasWiki` | `Boolean` | Optional | - | Boolean getHasWiki() | setHasWiki(Boolean hasWiki) |
| `HasPages` | `Boolean` | Optional | - | Boolean getHasPages() | setHasPages(Boolean hasPages) |
| `HasDownloads` | `Boolean` | Optional | - | Boolean getHasDownloads() | setHasDownloads(Boolean hasDownloads) |
| `HasDiscussions` | `Boolean` | Optional | - | Boolean getHasDiscussions() | setHasDiscussions(Boolean hasDiscussions) |
| `Archived` | `Boolean` | Optional | - | Boolean getArchived() | setArchived(Boolean archived) |
| `Disabled` | `Boolean` | Optional | - | Boolean getDisabled() | setDisabled(Boolean disabled) |
| `Visibility` | `String` | Optional | - | String getVisibility() | setVisibility(String visibility) |
| `PushedAt` | `LocalDateTime` | Optional | - | LocalDateTime getPushedAt() | setPushedAt(LocalDateTime pushedAt) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Permissions` | [`Permissions2`](../../doc/models/permissions-2.md) | Optional | - | Permissions2 getPermissions() | setPermissions(Permissions2 permissions) |
| `RoleName` | `String` | Optional | - | String getRoleName() | setRoleName(String roleName) |
| `TempCloneToken` | `String` | Optional | - | String getTempCloneToken() | setTempCloneToken(String tempCloneToken) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | - | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `SubscribersCount` | `Integer` | Optional | - | Integer getSubscribersCount() | setSubscribersCount(Integer subscribersCount) |
| `NetworkCount` | `Integer` | Optional | - | Integer getNetworkCount() | setNetworkCount(Integer networkCount) |
| `CodeOfConduct` | [`CodeOfConduct1`](../../doc/models/code-of-conduct-1.md) | Optional | - | CodeOfConduct1 getCodeOfConduct() | setCodeOfConduct(CodeOfConduct1 codeOfConduct) |
| `License` | `Object` | Optional | - | Object getLicense() | setLicense(Object license) |
| `Forks` | `Integer` | Optional | - | Integer getForks() | setForks(Integer forks) |
| `OpenIssues` | `Integer` | Optional | - | Integer getOpenIssues() | setOpenIssues(Integer openIssues) |
| `Watchers` | `Integer` | Optional | - | Integer getWatchers() | setWatchers(Integer watchers) |
| `AllowForking` | `Boolean` | Optional | - | Boolean getAllowForking() | setAllowForking(Boolean allowForking) |
| `WebCommitSignoffRequired` | `Boolean` | Optional | - | Boolean getWebCommitSignoffRequired() | setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) |
| `SecurityAndAnalysis` | `Object` | Optional | - | Object getSecurityAndAnalysis() | setSecurityAndAnalysis(Object securityAndAnalysis) |

## Example (as JSON)

```json
{
  "id": 1296269,
  "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
  "name": "Hello-World",
  "full_name": "octocat/Hello-World",
  "owner": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "private": null,
  "html_url": "https://github.com/octocat/Hello-World",
  "description": "This your first repo!",
  "fork": null,
  "url": "https://api.github.com/repos/octocat/Hello-World",
  "archive_url": "http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
  "assignees_url": "http://api.github.com/repos/octocat/Hello-World/assignees{/user}",
  "blobs_url": "http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
  "branches_url": "http://api.github.com/repos/octocat/Hello-World/branches{/branch}",
  "collaborators_url": "http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
  "comments_url": "http://api.github.com/repos/octocat/Hello-World/comments{/number}",
  "commits_url": "http://api.github.com/repos/octocat/Hello-World/commits{/sha}",
  "compare_url": "http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
  "contents_url": "http://api.github.com/repos/octocat/Hello-World/contents/{+path}",
  "contributors_url": "http://api.github.com/repos/octocat/Hello-World/contributors",
  "deployments_url": "http://api.github.com/repos/octocat/Hello-World/deployments",
  "downloads_url": "http://api.github.com/repos/octocat/Hello-World/downloads",
  "events_url": "http://api.github.com/repos/octocat/Hello-World/events",
  "forks_url": "http://api.github.com/repos/octocat/Hello-World/forks",
  "git_commits_url": "http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
  "git_refs_url": "http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
  "git_tags_url": "http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
  "issue_comment_url": "http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
  "issue_events_url": "http://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
  "issues_url": "http://api.github.com/repos/octocat/Hello-World/issues{/number}",
  "keys_url": "http://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
  "labels_url": "http://api.github.com/repos/octocat/Hello-World/labels{/name}",
  "languages_url": "http://api.github.com/repos/octocat/Hello-World/languages",
  "merges_url": "http://api.github.com/repos/octocat/Hello-World/merges",
  "milestones_url": "http://api.github.com/repos/octocat/Hello-World/milestones{/number}",
  "notifications_url": "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
  "pulls_url": "http://api.github.com/repos/octocat/Hello-World/pulls{/number}",
  "releases_url": "http://api.github.com/repos/octocat/Hello-World/releases{/id}",
  "stargazers_url": "http://api.github.com/repos/octocat/Hello-World/stargazers",
  "statuses_url": "http://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
  "subscribers_url": "http://api.github.com/repos/octocat/Hello-World/subscribers",
  "subscription_url": "http://api.github.com/repos/octocat/Hello-World/subscription",
  "tags_url": "http://api.github.com/repos/octocat/Hello-World/tags",
  "teams_url": "http://api.github.com/repos/octocat/Hello-World/teams",
  "trees_url": "http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
  "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
}
```

