
# Deployment Status 1

The [deployment status](https://docs.github.com/rest/reference/deployments#list-deployment-statuses).

## Structure

`DeploymentStatus1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `DeploymentUrl` | `String` | Required | - | String getDeploymentUrl() | setDeploymentUrl(String deploymentUrl) |
| `Description` | `String` | Required | The optional human-readable description added to the status. | String getDescription() | setDescription(String description) |
| `Environment` | `String` | Required | - | String getEnvironment() | setEnvironment(String environment) |
| `EnvironmentUrl` | `String` | Optional | - | String getEnvironmentUrl() | setEnvironmentUrl(String environmentUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `LogUrl` | `String` | Optional | - | String getLogUrl() | setLogUrl(String logUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `State` | `String` | Required | The new state. Can be `pending`, `success`, `failure`, or `error`. | String getState() | setState(String state) |
| `TargetUrl` | `String` | Required | The optional link added to the status. | String getTargetUrl() | setTargetUrl(String targetUrl) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "created_at": "created_at2",
  "creator": {
    "key1": "val1",
    "key2": "val2"
  },
  "deployment_url": "deployment_url4",
  "description": "description0",
  "environment": "environment6",
  "environment_url": null,
  "id": 112,
  "log_url": null,
  "node_id": "node_id2",
  "performed_via_github_app": null,
  "repository_url": "repository_url0",
  "state": "state4",
  "target_url": "target_url2",
  "updated_at": "updated_at4",
  "url": "url4"
}
```

