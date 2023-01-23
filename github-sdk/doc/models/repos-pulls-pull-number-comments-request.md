
# Repos Pulls Pull Number Comments Request

## Structure

`ReposPullsPullNumberCommentsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `String` | Required | The text of the review comment. | String getBody() | setBody(String body) |
| `CommitId` | `String` | Required | The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`. | String getCommitId() | setCommitId(String commitId) |
| `Path` | `String` | Required | The relative path to the file that necessitates a comment. | String getPath() | setPath(String path) |
| `Position` | `Integer` | Optional | **This parameter is deprecated. Use `line` instead**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note above. | Integer getPosition() | setPosition(Integer position) |
| `Side` | [`Side7Enum`](../../doc/models/side-7-enum.md) | Optional | - | Side7Enum getSide() | setSide(Side7Enum side) |
| `Line` | `int` | Required | The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to. | int getLine() | setLine(int line) |
| `StartLine` | `Integer` | Optional | **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in the GitHub Help documentation. | Integer getStartLine() | setStartLine(Integer startLine) |
| `StartSide` | [`StartSide7Enum`](../../doc/models/start-side-7-enum.md) | Optional | - | StartSide7Enum getStartSide() | setStartSide(StartSide7Enum startSide) |
| `InReplyTo` | `Integer` | Optional | The ID of the review comment to reply to. To find the ID of a review comment with ["List review comments on a pull request"](#list-review-comments-on-a-pull-request). When specified, all parameters other than `body` in the request body are ignored. | Integer getInReplyTo() | setInReplyTo(Integer inReplyTo) |

## Example (as JSON)

```json
{
  "body": "body6",
  "commit_id": "commit_id4",
  "path": "path6",
  "position": null,
  "side": null,
  "line": 200,
  "start_line": null,
  "start_side": null,
  "in_reply_to": null
}
```

