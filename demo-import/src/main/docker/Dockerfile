FROM registry.cn-shanghai.aliyuncs.com/c7n/javabase:jdk8u282-b08
COPY app.jar /demo-import-saas.jar
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.language=zh -Duser.region=CN -Duser.country=CN
ENTRYPOINT exec java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap $JAVA_OPTS $SKYWALKING_OPTS  -jar /demo-import-saas.jar