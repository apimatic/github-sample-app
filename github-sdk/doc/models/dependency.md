
# Dependency

## Structure

`Dependency`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PackageUrl` | `String` | Optional | Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.<br>**Constraints**: *Pattern*: `^pkg` | String getPackageUrl() | setPackageUrl(String packageUrl) |
| `Metadata` | [`Map<String, DependencyMetadata>`]($m/DependencyMetadata) | Optional | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. | Map<String, DependencyMetadata> getMetadata() | setMetadata(Map<String, DependencyMetadata> metadata) |
| `Relationship` | [`RelationshipEnum`](../../doc/models/relationship-enum.md) | Optional | - | RelationshipEnum getRelationship() | setRelationship(RelationshipEnum relationship) |
| `Scope` | [`Scope4Enum`](../../doc/models/scope-4-enum.md) | Optional | - | Scope4Enum getScope() | setScope(Scope4Enum scope) |
| `Dependencies` | `List<String>` | Optional | Array of package-url (PURLs) of direct child dependencies. | List<String> getDependencies() | setDependencies(List<String> dependencies) |

## Example (as JSON)

```json
{
  "package_url": null,
  "metadata": null,
  "relationship": null,
  "scope": null,
  "dependencies": null
}
```

