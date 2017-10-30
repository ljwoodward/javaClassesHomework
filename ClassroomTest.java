import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ClassroomTest {

  Classroom classroom;

  @Before
  public void before() {
    this.classroom = new Classroom( "E16" );
  }

  @Test
  public void hasName() {
    String name = this.classroom.getName();
    assertEquals( "E16", name);
  }

}
