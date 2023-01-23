
# Deployment Status

The status of a deployment.

## Structure

`DeploymentStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `State` | [`State10Enum`](../../doc/models/state-10-enum.md) | Required | - | State10Enum getState() | setState(State10Enum state) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `Description` | `String` | Required | A short description of the status.<br>**Constraints**: *Maximum Length*: `140` | String getDescription() | setDescription(String description) |
| `Environment` | `String` | Optional | The environment of the deployment that the status is for. | String getEnvironment() | setEnvironment(String environment) |
| `TargetUrl` | `String` | Required | Deprecated: the URL to associate with this status. | String getTargetUrl() | setTargetUrl(String targetUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DeploymentUrl` | `String` | Required | - | String getDeploymentUrl() | setDeploymentUrl(String deploymentUrl) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `EnvironmentUrl` | `String` | Optional | The URL for accessing your environment. | String getEnvironmentUrl() | setEnvironmentUrl(String environmentUrl) |
| `LogUrl` | `String` | Optional | The URL to associate with this status. | String getLogUrl() | setLogUrl(String logUrl) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/example/deployments/42/statuses/1",
  "id": 1,
  "node_id": "MDE2OkRlcGxveW1lbnRTdGF0dXMx",
  "state": null,
  "creator": null,
  "description": "Deployment finished successfully.",
  "target_url": "https://example.com/deployment/42/output",
  "created_at": "07/20/2012 01:19:13",
  "updated_at": "07/20/2012 01:19:13",
  "deployment_url": "https://api.github.com/repos/octocat/example/deployments/42",
  "repository_url": "https://api.github.com/repos/octocat/example"
}
```

