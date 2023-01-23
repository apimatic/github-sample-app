
# Repos Branches Branch Rename Response

## Structure

`ReposBranchesBranchRenameResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Commit` | [`Commit32`](../../doc/models/commit-32.md) | Required | - | Commit32 getCommit() | setCommit(Commit32 commit) |
| `Links` | [`Links1`](../../doc/models/links-1.md) | Required | - | Links1 getLinks() | setLinks(Links1 links) |
| `Protected` | `boolean` | Required | - | boolean getProtected() | setProtected(boolean mProtected) |
| `Protection` | [`Protection`](../../doc/models/protection.md) | Required | - | Protection getProtection() | setProtection(Protection protection) |
| `ProtectionUrl` | `String` | Required | - | String getProtectionUrl() | setProtectionUrl(String protectionUrl) |
| `Pattern` | `String` | Optional | - | String getPattern() | setPattern(String pattern) |
| `RequiredApprovingReviewCount` | `Integer` | Optional | - | Integer getRequiredApprovingReviewCount() | setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) |

## Example (as JSON)

```json
{
  "name": null,
  "commit": {
    "url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "sha": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "node_id": "MDY6Q29tbWl0NmRjYjA5YjViNTc4NzVmMzM0ZjYxYWViZWQ2OTVlMmU0MTkzZGI1ZQ==",
    "html_url": "https://github.com/octocat/Hello-World/commit/6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e/comments",
    "commit": {
      "url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
      "author": null,
      "committer": null,
      "message": "Fix all the bugs",
      "comment_count": 0,
      "tree": null
    },
    "author": null,
    "committer": null,
    "parents": {
      "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
      "url": "https://api.github.com/repos/octocat/Hello-World/commits/7638417db6d59f3c431d3e1f261cc637155684cd"
    }
  },
  "_links": null,
  "protected": null,
  "protection": null,
  "protection_url": null
}
```

