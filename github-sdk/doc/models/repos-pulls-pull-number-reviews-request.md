
# Repos Pulls Pull Number Reviews Request

## Structure

`ReposPullsPullNumberReviewsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommitId` | `String` | Optional | The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value. | String getCommitId() | setCommitId(String commitId) |
| `Body` | `String` | Optional | **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review. | String getBody() | setBody(String body) |
| `Event` | [`Event29Enum`](../../doc/models/event-29-enum.md) | Optional | - | Event29Enum getEvent() | setEvent(Event29Enum event) |
| `Comments` | [`List<Comment4>`](../../doc/models/comment-4.md) | Optional | Use the following table to specify the location, destination, and contents of the draft review comment. | List<Comment4> getComments() | setComments(List<Comment4> comments) |

## Example (as JSON)

```json
{
  "commit_id": null,
  "body": null,
  "event": null,
  "comments": null
}
```

