
# Checks 30

## Structure

`Checks30`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Context` | `String` | Required | The name of the required check | String getContext() | setContext(String context) |
| `AppId` | `Integer` | Optional | The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App that has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow any app to set the status. | Integer getAppId() | setAppId(Integer appId) |

## Example (as JSON)

```json
{
  "context": "context2",
  "app_id": null
}
```

