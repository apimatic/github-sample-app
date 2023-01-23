
# Check Suite 4

The [check_suite](https://docs.github.com/rest/reference/checks#suites).

## Structure

`CheckSuite4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `After` | `String` | Required | - | String getAfter() | setAfter(String after) |
| `App` | [`App52`](../../doc/models/app-52.md) | Required | - | App52 getApp() | setApp(App52 app) |
| `Before` | `String` | Required | - | String getBefore() | setBefore(String before) |
| `CheckRunsUrl` | `String` | Required | - | String getCheckRunsUrl() | setCheckRunsUrl(String checkRunsUrl) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `HeadBranch` | `String` | Required | The head branch name the changes are on. | String getHeadBranch() | setHeadBranch(String headBranch) |
| `HeadCommit` | [`SimpleCommit2`](../../doc/models/simple-commit-2.md) | Required | - | SimpleCommit2 getHeadCommit() | setHeadCommit(SimpleCommit2 headCommit) |
| `HeadSha` | `String` | Required | The SHA of the head commit that is being checked. | String getHeadSha() | setHeadSha(String headSha) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `LatestCheckRunsCount` | `int` | Required | - | int getLatestCheckRunsCount() | setLatestCheckRunsCount(int latestCheckRunsCount) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `PullRequests` | [`List<CheckRunPullRequest>`](../../doc/models/check-run-pull-request.md) | Required | An array of pull requests that match this check suite. A pull request matches a check suite if they have the same `head_sha` and `head_branch`. When the check suite's `head_branch` is in a forked repository it will be `null` and the `pull_requests` array will be empty. | List<CheckRunPullRequest> getPullRequests() | setPullRequests(List<CheckRunPullRequest> pullRequests) |
| `Rerequestable` | `Boolean` | Optional | - | Boolean getRerequestable() | setRerequestable(Boolean rerequestable) |
| `RunsRerequestable` | `Boolean` | Optional | - | Boolean getRunsRerequestable() | setRunsRerequestable(Boolean runsRerequestable) |
| `Status` | `Object` | Required | - | Object getStatus() | setStatus(Object status) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | URL that points to the check suite API resource. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "after": "after2",
  "app": {
    "created_at": "2016-03-13T12:52:32.123Z",
    "description": "description2",
    "events": null,
    "external_url": "external_url6",
    "html_url": "html_url2",
    "id": 204,
    "name": "name2",
    "node_id": "node_id0",
    "owner": {
      "key1": "val1",
      "key2": "val2"
    },
    "permissions": null,
    "slug": null,
    "updated_at": "2016-03-13T12:52:32.123Z"
  },
  "before": "before0",
  "check_runs_url": "check_runs_url8",
  "conclusion": {
    "key1": "val1",
    "key2": "val2"
  },
  "created_at": "2016-03-13T12:52:32.123Z",
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
  "head_sha": "head_sha6",
  "id": 112,
  "latest_check_runs_count": 54,
  "node_id": "node_id2",
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
      "id": 157,
      "number": 143,
      "url": "url3"
    }
  ],
  "rerequestable": null,
  "runs_rerequestable": null,
  "status": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4"
}
```

