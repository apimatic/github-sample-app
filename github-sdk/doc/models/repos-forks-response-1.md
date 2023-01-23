
# Repos Forks Response 1

## Structure

`ReposForksResponse1`

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
| `GitUrl` | `String` | Required | - | String getGitUrl() | setGitUrl(String gitUrl) |
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
| `SshUrl` | `String` | Required | - | String getSshUrl() | setSshUrl(String sshUrl) |
| `StargazersUrl` | `String` | Required | - | String getStargazersUrl() | setStargazersUrl(String stargazersUrl) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `SubscribersUrl` | `String` | Required | - | String getSubscribersUrl() | setSubscribersUrl(String subscribersUrl) |
| `SubscriptionUrl` | `String` | Required | - | String getSubscriptionUrl() | setSubscriptionUrl(String subscriptionUrl) |
| `TagsUrl` | `String` | Required | - | String getTagsUrl() | setTagsUrl(String tagsUrl) |
| `TeamsUrl` | `String` | Required | - | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |
| `TreesUrl` | `String` | Required | - | String getTreesUrl() | setTreesUrl(String treesUrl) |
| `CloneUrl` | `String` | Required | - | String getCloneUrl() | setCloneUrl(String cloneUrl) |
| `MirrorUrl` | `String` | Required | - | String getMirrorUrl() | setMirrorUrl(String mirrorUrl) |
| `HooksUrl` | `String` | Required | - | String getHooksUrl() | setHooksUrl(String hooksUrl) |
| `SvnUrl` | `String` | Required | - | String getSvnUrl() | setSvnUrl(String svnUrl) |
| `Homepage` | `String` | Required | - | String getHomepage() | setHomepage(String homepage) |
| `Language` | `String` | Required | - | String getLanguage() | setLanguage(String language) |
| `ForksCount` | `int` | Required | - | int getForksCount() | setForksCount(int forksCount) |
| `StargazersCount` | `int` | Required | - | int getStargazersCount() | setStargazersCount(int stargazersCount) |
| `WatchersCount` | `int` | Required | - | int getWatchersCount() | setWatchersCount(int watchersCount) |
| `Size` | `int` | Required | The size of the repository. Size is calculated hourly. When a repository is initially created, the size is 0. | int getSize() | setSize(int size) |
| `DefaultBranch` | `String` | Required | - | String getDefaultBranch() | setDefaultBranch(String defaultBranch) |
| `OpenIssuesCount` | `int` | Required | - | int getOpenIssuesCount() | setOpenIssuesCount(int openIssuesCount) |
| `IsTemplate` | `Boolean` | Optional | - | Boolean getIsTemplate() | setIsTemplate(Boolean isTemplate) |
| `Topics` | `List<String>` | Optional | - | List<String> getTopics() | setTopics(List<String> topics) |
| `HasIssues` | `boolean` | Required | - | boolean getHasIssues() | setHasIssues(boolean hasIssues) |
| `HasProjects` | `boolean` | Required | - | boolean getHasProjects() | setHasProjects(boolean hasProjects) |
| `HasWiki` | `boolean` | Required | - | boolean getHasWiki() | setHasWiki(boolean hasWiki) |
| `HasPages` | `boolean` | Required | - | boolean getHasPages() | setHasPages(boolean hasPages) |
| `HasDownloads` | `boolean` | Required | - | boolean getHasDownloads() | setHasDownloads(boolean hasDownloads) |
| `HasDiscussions` | `boolean` | Required | - | boolean getHasDiscussions() | setHasDiscussions(boolean hasDiscussions) |
| `Archived` | `boolean` | Required | - | boolean getArchived() | setArchived(boolean archived) |
| `Disabled` | `boolean` | Required | Returns whether or not this repository disabled. | boolean getDisabled() | setDisabled(boolean disabled) |
| `Visibility` | `String` | Optional | The repository visibility: public, private, or internal. | String getVisibility() | setVisibility(String visibility) |
| `PushedAt` | `LocalDateTime` | Required | - | LocalDateTime getPushedAt() | setPushedAt(LocalDateTime pushedAt) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Permissions` | [`Permissions1`](../../doc/models/permissions-1.md) | Optional | - | Permissions1 getPermissions() | setPermissions(Permissions1 permissions) |
| `AllowRebaseMerge` | `Boolean` | Optional | - | Boolean getAllowRebaseMerge() | setAllowRebaseMerge(Boolean allowRebaseMerge) |
| `TemplateRepository` | `Object` | Optional | - | Object getTemplateRepository() | setTemplateRepository(Object templateRepository) |
| `TempCloneToken` | `String` | Optional | - | String getTempCloneToken() | setTempCloneToken(String tempCloneToken) |
| `AllowSquashMerge` | `Boolean` | Optional | - | Boolean getAllowSquashMerge() | setAllowSquashMerge(Boolean allowSquashMerge) |
| `AllowAutoMerge` | `Boolean` | Optional | - | Boolean getAllowAutoMerge() | setAllowAutoMerge(Boolean allowAutoMerge) |
| `DeleteBranchOnMerge` | `Boolean` | Optional | - | Boolean getDeleteBranchOnMerge() | setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) |
| `AllowMergeCommit` | `Boolean` | Optional | - | Boolean getAllowMergeCommit() | setAllowMergeCommit(Boolean allowMergeCommit) |
| `AllowUpdateBranch` | `Boolean` | Optional | - | Boolean getAllowUpdateBranch() | setAllowUpdateBranch(Boolean allowUpdateBranch) |
| `UseSquashPrTitleAsDefault` | `Boolean` | Optional | - | Boolean getUseSquashPrTitleAsDefault() | setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) |
| `SquashMergeCommitTitle` | [`SquashMergeCommitTitleEnum`](../../doc/models/squash-merge-commit-title-enum.md) | Optional | - | SquashMergeCommitTitleEnum getSquashMergeCommitTitle() | setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) |
| `SquashMergeCommitMessage` | [`SquashMergeCommitMessageEnum`](../../doc/models/squash-merge-commit-message-enum.md) | Optional | - | SquashMergeCommitMessageEnum getSquashMergeCommitMessage() | setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) |
| `MergeCommitTitle` | [`MergeCommitTitle4Enum`](../../doc/models/merge-commit-title-4-enum.md) | Optional | - | MergeCommitTitle4Enum getMergeCommitTitle() | setMergeCommitTitle(MergeCommitTitle4Enum mergeCommitTitle) |
| `MergeCommitMessage` | [`MergeCommitMessageEnum`](../../doc/models/merge-commit-message-enum.md) | Optional | - | MergeCommitMessageEnum getMergeCommitMessage() | setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) |
| `AllowForking` | `Boolean` | Optional | - | Boolean getAllowForking() | setAllowForking(Boolean allowForking) |
| `WebCommitSignoffRequired` | `Boolean` | Optional | - | Boolean getWebCommitSignoffRequired() | setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) |
| `SubscribersCount` | `int` | Required | - | int getSubscribersCount() | setSubscribersCount(int subscribersCount) |
| `NetworkCount` | `int` | Required | - | int getNetworkCount() | setNetworkCount(int networkCount) |
| `License` | `Object` | Required | - | Object getLicense() | setLicense(Object license) |
| `Organization` | `Object` | Optional | - | Object getOrganization() | setOrganization(Object organization) |
| `Parent` | [`Parent6`](../../doc/models/parent-6.md) | Optional | - | Parent6 getParent() | setParent(Parent6 parent) |
| `Source` | [`Source14`](../../doc/models/source-14.md) | Optional | - | Source14 getSource() | setSource(Source14 source) |
| `Forks` | `int` | Required | - | int getForks() | setForks(int forks) |
| `MasterBranch` | `String` | Optional | - | String getMasterBranch() | setMasterBranch(String masterBranch) |
| `OpenIssues` | `int` | Required | - | int getOpenIssues() | setOpenIssues(int openIssues) |
| `Watchers` | `int` | Required | - | int getWatchers() | setWatchers(int watchers) |
| `AnonymousAccessEnabled` | `Boolean` | Optional | Whether anonymous git access is allowed.<br>**Default**: `true` | Boolean getAnonymousAccessEnabled() | setAnonymousAccessEnabled(Boolean anonymousAccessEnabled) |
| `CodeOfConduct` | [`CodeOfConduct2`](../../doc/models/code-of-conduct-2.md) | Optional | - | CodeOfConduct2 getCodeOfConduct() | setCodeOfConduct(CodeOfConduct2 codeOfConduct) |
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
  "git_url": "git:github.com/octocat/Hello-World.git",
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
  "ssh_url": "git@github.com:octocat/Hello-World.git",
  "stargazers_url": "http://api.github.com/repos/octocat/Hello-World/stargazers",
  "statuses_url": "http://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
  "subscribers_url": "http://api.github.com/repos/octocat/Hello-World/subscribers",
  "subscription_url": "http://api.github.com/repos/octocat/Hello-World/subscription",
  "tags_url": "http://api.github.com/repos/octocat/Hello-World/tags",
  "teams_url": "http://api.github.com/repos/octocat/Hello-World/teams",
  "trees_url": "http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
  "clone_url": "https://github.com/octocat/Hello-World.git",
  "mirror_url": "git:git.example.com/octocat/Hello-World",
  "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks",
  "svn_url": "https://svn.github.com/octocat/Hello-World",
  "homepage": "https://github.com",
  "language": null,
  "forks_count": 9,
  "stargazers_count": 80,
  "watchers_count": 80,
  "size": 108,
  "default_branch": "master",
  "open_issues_count": 0,
  "has_issues": true,
  "has_projects": true,
  "has_wiki": true,
  "has_pages": null,
  "has_downloads": true,
  "has_discussions": true,
  "archived": null,
  "disabled": null,
  "pushed_at": "01/26/2011 19:06:43",
  "created_at": "01/26/2011 19:01:12",
  "updated_at": "01/26/2011 19:14:43",
  "subscribers_count": 42,
  "network_count": 0,
  "license": null,
  "forks": null,
  "open_issues": null,
  "watchers": null
}
```

