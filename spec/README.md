# Fixes in the original spec:

- GitHub SDK needed the bearer authorization for its endpoint. Hence added the following bearer security scheme:
```json
"securitySchemes": {
    "httpBearer": {
      "type": "http",
      "scheme": "bearer"
    }
}
```

- All the fields with unsupported names, such as -1 and +1, have been renamed:
   - `-1` to `minus1`
   - `+1` to `plus1`

