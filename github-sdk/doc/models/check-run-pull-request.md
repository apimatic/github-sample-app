
# Check Run Pull Request

## Structure

`CheckRunPullRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Base` | [`Base`](../../doc/models/base.md) | Required | - | Base getBase() | setBase(Base base) |
| `Head` | [`Head`](../../doc/models/head.md) | Required | - | Head getHead() | setHead(Head head) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "base": {
    "ref": "ref6",
    "sha": "sha2",
    "repo": {
      "id": 172,
      "name": "name8",
      "url": "url2"
    }
  },
  "head": {
    "ref": "ref8",
    "sha": "sha4",
    "repo": {
      "id": 138,
      "name": "name6",
      "url": "url0"
    }
  },
  "id": 112,
  "number": 158,
  "url": "url4"
}
```

