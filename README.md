# spring-cloud-config-demo

A very basic [Spring Cloud Config] (http://cloud.spring.io/spring-cloud-config/)  demo.


# Modules

* config-demo-server : Server will start up on port 8888 and serve configuration data from "https://github.com/s-bortolussi/spring-cloud-config-demo".
* config-demo-client : Client will start up on port 8888 and get configuration from http://localhost:8888 (Config Server)
