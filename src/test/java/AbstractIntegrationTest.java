
import org.testcontainers.containers.GenericContainer;

public abstract class AbstractIntegrationTest {

    public static final GenericContainer redis = new GenericContainer("redis:6.0.1")
            .withExposedPorts(6379);

    static {
        redis.start();
    }
}