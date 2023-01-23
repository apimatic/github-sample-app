
# Repos Check Runs Check Run Id Response

## Structure

`ReposCheckRunsCheckRunIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The id of the check. | int getId() | setId(int id) |
| `HeadSha` | `String` | Required | The SHA of the commit that is being checked. | String getHeadSha() | setHeadSha(String headSha) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `ExternalId` | `String` | Required | - | String getExternalId() | setExternalId(String externalId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `DetailsUrl` | `String` | Required | - | String getDetailsUrl() | setDetailsUrl(String detailsUrl) |
| `Status` | [`Status6Enum`](../../doc/models/status-6-enum.md) | Required | - | Status6Enum getStatus() | setStatus(Status6Enum status) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `StartedAt` | `LocalDateTime` | Required | - | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `CompletedAt` | `LocalDateTime` | Required | - | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Output` | [`Output`](../../doc/models/output.md) | Required | - | Output getOutput() | setOutput(Output output) |
| `Name` | `String` | Required | The name of the check. | String getName() | setName(String name) |
| `CheckSuite` | `Object` | Required | - | Object getCheckSuite() | setCheckSuite(Object checkSuite) |
| `App` | `Object` | Required | - | Object getApp() | setApp(Object app) |
| `PullRequests` | [`List<PullRequestMinimal>`](../../doc/models/pull-request-minimal.md) | Required | - | List<PullRequestMinimal> getPullRequests() | setPullRequests(List<PullRequestMinimal> pullRequests) |
| `Deployment` | [`Deployment22`](../../doc/models/deployment-22.md) | Optional | - | Deployment22 getDeployment() | setDeployment(Deployment22 deployment) |

## Example (as JSON)

```json
{
  "id": 21,
  "head_sha": "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
  "node_id": "MDg6Q2hlY2tSdW40",
  "external_id": "42",
  "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
  "html_url": "https://github.com/github/hello-world/runs/4",
  "details_url": "https://example.com",
  "status": null,
  "conclusion": null,
  "started_at": "05/04/2018 01:14:52",
  "completed_at": "05/04/2018 01:14:52",
  "output": null,
  "name": "test-coverage",
  "check_suite": null,
  "app": null,
  "pull_requests": null
}
```

