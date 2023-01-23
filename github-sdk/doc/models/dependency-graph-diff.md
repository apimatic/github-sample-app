
# Dependency Graph Diff

## Structure

`DependencyGraphDiff`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChangeType` | [`ChangeTypeEnum`](../../doc/models/change-type-enum.md) | Required | - | ChangeTypeEnum getChangeType() | setChangeType(ChangeTypeEnum changeType) |
| `Manifest` | `String` | Required | - | String getManifest() | setManifest(String manifest) |
| `Ecosystem` | `String` | Required | - | String getEcosystem() | setEcosystem(String ecosystem) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Version` | `String` | Required | - | String getVersion() | setVersion(String version) |
| `PackageUrl` | `String` | Required | - | String getPackageUrl() | setPackageUrl(String packageUrl) |
| `License` | `String` | Required | - | String getLicense() | setLicense(String license) |
| `SourceRepositoryUrl` | `String` | Required | - | String getSourceRepositoryUrl() | setSourceRepositoryUrl(String sourceRepositoryUrl) |
| `Vulnerabilities` | [`List<Vulnerability>`](../../doc/models/vulnerability.md) | Required | - | List<Vulnerability> getVulnerabilities() | setVulnerabilities(List<Vulnerability> vulnerabilities) |
| `Scope` | [`Scope3Enum`](../../doc/models/scope-3-enum.md) | Required | - | Scope3Enum getScope() | setScope(Scope3Enum scope) |

## Example (as JSON)

```json
{
  "change_type": null,
  "manifest": "path/to/package-lock.json",
  "ecosystem": "npm",
  "name": "@actions/core",
  "version": "1.0.0",
  "package_url": "pkg:/npm/%40actions/core@1.1.0",
  "license": "MIT",
  "source_repository_url": "https://github.com/github/actions",
  "vulnerabilities": {
    "severity": "critical",
    "advisory_ghsa_id": "GHSA-rf4j-j272-fj86",
    "advisory_summary": "A summary of the advisory.",
    "advisory_url": "https://github.com/advisories/GHSA-rf4j-j272-fj86"
  },
  "scope": null
}
```

