class Classroom {
private String name;
private Student[] students;

public Classroom( String name ) {
  this.name = name;
  this.students = new Student[20];
  }

public String getName() {
  return this.name;
}

public int studentCount() {
  int number = 0;
  for( Student student : students ) {
    if( student != null) {
      number++;
    }
  }
  return number; 
}

}
