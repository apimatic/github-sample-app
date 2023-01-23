
# Simple Repository

A GitHub repository.

## Structure

`SimpleRepository`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | A unique identifier of the repository. | int getId() | setId(int id) |
| `NodeId` | `String` | Required | The GraphQL identifier of the repository. | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | The name of the repository. | String getName() | setName(String name) |
| `FullName` | `String` | Required | The full, globally unique, name of the repository. | String getFullName() | setFullName(String fullName) |
| `Owner` | [`Owner1`](../../doc/models/owner-1.md) | Required | - | Owner1 getOwner() | setOwner(Owner1 owner) |
| `Private` | `boolean` | Required | Whether the repository is private. | boolean getPrivate() | setPrivate(boolean mPrivate) |
| `HtmlUrl` | `String` | Required | The URL to view the repository on GitHub.com. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Description` | `String` | Required | The repository description. | String getDescription() | setDescription(String description) |
| `Fork` | `boolean` | Required | Whether the repository is a fork. | boolean getFork() | setFork(boolean fork) |
| `Url` | `String` | Required | The URL to get more information about the repository from the GitHub API. | String getUrl() | setUrl(String url) |
| `ArchiveUrl` | `String` | Required | A template for the API URL to download the repository as an archive. | String getArchiveUrl() | setArchiveUrl(String archiveUrl) |
| `AssigneesUrl` | `String` | Required | A template for the API URL to list the available assignees for issues in the repository. | String getAssigneesUrl() | setAssigneesUrl(String assigneesUrl) |
| `BlobsUrl` | `String` | Required | A template for the API URL to create or retrieve a raw Git blob in the repository. | String getBlobsUrl() | setBlobsUrl(String blobsUrl) |
| `BranchesUrl` | `String` | Required | A template for the API URL to get information about branches in the repository. | String getBranchesUrl() | setBranchesUrl(String branchesUrl) |
| `CollaboratorsUrl` | `String` | Required | A template for the API URL to get information about collaborators of the repository. | String getCollaboratorsUrl() | setCollaboratorsUrl(String collaboratorsUrl) |
| `CommentsUrl` | `String` | Required | A template for the API URL to get information about comments on the repository. | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `CommitsUrl` | `String` | Required | A template for the API URL to get information about commits on the repository. | String getCommitsUrl() | setCommitsUrl(String commitsUrl) |
| `CompareUrl` | `String` | Required | A template for the API URL to compare two commits or refs. | String getCompareUrl() | setCompareUrl(String compareUrl) |
| `ContentsUrl` | `String` | Required | A template for the API URL to get the contents of the repository. | String getContentsUrl() | setContentsUrl(String contentsUrl) |
| `ContributorsUrl` | `String` | Required | A template for the API URL to list the contributors to the repository. | String getContributorsUrl() | setContributorsUrl(String contributorsUrl) |
| `DeploymentsUrl` | `String` | Required | The API URL to list the deployments of the repository. | String getDeploymentsUrl() | setDeploymentsUrl(String deploymentsUrl) |
| `DownloadsUrl` | `String` | Required | The API URL to list the downloads on the repository. | String getDownloadsUrl() | setDownloadsUrl(String downloadsUrl) |
| `EventsUrl` | `String` | Required | The API URL to list the events of the repository. | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `ForksUrl` | `String` | Required | The API URL to list the forks of the repository. | String getForksUrl() | setForksUrl(String forksUrl) |
| `GitCommitsUrl` | `String` | Required | A template for the API URL to get information about Git commits of the repository. | String getGitCommitsUrl() | setGitCommitsUrl(String gitCommitsUrl) |
| `GitRefsUrl` | `String` | Required | A template for the API URL to get information about Git refs of the repository. | String getGitRefsUrl() | setGitRefsUrl(String gitRefsUrl) |
| `GitTagsUrl` | `String` | Required | A template for the API URL to get information about Git tags of the repository. | String getGitTagsUrl() | setGitTagsUrl(String gitTagsUrl) |
| `IssueCommentUrl` | `String` | Required | A template for the API URL to get information about issue comments on the repository. | String getIssueCommentUrl() | setIssueCommentUrl(String issueCommentUrl) |
| `IssueEventsUrl` | `String` | Required | A template for the API URL to get information about issue events on the repository. | String getIssueEventsUrl() | setIssueEventsUrl(String issueEventsUrl) |
| `IssuesUrl` | `String` | Required | A template for the API URL to get information about issues on the repository. | String getIssuesUrl() | setIssuesUrl(String issuesUrl) |
| `KeysUrl` | `String` | Required | A template for the API URL to get information about deploy keys on the repository. | String getKeysUrl() | setKeysUrl(String keysUrl) |
| `LabelsUrl` | `String` | Required | A template for the API URL to get information about labels of the repository. | String getLabelsUrl() | setLabelsUrl(String labelsUrl) |
| `LanguagesUrl` | `String` | Required | The API URL to get information about the languages of the repository. | String getLanguagesUrl() | setLanguagesUrl(String languagesUrl) |
| `MergesUrl` | `String` | Required | The API URL to merge branches in the repository. | String getMergesUrl() | setMergesUrl(String mergesUrl) |
| `MilestonesUrl` | `String` | Required | A template for the API URL to get information about milestones of the repository. | String getMilestonesUrl() | setMilestonesUrl(String milestonesUrl) |
| `NotificationsUrl` | `String` | Required | A template for the API URL to get information about notifications on the repository. | String getNotificationsUrl() | setNotificationsUrl(String notificationsUrl) |
| `PullsUrl` | `String` | Required | A template for the API URL to get information about pull requests on the repository. | String getPullsUrl() | setPullsUrl(String pullsUrl) |
| `ReleasesUrl` | `String` | Required | A template for the API URL to get information about releases on the repository. | String getReleasesUrl() | setReleasesUrl(String releasesUrl) |
| `StargazersUrl` | `String` | Required | The API URL to list the stargazers on the repository. | String getStargazersUrl() | setStargazersUrl(String stargazersUrl) |
| `StatusesUrl` | `String` | Required | A template for the API URL to get information about statuses of a commit. | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `SubscribersUrl` | `String` | Required | The API URL to list the subscribers on the repository. | String getSubscribersUrl() | setSubscribersUrl(String subscribersUrl) |
| `SubscriptionUrl` | `String` | Required | The API URL to subscribe to notifications for this repository. | String getSubscriptionUrl() | setSubscriptionUrl(String subscriptionUrl) |
| `TagsUrl` | `String` | Required | The API URL to get information about tags on the repository. | String getTagsUrl() | setTagsUrl(String tagsUrl) |
| `TeamsUrl` | `String` | Required | The API URL to list the teams on the repository. | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |
| `TreesUrl` | `String` | Required | A template for the API URL to create or retrieve a raw Git tree of the repository. | String getTreesUrl() | setTreesUrl(String treesUrl) |
| `HooksUrl` | `String` | Required | The API URL to list the hooks on the repository. | String getHooksUrl() | setHooksUrl(String hooksUrl) |

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
  "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
  "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
  "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
  "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
  "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
  "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
  "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
  "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
  "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
  "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
  "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
  "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
  "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
  "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
  "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
  "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
  "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
  "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
  "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
  "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
  "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
  "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
  "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
  "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
  "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
  "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
  "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
  "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
  "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
  "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
  "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
  "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
  "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
  "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks"
}
```

