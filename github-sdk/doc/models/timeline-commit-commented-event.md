
# Timeline Commit Commented Event

Timeline Commit Commented Event

## Structure

`TimelineCommitCommentedEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | `String` | Optional | - | String getEvent() | setEvent(String event) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `CommitId` | `String` | Optional | - | String getCommitId() | setCommitId(String commitId) |
| `Comments` | [`List<CommitComment>`](../../doc/models/commit-comment.md) | Optional | - | List<CommitComment> getComments() | setComments(List<CommitComment> comments) |

## Example (as JSON)

```json
{
  "event": null,
  "node_id": null,
  "commit_id": null,
  "comments": null
}
```

