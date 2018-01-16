import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordNetTest {

  @Before
  public void setUp() throws Exception {
  }

  @Test (timeout = 5000, expected = IllegalArgumentException.class)
  public void testWordNetNullSysnets() {
    WordNet w = new WordNet(null, "hypernyms.txt");
  }
  
  @Test (timeout = 5000, expected = IllegalArgumentException.class)
  public void testWordNetNullHypernyms() {
    WordNet w = new WordNet("sysnets.txt", null);
  }

  @Test
  public void testNouns() {
    fail("Not yet implemented");
  }

  @Test
  public void testIsNoun() {
    fail("Not yet implemented");
  }

  @Test
  public void testDistance() {
    fail("Not yet implemented");
  }

  @Test
  public void testSap() {
    fail("Not yet implemented");
  }

}
