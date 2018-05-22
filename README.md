# choerodon-zipkin-collector

Zipkin Call chain collector.
Read the Zipkin call information from the Kafka, store the call information in the Elasticsearch, and facilitate the Zipkin front-end display.

## Feature

Track the zipkin version for iteration.
## Requirements

 - The application receives messages from kafka and than insert these data into elasticsearch.

 - These data are targets of monitor system.

 - Add the following items in the configuration file:

```yaml
spring:
  cloud:
    stream:
      kafka:
        binder:
          brokers: KAFKA_ADRESS
          zkNodes: ZOOKEEPER_ADRESS
```

Make the monitoring data flow to Kafka.

## Installation and Getting Started

`helm install choerodon-aliyun/choerodon-zipkin-collector --version=0.5.0`

Version can be replaced, You can use the `--set env.open.foo_bar =foobar` to override the environment variables.

## Documentation

Replaceable variable：

|           variable        |  definition  |
| :-----------------------: | :----: |
| env.open.ZIPKIN_ELASTICSEARCH_HOST | es path |
| env.open.EUREKA_DEFAULT_ZONE | eureka path |
| env.open.SPRING_CLOUD_STREAM_KAFKA_BINDER_BROKERS | kafka path |
| env.open.SPRING_CLOUD_STREAM_KAFKA_BINDER_ZKNODES | zookeeper path |
| env.open.ZIPKIN_STORAGE_ELASTICSEARCH_HOSTS | es path |
| version | helm image version |


## Dependencies

|          依赖           |  版本  |
| :---------------------: | :----: |
|         zipkin          | 1.31.3 |
| choerodon-starter-hitoa | 0.5.0.RELEASE  |
| spring-cloud-sleuth-zipkin| 1.2.5.RELEASE |
| spring-cloud-sleuth-zipkin-stream | 1.2.5.RELEASE |
| spring-cloud-starter-stream-kafka | 1.2.1.RELEASE |
| spring-cloud-stream-binder-kafka | 1.2.1.RELEASE |


## Reporting Issues
If you find any shortcomings or bugs, please describe them in the [issue](https://github.com/choerodon/choerodon/issues/new?template=issue_template.md).
    
## How to Contribute
Pull requests are welcome! [Follow](https://github.com/choerodon/choerodon/blob/master/CONTRIBUTING.md) to know for more information on how to contribute.