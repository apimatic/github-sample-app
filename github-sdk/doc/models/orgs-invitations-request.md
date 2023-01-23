
# Orgs Invitations Request

## Structure

`OrgsInvitationsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InviteeId` | `Integer` | Optional | **Required unless you provide `email`**. GitHub user ID for the person you are inviting. | Integer getInviteeId() | setInviteeId(Integer inviteeId) |
| `Email` | `String` | Optional | **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user. | String getEmail() | setEmail(String email) |
| `Role` | [`Role2Enum`](../../doc/models/role-2-enum.md) | Optional | - | Role2Enum getRole() | setRole(Role2Enum role) |
| `TeamIds` | `List<Integer>` | Optional | Specify IDs for the teams you want to invite new members to. | List<Integer> getTeamIds() | setTeamIds(List<Integer> teamIds) |

## Example (as JSON)

```json
{
  "invitee_id": null,
  "email": null,
  "role": null,
  "team_ids": null
}
```

