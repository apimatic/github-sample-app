
# Deployment 4

## Structure

`Deployment4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Environment` | `String` | Required | - | String getEnvironment() | setEnvironment(String environment) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `OriginalEnvironment` | `String` | Required | - | String getOriginalEnvironment() | setOriginalEnvironment(String originalEnvironment) |
| `Payload` | [`Deployment4Payload`]($m/Deployment4Payload) | Required | - | Deployment4Payload getPayload() | setPayload(Deployment4Payload payload) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `ProductionEnvironment` | `Boolean` | Optional | - | Boolean getProductionEnvironment() | setProductionEnvironment(Boolean productionEnvironment) |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `Task` | `String` | Required | - | String getTask() | setTask(String task) |
| `TransientEnvironment` | `Boolean` | Optional | - | Boolean getTransientEnvironment() | setTransientEnvironment(Boolean transientEnvironment) |
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
  "description": "description0",
  "environment": "environment6",
  "id": 112,
  "node_id": "node_id2",
  "original_environment": "original_environment4",
  "payload": {
    "key0": {
      "key1": "val1",
      "key2": "val2"
    },
    "key1": {
      "key1": "val1",
      "key2": "val2"
    },
    "key2": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "performed_via_github_app": null,
  "production_environment": null,
  "ref": "ref0",
  "repository_url": "repository_url0",
  "sha": "sha6",
  "statuses_url": "statuses_url2",
  "task": "task4",
  "transient_environment": null,
  "updated_at": "updated_at4",
  "url": "url4"
}
```

