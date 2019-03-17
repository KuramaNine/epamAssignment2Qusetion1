package epamTask;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathematicalOperationsTest {
	MathematicalOperations mathematicalOperationsObject;
	@Before
	public void setUp() throws Exception {
		mathematicalOperationsObject=new MathematicalOperations(2, 3);
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
		Assert.assertEquals(5,mathematicalOperationsObject.add());
		Assert.assertEquals(6, mathematicalOperationsObject.multiply());
		Assert.assertEquals(0, mathematicalOperationsObject.divide());
	}

}
