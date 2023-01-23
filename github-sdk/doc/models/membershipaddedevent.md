
# Membershipaddedevent

## Structure

`Membershipaddedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"added"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Member` | `Object` | Required | - | Object getMember() | setMember(Object member) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Required | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Scope` | `String` | Required, Constant | The scope of the membership. Currently, can only be `team`.<br>**Default**: `"team"` | String getScope() | setScope(String scope) |
| `Sender` | `Object` | Required | - | Object getSender() | setSender(Object sender) |
| `Team` | [`Team2`](../../doc/models/team-2.md) | Required | - | Team2 getTeam() | setTeam(Team2 team) |

## Example (as JSON)

```json
{
  "action": "added",
  "member": null,
  "organization": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  },
  "scope": "team",
  "sender": null,
  "team": null
}
```

