
# Check Run 3

## Structure

`CheckRun3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `App` | `Object` | Required | - | Object getApp() | setApp(Object app) |
| `CheckSuite` | [`CheckSuite1`](../../doc/models/check-suite-1.md) | Required | - | CheckSuite1 getCheckSuite() | setCheckSuite(CheckSuite1 checkSuite) |
| `CompletedAt` | `LocalDateTime` | Required | - | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `Deployment` | [`Deployment22`](../../doc/models/deployment-22.md) | Optional | - | Deployment22 getDeployment() | setDeployment(Deployment22 deployment) |
| `DetailsUrl` | `String` | Required | - | String getDetailsUrl() | setDetailsUrl(String detailsUrl) |
| `ExternalId` | `String` | Required | - | String getExternalId() | setExternalId(String externalId) |
| `HeadSha` | `String` | Required | The SHA of the commit that is being checked. | String getHeadSha() | setHeadSha(String headSha) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | The id of the check. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the check. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Output` | [`Output`](../../doc/models/output.md) | Required | - | Output getOutput() | setOutput(Output output) |
| `PullRequests` | [`List<PullRequestMinimal>`](../../doc/models/pull-request-minimal.md) | Required | - | List<PullRequestMinimal> getPullRequests() | setPullRequests(List<PullRequestMinimal> pullRequests) |
| `StartedAt` | `LocalDateTime` | Required | - | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `Status` | [`Status13Enum`](../../doc/models/status-13-enum.md) | Required | - | Status13Enum getStatus() | setStatus(Status13Enum status) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "app": null,
  "check_suite": null,
  "completed_at": "05/04/2018 01:14:52",
  "conclusion": null,
  "details_url": "https://example.com",
  "external_id": "42",
  "head_sha": "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
  "html_url": "https://github.com/github/hello-world/runs/4",
  "id": 21,
  "name": "test-coverage",
  "node_id": "MDg6Q2hlY2tSdW40",
  "output": null,
  "pull_requests": null,
  "started_at": "05/04/2018 01:14:52",
  "status": null,
  "url": "https://api.github.com/repos/github/hello-world/check-runs/4"
}
```

