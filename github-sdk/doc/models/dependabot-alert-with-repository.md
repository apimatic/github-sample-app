
# Dependabot Alert With Repository

A Dependabot alert.

## Structure

`DependabotAlertWithRepository`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `int` | Required | The security alert number. | int getNumber() | setNumber(int number) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Required | - | StateEnum getState() | setState(StateEnum state) |
| `Dependency` | [`Dependency3`](../../doc/models/dependency-3.md) | Required | - | Dependency3 getDependency() | setDependency(Dependency3 dependency) |
| `SecurityAdvisory` | [`SecurityAdvisory1`](../../doc/models/security-advisory-1.md) | Required | - | SecurityAdvisory1 getSecurityAdvisory() | setSecurityAdvisory(SecurityAdvisory1 securityAdvisory) |
| `SecurityVulnerability` | [`SecurityVulnerability`](../../doc/models/security-vulnerability.md) | Required | - | SecurityVulnerability getSecurityVulnerability() | setSecurityVulnerability(SecurityVulnerability securityVulnerability) |
| `Url` | `String` | Required | The REST API URL of the alert resource. | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DismissedAt` | `LocalDateTime` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDismissedAt() | setDismissedAt(LocalDateTime dismissedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedReason` | `Object` | Required | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `DismissedComment` | `String` | Required | An optional comment associated with the alert's dismissal.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |
| `FixedAt` | `LocalDateTime` | Required | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getFixedAt() | setFixedAt(LocalDateTime fixedAt) |
| `Repository` | [`Repository1`](../../doc/models/repository-1.md) | Required | - | Repository1 getRepository() | setRepository(Repository1 repository) |

## Example (as JSON)

```json
{
  "number": null,
  "state": null,
  "dependency": null,
  "security_advisory": null,
  "security_vulnerability": null,
  "url": null,
  "html_url": null,
  "created_at": null,
  "updated_at": null,
  "dismissed_at": null,
  "dismissed_by": null,
  "dismissed_reason": null,
  "dismissed_comment": null,
  "fixed_at": null,
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

