# zipkin-collector

Zipkin Call chain collector.
Read the Zipkin call information from the Kafka, store the call information in the Elasticsearch, and facilitate the Zipkin front-end display.

## Feature

Track the zipkin version for iteration.
## Requirements

The application that needs to monitor the invocation chain needs to introduce maven dependencies as follows.

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-sleuth-stream</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>

<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-stream-binder-kafka</artifactId>
</dependency>
```

And add the following items in the configuration file:

```yaml
spring:
  cloud:
    stream:
      kafka:
        binder:
          brokers: kafka-0.kafka-headless.kafka.svc.cluster.local:9092,kafka-1.kafka-headless.kafka.svc.cluster.local:9092,kafka-2.kafka-headless.kafka.svc.cluster.local:9092
          zkNodes: zookeeper-0.zookeeper-headless.zookeeper.svc.cluster.local:2181,zookeeper-1.zookeeper-headless.zookeeper.svc.cluster.local:2181,zookeeper-2.zookeeper-headless.zookeeper.svc.cluster.local:2181
```

Make the monitoring data flow to Kafka.

## To get the code

```Shell
git clone https://github.com/choerodon/zipkin-collector.git
```
## Installation and Getting Started

helm install choerodon-aliyun/zipkin-collector --version=0.5.0.RELEASE-dev.20180514165144

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

|       Dependencies      | version|
| :---------------------: | :----: |
|         zipkin          | 1.31.3 |
| choerodon-starter-hitoa | 0.5.0.RELEASE  |


## Reporting Issues

If you find any shortcomings or bugs, please describe them in the Issue.
    
## How to Contribute
Pull requests are welcome! Follow this link for more information on how to contribute.
