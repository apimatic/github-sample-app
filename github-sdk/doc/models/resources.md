
# Resources

## Structure

`Resources`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Core` | [`RateLimit`](../../doc/models/rate-limit.md) | Required | - | RateLimit getCore() | setCore(RateLimit core) |
| `Graphql` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getGraphql() | setGraphql(RateLimit graphql) |
| `Search` | [`RateLimit`](../../doc/models/rate-limit.md) | Required | - | RateLimit getSearch() | setSearch(RateLimit search) |
| `SourceImport` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getSourceImport() | setSourceImport(RateLimit sourceImport) |
| `IntegrationManifest` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getIntegrationManifest() | setIntegrationManifest(RateLimit integrationManifest) |
| `CodeScanningUpload` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getCodeScanningUpload() | setCodeScanningUpload(RateLimit codeScanningUpload) |
| `ActionsRunnerRegistration` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getActionsRunnerRegistration() | setActionsRunnerRegistration(RateLimit actionsRunnerRegistration) |
| `Scim` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getScim() | setScim(RateLimit scim) |
| `DependencySnapshots` | [`RateLimit`](../../doc/models/rate-limit.md) | Optional | - | RateLimit getDependencySnapshots() | setDependencySnapshots(RateLimit dependencySnapshots) |

## Example (as JSON)

```json
{
  "core": {
    "limit": 94,
    "remaining": 154,
    "reset": 90,
    "used": 130
  },
  "graphql": null,
  "search": {
    "limit": 184,
    "remaining": 64,
    "reset": 0,
    "used": 40
  },
  "source_import": null,
  "integration_manifest": null,
  "code_scanning_upload": null,
  "actions_runner_registration": null,
  "scim": null,
  "dependency_snapshots": null
}
```

