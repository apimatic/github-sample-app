
# Orgs Invitations Response

## Structure

`OrgsInvitationsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Login` | `String` | Required | - | String getLogin() | setLogin(String login) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `FailedAt` | `String` | Optional | - | String getFailedAt() | setFailedAt(String failedAt) |
| `FailedReason` | `String` | Optional | - | String getFailedReason() | setFailedReason(String failedReason) |
| `Inviter` | [`Inviter`](../../doc/models/inviter.md) | Required | - | Inviter getInviter() | setInviter(Inviter inviter) |
| `TeamCount` | `int` | Required | - | int getTeamCount() | setTeamCount(int teamCount) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `InvitationTeamsUrl` | `String` | Required | - | String getInvitationTeamsUrl() | setInvitationTeamsUrl(String invitationTeamsUrl) |
| `InvitationSource` | `String` | Optional | - | String getInvitationSource() | setInvitationSource(String invitationSource) |

## Example (as JSON)

```json
{
  "id": null,
  "login": null,
  "email": null,
  "role": null,
  "created_at": null,
  "inviter": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "team_count": null,
  "node_id": "\"MDIyOk9yZ2FuaXphdGlvbkludml0YXRpb24x\"",
  "invitation_teams_url": "\"https://api.github.com/organizations/16/invitations/1/teams\""
}
```

