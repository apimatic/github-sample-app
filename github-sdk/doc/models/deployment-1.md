
# Deployment 1

A deployment created as the result of an Actions check run from a workflow that references an environment

## Structure

`Deployment1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | Unique identifier of the deployment | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Task` | `String` | Required | Parameter to specify a task to execute | String getTask() | setTask(String task) |
| `OriginalEnvironment` | `String` | Optional | - | String getOriginalEnvironment() | setOriginalEnvironment(String originalEnvironment) |
| `Environment` | `String` | Required | Name for the target deployment environment. | String getEnvironment() | setEnvironment(String environment) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `TransientEnvironment` | `Boolean` | Optional | Specifies if the given environment is will no longer exist at some point in the future. Default: false. | Boolean getTransientEnvironment() | setTransientEnvironment(Boolean transientEnvironment) |
| `ProductionEnvironment` | `Boolean` | Optional | Specifies if the given environment is one that end-users directly interact with. Default: false. | Boolean getProductionEnvironment() | setProductionEnvironment(Boolean productionEnvironment) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/example/deployments/1",
  "id": 42,
  "node_id": "MDEwOkRlcGxveW1lbnQx",
  "task": "deploy",
  "environment": "production",
  "description": "Deploy request from hubot",
  "created_at": "07/20/2012 01:19:13",
  "updated_at": "07/20/2012 01:19:13",
  "statuses_url": "https://api.github.com/repos/octocat/example/deployments/1/statuses",
  "repository_url": "https://api.github.com/repos/octocat/example"
}
```

