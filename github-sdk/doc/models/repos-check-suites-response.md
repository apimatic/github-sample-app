
# Repos Check Suites Response

## Structure

`ReposCheckSuitesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `HeadBranch` | `String` | Required | - | String getHeadBranch() | setHeadBranch(String headBranch) |
| `HeadSha` | `String` | Required | The SHA of the head commit that is being checked. | String getHeadSha() | setHeadSha(String headSha) |
| `Status` | `Object` | Required | - | Object getStatus() | setStatus(Object status) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Before` | `String` | Required | - | String getBefore() | setBefore(String before) |
| `After` | `String` | Required | - | String getAfter() | setAfter(String after) |
| `PullRequests` | [`List<PullRequestMinimal>`](../../doc/models/pull-request-minimal.md) | Required | - | List<PullRequestMinimal> getPullRequests() | setPullRequests(List<PullRequestMinimal> pullRequests) |
| `App` | `Object` | Required | - | Object getApp() | setApp(Object app) |
| `Repository` | [`Repository7`](../../doc/models/repository-7.md) | Required | - | Repository7 getRepository() | setRepository(Repository7 repository) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `HeadCommit` | [`HeadCommit`](../../doc/models/head-commit.md) | Required | - | HeadCommit getHeadCommit() | setHeadCommit(HeadCommit headCommit) |
| `LatestCheckRunsCount` | `int` | Required | - | int getLatestCheckRunsCount() | setLatestCheckRunsCount(int latestCheckRunsCount) |
| `CheckRunsUrl` | `String` | Required | - | String getCheckRunsUrl() | setCheckRunsUrl(String checkRunsUrl) |
| `Rerequestable` | `Boolean` | Optional | - | Boolean getRerequestable() | setRerequestable(Boolean rerequestable) |
| `RunsRerequestable` | `Boolean` | Optional | - | Boolean getRunsRerequestable() | setRunsRerequestable(Boolean runsRerequestable) |

## Example (as JSON)

```json
{
  "id": 5,
  "node_id": "MDEwOkNoZWNrU3VpdGU1",
  "head_branch": "master",
  "head_sha": "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
  "status": null,
  "conclusion": null,
  "url": "https://api.github.com/repos/github/hello-world/check-suites/5",
  "before": "146e867f55c26428e5f9fade55a9bbf5e95a7912",
  "after": "d6fde92930d4715a2b49857d24b940956b26d2d3",
  "pull_requests": null,
  "app": null,
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
  "created_at": null,
  "updated_at": null,
  "head_commit": null,
  "latest_check_runs_count": null,
  "check_runs_url": null
}
```

