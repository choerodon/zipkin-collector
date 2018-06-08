FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.5.0
COPY app.jar /zipkin-collector.jar
ENTRYPOINT [ "java", "-jar", "/zipkin-collector.jar" ]
