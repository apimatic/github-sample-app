
# Tag

Tag

## Structure

`Tag`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Commit` | [`Commit3`](../../doc/models/commit-3.md) | Required | - | Commit3 getCommit() | setCommit(Commit3 commit) |
| `ZipballUrl` | `String` | Required | - | String getZipballUrl() | setZipballUrl(String zipballUrl) |
| `TarballUrl` | `String` | Required | - | String getTarballUrl() | setTarballUrl(String tarballUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |

## Example (as JSON)

```json
{
  "name": "v0.1",
  "commit": null,
  "zipball_url": "https://github.com/octocat/Hello-World/zipball/v0.1",
  "tarball_url": "https://github.com/octocat/Hello-World/tarball/v0.1",
  "node_id": null
}
```

