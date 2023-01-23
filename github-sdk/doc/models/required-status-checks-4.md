
# Required Status Checks 4

## Structure

`RequiredStatusChecks4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `EnforcementLevel` | `String` | Optional | - | String getEnforcementLevel() | setEnforcementLevel(String enforcementLevel) |
| `Contexts` | `List<String>` | Required | - | List<String> getContexts() | setContexts(List<String> contexts) |
| `Checks` | [`List<Checks1>`](../../doc/models/checks-1.md) | Required | - | List<Checks1> getChecks() | setChecks(List<Checks1> checks) |
| `ContextsUrl` | `String` | Optional | - | String getContextsUrl() | setContextsUrl(String contextsUrl) |
| `Strict` | `Boolean` | Optional | - | Boolean getStrict() | setStrict(Boolean strict) |

## Example (as JSON)

```json
{
  "url": null,
  "enforcement_level": null,
  "contexts": [
    "contexts3"
  ],
  "checks": [
    {
      "context": "context2",
      "app_id": 58
    },
    {
      "context": "context3",
      "app_id": 57
    },
    {
      "context": "context4",
      "app_id": 56
    }
  ],
  "contexts_url": null,
  "strict": null
}
```

