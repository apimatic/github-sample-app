
# Repos Statuses Sha Request

## Structure

`ReposStatusesShaRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`State182Enum`](../../doc/models/state-182-enum.md) | Required | - | State182Enum getState() | setState(State182Enum state) |
| `TargetUrl` | `String` | Optional | The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.  <br>For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:  <br>`http://ci.example.com/user/repo/build/sha` | String getTargetUrl() | setTargetUrl(String targetUrl) |
| `Description` | `String` | Optional | A short description of the status. | String getDescription() | setDescription(String description) |
| `Context` | `String` | Optional | A string label to differentiate this status from the status of other systems. This field is case-insensitive.<br>**Default**: `"default"` | String getContext() | setContext(String context) |

## Example (as JSON)

```json
{
  "state": "error",
  "target_url": null,
  "description": null,
  "context": null
}
```

