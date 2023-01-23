
# Orgs Members Codespaces Codespace Name Stop Response

## Structure

`OrgsMembersCodespacesCodespaceNameStopResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | Automatically generated name of this codespace. | String getName() | setName(String name) |
| `DisplayName` | `String` | Optional | Display name for this codespace. | String getDisplayName() | setDisplayName(String displayName) |
| `EnvironmentId` | `String` | Required | UUID identifying this codespace's environment. | String getEnvironmentId() | setEnvironmentId(String environmentId) |
| `Owner` | [`Owner1`](../../doc/models/owner-1.md) | Required | - | Owner1 getOwner() | setOwner(Owner1 owner) |
| `BillableOwner` | [`BillableOwner`](../../doc/models/billable-owner.md) | Required | - | BillableOwner getBillableOwner() | setBillableOwner(BillableOwner billableOwner) |
| `Repository` | [`Repository7`](../../doc/models/repository-7.md) | Required | - | Repository7 getRepository() | setRepository(Repository7 repository) |
| `Machine` | `Object` | Required | - | Object getMachine() | setMachine(Object machine) |
| `DevcontainerPath` | `String` | Optional | Path to devcontainer.json from repo root used to create Codespace. | String getDevcontainerPath() | setDevcontainerPath(String devcontainerPath) |
| `Prebuild` | `Boolean` | Required | Whether the codespace was created from a prebuild. | Boolean getPrebuild() | setPrebuild(Boolean prebuild) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `LastUsedAt` | `LocalDateTime` | Required | Last known time this codespace was started. | LocalDateTime getLastUsedAt() | setLastUsedAt(LocalDateTime lastUsedAt) |
| `State` | [`State3Enum`](../../doc/models/state-3-enum.md) | Required | - | State3Enum getState() | setState(State3Enum state) |
| `Url` | `String` | Required | API URL for this codespace. | String getUrl() | setUrl(String url) |
| `GitStatus` | [`GitStatus1`](../../doc/models/git-status-1.md) | Required | - | GitStatus1 getGitStatus() | setGitStatus(GitStatus1 gitStatus) |
| `Location` | [`LocationEnum`](../../doc/models/location-enum.md) | Required | - | LocationEnum getLocation() | setLocation(LocationEnum location) |
| `IdleTimeoutMinutes` | `Integer` | Required | The number of minutes of inactivity after which this codespace will be automatically stopped. | Integer getIdleTimeoutMinutes() | setIdleTimeoutMinutes(Integer idleTimeoutMinutes) |
| `WebUrl` | `String` | Required | URL to access this codespace on the web. | String getWebUrl() | setWebUrl(String webUrl) |
| `MachinesUrl` | `String` | Required | API URL to access available alternate machine types for this codespace. | String getMachinesUrl() | setMachinesUrl(String machinesUrl) |
| `StartUrl` | `String` | Required | API URL to start this codespace. | String getStartUrl() | setStartUrl(String startUrl) |
| `StopUrl` | `String` | Required | API URL to stop this codespace. | String getStopUrl() | setStopUrl(String stopUrl) |
| `PublishUrl` | `String` | Optional | API URL to publish this codespace to a new repository. | String getPublishUrl() | setPublishUrl(String publishUrl) |
| `PullsUrl` | `String` | Required | API URL for the Pull Request associated with this codespace, if any. | String getPullsUrl() | setPullsUrl(String pullsUrl) |
| `RecentFolders` | `List<String>` | Required | - | List<String> getRecentFolders() | setRecentFolders(List<String> recentFolders) |
| `RuntimeConstraints` | [`RuntimeConstraints`](../../doc/models/runtime-constraints.md) | Optional | - | RuntimeConstraints getRuntimeConstraints() | setRuntimeConstraints(RuntimeConstraints runtimeConstraints) |
| `PendingOperation` | `Boolean` | Optional | Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily unavailable. The only thing that you can do with a codespace in this state is delete it. | Boolean getPendingOperation() | setPendingOperation(Boolean pendingOperation) |
| `PendingOperationDisabledReason` | `String` | Optional | Text to show user when codespace is disabled by a pending operation | String getPendingOperationDisabledReason() | setPendingOperationDisabledReason(String pendingOperationDisabledReason) |
| `IdleTimeoutNotice` | `String` | Optional | Text to show user when codespace idle timeout minutes has been overriden by an organization policy | String getIdleTimeoutNotice() | setIdleTimeoutNotice(String idleTimeoutNotice) |
| `RetentionPeriodMinutes` | `Integer` | Optional | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). | Integer getRetentionPeriodMinutes() | setRetentionPeriodMinutes(Integer retentionPeriodMinutes) |
| `RetentionExpiresAt` | `LocalDateTime` | Optional | When a codespace will be auto-deleted based on the "retention_period_minutes" and "last_used_at" | LocalDateTime getRetentionExpiresAt() | setRetentionExpiresAt(LocalDateTime retentionExpiresAt) |
| `LastKnownStopNotice` | `String` | Optional | The text to display to a user when a codespace has been stopped for a potentially actionable reason. | String getLastKnownStopNotice() | setLastKnownStopNotice(String lastKnownStopNotice) |

## Example (as JSON)

```json
{
  "id": 1,
  "name": "monalisa-octocat-hello-world-g4wpq6h95q",
  "environment_id": "26a7c758-7299-4a73-b978-5a92a7ae98a0",
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
  "billable_owner": {
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
  "repository": {
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
  },
  "machine": null,
  "prebuild": false,
  "created_at": "01/26/2011 19:01:12",
  "updated_at": "01/26/2011 19:01:12",
  "last_used_at": "01/26/2011 19:01:12",
  "state": null,
  "url": null,
  "git_status": null,
  "location": null,
  "idle_timeout_minutes": 60,
  "web_url": null,
  "machines_url": null,
  "start_url": null,
  "stop_url": null,
  "pulls_url": null,
  "recent_folders": null
}
```

