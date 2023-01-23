
# Timeline Line Commented Event

Timeline Line Commented Event

## Structure

`TimelineLineCommentedEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | `String` | Optional | - | String getEvent() | setEvent(String event) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Comments` | [`List<PullRequestReviewComment>`](../../doc/models/pull-request-review-comment.md) | Optional | - | List<PullRequestReviewComment> getComments() | setComments(List<PullRequestReviewComment> comments) |

## Example (as JSON)

```json
{
  "event": null,
  "node_id": null,
  "comments": null
}
```

