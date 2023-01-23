
# Simple Installation

The GitHub App installation. This property is included when the event is configured for and sent to a GitHub App.

## Structure

`SimpleInstallation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The ID of the installation. | int getId() | setId(int id) |
| `NodeId` | `String` | Required | The global node ID of the installation. | String getNodeId() | setNodeId(String nodeId) |

## Example (as JSON)

```json
{
  "id": 1,
  "node_id": "MDQ6VXNlcjU4MzIzMQ=="
}
```

