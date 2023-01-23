
# Repos Actions Runs Run Id Attempts Attempt Number Response

## Structure

`ReposActionsRunsRunIdAttemptsAttemptNumberResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The ID of the workflow run. | int getId() | setId(int id) |
| `Name` | `String` | Optional | The name of the workflow run. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `CheckSuiteId` | `Integer` | Optional | The ID of the associated check suite. | Integer getCheckSuiteId() | setCheckSuiteId(Integer checkSuiteId) |
| `CheckSuiteNodeId` | `String` | Optional | The node ID of the associated check suite. | String getCheckSuiteNodeId() | setCheckSuiteNodeId(String checkSuiteNodeId) |
| `HeadBranch` | `String` | Required | - | String getHeadBranch() | setHeadBranch(String headBranch) |
| `HeadSha` | `String` | Required | The SHA of the head commit that points to the version of the workflow being run. | String getHeadSha() | setHeadSha(String headSha) |
| `Path` | `String` | Required | The full path of the workflow | String getPath() | setPath(String path) |
| `RunNumber` | `int` | Required | The auto incrementing run number for the workflow run. | int getRunNumber() | setRunNumber(int runNumber) |
| `RunAttempt` | `Integer` | Optional | Attempt number of the run, 1 for first attempt and higher if the workflow was re-run. | Integer getRunAttempt() | setRunAttempt(Integer runAttempt) |
| `ReferencedWorkflows` | [`List<Referencedworkflow>`](../../doc/models/referencedworkflow.md) | Optional | - | List<Referencedworkflow> getReferencedWorkflows() | setReferencedWorkflows(List<Referencedworkflow> referencedWorkflows) |
| `Event` | `String` | Required | - | String getEvent() | setEvent(String event) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `Conclusion` | `String` | Required | - | String getConclusion() | setConclusion(String conclusion) |
| `WorkflowId` | `int` | Required | The ID of the parent workflow. | int getWorkflowId() | setWorkflowId(int workflowId) |
| `Url` | `String` | Required | The URL to the workflow run. | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PullRequests` | [`List<PullRequestMinimal>`](../../doc/models/pull-request-minimal.md) | Required | - | List<PullRequestMinimal> getPullRequests() | setPullRequests(List<PullRequestMinimal> pullRequests) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Actor` | [`Actor2`](../../doc/models/actor-2.md) | Optional | - | Actor2 getActor() | setActor(Actor2 actor) |
| `TriggeringActor` | [`TriggeringActor`](../../doc/models/triggering-actor.md) | Optional | - | TriggeringActor getTriggeringActor() | setTriggeringActor(TriggeringActor triggeringActor) |
| `RunStartedAt` | `LocalDateTime` | Optional | The start time of the latest run. Resets on re-run. | LocalDateTime getRunStartedAt() | setRunStartedAt(LocalDateTime runStartedAt) |
| `JobsUrl` | `String` | Required | The URL to the jobs for the workflow run. | String getJobsUrl() | setJobsUrl(String jobsUrl) |
| `LogsUrl` | `String` | Required | The URL to download the logs for the workflow run. | String getLogsUrl() | setLogsUrl(String logsUrl) |
| `CheckSuiteUrl` | `String` | Required | The URL to the associated check suite. | String getCheckSuiteUrl() | setCheckSuiteUrl(String checkSuiteUrl) |
| `ArtifactsUrl` | `String` | Required | The URL to the artifacts for the workflow run. | String getArtifactsUrl() | setArtifactsUrl(String artifactsUrl) |
| `CancelUrl` | `String` | Required | The URL to cancel the workflow run. | String getCancelUrl() | setCancelUrl(String cancelUrl) |
| `RerunUrl` | `String` | Required | The URL to rerun the workflow run. | String getRerunUrl() | setRerunUrl(String rerunUrl) |
| `PreviousAttemptUrl` | `String` | Optional | The URL to the previous attempted run of this workflow, if one exists. | String getPreviousAttemptUrl() | setPreviousAttemptUrl(String previousAttemptUrl) |
| `WorkflowUrl` | `String` | Required | The URL to the workflow. | String getWorkflowUrl() | setWorkflowUrl(String workflowUrl) |
| `HeadCommit` | `Object` | Required | - | Object getHeadCommit() | setHeadCommit(Object headCommit) |
| `Repository` | [`Repository7`](../../doc/models/repository-7.md) | Required | - | Repository7 getRepository() | setRepository(Repository7 repository) |
| `HeadRepository` | [`HeadRepository7`](../../doc/models/head-repository-7.md) | Required | - | HeadRepository7 getHeadRepository() | setHeadRepository(HeadRepository7 headRepository) |
| `HeadRepositoryId` | `Integer` | Optional | - | Integer getHeadRepositoryId() | setHeadRepositoryId(Integer headRepositoryId) |
| `DisplayTitle` | `String` | Required | The event-specific title associated with the run or the run-name if set, or the value of `run-name` if it is set in the workflow. | String getDisplayTitle() | setDisplayTitle(String displayTitle) |

## Example (as JSON)

```json
{
  "id": 5,
  "node_id": "MDEwOkNoZWNrU3VpdGU1",
  "head_branch": "master",
  "head_sha": "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
  "path": "octocat/octo-repo/.github/workflows/ci.yml@main",
  "run_number": 106,
  "event": "push",
  "status": "completed",
  "conclusion": "neutral",
  "workflow_id": 5,
  "url": "https://api.github.com/repos/github/hello-world/actions/runs/5",
  "html_url": "https://github.com/github/hello-world/suites/4",
  "pull_requests": null,
  "created_at": null,
  "updated_at": null,
  "jobs_url": "https://api.github.com/repos/github/hello-world/actions/runs/5/jobs",
  "logs_url": "https://api.github.com/repos/github/hello-world/actions/runs/5/logs",
  "check_suite_url": "https://api.github.com/repos/github/hello-world/check-suites/12",
  "artifacts_url": "https://api.github.com/repos/github/hello-world/actions/runs/5/rerun/artifacts",
  "cancel_url": "https://api.github.com/repos/github/hello-world/actions/runs/5/cancel",
  "rerun_url": "https://api.github.com/repos/github/hello-world/actions/runs/5/rerun",
  "workflow_url": "https://api.github.com/repos/github/hello-world/actions/workflows/main.yaml",
  "head_commit": null,
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
  "head_repository": {
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
  "display_title": "Simple Workflow"
}
```

