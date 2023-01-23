
# Code Scanning Organization Alert Items

## Structure

`CodeScanningOrganizationAlertItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `int` | Required | The security alert number. | int getNumber() | setNumber(int number) |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | The REST API URL of the alert resource. | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `InstancesUrl` | `String` | Required | The REST API URL for fetching the list of instances for an alert. | String getInstancesUrl() | setInstancesUrl(String instancesUrl) |
| `State` | [`CodeScanningAlertStateEnum`](../../doc/models/code-scanning-alert-state-enum.md) | Required | - | CodeScanningAlertStateEnum getState() | setState(CodeScanningAlertStateEnum state) |
| `FixedAt` | `LocalDateTime` | Optional | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getFixedAt() | setFixedAt(LocalDateTime fixedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedAt` | `LocalDateTime` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDismissedAt() | setDismissedAt(LocalDateTime dismissedAt) |
| `DismissedReason` | `Object` | Required | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `DismissedComment` | `String` | Optional | The dismissal comment associated with the dismissal of the alert.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |
| `Rule` | [`CodeScanningAlertRule`](../../doc/models/code-scanning-alert-rule.md) | Required | - | CodeScanningAlertRule getRule() | setRule(CodeScanningAlertRule rule) |
| `Tool` | [`CodeScanningAnalysisTool`](../../doc/models/code-scanning-analysis-tool.md) | Required | - | CodeScanningAnalysisTool getTool() | setTool(CodeScanningAnalysisTool tool) |
| `MostRecentInstance` | [`CodeScanningAlertInstance`](../../doc/models/code-scanning-alert-instance.md) | Required | - | CodeScanningAlertInstance getMostRecentInstance() | setMostRecentInstance(CodeScanningAlertInstance mostRecentInstance) |
| `Repository` | [`Repository1`](../../doc/models/repository-1.md) | Required | - | Repository1 getRepository() | setRepository(Repository1 repository) |

## Example (as JSON)

```json
{
  "number": null,
  "created_at": null,
  "url": null,
  "html_url": null,
  "instances_url": null,
  "state": null,
  "dismissed_by": null,
  "dismissed_at": null,
  "dismissed_reason": null,
  "rule": null,
  "tool": null,
  "most_recent_instance": null,
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
}
```

