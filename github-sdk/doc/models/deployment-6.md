
# Deployment 6

## Structure

`Deployment6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | Unique identifier of the deployment | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Ref` | `String` | Required | The ref to deploy. This can be a branch, tag, or sha. | String getRef() | setRef(String ref) |
| `Task` | `String` | Required | Parameter to specify a task to execute | String getTask() | setTask(String task) |
| `Payload` | [`Deployment6Payload`]($m/Deployment6Payload) | Required | - | Deployment6Payload getPayload() | setPayload(Deployment6Payload payload) |
| `OriginalEnvironment` | `String` | Optional | - | String getOriginalEnvironment() | setOriginalEnvironment(String originalEnvironment) |
| `Environment` | `String` | Required | Name for the target deployment environment. | String getEnvironment() | setEnvironment(String environment) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
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
  "sha": "a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d",
  "ref": "topic-branch",
  "task": "deploy",
  "payload": null,
  "environment": "production",
  "description": "Deploy request from hubot",
  "creator": null,
  "created_at": "07/20/2012 01:19:13",
  "updated_at": "07/20/2012 01:19:13",
  "statuses_url": "https://api.github.com/repos/octocat/example/deployments/1/statuses",
  "repository_url": "https://api.github.com/repos/octocat/example"
}
```

