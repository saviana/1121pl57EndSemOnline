import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SprintTest {

	Sprint sprint;
	@Before
	public void setUp() throws Exception {
		sprint = new Sprint(5);
	}

	@Test
	public void test() {
		assertEquals(5, sprint.getDuration());
	}

}
