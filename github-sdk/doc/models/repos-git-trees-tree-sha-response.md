
# Repos Git Trees Tree Sha Response

## Structure

`ReposGitTreesTreeShaResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Truncated` | `boolean` | Required | - | boolean getTruncated() | setTruncated(boolean truncated) |
| `Tree` | [`List<Tree3>`](../../doc/models/tree-3.md) | Required | Objects specifying a tree structure | List<Tree3> getTree() | setTree(List<Tree3> tree) |

## Example (as JSON)

```json
{
  "sha": null,
  "url": null,
  "truncated": null,
  "tree": [
    {
      "path": "file.rb",
      "mode": "100644",
      "type": "blob",
      "size": 30,
      "sha": "44b4fc6d56897b048c772eb4087f854f46256132",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/blobs/44b4fc6d56897b048c772eb4087f854f46256132",
      "properties": {
        "path": {
          "type": "string"
        },
        "mode": {
          "type": "string"
        },
        "type": {
          "type": "string"
        },
        "size": {
          "type": "integer"
        },
        "sha": {
          "type": "string"
        },
        "url": {
          "type": "string"
        }
      },
      "required": [
        "path",
        "mode",
        "type",
        "sha",
        "url",
        "size"
      ]
    }
  ]
}
```

