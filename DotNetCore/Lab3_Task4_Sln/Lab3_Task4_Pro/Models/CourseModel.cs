namespace Lab3_Task4_Pro.Models
{
    public class CourseModel
    {
        internal int Id { get; set; }
        internal String Title { get; set; }
        internal int Credit { get; set; }
        internal int Semester { get; set; }

        public CourseModel(int id,  String title, int credit, int semester)
        {
            Id = id;
            Title = title;
            Credit = credit;
            Semester = semester;
        }

    }
}
