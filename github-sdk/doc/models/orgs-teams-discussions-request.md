
# Orgs Teams Discussions Request

## Structure

`OrgsTeamsDiscussionsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Required | The discussion post's title. | String getTitle() | setTitle(String title) |
| `Body` | `String` | Required | The discussion post's body text. | String getBody() | setBody(String body) |
| `Private` | `Boolean` | Optional | Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.<br>**Default**: `false` | Boolean getPrivate() | setPrivate(Boolean mPrivate) |

## Example (as JSON)

```json
{
  "title": "title4",
  "body": "body6",
  "private": null
}
```

