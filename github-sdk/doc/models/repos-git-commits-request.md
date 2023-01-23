
# Repos Git Commits Request

## Structure

`ReposGitCommitsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | The commit message | String getMessage() | setMessage(String message) |
| `Tree` | `String` | Required | The SHA of the tree object this commit points to | String getTree() | setTree(String tree) |
| `Parents` | `List<String>` | Optional | The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided. | List<String> getParents() | setParents(List<String> parents) |
| `Author` | [`Author18`](../../doc/models/author-18.md) | Optional | - | Author18 getAuthor() | setAuthor(Author18 author) |
| `Committer` | [`Committer10`](../../doc/models/committer-10.md) | Optional | - | Committer10 getCommitter() | setCommitter(Committer10 committer) |
| `Signature` | `String` | Optional | The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits. | String getSignature() | setSignature(String signature) |

## Example (as JSON)

```json
{
  "message": "message0",
  "tree": "tree8",
  "parents": null,
  "author": null,
  "committer": null,
  "signature": null
}
```

