
# Alert 6

## Structure

`Alert6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AffectedPackageName` | `String` | Required | - | String getAffectedPackageName() | setAffectedPackageName(String affectedPackageName) |
| `AffectedRange` | `String` | Required | - | String getAffectedRange() | setAffectedRange(String affectedRange) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `DismissReason` | `String` | Optional | - | String getDismissReason() | setDismissReason(String dismissReason) |
| `DismissedAt` | `String` | Optional | - | String getDismissedAt() | setDismissedAt(String dismissedAt) |
| `Dismisser` | `Object` | Optional | - | Object getDismisser() | setDismisser(Object dismisser) |
| `ExternalIdentifier` | `String` | Required | - | String getExternalIdentifier() | setExternalIdentifier(String externalIdentifier) |
| `ExternalReference` | `String` | Required | - | String getExternalReference() | setExternalReference(String externalReference) |
| `FixReason` | `String` | Optional | - | String getFixReason() | setFixReason(String fixReason) |
| `FixedAt` | `LocalDateTime` | Optional | - | LocalDateTime getFixedAt() | setFixedAt(LocalDateTime fixedAt) |
| `FixedIn` | `String` | Optional | - | String getFixedIn() | setFixedIn(String fixedIn) |
| `GhsaId` | `String` | Required | - | String getGhsaId() | setGhsaId(String ghsaId) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `Severity` | `String` | Required | - | String getSeverity() | setSeverity(String severity) |
| `State` | [`State161Enum`](../../doc/models/state-161-enum.md) | Required | - | State161Enum getState() | setState(State161Enum state) |

## Example (as JSON)

```json
{
  "affected_package_name": "affected_package_name4",
  "affected_range": "affected_range4",
  "created_at": "created_at2",
  "dismiss_reason": null,
  "dismissed_at": null,
  "dismisser": null,
  "external_identifier": "external_identifier8",
  "external_reference": "external_reference8",
  "fix_reason": null,
  "fixed_at": null,
  "fixed_in": null,
  "ghsa_id": "ghsa_id0",
  "id": 112,
  "node_id": "node_id2",
  "number": 158,
  "severity": "severity0",
  "state": "fixed"
}
```

