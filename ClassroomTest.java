import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ClassroomTest {

  Classroom classroom;
  Student student;

  @Before
  public void before() {
    this.classroom = new Classroom( "E16" );
    this.student = new Student( "Chris Marshall");
  }

  @Test
  public void hasName() {
    String name = this.classroom.getName();
    assertEquals( "E16", name);
  }

  @Test
  public void classroomStartsEmpty() {
    assertEquals( 0, classroom.studentCount() );
  }

  @Test
  public void addNewStudent() {
    classroom.add( student );
    assertEquals(1 , classroom.studentCount() );
  }

  @Test
  public void classroomIsFull() {
    for ( int i = 0; i < 30; i++) {
      classroom.add( student );
    }
    assertEquals(20, classroom.studentCount() );
  }

  @Test
  public void emptyClassroomAfterGraduation() {
    classroom.add( student );
    classroom.graduate();
    assertEquals( 0, classroom.studentCount() );
  }



}
