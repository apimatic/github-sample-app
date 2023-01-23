
# Gist Comment

A comment made to a gist.

## Structure

`GistComment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Body` | `String` | Required | The comment text.<br>**Constraints**: *Maximum Length*: `65535` | String getBody() | setBody(String body) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |

## Example (as JSON)

```json
{
  "id": 1,
  "node_id": "MDExOkdpc3RDb21tZW50MQ==",
  "url": "https://api.github.com/gists/a6db0bec360bb87e9418/comments/1",
  "body": "Body of the attachment",
  "user": null,
  "created_at": "04/18/2011 23:23:56",
  "updated_at": "04/18/2011 23:23:56",
  "author_association": null
}
```

