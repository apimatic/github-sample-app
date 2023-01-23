
# Repos Dependency Graph Snapshots Response

## Structure

`ReposDependencyGraphSnapshotsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | ID of the created snapshot. | int getId() | setId(int id) |
| `CreatedAt` | `String` | Required | The time at which the snapshot was created. | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Result` | `String` | Required | Either "SUCCESS", "ACCEPTED", or "INVALID". "SUCCESS" indicates that the snapshot was successfully created and the repository's dependencies were updated. "ACCEPTED" indicates that the snapshot was successfully created, but the repository's dependencies were not updated. "INVALID" indicates that the snapshot was malformed. | String getResult() | setResult(String result) |
| `Message` | `String` | Required | A message providing further details about the result, such as why the dependencies were not updated. | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "id": 112,
  "created_at": "created_at2",
  "result": "result6",
  "message": "message0"
}
```

