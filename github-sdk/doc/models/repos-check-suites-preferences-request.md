
# Repos Check Suites Preferences Request

## Structure

`ReposCheckSuitesPreferencesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AutoTriggerChecks` | [`List<AutoTriggerCheck1>`](../../doc/models/auto-trigger-check-1.md) | Optional | Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. | List<AutoTriggerCheck1> getAutoTriggerChecks() | setAutoTriggerChecks(List<AutoTriggerCheck1> autoTriggerChecks) |

## Example (as JSON)

```json
{
  "auto_trigger_checks": null
}
```

