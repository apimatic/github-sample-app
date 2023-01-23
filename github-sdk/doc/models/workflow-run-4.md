
# Workflow Run 4

## Structure

`WorkflowRun4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Actor` | `Object` | Required | - | Object getActor() | setActor(Object actor) |
| `ArtifactsUrl` | `String` | Required | - | String getArtifactsUrl() | setArtifactsUrl(String artifactsUrl) |
| `CancelUrl` | `String` | Required | - | String getCancelUrl() | setCancelUrl(String cancelUrl) |
| `CheckSuiteId` | `int` | Required | - | int getCheckSuiteId() | setCheckSuiteId(int checkSuiteId) |
| `CheckSuiteNodeId` | `String` | Required | - | String getCheckSuiteNodeId() | setCheckSuiteNodeId(String checkSuiteNodeId) |
| `CheckSuiteUrl` | `String` | Required | - | String getCheckSuiteUrl() | setCheckSuiteUrl(String checkSuiteUrl) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Event` | `String` | Required | - | String getEvent() | setEvent(String event) |
| `HeadBranch` | `String` | Required | - | String getHeadBranch() | setHeadBranch(String headBranch) |
| `HeadCommit` | [`SimpleCommit2`](../../doc/models/simple-commit-2.md) | Required | - | SimpleCommit2 getHeadCommit() | setHeadCommit(SimpleCommit2 headCommit) |
| `HeadRepository` | [`RepositoryLite`](../../doc/models/repository-lite.md) | Required | - | RepositoryLite getHeadRepository() | setHeadRepository(RepositoryLite headRepository) |
| `HeadSha` | `String` | Required | - | String getHeadSha() | setHeadSha(String headSha) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `JobsUrl` | `String` | Required | - | String getJobsUrl() | setJobsUrl(String jobsUrl) |
| `LogsUrl` | `String` | Required | - | String getLogsUrl() | setLogsUrl(String logsUrl) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `PreviousAttemptUrl` | `String` | Required | - | String getPreviousAttemptUrl() | setPreviousAttemptUrl(String previousAttemptUrl) |
| `PullRequests` | [`List<PullRequests28>`](../../doc/models/pull-requests-28.md) | Required | - | List<PullRequests28> getPullRequests() | setPullRequests(List<PullRequests28> pullRequests) |
| `ReferencedWorkflows` | [`List<ReferencedWorkflow1>`](../../doc/models/referenced-workflow-1.md) | Optional | - | List<ReferencedWorkflow1> getReferencedWorkflows() | setReferencedWorkflows(List<ReferencedWorkflow1> referencedWorkflows) |
| `Repository` | [`RepositoryLite`](../../doc/models/repository-lite.md) | Required | - | RepositoryLite getRepository() | setRepository(RepositoryLite repository) |
| `RerunUrl` | `String` | Required | - | String getRerunUrl() | setRerunUrl(String rerunUrl) |
| `RunAttempt` | `int` | Required | - | int getRunAttempt() | setRunAttempt(int runAttempt) |
| `RunNumber` | `int` | Required | - | int getRunNumber() | setRunNumber(int runNumber) |
| `RunStartedAt` | `LocalDateTime` | Required | - | LocalDateTime getRunStartedAt() | setRunStartedAt(LocalDateTime runStartedAt) |
| `Status` | [`Status17Enum`](../../doc/models/status-17-enum.md) | Required | - | Status17Enum getStatus() | setStatus(Status17Enum status) |
| `TriggeringActor` | `Object` | Required | - | Object getTriggeringActor() | setTriggeringActor(Object triggeringActor) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `WorkflowId` | `int` | Required | - | int getWorkflowId() | setWorkflowId(int workflowId) |
| `WorkflowUrl` | `String` | Required | - | String getWorkflowUrl() | setWorkflowUrl(String workflowUrl) |
| `DisplayTitle` | `String` | Required | - | String getDisplayTitle() | setDisplayTitle(String displayTitle) |

## Example (as JSON)

```json
{
  "actor": {
    "key1": "val1",
    "key2": "val2"
  },
  "artifacts_url": "artifacts_url6",
  "cancel_url": "cancel_url8",
  "check_suite_id": 84,
  "check_suite_node_id": "check_suite_node_id6",
  "check_suite_url": "check_suite_url0",
  "conclusion": {
    "key1": "val1",
    "key2": "val2"
  },
  "created_at": "2016-03-13T12:52:32.123Z",
  "event": "event0",
  "head_branch": "head_branch0",
  "head_commit": {
    "author": {
      "date": null,
      "email": "email8",
      "name": "name8",
      "username": null
    },
    "committer": {
      "date": null,
      "email": "email6",
      "name": "name2",
      "username": null
    },
    "id": "id8",
    "message": "message8",
    "timestamp": "timestamp6",
    "tree_id": "tree_id0"
  },
  "head_repository": {
    "archive_url": "archive_url2",
    "assignees_url": "assignees_url0",
    "blobs_url": "blobs_url8",
    "branches_url": "branches_url8",
    "collaborators_url": "collaborators_url2",
    "comments_url": "comments_url8",
    "commits_url": "commits_url8",
    "compare_url": "compare_url4",
    "contents_url": "contents_url4",
    "contributors_url": "contributors_url4",
    "deployments_url": "deployments_url6",
    "description": "description2",
    "downloads_url": "downloads_url0",
    "events_url": "events_url4",
    "fork": false,
    "forks_url": "forks_url8",
    "full_name": "full_name8",
    "git_commits_url": "git_commits_url8",
    "git_refs_url": "git_refs_url2",
    "git_tags_url": "git_tags_url6",
    "hooks_url": "hooks_url8",
    "html_url": "html_url2",
    "id": 126,
    "issue_comment_url": "issue_comment_url6",
    "issue_events_url": "issue_events_url8",
    "issues_url": "issues_url8",
    "keys_url": "keys_url4",
    "labels_url": "labels_url6",
    "languages_url": "languages_url6",
    "merges_url": "merges_url4",
    "milestones_url": "milestones_url0",
    "name": "name2",
    "node_id": "node_id0",
    "notifications_url": "notifications_url8",
    "owner": {
      "key1": "val1",
      "key2": "val2"
    },
    "private": false,
    "pulls_url": "pulls_url8",
    "releases_url": "releases_url6",
    "stargazers_url": "stargazers_url2",
    "statuses_url": "statuses_url4",
    "subscribers_url": "subscribers_url4",
    "subscription_url": "subscription_url8",
    "tags_url": "tags_url0",
    "teams_url": "teams_url4",
    "trees_url": "trees_url2",
    "url": "url6"
  },
  "head_sha": "head_sha6",
  "html_url": "html_url0",
  "id": 112,
  "jobs_url": "jobs_url0",
  "logs_url": "logs_url2",
  "name": "name0",
  "node_id": "node_id2",
  "path": "path6",
  "previous_attempt_url": "previous_attempt_url4",
  "pull_requests": [
    {
      "base": {
        "ref": "ref5",
        "sha": "sha1",
        "repo": {
          "id": 97,
          "name": "name1",
          "url": "url5"
        }
      },
      "head": {
        "ref": "ref1",
        "sha": "sha7",
        "repo": {
          "id": 219,
          "name": "name7",
          "url": "url1"
        }
      },
      "id": 32.29,
      "number": 139.67,
      "url": "url3"
    }
  ],
  "referenced_workflows": null,
  "repository": {
    "archive_url": "archive_url0",
    "assignees_url": "assignees_url2",
    "blobs_url": "blobs_url6",
    "branches_url": "branches_url4",
    "collaborators_url": "collaborators_url0",
    "comments_url": "comments_url4",
    "commits_url": "commits_url6",
    "compare_url": "compare_url8",
    "contents_url": "contents_url2",
    "contributors_url": "contributors_url8",
    "deployments_url": "deployments_url6",
    "description": "description0",
    "downloads_url": "downloads_url8",
    "events_url": "events_url8",
    "fork": false,
    "forks_url": "forks_url4",
    "full_name": "full_name6",
    "git_commits_url": "git_commits_url6",
    "git_refs_url": "git_refs_url0",
    "git_tags_url": "git_tags_url4",
    "hooks_url": "hooks_url4",
    "html_url": "html_url0",
    "id": 10,
    "issue_comment_url": "issue_comment_url4",
    "issue_events_url": "issue_events_url6",
    "issues_url": "issues_url4",
    "keys_url": "keys_url2",
    "labels_url": "labels_url6",
    "languages_url": "languages_url4",
    "merges_url": "merges_url2",
    "milestones_url": "milestones_url2",
    "name": "name0",
    "node_id": "node_id2",
    "notifications_url": "notifications_url6",
    "owner": {
      "key1": "val1",
      "key2": "val2"
    },
    "private": false,
    "pulls_url": "pulls_url6",
    "releases_url": "releases_url6",
    "stargazers_url": "stargazers_url0",
    "statuses_url": "statuses_url2",
    "subscribers_url": "subscribers_url2",
    "subscription_url": "subscription_url4",
    "tags_url": "tags_url8",
    "teams_url": "teams_url2",
    "trees_url": "trees_url0",
    "url": "url4"
  },
  "rerun_url": "rerun_url6",
  "run_attempt": 226,
  "run_number": 144,
  "run_started_at": "2016-03-13T12:52:32.123Z",
  "status": "completed",
  "triggering_actor": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "workflow_id": 8,
  "workflow_url": "workflow_url4",
  "display_title": "display_title0"
}
```

