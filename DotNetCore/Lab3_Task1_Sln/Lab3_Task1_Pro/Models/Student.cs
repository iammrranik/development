namespace Lab3_Task1_Pro.Models
{
    public class Student
    {
        public int Id { get; set; }
        public String Name { get; set; }
        public int Age { get; set; }
        public String Department { get; set; }
        public float Cgpa { get; set; }

        public Student(int id, string name, int age, string department, float cgpa)
        {
            Id = id;
            Name = name;
            Age = age;
            Department = department;
            Cgpa = cgpa;
        }

    }
}
