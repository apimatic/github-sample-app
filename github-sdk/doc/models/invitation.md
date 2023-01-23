
# Invitation

The invitation for the user or email if the action is `member_invited`.

## Structure

`Invitation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `FailedAt` | `LocalDateTime` | Required | - | LocalDateTime getFailedAt() | setFailedAt(LocalDateTime failedAt) |
| `FailedReason` | `String` | Required | - | String getFailedReason() | setFailedReason(String failedReason) |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `InvitationTeamsUrl` | `String` | Required | - | String getInvitationTeamsUrl() | setInvitationTeamsUrl(String invitationTeamsUrl) |
| `Inviter` | `Object` | Required | - | Object getInviter() | setInviter(Object inviter) |
| `Login` | `String` | Required | - | String getLogin() | setLogin(String login) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `TeamCount` | `double` | Required | - | double getTeamCount() | setTeamCount(double teamCount) |
| `InvitationSource` | `String` | Optional | - | String getInvitationSource() | setInvitationSource(String invitationSource) |

## Example (as JSON)

```json
{
  "created_at": "2016-03-13T12:52:32.123Z",
  "email": "email6",
  "failed_at": "2016-03-13T12:52:32.123Z",
  "failed_reason": "failed_reason6",
  "id": 60.0,
  "invitation_teams_url": "invitation_teams_url2",
  "inviter": {
    "key1": "val1",
    "key2": "val2"
  },
  "login": "login0",
  "node_id": "node_id2",
  "role": "role6",
  "team_count": 190.68,
  "invitation_source": null
}
```

