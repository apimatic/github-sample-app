
# Repos Compare Basehead Response

## Structure

`ReposCompareBaseheadResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PermalinkUrl` | `String` | Required | - | String getPermalinkUrl() | setPermalinkUrl(String permalinkUrl) |
| `DiffUrl` | `String` | Required | - | String getDiffUrl() | setDiffUrl(String diffUrl) |
| `PatchUrl` | `String` | Required | - | String getPatchUrl() | setPatchUrl(String patchUrl) |
| `BaseCommit` | [`BaseCommit`](../../doc/models/base-commit.md) | Required | - | BaseCommit getBaseCommit() | setBaseCommit(BaseCommit baseCommit) |
| `MergeBaseCommit` | [`MergeBaseCommit`](../../doc/models/merge-base-commit.md) | Required | - | MergeBaseCommit getMergeBaseCommit() | setMergeBaseCommit(MergeBaseCommit mergeBaseCommit) |
| `Status` | [`Status9Enum`](../../doc/models/status-9-enum.md) | Required | - | Status9Enum getStatus() | setStatus(Status9Enum status) |
| `AheadBy` | `int` | Required | - | int getAheadBy() | setAheadBy(int aheadBy) |
| `BehindBy` | `int` | Required | - | int getBehindBy() | setBehindBy(int behindBy) |
| `TotalCommits` | `int` | Required | - | int getTotalCommits() | setTotalCommits(int totalCommits) |
| `Commits` | [`List<Commit>`](../../doc/models/commit.md) | Required | - | List<Commit> getCommits() | setCommits(List<Commit> commits) |
| `Files` | [`List<DiffEntry>`](../../doc/models/diff-entry.md) | Optional | - | List<DiffEntry> getFiles() | setFiles(List<DiffEntry> files) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/compare/master...topic",
  "html_url": "https://github.com/octocat/Hello-World/compare/master...topic",
  "permalink_url": "https://github.com/octocat/Hello-World/compare/octocat:bbcd538c8e72b8c175046e27cc8f907076331401...octocat:0328041d1152db8ae77652d1618a02e57f745f17",
  "diff_url": "https://github.com/octocat/Hello-World/compare/master...topic.diff",
  "patch_url": "https://github.com/octocat/Hello-World/compare/master...topic.patch",
  "base_commit": {
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
  "merge_base_commit": {
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
  "status": null,
  "ahead_by": 4,
  "behind_by": 5,
  "total_commits": 6,
  "commits": {
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
  }
}
```

