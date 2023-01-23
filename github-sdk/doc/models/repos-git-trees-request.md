
# Repos Git Trees Request

## Structure

`ReposGitTreesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Tree` | [`List<Tree7>`](../../doc/models/tree-7.md) | Required | Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure. | List<Tree7> getTree() | setTree(List<Tree7> tree) |
| `BaseTree` | `String` | Optional | The SHA1 of an existing Git tree object which will be used as the base for the new tree. If provided, a new Git tree object will be created from entries in the Git tree object pointed to by `base_tree` and entries defined in the `tree` parameter. Entries defined in the `tree` parameter will overwrite items from `base_tree` with the same `path`. If you're creating new changes on a branch, then normally you'd set `base_tree` to the SHA1 of the Git tree object of the current latest commit on the branch you're working on.<br>If not provided, GitHub will create a new Git tree object from only the entries defined in the `tree` parameter. If you create a new commit pointing to such a tree, then all files which were a part of the parent commit's tree and were not defined in the `tree` parameter will be listed as deleted by the new commit. | String getBaseTree() | setBaseTree(String baseTree) |

## Example (as JSON)

```json
{
  "tree": [
    {
      "path": null,
      "mode": null,
      "type": null,
      "sha": null,
      "content": null
    }
  ],
  "base_tree": null
}
```

