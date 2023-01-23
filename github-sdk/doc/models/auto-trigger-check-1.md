
# Auto Trigger Check 1

## Structure

`AutoTriggerCheck1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AppId` | `int` | Required | The `id` of the GitHub App. | int getAppId() | setAppId(int appId) |
| `Setting` | `boolean` | Required | Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them. | boolean getSetting() | setSetting(boolean setting) |

## Example (as JSON)

```json
{
  "app_id": 26,
  "setting": false
}
```

