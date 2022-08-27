# MetaModel

Mainly, this configuration will generate a model base on entity with name is `mode_` and constant column name.
If the model have any changes, this build will fail
additionally, it help constant name of column

open cmd
```text
mvn clean install
```

build or run application 1 times, and the model file will generate automatically

Now, we can call it with `Role_.ID` `Role_.NAME` `Role_.APPROVE_DATE` `Role_.TERMINATE_DATE` all columns name






