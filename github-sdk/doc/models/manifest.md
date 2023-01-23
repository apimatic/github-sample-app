
# Manifest

## Structure

`Manifest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the manifest. | String getName() | setName(String name) |
| `File` | [`File`](../../doc/models/file.md) | Optional | - | File getFile() | setFile(File file) |
| `Metadata` | [`Map<String, ManifestMetadata>`]($m/ManifestMetadata) | Optional | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. | Map<String, ManifestMetadata> getMetadata() | setMetadata(Map<String, ManifestMetadata> metadata) |
| `Resolved` | [`Map<String, Dependency>`](../../doc/models/dependency.md) | Optional | A collection of resolved package dependencies. | Map<String, Dependency> getResolved() | setResolved(Map<String, Dependency> resolved) |

## Example (as JSON)

```json
{
  "name": "package-lock.json"
}
```

