
# Simple Check Suite

A suite of checks performed on the code of a given code change

## Structure

`SimpleCheckSuite`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `After` | `String` | Optional | - | String getAfter() | setAfter(String after) |
| `App` | [`App22`](../../doc/models/app-22.md) | Optional | - | App22 getApp() | setApp(App22 app) |
| `Before` | `String` | Optional | - | String getBefore() | setBefore(String before) |
| `Conclusion` | `Object` | Optional | - | Object getConclusion() | setConclusion(Object conclusion) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `HeadBranch` | `String` | Optional | - | String getHeadBranch() | setHeadBranch(String headBranch) |
| `HeadSha` | `String` | Optional | The SHA of the head commit that is being checked. | String getHeadSha() | setHeadSha(String headSha) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `PullRequests` | [`List<PullRequestMinimal>`](../../doc/models/pull-request-minimal.md) | Optional | - | List<PullRequestMinimal> getPullRequests() | setPullRequests(List<PullRequestMinimal> pullRequests) |
| `Repository` | [`Repository7`](../../doc/models/repository-7.md) | Optional | - | Repository7 getRepository() | setRepository(Repository7 repository) |
| `Status` | [`Status12Enum`](../../doc/models/status-12-enum.md) | Optional | - | Status12Enum getStatus() | setStatus(Status12Enum status) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "after": null,
  "app": null,
  "before": null,
  "conclusion": null,
  "created_at": null,
  "head_branch": null,
  "head_sha": null,
  "id": null,
  "node_id": null,
  "pull_requests": null,
  "repository": null,
  "status": null,
  "updated_at": null,
  "url": null
}
```

