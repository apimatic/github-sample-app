
# Repos Deployments Request

## Structure

`ReposDeploymentsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Required | The ref to deploy. This can be a branch, tag, or SHA. | String getRef() | setRef(String ref) |
| `Task` | `String` | Optional | Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).<br>**Default**: `"deploy"` | String getTask() | setTask(String task) |
| `AutoMerge` | `Boolean` | Optional | Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.<br>**Default**: `true` | Boolean getAutoMerge() | setAutoMerge(Boolean autoMerge) |
| `RequiredContexts` | `List<String>` | Optional | The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts. | List<String> getRequiredContexts() | setRequiredContexts(List<String> requiredContexts) |
| `Payload` | [`ReposDeploymentsRequestPayload`]($m/ReposDeploymentsRequestPayload) | Optional | - | ReposDeploymentsRequestPayload getPayload() | setPayload(ReposDeploymentsRequestPayload payload) |
| `Environment` | `String` | Optional | Name for the target deployment environment (e.g., `production`, `staging`, `qa`).<br>**Default**: `"production"` | String getEnvironment() | setEnvironment(String environment) |
| `Description` | `String` | Optional | Short description of the deployment. | String getDescription() | setDescription(String description) |
| `TransientEnvironment` | `Boolean` | Optional | Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`<br>**Default**: `false` | Boolean getTransientEnvironment() | setTransientEnvironment(Boolean transientEnvironment) |
| `ProductionEnvironment` | `Boolean` | Optional | Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise. | Boolean getProductionEnvironment() | setProductionEnvironment(Boolean productionEnvironment) |

## Example (as JSON)

```json
{
  "ref": "ref0",
  "task": null,
  "auto_merge": null,
  "required_contexts": null,
  "payload": null,
  "environment": null,
  "description": null,
  "transient_environment": null,
  "production_environment": null
}
```

