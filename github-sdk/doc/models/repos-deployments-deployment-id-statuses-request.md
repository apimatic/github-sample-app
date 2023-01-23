
# Repos Deployments Deployment Id Statuses Request

## Structure

`ReposDeploymentsDeploymentIdStatusesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`State173Enum`](../../doc/models/state-173-enum.md) | Required | - | State173Enum getState() | setState(State173Enum state) |
| `TargetUrl` | `String` | Optional | The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment. **Note:** It's recommended to use the `log_url` parameter, which replaces `target_url`. | String getTargetUrl() | setTargetUrl(String targetUrl) |
| `LogUrl` | `String` | Optional | The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will automatically set `target_url` to the same value. Default: `""` | String getLogUrl() | setLogUrl(String logUrl) |
| `Description` | `String` | Optional | A short description of the status. The maximum description length is 140 characters. | String getDescription() | setDescription(String description) |
| `Environment` | [`Environment1Enum`](../../doc/models/environment-1-enum.md) | Optional | - | Environment1Enum getEnvironment() | setEnvironment(Environment1Enum environment) |
| `EnvironmentUrl` | `String` | Optional | Sets the URL for accessing your environment. Default: `""` | String getEnvironmentUrl() | setEnvironmentUrl(String environmentUrl) |
| `AutoInactive` | `Boolean` | Optional | Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same repository and `environment` name as the created status's deployment. An `inactive` status is only added to deployments that had a `success` state. Default: `true` | Boolean getAutoInactive() | setAutoInactive(Boolean autoInactive) |

## Example (as JSON)

```json
{
  "state": "inactive",
  "target_url": null,
  "log_url": null,
  "description": null,
  "environment": null,
  "environment_url": null,
  "auto_inactive": null
}
```

