
# Status Check Policy

Status Check Policy

## Structure

`StatusCheckPolicy`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Strict` | `boolean` | Required | - | boolean getStrict() | setStrict(boolean strict) |
| `Contexts` | `List<String>` | Required | - | List<String> getContexts() | setContexts(List<String> contexts) |
| `Checks` | [`List<Checks1>`](../../doc/models/checks-1.md) | Required | - | List<Checks1> getChecks() | setChecks(List<Checks1> checks) |
| `ContextsUrl` | `String` | Required | - | String getContextsUrl() | setContextsUrl(String contextsUrl) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_status_checks",
  "strict": true,
  "contexts": [
    "continuous-integration/travis-ci"
  ],
  "checks": null,
  "contexts_url": "https://api.github.com/repos/octocat/Hello-World/branches/master/protection/required_status_checks/contexts"
}
```

