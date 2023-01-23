
# Event 31 Enum

The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.

## Enumeration

`Event31Enum`

## Fields

| Name |
|  --- |
| `APPROVE` |
| `REQUESTCHANGES` |
| `COMMENT` |

