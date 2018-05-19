package io.choerodon.zipkin;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.metrics.buffer.CounterBuffers;
import org.springframework.boot.actuate.metrics.buffer.GaugeBuffers;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.Bean;
import zipkin.collector.CollectorMetrics;
import zipkin.server.ActuateCollectorMetrics;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinStreamServer
public class ZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }

    @Bean(name = "myCollectorMetrics")
    CollectorMetrics metrics(Optional<CounterBuffers> counterBuffers, Optional<GaugeBuffers> gaugeBuffers) {
        return new ActuateCollectorMetrics(counterBuffers.orElse(new CounterBuffers()),
                gaugeBuffers.orElse(new GaugeBuffers()));
    }
}