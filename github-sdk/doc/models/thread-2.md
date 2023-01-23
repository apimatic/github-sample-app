
# Thread 2

## Structure

`Thread2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Comments` | [`List<PullRequestReviewComment3>`](../../doc/models/pull-request-review-comment-3.md) | Required | - | List<PullRequestReviewComment3> getComments() | setComments(List<PullRequestReviewComment3> comments) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |

## Example (as JSON)

```json
{
  "comments": [
    {
      "_links": {
        "self": {
          "href": "href7"
        },
        "html": {
          "href": "href9"
        },
        "pull_request": {
          "href": "href9"
        }
      },
      "author_association": "MEMBER",
      "body": "body5",
      "commit_id": "commit_id3",
      "created_at": "2016-03-13T12:52:32.123Z",
      "diff_hunk": "diff_hunk7",
      "html_url": "html_url1",
      "id": 203,
      "in_reply_to_id": null,
      "line": 35,
      "node_id": "node_id3",
      "original_commit_id": "original_commit_id9",
      "original_line": 45,
      "original_position": 33,
      "original_start_line": 107,
      "path": "path3",
      "position": 233,
      "pull_request_review_id": 25,
      "pull_request_url": "pull_request_url5",
      "reactions": {
        "url": "url1",
        "total_count": 47,
        "plus1": 75,
        "minus1": 201,
        "laugh": 89,
        "confused": 251,
        "heart": 215,
        "hooray": 1,
        "eyes": 13,
        "rocket": 193
      },
      "side": "RIGHT",
      "start_line": 29,
      "start_side": {
        "key1": "val1",
        "key2": "val2"
      },
      "updated_at": "2016-03-13T12:52:32.123Z",
      "url": "url3",
      "user": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "_links": {
        "self": {
          "href": "href6"
        },
        "html": {
          "href": "href8"
        },
        "pull_request": {
          "href": "href0"
        }
      },
      "author_association": "MANNEQUIN",
      "body": "body6",
      "commit_id": "commit_id4",
      "created_at": "2016-03-13T12:52:32.123Z",
      "diff_hunk": "diff_hunk6",
      "html_url": "html_url0",
      "id": 204,
      "in_reply_to_id": null,
      "line": 36,
      "node_id": "node_id2",
      "original_commit_id": "original_commit_id0",
      "original_line": 46,
      "original_position": 32,
      "original_start_line": 106,
      "path": "path4",
      "position": 234,
      "pull_request_review_id": 24,
      "pull_request_url": "pull_request_url6",
      "reactions": {
        "url": "url2",
        "total_count": 48,
        "plus1": 74,
        "minus1": 202,
        "laugh": 90,
        "confused": 252,
        "heart": 214,
        "hooray": 0,
        "eyes": 14,
        "rocket": 194
      },
      "side": "LEFT",
      "start_line": 30,
      "start_side": {
        "key1": "val1",
        "key2": "val2"
      },
      "updated_at": "2016-03-13T12:52:32.123Z",
      "url": "url4",
      "user": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "node_id": "node_id2"
}
```

