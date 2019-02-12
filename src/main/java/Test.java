import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalTime;

public class Test {

    private static final Logger LOG = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        LOG.debug("Local Time: " + LocalTime.now());
    }
}

