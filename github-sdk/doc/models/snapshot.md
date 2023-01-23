
# Snapshot

Create a new snapshot of a repository's dependencies.

## Structure

`Snapshot`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Version` | `int` | Required | The version of the repository snapshot submission. | int getVersion() | setVersion(int version) |
| `Job` | [`Job1`](../../doc/models/job-1.md) | Required | - | Job1 getJob() | setJob(Job1 job) |
| `Sha` | `String` | Required | The commit SHA associated with this dependency snapshot. Maximum length: 40 characters.<br>**Constraints**: *Minimum Length*: `40`, *Maximum Length*: `40` | String getSha() | setSha(String sha) |
| `Ref` | `String` | Required | The repository branch that triggered this snapshot.<br>**Constraints**: *Pattern*: `^refs/` | String getRef() | setRef(String ref) |
| `Detector` | [`Detector2`](../../doc/models/detector-2.md) | Required | - | Detector2 getDetector() | setDetector(Detector2 detector) |
| `Metadata` | [`Map<String, SnapshotMetadata>`]($m/SnapshotMetadata) | Optional | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. | Map<String, SnapshotMetadata> getMetadata() | setMetadata(Map<String, SnapshotMetadata> metadata) |
| `Manifests` | [`Map<String, Manifest>`](../../doc/models/manifest.md) | Optional | A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies. | Map<String, Manifest> getManifests() | setManifests(Map<String, Manifest> manifests) |
| `Scanned` | `LocalDateTime` | Required | The time at which the snapshot was scanned. | LocalDateTime getScanned() | setScanned(LocalDateTime scanned) |

## Example (as JSON)

```json
{
  "version": null,
  "job": {
    "id": "5622a2b0-63f6-4732-8c34-a1ab27e102a11",
    "correlator": "yourworkflowname_yourjobname"
  },
  "sha": "ddc951f4b1293222421f2c8df679786153acf689",
  "ref": "refs/heads/main",
  "detector": {
    "name": "docker buildtime detector",
    "version": "1.0.0",
    "url": "http://example.com/docker-buildtimer-detector"
  },
  "scanned": "06/14/2020 00:52:50"
}
```

